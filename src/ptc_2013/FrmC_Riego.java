/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ptc_2013;

import circuito_riego.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Calendar;
import javax.swing.JOptionPane;
import com.codeminders.hidapi.*;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URLDecoder;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.Timer;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Carlos_Cornejo
 */
public class FrmC_Riego extends javax.swing.JFrame {
int num_riego;
static
    {
        ClassPathLibraryLoader.loadNativeHIDLibrary();
    }
    static final int VENDOR_ID = 0x04D8;
    static final int PRODUCT_ID = 0x0042;
    boolean[] sw = {true, true, true};
    HIDDevice dev;
    /**
     * Creates new form FrmC_Riego
     */
    public FrmC_Riego() {
        initComponents();
        try {
            dev = HIDManager.getInstance().openById(VENDOR_ID, PRODUCT_ID, null);
            System.out.println("Conectado :)");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
//        duracion = 1*60 * 60 * 1000;

//        tiempo = (int)tbRiego.getValueAt(tbRiego.getSelectedRow(), 3) *1000 * 60 ;

        frmdi fondo = new frmdi("Hojas.jpg", 668, 500);
        this.pnlFondo.add(fondo);
        this.pnlFondo.repaint();// repintar o refrescar
        cargarCodigo();
        centrar();
        cargarFecha();
        LlenarCombo();
        Image icono;
        icono = new ImageIcon(getClass().getResource("icono.png")).getImage();
        this.setIconImage(icono);
        verificador.start();
    }
    private void centrar() {
        Dimension Pantalla = Toolkit.getDefaultToolkit().getScreenSize();
        Dimension formulario = this.getSize();
        int X = (Pantalla.width - formulario.width) / 2;
        int Y = (Pantalla.height - formulario.height) / 2;
        this.setLocation(X, Y);
    }
    public void LlenarCombo() {
        MtoC_Riego obj = new MtoC_Riego();
        obj.setModelo((DefaultComboBoxModel) cbTipo.getModel());
        if (obj.cargarDatosComboBox()) {
            cbTipo.setModel(obj.getModelo());
        }
    }
    
    public void cargarCodigo() {

        MtoC_Riego obj = new MtoC_Riego();
        obj.codriego();
        num_riego = obj.getNum_riego();
        txtNum.setText(String.valueOf(obj.getNum_riego()));


    }
    public void limpiarCampos() {
        txtZ.setText("");
        txtF.setText("");
        txtD.setText("");
    }
    public void cargarFecha() {
        Calendar c = Calendar.getInstance();
        this.txtF.setText(String.valueOf(c.get(Calendar.MONTH) + 1)
                + "/" + String.valueOf(c.get(Calendar.DAY_OF_MONTH))
                + "/" + String.valueOf(c.get(Calendar.YEAR)));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlFondo = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNum = new javax.swing.JTextField();
        txtZ = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtF = new javax.swing.JTextField();
        txtD = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbRiego = new javax.swing.JTable();
        btnReporte = new javax.swing.JButton();
        txtMat = new javax.swing.JTextField();
        txtVes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnreconectar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Número de Riego");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Número de Zona");

        txtNum.setEnabled(false);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Duración");

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/add.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tipo de mes");

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        tbRiego.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número de riego", "Duración", "Número de zonas", "FEcha", "Tipo mes", "Mat", "Ves"
            }
        ));
        jScrollPane1.setViewportView(tbRiego);

        btnReporte.setText("Reportes");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        txtMat.setEditable(false);
        txtMat.setText("15");

        txtVes.setEditable(false);
        txtVes.setText("10");

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hora de riego vespertina");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hora de riego Matutina");

        btnreconectar.setText("Reconectar");
        btnreconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFondoLayout = new javax.swing.GroupLayout(pnlFondo);
        pnlFondo.setLayout(pnlFondoLayout);
        pnlFondoLayout.setHorizontalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtZ)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtD)
                                    .addComponent(txtF))
                                .addGap(3, 3, 3))
                            .addGroup(pnlFondoLayout.createSequentialGroup()
                                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbTipo, 0, 81, Short.MAX_VALUE)
                                    .addComponent(txtMat)
                                    .addComponent(txtVes))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnReporte, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConsultar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnreconectar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlFondoLayout.setVerticalGroup(
            pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFondoLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(txtZ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar))
                .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtVes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlFondoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnReporte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnreconectar)
                        .addGap(60, 60, 60)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:

        Lista item = (Lista)cbTipo.getSelectedItem();
        int codigo = Integer.parseInt(item.getValue().toString());
        MtoC_Riego obj = new MtoC_Riego();
        obj.setNum_zona(Integer.parseInt(txtZ.getText()));
        obj.setFecha(String.valueOf(txtF.getText()));
        obj.setDuracion(Integer.parseInt(txtD.getText()));
         obj.setMatutino(Integer.parseInt(txtMat.getText()));
          obj.setVespertino(Integer.parseInt(txtVes.getText()));
        obj.setId_tipo_mes(codigo);

        if( obj.AgregarRiego())
        {
            JOptionPane.showMessageDialog(this, "Datos Agregados con éxito");
            limpiarCampos();
            cargarCodigo();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Datos con error");
        }
        btnAgregar.setEnabled(true);
        //btnEncender.setEnabled(false);
        limpiarCampos();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        // TODO add your handling code here:
        MtoC_Riego obj = new MtoC_Riego();
        obj.setModel((DefaultTableModel)tbRiego.getModel());
        if(obj.Consultar())
        {
            tbRiego.setModel(obj.getModel());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        // TODO add your handling code here:
        String path = "";
        try{
            path = getClass().getResource("/Reportes/RptRiego.jasper").getPath();
            path = URLDecoder.decode(path,"UTF-8");
            Connection cn = new Conexion().conectar();
            //Crear parametros
            Map parametros = new HashMap();
            //parametros.put("",codigoParametro );
            parametros.put("hola","mundo");
            //Crear el reporte
            JasperReport reporte = (JasperReport)JRLoader.loadObject(path);
            //Imprimir el reporte
            JasperPrint imprimir = JasperFillManager.fillReport(reporte, parametros, cn);
            //Mostrar reporte
            JasperViewer visor = new JasperViewer(imprimir, false);
            //System.out.println(codigoParametro);
            visor.setTitle("Reporte de Riego");
            visor.setVisible(true);
        }
        catch ( Exception e)
        {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnreconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreconectarActionPerformed
//        try {
//            dev = HIDManager.getInstance().openById(VENDOR_ID, PRODUCT_ID, null);
//            System.out.println("Conectado :)");
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        byte valor = 0x23;
        encender(valor);
    }//GEN-LAST:event_btnreconectarActionPerformed
    void encender(byte valor) {
        try {
            byte[] out = new byte[65];
            out[1] = valor;
            dev.write(out);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    public int read_comando(byte[] in) {
        int resp = 0;
        try {
            resp = dev.read(in);
            dev.getFeatureReport(in);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return resp;
    }
      


    int cont = 0;
    int tiempo = 0;
    int tipoMes = 0;
    
    int manana = 1;
    int tarde = 3;
    int duracion2=0;
    
    static int bandera=-1;
    static int conta=-1;
    static int dur =0;
    static int horaActual=-1;
    int temp = 0;
    int band = 1;
    public void verificar()
    {
        Calendar c=Calendar.getInstance();
        int mes = c.get(Calendar.MONTH) + 1;
        int hora = c.get(Calendar.HOUR_OF_DAY);
        int minutos = c.get(Calendar.MINUTE);
        int segundos = c.get(Calendar.SECOND);
        //System.out.println(mes);
        DefaultTableModel mod = (DefaultTableModel)tbRiego.getModel();
        //System.out.println("aca");
        for(int i = 0; i < mod.getRowCount(); i++)
        {
            try {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha = null;
                fecha = formato.parse(mod.getValueAt(0, 3).toString().substring(0, 10));
                int m = fecha.getMonth() + 1;
                int hor1 = Integer.parseInt(mod.getValueAt(0, 5).toString());
                int hor2 = Integer.parseInt(mod.getValueAt(0, 6).toString());
                if(mes == m && hora == hor1 && minutos == 0 && segundos == 0)
                {
                    System.out.println("Encender: " + m);
                    byte valor = 0x23;
                    encender(valor);
                    temp = ((Integer.parseInt(mod.getValueAt(0, 1).toString())));
                    rr(temp);
                    dia.start();
                    verificador.stop();
                    break;
                }
                if(mes == m && hora == hor2 && minutos == 0 && segundos == 0)
                {
                    System.out.println("Encender: " + m);
                    byte valor = 0x23;
                    encender(valor);
                    temp = (Integer.parseInt(mod.getValueAt(0, 1).toString()));
                    rr(temp);
                    dia.start();
                    verificador.stop();
                    break;
                }
            } catch (ParseException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    //Verifica cada segundo la fecha y hora
    Timer  verificador  = new Timer (1000, new ActionListener ()
    {
        @Override
        public void actionPerformed(ActionEvent e) 
        {
            verificar();
        }
    });
    Timer  dia;Ad
    public void rr(int valor)
    {
        dia  = new Timer (1000, new ActionListener ()
        {
                @Override
                public void actionPerformed(ActionEvent e) 
                {
                    band++;
                    System.out.println(band);
                    if(band == temp)
                    {
                        byte valor = 0x23;
                        encender(valor);
                        dia.stop();
                        verificador.start();
                        band = 1;
                    }
                }
        } );
    }
    /*public void actionPerformed(ActionEvent e) 
    {
        
        if(bandera==-1){
            int hora, regar =0;
            Calendar ca = Calendar.getInstance();
            //Extraer la hora del sistema,
           hora = ca.get(Calendar.HOUR);
           System.out.println(hora);
            if(horaActual==hora){}else{
                horaActual=hora;
                if(hora ==manana){
                             regar=1;
                }
                if(hora ==tarde){
                        regar=2;
                }
                if(regar==1){
                 MtoC_Riego obj = new MtoC_Riego();
                 int matriz[][] = obj.ConsultarDuracion("");
                 int f= 0;
                 int c =0 ;
            System.out.println(matriz.length);
//             System.out.println();
                 for (f =0; f < matriz.length; f++)
                 {
                     for (c =0; c < 2; c++)
                     {
                         if(matriz[f] [c] ==0)
                         {
                             break;
                         }else {
                         dur = matriz[f] [c];
                         dur = dur *60 *1000;
                         duracion2 = dur;
                         bandera=1;
                         conta = 0;}
                     }
                 }
                 }
                if(regar==2){
                 MtoC_Riego obj = new MtoC_Riego();
                 int matriz[][] = obj.ConsultarDuracion("select * from riego where id_tipo_mes = 2");
                 int f= 0;
                 int c =0 ;
            System.out.println(matriz.length);
                 for (f =0; f < matriz.length; f++)
                 {
                     for (c =0; c < 2; c++)
                     {
                         if(matriz[f] [c] ==0)
                         {
                             break;
                         }else {
                         dur = matriz[f] [c];
                         dur = dur *60 *1000;
                         duracion2 = dur;
                         bandera=1;
                         conta = 0;}
                     }
                 }
                 }
            }
            }else{
            if(conta ==0)
            {
               System.out.println("inicia conteo");
                timer.start();
            }
            if(conta == dur)
            {
                System.out.println("fin de conteo");
                bandera = -1;
                prueba();
                
            }
                System.out.println("conta: "+ conta + " dur: "+ dur);
            conta= conta + 1;
//        if(conta<=dur){
//             byte valor = 0x23;
//            encender(valor);
//            conta++;
//        }else{
//            bandera=-1;
//        }
        }
        
    } */
    
    public void prueba ()
    {
                dia.stop();
                timer.stop();
                dia.start();
    }
    
    Timer timer = new Timer (duracion2, new ActionListener () 
{ 
    @Override
    public void actionPerformed(ActionEvent e) 
    {
//        System.out.println("timer2");
        byte valor = 0x23;
            encender(valor);
        //LOS PULSADORES
//        switch0();
//        switch1();
//        switch2();
            
    } 
}); 
    
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
            java.util.logging.Logger.getLogger(FrmC_Riego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmC_Riego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmC_Riego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmC_Riego.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmC_Riego().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnreconectar;
    private javax.swing.JComboBox cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlFondo;
    private javax.swing.JTable tbRiego;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtF;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtNum;
    private javax.swing.JTextField txtVes;
    private javax.swing.JTextField txtZ;
    // End of variables declaration//GEN-END:variables
}
