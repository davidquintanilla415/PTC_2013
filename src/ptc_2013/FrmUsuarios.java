/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ptc_2013;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class FrmUsuarios extends javax.swing.JFrame {

    /**
     * Creates new form FrmUsuarios
     */int codigo;
    public FrmUsuarios() {
        initComponents();
          frmdi fondo = new frmdi("/img/titi.jpg", 500,600);
         this.pf.add(fondo);
         this.pf.repaint();// repintar o refrescar
           Image icono;
        icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        this.setIconImage(icono);
        cargarCodigo();
        centrar();
        llenarCombo();
    }
  public void cargarCodigo(){
MtoUsuario obj = new MtoUsuario();
obj.codcargo();
codigo = obj.getId();
txtid.setText(String.valueOf(obj.getId()));


}
   public void llenarCombo()
    {
        MtoUsuario obj = new MtoUsuario();
        obj.setModelo2((DefaultComboBoxModel)cbtipo.getModel());
        if(obj.cargarDatosCombo())
        {
            cbtipo.setModel(obj.getModelo2());
        }
    
    }
   public void limpiar()
   {
    
       txtnombre.setText("");
       txtapellidos.setText("");
       txtcontra.setText("");
       txtnick.setText("");
   }
   
   public void centrar()
   {
     Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
     Dimension formulario = this.getSize();
     int X = (pantalla.width - formulario.width)/2;
     int Y = (pantalla.height - formulario.height)/2;
             this.setLocation(X, Y);
   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pf = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnagregar = new javax.swing.JButton();
        btnmodi = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnconsul = new javax.swing.JButton();
        txtcontra = new javax.swing.JPasswordField();
        cbtipo = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        txtnick = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Usuarios");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código:");

        txtid.setText(" ");
        txtid.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre:");

        txtnombre.setText(" ");
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Apellidos:");

        txtapellidos.setText(" ");
        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contraseña:");

        btnagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnagregar.setText("Agregar");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        btnmodi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnmodi.setText("Modificar");
        btnmodi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodiActionPerformed(evt);
            }
        });

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        btnconsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnconsul.setText("Consultar");
        btnconsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsulActionPerformed(evt);
            }
        });

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código ID", "NickName", "Tipo", "Nombres", "Apellidos", "Contraseña"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nick Name:");

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/promotion.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pfLayout = new javax.swing.GroupLayout(pf);
        pf.setLayout(pfLayout);
        pfLayout.setHorizontalGroup(
            pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pfLayout.createSequentialGroup()
                .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfLayout.createSequentialGroup()
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pfLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel1))
                            .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pfLayout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfLayout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel4)))))
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)))
                .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtid)
                    .addComponent(cbtipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(txtapellidos)
                    .addComponent(txtcontra)
                    .addComponent(txtnick))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnmodi)
                    .addComponent(btnagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnconsul)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(35, 35, 35))
        );
        pfLayout.setVerticalGroup(
            pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pfLayout.createSequentialGroup()
                .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pfLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnick, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pfLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnagregar)))
                .addGap(18, 18, 18)
                .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pfLayout.createSequentialGroup()
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbtipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE))
                    .addGroup(pfLayout.createSequentialGroup()
                        .addComponent(btnmodi)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminar)
                        .addGap(61, 61, 61)
                        .addGroup(pfLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnconsul)
                            .addComponent(btnLimpiar))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
         Lista item = (Lista)cbtipo.getSelectedItem();
        int codigo = Integer.parseInt(item.getValue().toString());
        MtoUsuario obj = new MtoUsuario();
        
       
        obj.setCodigo(codigo);
        obj.setNombres(txtnombre.getText());
        obj.setApellidos(txtapellidos.getText());
        obj.setContra(txtcontra.getText());
         obj.setNick(txtnick.getText());
      
       
        
        if(obj.guadar())
        {
            JOptionPane.showMessageDialog(this,"Datos Guardados con exito");
            cargarCodigo();
            limpiar();
        }
        else
        {
           JOptionPane.showMessageDialog(this, "ERROR");
        }

    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodiActionPerformed
                Lista item = (Lista)cbtipo.getSelectedItem();
        int codigo = Integer.parseInt(item.getValue().toString());
        MtoUsuario obj = new MtoUsuario();
        
        
        
        obj.setId(Integer.parseInt(txtid.getText()));
        
        
        
          obj.setNick(txtnick.getText());
          obj.setCodigo(codigo);
        obj.setNombres(txtnombre.getText());
        obj.setApellidos(txtapellidos.getText());
         obj.setContra(txtcontra.getText());
         
    
        if(obj.Modificar())
        {
            JOptionPane.showMessageDialog(this, "Datos Modificados");
            limpiar();
            cargarCodigo();
            
            DefaultTableModel model = (DefaultTableModel)tb.getModel() ;
                 model.setRowCount(0) ;
            
        }
        else
        {
            JOptionPane.showMessageDialog(this, "ERROR");
        }

    }//GEN-LAST:event_btnmodiActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        MtoUsuario obj = new MtoUsuario();
        obj.setId(Integer.parseInt(txtid.getText()));
        int eliminar = JOptionPane.showConfirmDialog(this,  "¿Esta seguro de querer eliminar el registro?", "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eliminar == 0)
        {
            if (obj.Eliminar())
            {
                JOptionPane.showMessageDialog(this, "Datos eliminados");
                limpiar();
                cargarCodigo();
               
            }

        }

    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnconsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsulActionPerformed
          MtoUsuario obj = new MtoUsuario();
        obj.setModelo((DefaultTableModel)tb.getModel());
        
        if(obj.consultarTabla())
        {
            tb.setModel(obj.getModelo());
            
        }

    }//GEN-LAST:event_btnconsulActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:

        limpiar();
        cargarCodigo();

        btnagregar.setEnabled(true);

        btnmodi.setEnabled(false);
        btneliminar.setEnabled(false);

        DefaultTableModel model = (DefaultTableModel)tb.getModel() ;
        model.setRowCount(0) ;
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
        // TODO add your handling code here:
          int fila = tb.getSelectedRow();
          
          limpiar();
          btnagregar.setEnabled(false);
          btnmodi.setEnabled(true);
          btneliminar.setEnabled(true);
          //Datos

          
        this.txtid.setText(tb.getValueAt(fila, 0).toString());  
        String nickname = (String) tb.getValueAt(fila,1);
        
      
            
                 
       
        String nombre = (String) tb.getValueAt(fila,3);
        String apellidos = (String) tb.getValueAt(fila,4);
        String contraseña = (String) tb.getValueAt(fila,5);
   

        txtnick.setText(nickname);
        txtnombre.setText(nombre);
        txtapellidos.setText(apellidos);
        txtcontra.setText(contraseña);
        
        
        
        
    }//GEN-LAST:event_tbMouseClicked

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
                       
            evt.consume();

            
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        // TODO add your handling code here:
         char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
                       
            evt.consume();

            
        }
    }//GEN-LAST:event_txtapellidosKeyTyped

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
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUsuarios().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnconsul;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodi;
    private javax.swing.JComboBox cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pf;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnick;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
