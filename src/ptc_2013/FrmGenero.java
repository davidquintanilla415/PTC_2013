/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ptc_2013;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class FrmGenero extends javax.swing.JFrame {

    /**
     * Creates new form FrmRegion
     */
    
    int codigo;
    public FrmGenero() {
        initComponents();
        
        frmdi fondo = new frmdi("/img/titi.jpg",700, 500);
        this.pl1.add(fondo);
        this.pl1.repaint();//Refrescar
            Image icono;
        icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        this.setIconImage(icono);
        
        cargarCodigo();
        
        centrar();
        
        
         btnmodi.setEnabled(false);
          btneliminar.setEnabled(false);
        
        
    }
    
    
     public void cargarCodigo(){
        MtoGenero  obj = new MtoGenero();
        obj.codFact();
        codigo = obj.getId_genero();
        txtcod.setText(String.valueOf(obj.getId_genero()));
        
        System.out.println(codigo);
       
        
    }
     
     public void limpiarCampos()
    {
        txtcod.setText("");
        txtNombre.setText("");
        txtDescripcion.setText("");
        
    }
     
     private void centrar()
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

        pl1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblDes = new javax.swing.JLabel();
        txtcod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnagregar = new javax.swing.JButton();
        btnmodi = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnconsul = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnLimpiar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Género de plantas");

        pl1.setBackground(new java.awt.Color(255, 255, 153));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));
        jPanel2.setOpaque(false);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("Código ID:");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre:");

        lblDes.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDes.setForeground(new java.awt.Color(255, 255, 255));
        lblDes.setText("Descripción:");

        txtcod.setEnabled(false);

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtDescripcion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblDes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNombre))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtcod, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(txtNombre))))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblDes))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

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

        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código ID", "Nombre", "Descripción"
            }
        ));
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDatos);

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/promotion.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setActionCommand("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pl1Layout = new javax.swing.GroupLayout(pl1);
        pl1.setLayout(pl1Layout);
        pl1Layout.setHorizontalGroup(
            pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(pl1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btneliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnmodi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pl1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(txtBuscar)
                .addGap(18, 18, 18)
                .addComponent(btnconsul)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addGap(53, 53, 53))
        );
        pl1Layout.setVerticalGroup(
            pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pl1Layout.createSequentialGroup()
                .addGroup(pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pl1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnagregar)
                        .addGap(18, 18, 18)
                        .addComponent(btnmodi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btneliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pl1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnconsul)
                            .addComponent(btnLimpiar)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        // TODO add your handling code here:
         MtoGenero obj = new MtoGenero();
        
        obj.setNombre_genero(txtNombre.getText());
        obj.setDetalle_genero(txtDescripcion.getText());
       
        
        if(obj.agregaRegion())
        {
            JOptionPane.showMessageDialog(this,"Datos Guardados con exito");
            limpiarCampos();
            cargarCodigo();
                       
        }
        else
        {
           JOptionPane.showMessageDialog(this, "Error, datos no guardados");
        }
        
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btnmodiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodiActionPerformed
        // TODO add your handling code here:
        
          MtoGenero obj = new MtoGenero();
        
        obj.setId_genero(Integer.parseInt(txtcod.getText()));
        obj.setNombre_genero(txtNombre.getText());
        obj.setDetalle_genero(txtDescripcion.getText());
       
        
        if(obj.modificarHotel())
        {
            JOptionPane.showMessageDialog(this, "Datos Modificados");
            limpiarCampos();
            
            cargarCodigo();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
        
    }//GEN-LAST:event_btnmodiActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
        // TODO add your handling code here:
        
          MtoGenero obj = new MtoGenero();
            obj.setId_genero(Integer.parseInt(txtcod.getText()));
            int eliminar = JOptionPane.showConfirmDialog(this, "¿Está seguro que desea eliminar?",
            "Atención", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if(eliminar == 0)
            {
                if(obj.eliminarHotel())
                
                  
                    
            {
                
                JOptionPane.showMessageDialog(this, "Datos Eliminados");
                limpiarCampos();
                cargarCodigo();
            }
            else
            {   
                JOptionPane.showMessageDialog(this, "ERROR");
             }
            }

        
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnconsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsulActionPerformed
        // TODO add your handling code here:
        
        MtoGenero obj = new MtoGenero();
        obj.setModelo((DefaultTableModel)tbDatos.getModel());
        obj.setId_genero(Integer.parseInt(txtcod.getText()));
        if(obj.consultarTabla())
        {
            tbDatos.setModel(obj.getModelo());
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Registro no Encontrado");
        }

    }//GEN-LAST:event_btnconsulActionPerformed

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        // TODO add your handling code here:
          int fila = tbDatos.getSelectedRow();
          
          limpiarCampos();
          btnagregar.setEnabled(false);
          btnmodi.setEnabled(true);
          btneliminar.setEnabled(true);
          //Datos

          
        this.txtcod.setText(tbDatos.getValueAt(fila, 0).toString());  
        String nombre = (String) tbDatos.getValueAt(fila,1);
        String descripcion = (String) tbDatos.getValueAt(fila,2);
   

        txtNombre.setText(nombre);
        txtDescripcion.setText(descripcion);
    }//GEN-LAST:event_tbDatosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
         
        limpiarCampos();
        cargarCodigo();
        
        btnagregar.setEnabled(true);     
        btnmodi.setEnabled(false);
        btneliminar.setEnabled(false);
        
         DefaultTableModel model = (DefaultTableModel)tbDatos.getModel() ; 
        model.setRowCount(0) ;
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
        cargarCodigo();
        
         MtoGenero obj = new MtoGenero();
         
        obj.setFiltro(txtBuscar.getText());
        obj.setModelo((DefaultTableModel)tbDatos.getModel());
        if(obj.consultarFiltro())
        {
                  
            
            
            tbDatos.setModel(obj.getModelo());
        }
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
        
        
          char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
                       
            evt.consume();

            
        }
        
        
        
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        // TODO add your handling code here:
        
        
          char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c != (char) KeyEvent.VK_SPACE)) {
                       
            evt.consume();

            
        }
        
        
        
    }//GEN-LAST:event_txtDescripcionKeyTyped

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
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGenero().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnconsul;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnmodi;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDes;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pl1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtcod;
    // End of variables declaration//GEN-END:variables
}