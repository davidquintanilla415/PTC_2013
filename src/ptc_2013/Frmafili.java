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
public class Frmafili extends javax.swing.JFrame {

    /**
     * Creates new form Frmafili
     */int id;
    public Frmafili() {
        initComponents();
         
         frmdi fondo = new frmdi("/img/titi.jpg",1000, 1000);
        this.pnlF.add(fondo);
        this.pnlF.repaint();//Refrescar
            Image icono;
        icono = new ImageIcon(getClass().getResource("/img/icono.png")).getImage();
        this.setIconImage(icono);
        cargarfecha();
        cargarfecha2();
        cargarFin();
        LlenarCombo();
        cargar();
        centrar();
        btnmodi.setEnabled(false);
          btneli.setEnabled(false);
             btnagrega.setEnabled(true);
    }
     public void cargar(){
Mtoafili obj = new Mtoafili();
obj.cod();
id = obj.getNum();
txtnum.setText(String.valueOf(obj.getNum()));
    }
        public void LlenarCombo() {
        Mtoafili obj = new Mtoafili();
        obj.setModelo2((DefaultComboBoxModel) cmbt.getModel());
        if (obj.cargarDatosCombo()) {
            cmbt.setModel(obj.getModelo2());
        }
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
        this.txtinicio.setText(String.valueOf(c.get(Calendar.DAY_OF_MONTH))+ "/"+String.valueOf(c.get(Calendar.MONTH)+1)+"/"+String.valueOf(c.get(Calendar.YEAR)));
    }
     public void cargarfecha2()
    {
        Calendar c=Calendar.getInstance();
        this.txting.setText(String.valueOf(c.get(Calendar.DAY_OF_MONTH))+ "/"+String.valueOf(c.get(Calendar.MONTH)+1)+"/"+String.valueOf(c.get(Calendar.YEAR)));
    }
     
