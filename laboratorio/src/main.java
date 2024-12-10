
import getset.variablesClinica;
import getset.variablesDoctor;
import getset.variablesEstatus;
import getset.variablesFecha;
import getset.variablesPago;
import getset.variablesSalTrabajo;
import getset.variablesTrabajo;
import java.awt.Color;
import sql.crudsql;




public class main extends javax.swing.JFrame {

    
    public main() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        
       
    }

  
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        txtnomT = new javax.swing.JTextField();
        txtnumT = new javax.swing.JTextField();
        txtdescT = new javax.swing.JTextField();
        txtcodrT = new javax.swing.JTextField();
        btnGuardarT = new javax.swing.JButton();
        jLabel60 = new javax.swing.JLabel();
        txtbuscarT = new javax.swing.JTextField();
        btnbuscarT = new javax.swing.JButton();
        btnactualizarT = new javax.swing.JButton();
        btneliminarT = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        txtnomD = new javax.swing.JTextField();
        txtcodclinicaD = new javax.swing.JTextField();
        btnguardarD = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        txtcodD = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        txtbuscarD = new javax.swing.JTextField();
        btnbuscarD = new javax.swing.JButton();
        btnactualizarD = new javax.swing.JButton();
        btneliminarD = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        txtsaldop = new javax.swing.JTextField();
        txtpagoc = new javax.swing.JTextField();
        txtsaldof = new javax.swing.JTextField();
        txtcodtrabajo = new javax.swing.JTextField();
        txtcodoctor = new javax.swing.JTextField();
        btnguardarS = new javax.swing.JButton();
        jLabel62 = new javax.swing.JLabel();
        txtbuscarS = new javax.swing.JTextField();
        btnbuscarS = new javax.swing.JButton();
        btnactualizarS = new javax.swing.JButton();
        btneliminarS = new javax.swing.JButton();
        jLabel67 = new javax.swing.JLabel();
        txtcodsaltrabajo = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtnomC = new javax.swing.JTextField();
        txtdirC = new javax.swing.JTextField();
        txttelC = new javax.swing.JTextField();
        btnguardarC = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        txtcodC = new javax.swing.JTextField();
        txtbuscarC = new javax.swing.JTextField();
        btnbuscarC = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        btnactualizarC = new javax.swing.JButton();
        btneliminarC = new javax.swing.JButton();
        jPanel12 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txtpruebaE = new javax.swing.JTextField();
        txtterminadoE = new javax.swing.JTextField();
        txtgarantiaE = new javax.swing.JTextField();
        txtcorreccionE = new javax.swing.JTextField();
        txtcodtrabajoE = new javax.swing.JTextField();
        btnguardarE = new javax.swing.JButton();
        jLabel63 = new javax.swing.JLabel();
        txtbuscarE = new javax.swing.JTextField();
        btnbuscarE = new javax.swing.JButton();
        btnactualizarE = new javax.swing.JButton();
        btneliminarE = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        txtcodestatus = new javax.swing.JTextField();
        jPanel14 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        txtfechaP = new javax.swing.JTextField();
        txtabono = new javax.swing.JTextField();
        txtabonado = new javax.swing.JTextField();
        txtcodrP = new javax.swing.JTextField();
        txtcodsaldo = new javax.swing.JTextField();
        btnguardarP = new javax.swing.JButton();
        txtbuscarP = new javax.swing.JTextField();
        btnbuscarP = new javax.swing.JButton();
        jLabel65 = new javax.swing.JLabel();
        btnactualizarP = new javax.swing.JButton();
        btneliminarP = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        txtfechaprueba = new javax.swing.JTextField();
        txtfechallegada = new javax.swing.JTextField();
        txtfechasalida = new javax.swing.JTextField();
        txtcodtrabajoF = new javax.swing.JTextField();
        btnguardarF = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        btnbuscarF = new javax.swing.JButton();
        txtbuscarF = new javax.swing.JTextField();
        btnactualizarF = new javax.swing.JButton();
        btneliminarF = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(242, 230, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\laboratorio2.jpg")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 200, 130));

        jLabel4.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Laboratorio Dental Patria Nueva");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 270, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\Fotos para portadas y fondos - Fondos para Whatsapp.jpeg")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 180));

        jPanel2.setBackground(new java.awt.Color(242, 230, 255));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel2MouseMoved(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\casa2.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Pagina principal");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 290, 50));

        jPanel3.setBackground(new java.awt.Color(242, 230, 255));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel3MouseMoved(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\dentadura-postiza2.png")); // NOI18N
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 153, 153));
        jLabel8.setText("Trabajos");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 100, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 290, 50));

        jPanel4.setBackground(new java.awt.Color(242, 230, 255));
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel4MouseMoved(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Doctor");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 80, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\doctor2.png")); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 290, 50));

        jPanel5.setBackground(new java.awt.Color(242, 230, 255));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\dar-dinero2.png")); // NOI18N
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 40, 30));

        jLabel12.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(153, 153, 153));
        jLabel12.setText("Saldo Del Trabajo");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 180, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 290, 50));

        jPanel6.setBackground(new java.awt.Color(242, 230, 255));
        jPanel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel6MouseMoved(evt);
            }
        });
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\loading-bar2.png")); // NOI18N
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 40, 30));

        jLabel14.setBackground(new java.awt.Color(242, 230, 255));
        jLabel14.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 153, 153));
        jLabel14.setText("Estatus Del Trabajo");
        jPanel6.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 200, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 290, 50));

        jPanel7.setBackground(new java.awt.Color(242, 230, 255));
        jPanel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel7MouseMoved(evt);
            }
        });
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\clinica-dental2.png")); // NOI18N
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel16.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("Clinica");
        jPanel7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 180, -1));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 290, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 500));

        jLabel20.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(153, 153, 153));
        jLabel20.setText("_");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 30, 30));

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\implante-dental2.png")); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 60, 50));

        jLabel18.setFont(new java.awt.Font("Corbel", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Laboratorio Dental");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\icons8_Multiply_32px.png")); // NOI18N
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 30, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\descarga.jpeg")); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 650, 70));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\2.jpg")); // NOI18N
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 150));

        jLabel22.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Variedad de nuestras piezas dentales");
        jPanel8.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 470, 40));

        jLabel23.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\222.jpg")); // NOI18N
        jPanel8.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, 170));

        jLabel24.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\333.jpg")); // NOI18N
        jLabel24.setText("jLabel24");
        jPanel8.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 180, 170));

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\444.jpg")); // NOI18N
        jLabel25.setText("jLabel25");
        jPanel8.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 180, 170));

        jTabbedPane1.addTab("tab1", jPanel8);

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel26.setText("Nombre del cliente:");
        jPanel9.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 170, 50));

        jLabel31.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel31.setText("Número de trabajo:");
        jPanel9.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 150, -1));

        jLabel32.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel32.setText("Descripción:");
        jPanel9.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel33.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel33.setText("Código del doctor:");
        jPanel9.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        txtnomT.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jPanel9.add(txtnomT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, 230, 30));

        txtnumT.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jPanel9.add(txtnumT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 130, 30));

        txtdescT.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        txtdescT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescTActionPerformed(evt);
            }
        });
        jPanel9.add(txtdescT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 250, 80));

        txtcodrT.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        jPanel9.add(txtcodrT, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 150, -1));

        btnGuardarT.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnGuardarT.setText("Guardar");
        btnGuardarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarTActionPerformed(evt);
            }
        });
        jPanel9.add(btnGuardarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 100, 50));

        jLabel60.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel60.setText("Número de trabajo:");
        jPanel9.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, -1));

        txtbuscarT.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel9.add(txtbuscarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 180, -1));

        btnbuscarT.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnbuscarT.setText("Buscar");
        btnbuscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarTActionPerformed(evt);
            }
        });
        jPanel9.add(btnbuscarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 90, 40));

        btnactualizarT.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnactualizarT.setText("Modificar");
        btnactualizarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarTActionPerformed(evt);
            }
        });
        jPanel9.add(btnactualizarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 110, 50));

        btneliminarT.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btneliminarT.setText("Eliminar");
        btneliminarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarTActionPerformed(evt);
            }
        });
        jPanel9.add(btneliminarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 120, 50));

        jTabbedPane1.addTab("tab2", jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel27.setText("Nombre del doctor:");
        jPanel10.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 160, 30));

        jLabel36.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel36.setText("Codigo de la clinica:");
        jPanel10.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 160, 30));

        txtnomD.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtnomD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomDActionPerformed(evt);
            }
        });
        jPanel10.add(txtnomD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 200, 30));
        jPanel10.add(txtcodclinicaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 140, 30));

        btnguardarD.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnguardarD.setText("Guardar");
        btnguardarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarDActionPerformed(evt);
            }
        });
        jPanel10.add(btnguardarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 40));

        jLabel45.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel45.setText("Codigo del doctor:");
        jPanel10.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 150, 30));
        jPanel10.add(txtcodD, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 140, 30));

        jLabel64.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel64.setText("Codigo del doctor a buscar:");
        jPanel10.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        txtbuscarD.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel10.add(txtbuscarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 160, -1));

        btnbuscarD.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnbuscarD.setText("Buscar");
        btnbuscarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarDActionPerformed(evt);
            }
        });
        jPanel10.add(btnbuscarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        btnactualizarD.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnactualizarD.setText("Modificar");
        btnactualizarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarDActionPerformed(evt);
            }
        });
        jPanel10.add(btnactualizarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 110, 40));

        btneliminarD.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btneliminarD.setText("Eliminar");
        btneliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarDActionPerformed(evt);
            }
        });
        jPanel10.add(btneliminarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 300, 110, 40));

        jTabbedPane1.addTab("tab3", jPanel10);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel28.setText("Saldo Pendiente:");
        jPanel11.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 50));

        jLabel37.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel37.setText("Pago completo:");
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, 20));

        jLabel38.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel38.setText("Saldo a favor:");
        jPanel11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 140, 30));

        jLabel39.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel39.setText("Codigo del trabajo:");
        jPanel11.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 150, 30));

        jLabel40.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel40.setText("Codigo del doctor:");
        jPanel11.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 160, 30));

        txtsaldop.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel11.add(txtsaldop, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 100, 30));

        txtpagoc.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        txtpagoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpagocActionPerformed(evt);
            }
        });
        jPanel11.add(txtpagoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 90, 30));

        txtsaldof.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel11.add(txtsaldof, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 80, 30));

        txtcodtrabajo.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel11.add(txtcodtrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, 30));

        txtcodoctor.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel11.add(txtcodoctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, 80, 30));

        btnguardarS.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnguardarS.setText("Guardar");
        btnguardarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarSActionPerformed(evt);
            }
        });
        jPanel11.add(btnguardarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 100, 50));

        jLabel62.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel62.setText("Codigo de trabajo a buscar: ");
        jPanel11.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        txtbuscarS.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel11.add(txtbuscarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 190, -1));

        btnbuscarS.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnbuscarS.setText("Buscar");
        btnbuscarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarSActionPerformed(evt);
            }
        });
        jPanel11.add(btnbuscarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, -1, -1));

        btnactualizarS.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnactualizarS.setText("Modificar");
        btnactualizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarSActionPerformed(evt);
            }
        });
        jPanel11.add(btnactualizarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 110, 50));

        btneliminarS.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btneliminarS.setText("Eliminar");
        btneliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarSActionPerformed(evt);
            }
        });
        jPanel11.add(btneliminarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 110, 50));

        jLabel67.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel67.setText("Codigo saldo del trabajo:");
        jPanel11.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        txtcodsaltrabajo.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel11.add(txtcodsaltrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 120, -1));

        jTabbedPane1.addTab("tab4", jPanel11);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel30.setText("Nombre de la clinica:");
        jPanel13.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 170, 50));

        jLabel34.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel34.setText("Dirección:");
        jPanel13.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel35.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel35.setText("Telefono:");
        jPanel13.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        txtnomC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel13.add(txtnomC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 180, 30));

        txtdirC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel13.add(txtdirC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 200, 30));

        txttelC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel13.add(txttelC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 170, 30));

        btnguardarC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnguardarC.setText("Guardar");
        btnguardarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarCActionPerformed(evt);
            }
        });
        jPanel13.add(btnguardarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 100, 40));

        jLabel46.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel46.setText("Codigo de la clinica:");
        jPanel13.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, 30));

        txtcodC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel13.add(txtcodC, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 170, -1));

        txtbuscarC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel13.add(txtbuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 150, -1));

        btnbuscarC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnbuscarC.setText("Buscar");
        btnbuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarCActionPerformed(evt);
            }
        });
        jPanel13.add(btnbuscarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        jLabel61.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel61.setText("Codigo de clinica a buscar:");
        jPanel13.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        btnactualizarC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnactualizarC.setText("Modificar");
        btnactualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarCActionPerformed(evt);
            }
        });
        jPanel13.add(btnactualizarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 110, 40));

        btneliminarC.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btneliminarC.setText("Eliminar");
        btneliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarCActionPerformed(evt);
            }
        });
        jPanel13.add(btneliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 120, 40));

        jTabbedPane1.addTab("tab6", jPanel13);

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel29.setText("Prueba:");
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, 40));

        jLabel41.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel41.setText("Terminado:");
        jPanel12.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel42.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel42.setText("Garantia:");
        jPanel12.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel43.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel43.setText("Correción:");
        jPanel12.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel44.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel44.setText("Codigo del trabajo:");
        jPanel12.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        txtpruebaE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel12.add(txtpruebaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 80, 30));

        txtterminadoE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel12.add(txtterminadoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 90, 30));

        txtgarantiaE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel12.add(txtgarantiaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 80, 30));

        txtcorreccionE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel12.add(txtcorreccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 80, 30));

        txtcodtrabajoE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel12.add(txtcodtrabajoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 110, 30));

        btnguardarE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnguardarE.setText("Guardar");
        btnguardarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarEActionPerformed(evt);
            }
        });
        jPanel12.add(btnguardarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 100, 50));

        jLabel63.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel63.setText("Codigo de trabajo a buscar:");
        jPanel12.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        txtbuscarE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel12.add(txtbuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, -1));

        btnbuscarE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnbuscarE.setText("Buscar");
        btnbuscarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarEActionPerformed(evt);
            }
        });
        jPanel12.add(btnbuscarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        btnactualizarE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnactualizarE.setText("Modificar");
        btnactualizarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarEActionPerformed(evt);
            }
        });
        jPanel12.add(btnactualizarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 120, 50));

        btneliminarE.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btneliminarE.setText("Eliminar");
        btneliminarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarEActionPerformed(evt);
            }
        });
        jPanel12.add(btneliminarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 400, 110, 50));

        jLabel68.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel68.setText("Codigo del estatus:");
        jPanel12.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        txtcodestatus.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel12.add(txtcodestatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 100, -1));

        jTabbedPane1.addTab("tab5", jPanel12);

        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel14MouseClicked(evt);
            }
        });
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel51.setText("Fecha del abono:");
        jPanel14.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, 30));

        jLabel52.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel52.setText("Abono:");
        jPanel14.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 30));

        jLabel53.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel53.setText("Abonado:");
        jPanel14.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel54.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel54.setText("Codigo del doctor:");
        jPanel14.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel55.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel55.setText("Codigo del saldo del trabajo:");
        jPanel14.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        txtfechaP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel14.add(txtfechaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 130, 30));

        txtabono.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel14.add(txtabono, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 70, 30));

        txtabonado.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel14.add(txtabonado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 70, 30));

        txtcodrP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel14.add(txtcodrP, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 90, 30));

        txtcodsaldo.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel14.add(txtcodsaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 90, 30));

        btnguardarP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnguardarP.setText("Guardar");
        btnguardarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarPActionPerformed(evt);
            }
        });
        jPanel14.add(btnguardarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 100, 40));

        txtbuscarP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel14.add(txtbuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 140, -1));

        btnbuscarP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnbuscarP.setText("Buscar");
        btnbuscarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarPActionPerformed(evt);
            }
        });
        jPanel14.add(btnbuscarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel65.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel65.setText("Codigo del saldo del trabajo a buscar:");
        jPanel14.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        btnactualizarP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnactualizarP.setText("Modificar");
        btnactualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarPActionPerformed(evt);
            }
        });
        jPanel14.add(btnactualizarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 110, 40));

        btneliminarP.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btneliminarP.setText("Eliminar");
        btneliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarPActionPerformed(evt);
            }
        });
        jPanel14.add(btneliminarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 110, 40));

        jTabbedPane1.addTab("tab7", jPanel14);

        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel56.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel56.setText("Fecha de prueba:");
        jPanel15.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel57.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel57.setText("Fecha de llegada:");
        jPanel15.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel58.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel58.setText("Fecha de salida:");
        jPanel15.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel59.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel59.setText("Codigo del trabajo:");
        jPanel15.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtfechaprueba.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel15.add(txtfechaprueba, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 120, 30));

        txtfechallegada.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel15.add(txtfechallegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, 110, 30));

        txtfechasalida.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel15.add(txtfechasalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 110, 30));

        txtcodtrabajoF.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel15.add(txtcodtrabajoF, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 100, 30));

        btnguardarF.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnguardarF.setText("Guardar");
        btnguardarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarFActionPerformed(evt);
            }
        });
        jPanel15.add(btnguardarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, 40));

        jLabel66.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jLabel66.setText("Codigo del trabajo a buscar:");
        jPanel15.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        btnbuscarF.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnbuscarF.setText("Buscar");
        btnbuscarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarFActionPerformed(evt);
            }
        });
        jPanel15.add(btnbuscarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 20, -1, -1));

        txtbuscarF.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        jPanel15.add(txtbuscarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 160, -1));

        btnactualizarF.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btnactualizarF.setText("Modificar");
        btnactualizarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarFActionPerformed(evt);
            }
        });
        jPanel15.add(btnactualizarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, 110, 40));

        btneliminarF.setFont(new java.awt.Font("Corbel", 0, 18)); // NOI18N
        btneliminarF.setText("Eliminar");
        btneliminarF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarFActionPerformed(evt);
            }
        });
        jPanel15.add(btneliminarF, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 100, 40));

        jTabbedPane1.addTab("tab8", jPanel15);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 650, 560));

        jButton1.setText("jButton1");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 40, -1, -1));

        jPanel16.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel16MouseMoved(evt);
            }
        });
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel16MouseExited(evt);
            }
        });
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(153, 153, 153));
        jLabel47.setText("Fecha");
        jLabel47.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel16.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\calendario2.png")); // NOI18N
        jPanel16.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 290, 50));

        jPanel17.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel17MouseMoved(evt);
            }
        });
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel17MouseExited(evt);
            }
        });
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Corbel", 0, 24)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(153, 153, 153));
        jLabel49.setText("Pago");
        jPanel17.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 90, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon("C:\\Users\\citla\\Downloads\\pago.png")); // NOI18N
        jPanel17.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 40));

        getContentPane().add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 540, 290, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    crudsql objcrud = new crudsql();
    variablesTrabajo var1=new variablesTrabajo();
    variablesClinica var2=new variablesClinica();
    variablesDoctor var3=new variablesDoctor();
    variablesEstatus var4=new variablesEstatus();
    variablesSalTrabajo var5=new variablesSalTrabajo();
    variablesFecha var6=new variablesFecha();
    variablesPago var7=new variablesPago();
    
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseMoved
        jPanel2.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel2MouseMoved

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
         jPanel2.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel2MouseExited

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        jTabbedPane1.setSelectedIndex(5);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        jTabbedPane1.setSelectedIndex(4);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
        System.exit(1);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        this.setExtendedState(1);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void txtdescTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescTActionPerformed

    private void btnGuardarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarTActionPerformed
        objcrud.insertar(txtnomT.getText(), txtnumT.getText(), txtdescT.getText(), txtcodrT.getText());
        
        txtnomT.setText("");
        txtnumT.setText("");
        txtdescT.setText("");
        txtcodrT.setText("");       
        txtbuscarT.setText("");
    }//GEN-LAST:event_btnGuardarTActionPerformed

    private void txtnomDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomDActionPerformed

    private void txtpagocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpagocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpagocActionPerformed

    private void btnguardarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarCActionPerformed
       objcrud.insertarClinica(Integer.parseInt(txtcodC.getText()),txtnomC.getText(), txtdirC.getText(), txttelC.getText());
       
       txtcodC.setText("");
        txtnomC.setText("");
        txtdirC.setText("");
        txttelC.setText("");       
        txtbuscarC.setText("");
    }//GEN-LAST:event_btnguardarCActionPerformed

    private void btnguardarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarDActionPerformed
        objcrud.insertarDoctor(Integer.parseInt(txtcodD.getText()),txtnomD.getText(), Integer.parseInt(txtcodclinicaD.getText()));
        
        txtcodD.setText("");
        txtnomD.setText("");
        txtcodclinicaD.setText("");       
        txtbuscarD.setText("");
    }//GEN-LAST:event_btnguardarDActionPerformed

    private void btnguardarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarEActionPerformed
        objcrud.insertarEstatus(txtcodestatus.getText(),txtpruebaE.getText(),txtterminadoE.getText(),txtgarantiaE.getText(),txtcorreccionE.getText(),
                Integer.parseInt(txtcodtrabajoE.getText()));
        
        txtcodestatus.setText("");
        txtpruebaE.setText("");
        txtterminadoE.setText("");
        txtgarantiaE.setText("");
        txtcorreccionE.setText("");
        txtcodtrabajoE.setText("");
        txtbuscarE.setText("");
    }//GEN-LAST:event_btnguardarEActionPerformed

    private void btnguardarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarSActionPerformed
        objcrud.insertarSalTrabajo(txtcodsaltrabajo.getText(),txtsaldop.getText(),txtpagoc.getText(),txtsaldof.getText(), Integer.parseInt(txtcodtrabajo.getText()),
                Integer.parseInt(txtcodoctor.getText()));
        
        txtcodsaltrabajo.setText("");
        txtsaldop.setText("");
        txtpagoc.setText("");
        txtsaldof.setText("");
        txtcodtrabajo.setText("");
        txtcodoctor.setText("");
        txtbuscarS.setText("");
    }//GEN-LAST:event_btnguardarSActionPerformed

    private void btnguardarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarPActionPerformed
        objcrud.insertarPago(txtfechaP.getText(),txtabono.getText(),txtabonado.getText(), Integer.parseInt(txtcodrP.getText()),
                Integer.parseInt(txtcodsaldo.getText()));
        
        txtfechaP.setText("");
        txtabono.setText("");
        txtabonado.setText("");
        txtcodrP.setText("");
        txtcodsaldo.setText("");
        txtbuscarP.setText("");
    }//GEN-LAST:event_btnguardarPActionPerformed

    private void btnguardarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarFActionPerformed
        objcrud.insertarFecha(txtfechaprueba.getText(),txtfechallegada.getText(),txtfechasalida.getText(), Integer.parseInt(txtcodtrabajoF.getText()));
        
        txtfechaprueba.setText("");
        txtfechallegada.setText("");
        txtfechasalida.setText("");
        txtcodtrabajoF.setText("");
        txtbuscarF.setText("");
    }//GEN-LAST:event_btnguardarFActionPerformed

    private void jPanel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel14MouseClicked

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        jTabbedPane1.setSelectedIndex(6);
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
         jTabbedPane1.setSelectedIndex(7);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void btnbuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarTActionPerformed
        objcrud.mostrarTrabajo(txtbuscarT.getText());
        txtnomT.setText(var1.getNombrePaciente());
        txtnumT.setText(var1.getCodigotrabajo());
        txtdescT.setText(var1.getDescripccion());
        txtcodrT.setText(var1.getCodigo_doctor());
        
        txtnumT.setEditable(false);
    }//GEN-LAST:event_btnbuscarTActionPerformed

    private void btnbuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarCActionPerformed
       objcrud.mostrarClinica(txtbuscarC.getText());
       txtcodC.setText(var2.getCodigoClinica());
       txtnomC.setText(var2.getNombre());
       txtdirC.setText(var2.getDireccion());
       txttelC.setText(var2.getTelefono());
       
       txtcodC.setEditable(false);
    }//GEN-LAST:event_btnbuscarCActionPerformed

    private void btnbuscarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarDActionPerformed
        objcrud.mostrarDoctor(txtbuscarD.getText());
        txtcodD.setText(var3.getCodigoDoctor());
        txtnomD.setText(var3.getNombre());
        txtcodclinicaD.setText(var3.getCodigo_clinica());
        
        txtcodD.setEditable(false);
    }//GEN-LAST:event_btnbuscarDActionPerformed

    private void btnbuscarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarEActionPerformed
        objcrud.mostrarEstatus(txtbuscarE.getText());
        txtcodestatus.setText(var4.getCodigotrabajoestatus());
        txtpruebaE.setText(var4.getPrueba());
        txtterminadoE.setText(var4.getTerminado());
        txtgarantiaE.setText(var4.getGarantia());
        txtcorreccionE.setText(var4.getCorrecion());
        txtcodtrabajoE.setText(var4.getCodigo_trabajo());
        
        txtcodtrabajoE.setEditable(false);
    }//GEN-LAST:event_btnbuscarEActionPerformed

    private void btnbuscarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarSActionPerformed
        objcrud.mostrarSalTrabajo(txtbuscarS.getText());
        
        txtcodsaltrabajo.setText(var5.getCodigosaldotrabajo());
        txtsaldop.setText(var5.getSaldoPendiente());
        txtpagoc.setText(var5.getPagocompleto());
        txtsaldof.setText(var5.getSaldoAfavor());
        txtcodtrabajo.setText(var5.getCodigo_trabajo());
        txtcodoctor.setText(var5.getCodigo_doctor());
        
        txtcodtrabajo.setEditable(false);
    }//GEN-LAST:event_btnbuscarSActionPerformed

    private void btnbuscarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarPActionPerformed
        objcrud.mostrarPago(txtbuscarP.getText());
        txtfechaP.setText(var7.getFechaAbono());
        txtabono.setText(var7.getAbono());
        txtabonado.setText(var7.getAbonado());
        txtcodrP.setText(var7.getCodigo_doctor());
        txtcodsaldo.setText(var7.getCodigo_saldoTrabajo());
        
        txtcodsaldo.setEditable(false);
    }//GEN-LAST:event_btnbuscarPActionPerformed

    private void btnbuscarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarFActionPerformed
        objcrud.mostrarFecha(txtbuscarF.getText());
        txtfechaprueba.setText(var6.getFprueba());
        txtfechallegada.setText(var6.getFllegada());
        txtfechasalida.setText(var6.getFsalida());
        txtcodtrabajoF.setText(var6.getCodigo_trabajo());
        
        txtcodtrabajoF.setEditable(false);
    }//GEN-LAST:event_btnbuscarFActionPerformed

    private void btnactualizarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarTActionPerformed
        var1.setNombrePaciente(txtnomT.getText());
        var1.setCodigotrabajo(txtnumT.getText());
        var1.setDescripccion(txtdescT.getText());
        var1.setCodigo_doctor(txtcodrT.getText());
        objcrud.actualizarTrabajo(var1.getNombrePaciente(), var1.getDescripccion(), var1.getCodigo_doctor(), var1.getCodigotrabajo());
        
        txtnomT.setText("");
        txtnumT.setText("");
        txtdescT.setText("");
        txtcodrT.setText("");       
        txtbuscarT.setText("");
        txtnumT.setEditable(true);
    }//GEN-LAST:event_btnactualizarTActionPerformed

    private void btnactualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarCActionPerformed
        var2.setCodigoClinica(txtcodC.getText());
        var2.setNombre(txtnomC.getText());
        var2.setDireccion(txtdirC.getText());
        var2.setTelefono(txttelC.getText());
        
        objcrud.actualizarClinica(var2.getNombre(), var2.getDireccion(), var2.getTelefono(), var2.getCodigoClinica());
        
        txtcodC.setText("");
        txtnomC.setText("");
        txtdirC.setText("");
        txttelC.setText("");       
        txtbuscarC.setText("");
        txtcodC.setEditable(true);
        
    }//GEN-LAST:event_btnactualizarCActionPerformed

    private void btnactualizarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarDActionPerformed
        var3.setCodigoDoctor(txtcodD.getText());
        var3.setNombre(txtnomD.getText());
        var3.setCodigo_clinica(txtcodclinicaD.getText());
        
        objcrud.actualizarDoctor(var3.getNombre(), var3.getCodigo_clinica(), var3.getCodigoDoctor());
        
        txtcodD.setText("");
        txtnomD.setText("");
        txtcodclinicaD.setText("");       
        txtbuscarD.setText("");
        txtcodD.setEditable(true);
    }//GEN-LAST:event_btnactualizarDActionPerformed

    private void btnactualizarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarEActionPerformed
        var4.setCodigotrabajoestatus(txtcodestatus.getText());
        var4.setPrueba(txtpruebaE.getText());
        var4.setTerminado(txtterminadoE.getText());
        var4.setGarantia(txtgarantiaE.getText());
        var4.setCorrecion(txtcorreccionE.getText());
        var4.setCodigo_trabajo(txtcodtrabajoE.getText());
        
        objcrud.actualizarEstatus(var4.getCodigotrabajoestatus(),var4.getPrueba(), var4.getTerminado(), var4.getGarantia(), var4.getCorrecion(), var4.getCodigo_trabajo());
        
        txtpruebaE.setText("");
        txtcodestatus.setText("");
        txtterminadoE.setText("");
        txtgarantiaE.setText("");
        txtcorreccionE.setText("");
        txtcodtrabajoE.setText("");
        txtbuscarE.setText("");
        txtcodtrabajoE.setEditable(true);
    }//GEN-LAST:event_btnactualizarEActionPerformed

    private void btnactualizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarSActionPerformed
        var5.setCodigosaldotrabajo(txtcodsaltrabajo.getText());
        var5.setSaldoPendiente(txtsaldop.getText());
        var5.setPagocompleto(txtpagoc.getText());
        var5.setSaldoAfavor(txtsaldof.getText());
        var5.setCodigo_trabajo(txtcodtrabajo.getText());
        var5.setCodigo_doctor(txtcodoctor.getText());
        
        objcrud.actualizarSalTrabajo(var5.getCodigosaldotrabajo(),var5.getSaldoPendiente(), var5.getPagocompleto(), var5.getSaldoAfavor(), var5.getCodigo_doctor(), var5.getCodigo_trabajo());
        
        txtsaldop.setText("");
        txtpagoc.setText("");
        txtsaldof.setText("");
        txtcodtrabajo.setText("");
        txtcodoctor.setText("");
        txtbuscarS.setText("");
        txtcodtrabajo.setEditable(true);
    }//GEN-LAST:event_btnactualizarSActionPerformed

    private void btnactualizarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarFActionPerformed
         var6.setFprueba(txtfechaprueba.getText());
        var6.setFllegada(txtfechallegada.getText());
        var6.setFsalida(txtfechasalida.getText());
        var6.setCodigo_trabajo(txtcodtrabajoF.getText());
        
        objcrud.actualizarFecha(var6.getFprueba(), var6.getFllegada(), var6.getFsalida(), var6.getCodigo_trabajo());
        
        txtfechaprueba.setText("");
        txtfechallegada.setText("");
        txtfechasalida.setText("");
        txtcodtrabajoF.setText("");
        txtbuscarF.setText("");
        txtcodtrabajoF.setEditable(true);
    }//GEN-LAST:event_btnactualizarFActionPerformed

    private void btnactualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarPActionPerformed
        var7.setFechaAbono(txtfechaP.getText());
        var7.setAbono(txtabono.getText());
        var7.setAbonado(txtabonado.getText());
        var7.setCodigo_doctor(txtcodrP.getText());
        var7.setCodigo_saldoTrabajo(txtcodsaldo.getText());
        
        objcrud.actualizarPago(var7.getFechaAbono(), var7.getAbono(), var7.getAbonado(), var7.getCodigo_doctor(), var7.getCodigo_saldoTrabajo());
        
        txtfechaP.setText("");
        txtabono.setText("");
        txtabonado.setText("");
        txtcodrP.setText("");
        txtcodsaldo.setText("");
        txtbuscarP.setText("");
        txtcodsaldo.setEditable(true);
    }//GEN-LAST:event_btnactualizarPActionPerformed

    private void btneliminarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarTActionPerformed
        var1.setCodigotrabajo(txtnumT.getText());
        
        objcrud.eliminarTrabajo(var1.getCodigotrabajo());
        
        txtnomT.setText("");
        txtnumT.setText("");
        txtdescT.setText("");
        txtcodrT.setText("");       
        txtbuscarT.setText("");
        txtnumT.setEditable(true);
    }//GEN-LAST:event_btneliminarTActionPerformed

    private void btneliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarCActionPerformed
        var2.setCodigoClinica(txtcodC.getText());
        
        objcrud.eliminarClinica(var2.getCodigoClinica());
        
        txtcodC.setText("");
        txtnomC.setText("");
        txtdirC.setText("");
        txttelC.setText("");       
        txtbuscarC.setText("");
        txtcodC.setEditable(true);
    }//GEN-LAST:event_btneliminarCActionPerformed

    private void btneliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarDActionPerformed
        var3.setCodigoDoctor(txtcodD.getText());
        
        objcrud.eliminarDoctor(var3.getCodigoDoctor());
        
        txtcodD.setText("");
        txtnomD.setText("");
        txtcodclinicaD.setText("");       
        txtbuscarD.setText("");
        txtcodD.setEditable(true);
    }//GEN-LAST:event_btneliminarDActionPerformed

    private void btneliminarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarEActionPerformed
        var4.setCodigo_trabajo(txtcodtrabajoE.getText());
        
        objcrud.eliminarEstatus(var4.getCodigo_trabajo());
        
        txtpruebaE.setText("");
        txtterminadoE.setText("");
        txtgarantiaE.setText("");
        txtcorreccionE.setText("");
        txtcodtrabajoE.setText("");
        txtbuscarE.setText("");
        txtcodtrabajoE.setEditable(true);
    }//GEN-LAST:event_btneliminarEActionPerformed

    private void btneliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarSActionPerformed
        var5.setCodigo_trabajo(txtcodtrabajo.getText());
        
        objcrud.eliminarSalTrabajo(var5.getCodigo_trabajo());
        
        txtcodsaltrabajo.setText("");
        txtsaldop.setText("");
        txtpagoc.setText("");
        txtsaldof.setText("");
        txtcodtrabajo.setText("");
        txtcodoctor.setText("");
        txtbuscarS.setText("");
        txtcodtrabajo.setEditable(true);
    }//GEN-LAST:event_btneliminarSActionPerformed

    private void btneliminarFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarFActionPerformed
        var6.setCodigo_trabajo(txtcodtrabajoF.getText());
        
        objcrud.eliminarFecha(var6.getCodigo_trabajo());
        
        txtfechaprueba.setText("");
        txtfechallegada.setText("");
        txtfechasalida.setText("");
        txtcodtrabajoF.setText("");
        txtbuscarF.setText("");
        txtcodtrabajoF.setEditable(true);
    }//GEN-LAST:event_btneliminarFActionPerformed

    private void btneliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarPActionPerformed
        var7.setCodigo_saldoTrabajo(txtcodsaldo.getText());
        
        objcrud.eliminarPago(var7.getCodigo_saldoTrabajo());
        
        txtfechaP.setText("");
        txtabono.setText("");
        txtabonado.setText("");
        txtcodrP.setText("");
        txtcodsaldo.setText("");
        txtbuscarP.setText("");
        txtcodsaldo.setEditable(true);
    }//GEN-LAST:event_btneliminarPActionPerformed

    private void jPanel3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseMoved
        jPanel3.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel3MouseMoved

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        jPanel3.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel3MouseExited

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
        jPanel4.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
         jPanel6.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        jPanel7.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel16MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseMoved
       jPanel16.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel16MouseMoved

    private void jPanel4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseMoved
        jPanel4.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel4MouseMoved

    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved
        jPanel5.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel5MouseMoved

    private void jPanel6MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseMoved
        jPanel6.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel6MouseMoved

    private void jPanel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseMoved
        jPanel7.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel7MouseMoved

    private void jPanel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseExited
        jPanel16.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel16MouseExited

    private void jPanel17MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseMoved
         jPanel17.setBackground(new Color(214, 180, 248));
    }//GEN-LAST:event_jPanel17MouseMoved

    private void jPanel17MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseExited
      jPanel17.setBackground(new Color(242, 230, 248));
    }//GEN-LAST:event_jPanel17MouseExited
    
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main abrir = new main();
                abrir.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarT;
    private javax.swing.JButton btnactualizarC;
    private javax.swing.JButton btnactualizarD;
    private javax.swing.JButton btnactualizarE;
    private javax.swing.JButton btnactualizarF;
    private javax.swing.JButton btnactualizarP;
    private javax.swing.JButton btnactualizarS;
    private javax.swing.JButton btnactualizarT;
    private javax.swing.JButton btnbuscarC;
    private javax.swing.JButton btnbuscarD;
    private javax.swing.JButton btnbuscarE;
    private javax.swing.JButton btnbuscarF;
    private javax.swing.JButton btnbuscarP;
    private javax.swing.JButton btnbuscarS;
    private javax.swing.JButton btnbuscarT;
    private javax.swing.JButton btneliminarC;
    private javax.swing.JButton btneliminarD;
    private javax.swing.JButton btneliminarE;
    private javax.swing.JButton btneliminarF;
    private javax.swing.JButton btneliminarP;
    private javax.swing.JButton btneliminarS;
    private javax.swing.JButton btneliminarT;
    private javax.swing.JButton btnguardarC;
    private javax.swing.JButton btnguardarD;
    private javax.swing.JButton btnguardarE;
    private javax.swing.JButton btnguardarF;
    private javax.swing.JButton btnguardarP;
    private javax.swing.JButton btnguardarS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtabonado;
    private javax.swing.JTextField txtabono;
    private javax.swing.JTextField txtbuscarC;
    private javax.swing.JTextField txtbuscarD;
    private javax.swing.JTextField txtbuscarE;
    private javax.swing.JTextField txtbuscarF;
    private javax.swing.JTextField txtbuscarP;
    private javax.swing.JTextField txtbuscarS;
    private javax.swing.JTextField txtbuscarT;
    private javax.swing.JTextField txtcodC;
    private javax.swing.JTextField txtcodD;
    private javax.swing.JTextField txtcodclinicaD;
    private javax.swing.JTextField txtcodestatus;
    private javax.swing.JTextField txtcodoctor;
    private javax.swing.JTextField txtcodrP;
    private javax.swing.JTextField txtcodrT;
    private javax.swing.JTextField txtcodsaldo;
    private javax.swing.JTextField txtcodsaltrabajo;
    private javax.swing.JTextField txtcodtrabajo;
    private javax.swing.JTextField txtcodtrabajoE;
    private javax.swing.JTextField txtcodtrabajoF;
    private javax.swing.JTextField txtcorreccionE;
    private javax.swing.JTextField txtdescT;
    private javax.swing.JTextField txtdirC;
    private javax.swing.JTextField txtfechaP;
    private javax.swing.JTextField txtfechallegada;
    private javax.swing.JTextField txtfechaprueba;
    private javax.swing.JTextField txtfechasalida;
    private javax.swing.JTextField txtgarantiaE;
    private javax.swing.JTextField txtnomC;
    private javax.swing.JTextField txtnomD;
    private javax.swing.JTextField txtnomT;
    private javax.swing.JTextField txtnumT;
    private javax.swing.JTextField txtpagoc;
    private javax.swing.JTextField txtpruebaE;
    private javax.swing.JTextField txtsaldof;
    private javax.swing.JTextField txtsaldop;
    private javax.swing.JTextField txttelC;
    private javax.swing.JTextField txtterminadoE;
    // End of variables declaration//GEN-END:variables
}
