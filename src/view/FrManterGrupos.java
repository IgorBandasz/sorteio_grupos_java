/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GrupoController;
import java.net.URL;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Grupo;

/**
 *
 * @author iband
 */
public class FrManterGrupos extends javax.swing.JDialog {

  /**
   * Creates new form FrManterGrupos
   */
  public FrManterGrupos(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();
    
    this.setLocationRelativeTo(null);
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jPanel1 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jScrollPane1 = new javax.swing.JScrollPane();
    tblGrupos = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();
    edtTema = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    edtIntegrantes = new javax.swing.JTextField();
    btnCadastrar = new javax.swing.JButton();
    edtExcluir = new javax.swing.JButton();
    btnVoltar = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Sorteio de Grupos");
    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(java.awt.event.WindowEvent evt) {
        formWindowOpened(evt);
      }
    });
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel1.setBackground(new java.awt.Color(0, 0, 0));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Cadastro de Grupos");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 23, -1, -1));

    tblGrupos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {null, null, null},
        {null, null, null},
        {null, null, null},
        {null, null, null}
      },
      new String [] {
        "ID", "Tema", "Integrantes"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.Integer.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    tblGrupos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
    tblGrupos.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tblGrupos);
    if (tblGrupos.getColumnModel().getColumnCount() > 0) {
      tblGrupos.getColumnModel().getColumn(0).setResizable(false);
      tblGrupos.getColumnModel().getColumn(0).setPreferredWidth(55);
      tblGrupos.getColumnModel().getColumn(1).setResizable(false);
      tblGrupos.getColumnModel().getColumn(1).setPreferredWidth(120);
      tblGrupos.getColumnModel().getColumn(2).setResizable(false);
      tblGrupos.getColumnModel().getColumn(2).setPreferredWidth(300);
    }

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 119, 466, 286));

    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Tema");
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 67, -1, -1));
    jPanel1.add(edtTema, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 143, -1));

    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Integrantes");
    jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 67, -1, -1));
    jPanel1.add(edtIntegrantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 90, 264, -1));

    btnCadastrar.setBackground(new java.awt.Color(255, 255, 255));
    btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
    btnCadastrar.setFocusPainted(false);
    btnCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnCadastrarMouseClicked(evt);
      }
    });
    jPanel1.add(btnCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(456, 79, 40, -1));

    edtExcluir.setBackground(new java.awt.Color(255, 255, 255));
    edtExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    edtExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/trash.png"))); // NOI18N
    edtExcluir.setText("Excluir");
    edtExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        edtExcluirMouseClicked(evt);
      }
    });
    jPanel1.add(edtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(386, 425, -1, -1));

    btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
    btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltar.png"))); // NOI18N
    btnVoltar.setText("Voltar");
    btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnVoltarMouseClicked(evt);
      }
    });
    jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 536, 470));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void btnCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastrarMouseClicked
    Grupo g = new Grupo();
    
    g.setTema(edtTema.getText());
    g.setIntegrantes(edtIntegrantes.getText());
    
    GrupoController controller = new GrupoController();
    
    if(controller.inserir(g)){
      consultar();
      edtTema.setText("");
      edtIntegrantes.setText("");
      edtTema.requestFocus();
    }else{
      JOptionPane.showMessageDialog(rootPane, "Não foi adicionado");
    }
  }//GEN-LAST:event_btnCadastrarMouseClicked

  private void edtExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_edtExcluirMouseClicked
    if (tblGrupos.getSelectedRow() != -1) {
      //Se tiver pegar o código do usuário da grade
      int linhaSelecionada = tblGrupos.getSelectedRow();
      String textoCelula = tblGrupos.getValueAt(linhaSelecionada, 0).toString();
      
      //converter o texto da célula em inteiro
      int pkGrupo = Integer.parseInt(textoCelula);
         
      GrupoController controller = new GrupoController();
    
      if(controller.deletar(pkGrupo)){
        consultar();
        JOptionPane.showMessageDialog(rootPane, "Deletado com sucesso");
      }else{
        JOptionPane.showMessageDialog(rootPane, "Não foi deletado");
      }
    }
  }//GEN-LAST:event_edtExcluirMouseClicked

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    URL caminhoImagem = getClass().getResource("/images/serra_icone.png");

    ImageIcon icon = new ImageIcon(caminhoImagem);

    // Define o ícone da janela
    this.setIconImage(icon.getImage());
    
    consultar();
  }//GEN-LAST:event_formWindowOpened

  private void btnVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseClicked
    this.dispose();
  }//GEN-LAST:event_btnVoltarMouseClicked

  public void consultar(){
    DefaultTableModel modeloTabela = (DefaultTableModel) tblGrupos.getModel();

    //Limpa a grade setando o número de linhas para zero
    modeloTabela.setNumRows(0);

    //Cria um UsuarioController para poder acessar os dados de tbusuario
    GrupoController controller = new GrupoController();
    
    //consulta os usuários e guarda a lista de usuários que encontrou
    List<Grupo> listaGrupos = controller.consultar();
    
    //Preencher a grade
    //percorre todos os usuários presentes na lista
    for (Grupo g : listaGrupos) {
      //cria um array onde cada posição é o valor das colunas da grade
      Object[] linha = {
        g.getPkGrupo(), //coluna 0
        g.getTema(), //coluna 1
        g.getIntegrantes()//coluna 2
      };
      
      //Adiciona o array com os dados do usuário na grade
      modeloTabela.addRow(linha);
    }
  }
  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(FrManterGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrManterGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrManterGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrManterGrupos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        FrManterGrupos dialog = new FrManterGrupos(new javax.swing.JFrame(), true);
        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
          @Override
          public void windowClosing(java.awt.event.WindowEvent e) {
            System.exit(0);
          }
        });
        dialog.setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton btnCadastrar;
  private javax.swing.JButton btnVoltar;
  private javax.swing.JButton edtExcluir;
  private javax.swing.JTextField edtIntegrantes;
  private javax.swing.JTextField edtTema;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JLabel jLabel3;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblGrupos;
  // End of variables declaration//GEN-END:variables
}
