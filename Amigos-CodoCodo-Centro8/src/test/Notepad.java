package test;
import ar.org.centro8.curso.java.utils.files.FileText;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Notepad extends javax.swing.JFrame {
    public Notepad() {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txaTexto = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniNuevo = new javax.swing.JMenuItem();
        mniAbrir = new javax.swing.JMenuItem();
        mniGuardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mniAcerca = new javax.swing.JMenuItem();
        mniSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad");

        txaTexto.setColumns(20);
        txaTexto.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txaTexto.setRows(5);
        jScrollPane1.setViewportView(txaTexto);

        jMenu1.setText("Archivo");

        mniNuevo.setText("Nuevo");
        mniNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mniNuevo);

        mniAbrir.setText("Abrir");
        mniAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mniAbrir);

        mniGuardar.setText("Guardar");
        mniGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(mniGuardar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        mniAcerca.setText("Acerca de");
        mniAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAcercaActionPerformed(evt);
            }
        });
        jMenu2.add(mniAcerca);

        mniSalir.setText("Salir");
        mniSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniSalirActionPerformed(evt);
            }
        });
        jMenu2.add(mniSalir);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAcercaActionPerformed
        // Evento Acerca
        JOptionPane.showMessageDialog(this, "Bloc de Notas.\nCurso de Java.");
    }//GEN-LAST:event_mniAcercaActionPerformed

    private void mniSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniSalirActionPerformed
        // Evento Salir
        System.exit(0);
    }//GEN-LAST:event_mniSalirActionPerformed

    private void mniNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNuevoActionPerformed
        // Evento Nuevo
        if(txaTexto.getText().isEmpty()) return;
        if(JOptionPane.showConfirmDialog(this, "Desea borrar el texto existente?")==0)
            txaTexto.setText("");
    }//GEN-LAST:event_mniNuevoActionPerformed

    private void mniGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGuardarActionPerformed
        // Evento Guardar
        JFileChooser fc=new JFileChooser();
        fc.showSaveDialog(this);
        File file=fc.getSelectedFile();
        if(file==null) return;
        new FileText(file).setText(txaTexto.getText());
    }//GEN-LAST:event_mniGuardarActionPerformed

    private void mniAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAbrirActionPerformed
        // Evento Abrir
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(this);
        File file=fc.getSelectedFile();
        if(file==null) return;
        txaTexto.setText(new FileText(file).getText());
        
    }//GEN-LAST:event_mniAbrirActionPerformed
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
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Notepad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mniAbrir;
    private javax.swing.JMenuItem mniAcerca;
    private javax.swing.JMenuItem mniGuardar;
    private javax.swing.JMenuItem mniNuevo;
    private javax.swing.JMenuItem mniSalir;
    private javax.swing.JTextArea txaTexto;
    // End of variables declaration//GEN-END:variables
}
