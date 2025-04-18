/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.GrupoController;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import model.Grupo;

/**
 *
 * @author iband
 */
public class FrSorteio extends javax.swing.JDialog {

  /**
   * Creates new form FrSorteio
   */
  public FrSorteio(java.awt.Frame parent, boolean modal) {
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
    jScrollPane1 = new javax.swing.JScrollPane();
    tblGrupos = new javax.swing.JTable();
    jButton1 = new javax.swing.JButton();
    jLabel1 = new javax.swing.JLabel();
    jLabel2 = new javax.swing.JLabel();
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

    tblGrupos.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
    tblGrupos.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "Ordem", "Tema", "Integrantes"
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
    tblGrupos.setIntercellSpacing(new java.awt.Dimension(1, 3));
    tblGrupos.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(tblGrupos);
    if (tblGrupos.getColumnModel().getColumnCount() > 0) {
      tblGrupos.getColumnModel().getColumn(0).setPreferredWidth(55);
      tblGrupos.getColumnModel().getColumn(1).setPreferredWidth(120);
      tblGrupos.getColumnModel().getColumn(2).setPreferredWidth(350);
    }

    jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 503, 330));

    jButton1.setBackground(new java.awt.Color(255, 255, 255));
    jButton1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jButton1.setText("Sortear");
    jButton1.setFocusPainted(false);
    jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        jButton1MouseClicked(evt);
      }
    });
    jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 255));
    jLabel1.setText("Sorteio de Grupos");
    jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/jigsaw_inteiro.png"))); // NOI18N
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, -1, 533));

    btnVoltar.setBackground(new java.awt.Color(255, 255, 255));
    btnVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/voltar.png"))); // NOI18N
    btnVoltar.setText("Voltar");
    btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        btnVoltarMouseClicked(evt);
      }
    });
    jPanel1.add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 550, -1, -1));

    getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 620));

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
    consultar();
  }//GEN-LAST:event_jButton1MouseClicked

  private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    URL caminhoImagem = getClass().getResource("/images/serra_icone.png");

    ImageIcon icon = new ImageIcon(caminhoImagem);

    // Define o ícone da janela
    this.setIconImage(icon.getImage());
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
    
    Collections.shuffle(listaGrupos);
    
    int ordem = 1;
    //Preencher a grade
    //percorre todos os usuários presentes na lista
    for (Grupo g : listaGrupos) {
      //cria um array onde cada posição é o valor das colunas da grade
      Object[] linha = {
        ordem, //coluna 0
        g.getTema(), //coluna 1
        g.getIntegrantes()//coluna 2
      };
      
      ordem++;
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
      java.util.logging.Logger.getLogger(FrSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(FrSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(FrSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(FrSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the dialog */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        FrSorteio dialog = new FrSorteio(new javax.swing.JFrame(), true);
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
  private javax.swing.JButton btnVoltar;
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  private javax.swing.JLabel jLabel2;
  private javax.swing.JPanel jPanel1;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JTable tblGrupos;
  // End of variables declaration//GEN-END:variables
}
