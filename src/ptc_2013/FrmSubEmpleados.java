/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * FrmSubEmpleados.java
 *
 * Created on 25-ago-2013, 16:12:07
 */
package ptc_2013;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Toshiba
 */
public class FrmSubEmpleados extends javax.swing.JFrame {

    /** Creates new form FrmSubEmpleados */
    public FrmSubEmpleados() {
        initComponents();
        setTitle("SubEmpleados");
        frmdi fondo = new frmdi("/img/empleados1.png",400, 300);
        this.pnlfondo.add(fondo);
        this.pnlfondo.repaint();//Refrescar
        frmdi fondo2 = new frmdi("/img/emple.png",128, 128);
        this.pnl1.add(fondo2);
        this.pnl1.repaint();//Refrescar
        frmdi fondo3 = new frmdi("/img/cargo.png",128, 128);
        this.pnl3.add(fondo3);
        this.pnl3.repaint();//Refrescar
        
            Image icono;
        icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        this.setIconImage(icono);
        centrar();
    }
    private void centrar() {
        Dimension Pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension formulario = this.getSize();
        int X = (Pantalla.width - formulario.width) / 2;
        int Y = (Pantalla.height - formulario.height) / 2;
        this.setLocation(X, Y);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlfondo = new javax.swing.JPanel();
        pnl1 = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnlfondo.setPreferredSize(new java.awt.Dimension(400, 300));

        pnl1.setPreferredSize(new java.awt.Dimension(128, 128));
        pnl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        pnl3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnl3.setPreferredSize(new java.awt.Dimension(128, 128));
        pnl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnl3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl3Layout = new javax.swing.GroupLayout(pnl3);
        pnl3.setLayout(pnl3Layout);
        pnl3Layout.setHorizontalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );
        pnl3Layout.setVerticalGroup(
            pnl3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 128, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlfondoLayout = new javax.swing.GroupLayout(pnlfondo);
        pnlfondo.setLayout(pnlfondoLayout);
        pnlfondoLayout.setHorizontalGroup(
            pnlfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlfondoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        pnlfondoLayout.setVerticalGroup(
            pnlfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlfondoLayout.createSequentialGroup()
                .addGroup(pnlfondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlfondoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlfondoLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(60, 60, 60))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlfondo, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void pnl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl1MouseClicked
FrmEmpleados obj = new FrmEmpleados();
obj.setVisible(true);
}//GEN-LAST:event_pnl1MouseClicked

private void pnl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl3MouseClicked
FrmCargo_empleado obj = new FrmCargo_empleado();
obj.setVisible(true);
}//GEN-LAST:event_pnl3MouseClicked

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
            java.util.logging.Logger.getLogger(FrmSubEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSubEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSubEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSubEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new FrmSubEmpleados().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnlfondo;
    // End of variables declaration//GEN-END:variables
}
