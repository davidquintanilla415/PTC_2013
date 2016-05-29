/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ptc_2013;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Molina
 */
public class FrmMante extends javax.swing.JFrame {

    /**
     * Creates new form FrmMante
     */
    int id;
    public FrmMante() {
        initComponents();
         frmdi fondo = new frmdi("/img/titi.jpg",700, 600);
        this.pnlF.add(fondo);
        this.pnlF.repaint();//Refrescar
            Image icono;
        icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        this.setIconImage(icono);
        centrar();
        cargarfecha();
        cargar();
        llenarCombo();
        llenarCombo2();
          btnmod.setEnabled(false);
          btneli.setEnabled(false);
    }
private void centrar()
    {
        Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension formulario = this.getSize();
        int X = (pantalla.width - formulario.width)/2;
        int Y = (pantalla.height - formulario.height)/2;
        this.setLocation(X, Y);
    }

  public void cargarfecha()
    {
        Calendar c=Calendar.getInstance();
        this.txtfecha.setText(String.valueOf(c.get(Calendar.MONTH)+1)+ "/"+String.valueOf(c.get(Calendar.DAY_OF_MONTH))+"/"+String.valueOf(c.get(Calendar.YEAR)));
    }
    public void cargar(){
Mtomante obj = new Mtomante();
obj.cod();
id = obj.getId();
txtid.setText(String.valueOf(obj.getId()));
    }
    
      public void llenarCombo()
    {
        Mtomante obj = new Mtomante();
        obj.setModelo2((DefaultComboBoxModel)cmbt.getModel());
        if(obj.cargarDatosCombo())
        {
            cmbt.setModel(obj.getModelo2());
        }
        
    
    }
       public void llenarCombo2()
    {
        Mtomante obj = new Mtomante();
        obj.setModelo3((DefaultComboBoxModel)cmbn.getModel());
        if(obj.cargarDatosCombo2())
        {
            cmbn.setModel(obj.getModelo3());
        }
        
    
    }
    /**
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlF = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbt = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbn = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        btnagrega = new javax.swing.JButton();
        btnmod = new javax.swing.JButton();
        btneli = new javax.swing.JButton();
        btnconsul = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Mantenimiento:");

        txtid.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Fecha:");

        txtfecha.setEnabled(false);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo Mantenimiento:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Numero de Riego: ");

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Fecha", "Tipo", "Riego", "Nombre"
            }
        ));
        tb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb);

        btnagrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnagrega.setText("Agregar");
        btnagrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregaActionPerformed(evt);
            }
        });

        btnmod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnmod.setText("Modificar");
        btnmod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodActionPerformed(evt);
            }
        });

        btneli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btneli.setText("Eliminar");
        btneli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliActionPerformed(evt);
            }
        });

        btnconsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnconsul.setText("Consultar");
        btnconsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsulActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/promotion.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nombre mantenimiento:");

        javax.swing.GroupLayout pnlFLayout = new javax.swing.GroupLayout(pnlF);
        pnlF.setLayout(pnlFLayout);
        pnlFLayout.setHorizontalGroup(
            pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFLayout.createSequentialGroup()
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel1))
                        .addGroup(pnlFLayout.createSequentialGroup()
                            .addGap(19, 19, 19)
                            .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))))
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnombre)
                    .addComponent(txtid)
                    .addComponent(cmbt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbn, 0, 125, Short.MAX_VALUE)
                    .addComponent(txtfecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnmod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnagrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnconsul))
                .addGap(19, 19, 19))
        );
        pnlFLayout.setVerticalGroup(
            pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFLayout.createSequentialGroup()
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnagrega))
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addGap(10, 10, 10)
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmod)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addComponent(btneli)
                        .addGap(7, 7, 7)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnconsul)
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregaActionPerformed
        Lista item = (Lista)cmbt.getSelectedItem();
        int codigo = Integer.parseInt(item.getValue().toString());
        
        Lista item2 = (Lista)cmbn.getSelectedItem();
        int codigo2 = Integer.parseInt(item.getValue().toString());
        
        Mtomante obj = new Mtomante();

       
       
        obj.setId_tipo(codigo);
          obj.setId_riego(codigo2);
          obj.setFecha(txtfecha.getText());
             obj.setNombre(txtnombre.getText());
        if(obj.guadar())
        {
            JOptionPane.showMessageDialog(this,"Datos Guardados con exito");

        }
        else
        {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_btnagregaActionPerformed

    private void btnmodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodActionPerformed
               Lista item = (Lista)cmbt.getSelectedItem();
        int codigo = Integer.parseInt(item.getValue().toString());
        
         Lista item2 = (Lista)cmbn.getSelectedItem();
        int codigo2 = Integer.parseInt(item.getValue().toString());
        Mtomante obj = new Mtomante();
          
obj.setId(Integer.parseInt(txtid.getText()));
       
          obj.setId_tipo(codigo);
         obj.setId_riego(codigo2);
         obj.setNombre(txtnombre.getText());

        if(obj.Modificar())
        {
            JOptionPane.showMessageDialog(this, "Datos Modificados");

         
           

        }
        else
        {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_btnmodActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       limpiar();
       cargarfecha();
       cargar();
        btnagrega.setEnabled(true);     
        btnmod.setEnabled(false);
        btneli.setEnabled(false);
        
         DefaultTableModel model = (DefaultTableModel)tb.getModel() ; 
        model.setRowCount(0) ;
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btneliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliActionPerformed
        Mtomante obj = new Mtomante();
       obj.setId(Integer.parseInt(txtid.getText()));
        int eliminar = JOptionPane.showConfirmDialog(this,  "¿Esta seguro de querer eliminar el registro?", "Atencion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (eliminar == 0)
        {
            if (obj.Eliminar())
            {
                JOptionPane.showMessageDialog(this, "Datos eliminados");
                limpiar();
               
            }

        }
    }//GEN-LAST:event_btneliActionPerformed

    private void btnconsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsulActionPerformed
        Mtomante obj = new Mtomante();
        obj.setModelo((DefaultTableModel)tb.getModel());
        
        if(obj.consultarTabla())
        {
            tb.setModel(obj.getModelo());
          btnmod.setEnabled(true);
          btneli.setEnabled(true);
             btnagrega.setEnabled(false);
         
        }
    }//GEN-LAST:event_btnconsulActionPerformed

    private void tbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbMouseClicked
          int fila = tb.getSelectedRow();
          
          limpiar();
          btnagrega.setEnabled(false);
          btnmod.setEnabled(true);
          btneli.setEnabled(true);
          //Datos

          
        this.txtid.setText(tb.getValueAt(fila, 0).toString()); 
         this.txtnombre.setText(tb.getValueAt(fila, 4).toString()); 
        this.txtfecha.setText(tb.getValueAt(fila, 1).toString()); 
        
      

        
       
    }//GEN-LAST:event_tbMouseClicked

           public void limpiar()
   {
       cargarfecha();
       cargar();
      txtid.setText("");
       txtfecha.setText("");
          txtnombre.setText("");
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
            java.util.logging.Logger.getLogger(FrmMante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMante().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagrega;
    private javax.swing.JButton btnconsul;
    private javax.swing.JButton btneli;
    private javax.swing.JButton btnmod;
    private javax.swing.JComboBox cmbn;
    private javax.swing.JComboBox cmbt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlF;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
