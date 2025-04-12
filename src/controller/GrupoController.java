package controller;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import model.Grupo;

/**
 *
 * @author iband
 */
public class GrupoController {

  public boolean inserir(Grupo g) {
    //Montar o comando a ser executado
    //os ? são variáveis que são preenchidas mais adiante
    String sql = "INSERT INTO tbgrupo(tema, integrantes) "
            + " VALUES (?,?)";

    //Cria uma instância do gerenciador de conexão(conexão com o banco de dados),
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    //Declara as variáveis como nulas antes do try para poder usar no finally
    PreparedStatement comando = null;
    try {
      //prepara o sql, analisando o formato e as váriaveis
      comando = gerenciador.prepararComando(sql);

      //define o valor de cada variável(?) pela posição em que aparece no sql
      comando.setString(1, g.getTema());
      comando.setString(2, g.getIntegrantes());

      //Executa o insert
      comando.executeUpdate();

      return true;
    } catch (SQLException e) {//caso ocorra um erro relacionado ao banco de dados
      JOptionPane.showMessageDialog(null, e.getMessage());//exibe popup com o erro
    } finally {//depois de executar o try, dando erro ou não executa o finally
      gerenciador.fecharConexao(comando);
    }
    return false;
  }

  public List<Grupo> consultar() {
    //Guarda o sql
    String sql = "SELECT * FROM TBGRUPO";
    
    //Cria um gerenciador de conexão
    GerenciadorConexao gerenciador = new GerenciadorConexao();
    //Cria as variáveis vazias antes do try pois vão ser usadas no finally
    PreparedStatement comando = null;
    ResultSet resultado = null;
    
    //Crio a lista de usuários vazia
    List<Grupo> listaGrupos = new ArrayList<>();
    
    try {
      //Preparo do comando sql
      comando = gerenciador.prepararComando(sql);

      //Como não há parâmetros já executo direto
      resultado = comando.executeQuery();

      //Irá percorrer os registros do resultado do sql
      //A cada next() a variavel resultado aponta para o próximo registro 
      //enquanto next() == true quer dizer que tem registros
      while (resultado.next()) {

        //Crio um novo usuário vazio
        Grupo g = new Grupo();

        //Leio as informações da variável resultado e guardo no usuário
        g.setPkGrupo(resultado.getInt("pkGrupo"));
        g.setTema(resultado.getString("tema"));
        g.setIntegrantes(resultado.getString("integrantes"));

        //adiciono o usuário na lista
        listaGrupos.add(g);
      }

    } catch (SQLException ex) {
      Logger.getLogger(GrupoController.class.getName()).log(
              Level.SEVERE, null, ex);
    } finally {
      gerenciador.fecharConexao(comando, resultado);
    }

    //retorno a lista de usuários
    return listaGrupos;
  }
  
  public boolean deletar(int pkGrupo) {
    String sql = "DELETE FROM TBGRUPO "
               + "WHERE pkGrupo = ?";

    GerenciadorConexao gerenciador = new GerenciadorConexao();
    PreparedStatement comando = null;

    try {
      comando = gerenciador.prepararComando(sql);
      comando.setInt(1, pkGrupo);

      comando.executeUpdate();

      return true;
    } catch (SQLException ex) {
      JOptionPane.showMessageDialog(null, "Erro ao excluir: "
              + ex);
    } finally {
      gerenciador.fecharConexao(comando);
    }
    return false;
  }
}