     public void cargarFin()
    {
        Calendar c=Calendar.getInstance();
        this.txtfin.setText(String.valueOf(c.get(Calendar.DAY_OF_MONTH))+ "/"+String.valueOf(c.get(Calendar.MONTH)+1)+"/"+String.valueOf(c.get(Calendar.YEAR)+1));
    }

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
        jLabel2 = new javax.swing.JLabel();
        txtdui = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbt = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttel = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtdire = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtprofesion = new javax.swing.JTextField();
        cmbestado = new javax.swing.JComboBox();
        txtnum = new javax.swing.JTextField();
        txtinicio = new javax.swing.JTextField();
        txtfin = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb = new javax.swing.JTable();
        btnagrega = new javax.swing.JButton();
        btnmodi = new javax.swing.JButton();
        btneli = new javax.swing.JButton();
        btnlimpia = new javax.swing.JButton();
        btnconsul = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txting = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Afiliados");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DUI :");

        try {
            txtdui.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########-#")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tipo mebresia:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Apellidos:");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Telefono:");

        try {
            txttel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Direccion:");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Profesion:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Estado Civil:");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero Membresia:");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fecha Inicio:");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Fecha Fin:");

        cmbestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "soltero", "casado", "viudo", "Acompañado" }));

        txtnum.setEnabled(false);

        txtinicio.setEnabled(false);

        txtfin.setEnabled(false);

        tb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "DUI", "Membresia", "Nombre", "Apellido", "Telefono", "Email", "Direccion", "Profesion", "Estado", "N Membresia", "Inicio", "Fin"
            }
        ));
        jScrollPane1.setViewportView(tb);

        btnagrega.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnagrega.setText("Agregar");
        btnagrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregaActionPerformed(evt);
            }
        });

        btnmodi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/refresh.png"))); // NOI18N
        btnmodi.setText("Modificar");

        btneli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btneli.setText("Eliminar");

        btnlimpia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/promotion.png"))); // NOI18N
        btnlimpia.setText("Limpiar");
        btnlimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiaActionPerformed(evt);
            }
        });

        btnconsul.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search.png"))); // NOI18N
        btnconsul.setText("Consultar");
        btnconsul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsulActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha ingreso:");

        txting.setEnabled(false);

        javax.swing.GroupLayout pnlFLayout = new javax.swing.GroupLayout(pnlF);
        pnlF.setLayout(pnlFLayout);
        pnlFLayout.setHorizontalGroup(
            pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdire))
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtemail))
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txttel))
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtapellido))
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtnombre))
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbt, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtdui, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlFLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pnlFLayout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(pnlFLayout.createSequentialGroup()
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtnum))
                                    .addGroup(pnlFLayout.createSequentialGroup()
                                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel12)
                                            .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14)
                                                .addComponent(jLabel13)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtinicio)
                                            .addComponent(txtfin)
                                            .addComponent(txting))))
                                .addGap(169, 169, 169)
                                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlFLayout.createSequentialGroup()
                                        .addComponent(btnmodi)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(btnagrega, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pnlFLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnlimpia, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnconsul)))
                        .addGap(22, 22, 22))))
            .addGroup(pnlFLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        pnlFLayout.setVerticalGroup(
            pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtdui, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtprofesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFLayout.createSequentialGroup()
                        .addComponent(btnagrega)
                        .addGap(1, 1, 1)))
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cmbt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(cmbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmodi))
                        .addGap(22, 22, 22)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(txtinicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtfin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14)
                            .addComponent(txting, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtdire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFLayout.createSequentialGroup()
                        .addComponent(btneli)
                        .addGap(61, 61, 61)
                        .addGroup(pnlFLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnconsul)
                            .addComponent(btnlimpia))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            .addComponent(pnlF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnlimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiaActionPerformed
       limpiar();
       cargarfecha();
       cargar();
       cargarFin();
        cargarfecha2();
        btnmodi.setEnabled(false);
          btneli.setEnabled(false);
             btnagrega.setEnabled(true);
       DefaultTableModel model = (DefaultTableModel)tb.getModel() ; 
        model.setRowCount(0) ;
    }//GEN-LAST:event_btnlimpiaActionPerformed

    private void btnconsulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsulActionPerformed
          Mtoafili obj = new Mtoafili();
        obj.setModelo((DefaultTableModel) tb.getModel());
        if (obj.consultarTabla()) {
            tb.setModel(obj.getModelo());
            
          btnmodi.setEnabled(true);
          btneli.setEnabled(true);
             btnagrega.setEnabled(false);
             
        }
    }//GEN-LAST:event_btnconsulActionPerformed

    private void btnagregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregaActionPerformed
       Lista item = (Lista)cmbt.getSelectedItem();
        int codigo = Integer.parseInt(item.getValue().toString());
        
       
        
        Mtoafili obj = new Mtoafili();

       
       
        obj.setCodigo(codigo);
         obj.setDui(txtdui.getText());
          obj.setApellido(txtapellido.getText());
             obj.setTel(txttel.getText());
             obj.setEmail(txtemail.getText());
             obj.setDire(txtdire.getText());
             obj.setPro(txtprofesion.getText());
             obj.setIng(txting.getText());
             obj.setFin(txtfin.getText());
          obj.setInicio(txtinicio.getText());
             obj.setNombre(txtnombre.getText());
             obj.setEstado(cmbestado.getSelectedItem().toString());
        if(obj.guadar())
        {
            JOptionPane.showMessageDialog(this,"Datos Guardados con exito");

        }
        else
        {
            JOptionPane.showMessageDialog(this, "ERROR");
        }
    }//GEN-LAST:event_btnagregaActionPerformed
          public void limpiar()
   {
       
      txtdui.setText("");
       txtnombre.setText("");
          txtapellido.setText("");
           txtdire.setText("");
            txttel.setText("");
       txtemail.setText("");
          txtprofesion.setText("");
            txtnum.setText("");
       txtinicio.setText("");
          txtfin.setText("");
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
            java.util.logging.Logger.getLogger(Frmafili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmafili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmafili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmafili.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmafili().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnagrega;
    private javax.swing.JButton btnconsul;
    private javax.swing.JButton btneli;
    private javax.swing.JButton btnlimpia;
    private javax.swing.JButton btnmodi;
    private javax.swing.JComboBox cmbestado;
    private javax.swing.JComboBox cmbt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlF;
    private javax.swing.JTable tb;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtdire;
    private javax.swing.JFormattedTextField txtdui;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtfin;
    private javax.swing.JTextField txting;
    private javax.swing.JTextField txtinicio;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtnum;
    private javax.swing.JTextField txtprofesion;
    private javax.swing.JFormattedTextField txttel;
    // End of variables declaration//GEN-END:variables
}
