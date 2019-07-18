package KhonaTokig;

import JavaClasses.DBconnection;
import JavaClasses.IdStore;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class AdminPane extends javax.swing.JFrame {

    IdStore sid = new IdStore();
    DBconnection d = new DBconnection();

    public AdminPane() {
        initComponents();
        getCategory();
        getCategoryItem();
        getCountryItem();
        getCountry();
        getPremere();
        getPremereItem();
        getEntryFee();
        getEntryFeeItem();
        getDurationItem();
        getDuration();
        getProjectStatusItem();
        getProjectStatus();
        getTalentItem();
        getTalent();
        getUser();
        getFestival();
        getProject();
        getFund();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtFName = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        entryStartDate = new com.toedter.calendar.JDateChooser();
        EntryEndDate = new com.toedter.calendar.JDateChooser();
        FestivalDate = new com.toedter.calendar.JDateChooser();
        productiondate = new com.toedter.calendar.JDateChooser();
        festivalWebsite = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        aboutFestival = new javax.swing.JTextArea();
        cmbPremire = new javax.swing.JComboBox<>();
        cmbfestivalRating = new javax.swing.JComboBox<>();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        cmbEntryfee = new javax.swing.JComboBox<>();
        cmbduration = new javax.swing.JComboBox<>();
        cmbCountry = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pTitle = new javax.swing.JTextField();
        pDirector = new javax.swing.JTextField();
        pcmbCategory = new javax.swing.JComboBox<>();
        pProductionDate = new com.toedter.calendar.JDateChooser();
        pProjectLink = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        pAbout = new javax.swing.JTextArea();
        pcmbPremereStatus = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        pSynopsis = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        pcmbDuration = new javax.swing.JComboBox<>();
        jLabel44 = new javax.swing.JLabel();
        pcmbProjectStatus = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblproject = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtFundName = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        fCmbCountry = new javax.swing.JComboBox<>();
        fCmbCategory = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        fCmbTalent = new javax.swing.JComboBox<>();
        fApplyDate = new com.toedter.calendar.JDateChooser();
        fEndDate = new com.toedter.calendar.JDateChooser();
        fCmbProjectStatus = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblfund = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        txtPassword = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        cmbUType = new javax.swing.JComboBox<>();
        jPanel24 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();
        jButton69 = new javax.swing.JButton();
        jButton70 = new javax.swing.JButton();
        jButton71 = new javax.swing.JButton();
        jButton72 = new javax.swing.JButton();
        jButton73 = new javax.swing.JButton();
        jButton74 = new javax.swing.JButton();
        jButton75 = new javax.swing.JButton();
        jButton76 = new javax.swing.JButton();
        jButton77 = new javax.swing.JButton();
        jButton78 = new javax.swing.JButton();
        jButton79 = new javax.swing.JButton();
        jButton80 = new javax.swing.JButton();
        jButton81 = new javax.swing.JButton();
        jButton82 = new javax.swing.JButton();
        jButton83 = new javax.swing.JButton();
        jButton84 = new javax.swing.JButton();
        jButton85 = new javax.swing.JButton();
        jButton86 = new javax.swing.JButton();
        jButton87 = new javax.swing.JButton();
        jButton88 = new javax.swing.JButton();
        jButton89 = new javax.swing.JButton();
        jButton90 = new javax.swing.JButton();
        jButton91 = new javax.swing.JButton();
        jButton92 = new javax.swing.JButton();
        jButton93 = new javax.swing.JButton();
        jButton94 = new javax.swing.JButton();
        jButton95 = new javax.swing.JButton();
        jButton96 = new javax.swing.JButton();
        jButton97 = new javax.swing.JButton();
        jButton98 = new javax.swing.JButton();
        jButton99 = new javax.swing.JButton();
        jButton100 = new javax.swing.JButton();
        jButton101 = new javax.swing.JButton();
        jButton102 = new javax.swing.JButton();
        jButton103 = new javax.swing.JButton();
        jButton104 = new javax.swing.JButton();
        jButton105 = new javax.swing.JButton();
        jButton106 = new javax.swing.JButton();
        jButton107 = new javax.swing.JButton();
        jButton108 = new javax.swing.JButton();
        jButton109 = new javax.swing.JButton();
        jButton110 = new javax.swing.JButton();
        jButton111 = new javax.swing.JButton();
        jButton112 = new javax.swing.JButton();
        jButton113 = new javax.swing.JButton();
        jButton114 = new javax.swing.JButton();
        jButton115 = new javax.swing.JButton();
        jButton116 = new javax.swing.JButton();
        jButton117 = new javax.swing.JButton();
        jButton118 = new javax.swing.JButton();
        jButton119 = new javax.swing.JButton();
        jButton120 = new javax.swing.JButton();
        jButton121 = new javax.swing.JButton();
        jButton122 = new javax.swing.JButton();
        jButton123 = new javax.swing.JButton();
        jButton124 = new javax.swing.JButton();
        jButton125 = new javax.swing.JButton();
        jButton126 = new javax.swing.JButton();
        jButton127 = new javax.swing.JButton();
        jButton128 = new javax.swing.JButton();
        jButton129 = new javax.swing.JButton();
        jButton130 = new javax.swing.JButton();
        jButton131 = new javax.swing.JButton();
        jButton132 = new javax.swing.JButton();
        jButton133 = new javax.swing.JButton();
        jButton134 = new javax.swing.JButton();
        jButton135 = new javax.swing.JButton();
        jButton136 = new javax.swing.JButton();
        jButton137 = new javax.swing.JButton();
        jButton138 = new javax.swing.JButton();
        jButton139 = new javax.swing.JButton();
        jButton140 = new javax.swing.JButton();
        jButton141 = new javax.swing.JButton();
        jButton142 = new javax.swing.JButton();
        jButton143 = new javax.swing.JButton();
        jButton144 = new javax.swing.JButton();
        jButton145 = new javax.swing.JButton();
        jButton146 = new javax.swing.JButton();
        jButton147 = new javax.swing.JButton();
        jButton148 = new javax.swing.JButton();
        jButton149 = new javax.swing.JButton();
        jButton150 = new javax.swing.JButton();
        jButton151 = new javax.swing.JButton();
        jButton152 = new javax.swing.JButton();
        jButton153 = new javax.swing.JButton();
        jButton154 = new javax.swing.JButton();
        jButton155 = new javax.swing.JButton();
        jButton156 = new javax.swing.JButton();
        jButton157 = new javax.swing.JButton();
        jButton158 = new javax.swing.JButton();
        btnUserClean = new javax.swing.JButton();
        btnUserAdd = new javax.swing.JButton();
        btnUserUpdate = new javax.swing.JButton();
        btnUserDelete = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtcategoryadd = new javax.swing.JTextField();
        btncategoryAdd = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblcategory = new javax.swing.JTable();
        btncategoryUpdate = new javax.swing.JButton();
        btnCategoryDelete = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        btnCountryAdd = new javax.swing.JButton();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        btnCountryUpdate = new javax.swing.JButton();
        btnCountryDelete = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        txtPremeare = new javax.swing.JTextField();
        btnaddPremere = new javax.swing.JButton();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        btnUpdatePremere = new javax.swing.JButton();
        btnDeletePremere = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        txtentryfee = new javax.swing.JTextField();
        btnentryfeeAdd = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        tblentryfee = new javax.swing.JTable();
        btnentryfeeUpdate = new javax.swing.JButton();
        btnentryfeeDelete = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        btnDurationAdd = new javax.swing.JButton();
        jScrollPane12 = new javax.swing.JScrollPane();
        tblDuration = new javax.swing.JTable();
        btnDurationUpdate = new javax.swing.JButton();
        btnDurationDelate = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        txtProjectStatus = new javax.swing.JTextField();
        btnProjectStatusAdd = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        btnProjectStatusUpdate = new javax.swing.JButton();
        btnProjectStatusDelete = new javax.swing.JButton();
        jPanel25 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        txtTalent = new javax.swing.JTextField();
        btnTalentAdd = new javax.swing.JButton();
        jScrollPane14 = new javax.swing.JScrollPane();
        tblTalent = new javax.swing.JTable();
        btnTalentUpdate = new javax.swing.JButton();
        btnTalentDelete = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("User Panel");

        jTabbedPane1.setBackground(new java.awt.Color(153, 153, 153));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTabbedPane1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Clean");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Save");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("F E S T I V A L S");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Name Of Festival:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Category:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Country:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Entry Start Date:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Entry Deadline:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Festival Date:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Premiere Status:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Production Date:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Festival Raiting:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Festival Website:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("About Festival:");

        cmbCategory.setMaximumRowCount(40);

        entryStartDate.setDateFormatString("yyyy-MM-dd");

        EntryEndDate.setDateFormatString("yyyy-MM-dd");

        FestivalDate.setDateFormatString("yyyy-MM-dd");

        productiondate.setDateFormatString("yyyy-MM-dd");

        aboutFestival.setColumns(20);
        aboutFestival.setLineWrap(true);
        aboutFestival.setRows(5);
        aboutFestival.setWrapStyleWord(true);
        jScrollPane2.setViewportView(aboutFestival);

        cmbfestivalRating.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cmbfestivalRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("Duration Requirment:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("Entry Fee:");

        cmbduration.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 443, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(txtFName))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(festivalWebsite)
                                    .addComponent(jScrollPane2)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EntryEndDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                            .addComponent(entryStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(FestivalDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(productiondate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbfestivalRating, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbPremire, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addComponent(jLabel36))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbEntryfee, 0, 187, Short.MAX_VALUE)
                            .addComponent(cmbduration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(entryStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EntryEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FestivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPremire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productiondate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbfestivalRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(festivalWebsite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbEntryfee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbduration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(0, 0, 0));

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 654, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Festival", jPanel2);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton7.setText("Save");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Update");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton10.setText("Clean");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton10)
                .addGap(51, 51, 51))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("P R O J E C T");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setText("Project Title:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setText("Category:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setText("Director:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setText("Production Date:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel20.setText("Premiere Status:");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel23.setText("Project Link:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel24.setText("About Project:");

        pProductionDate.setDateFormatString("YYYY-MM-dd");

        pAbout.setColumns(20);
        pAbout.setLineWrap(true);
        pAbout.setRows(5);
        pAbout.setWrapStyleWord(true);
        jScrollPane3.setViewportView(pAbout);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel25.setText("Synopsis:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Duration Requirment:");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel44.setText("Project Status:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel25))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pSynopsis)
                                    .addComponent(pTitle)
                                    .addComponent(pDirector)
                                    .addComponent(pProjectLink)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(pcmbCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pProductionDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pcmbPremereStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(pcmbDuration, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane3)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pcmbProjectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pcmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pProductionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcmbDuration, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcmbPremereStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pProjectLink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pSynopsis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pcmbProjectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        tblproject.setAutoCreateRowSorter(true);
        tblproject.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblproject.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblprojectMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblproject);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Project", jPanel3);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton12.setText("Clean");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton15.setText("Update");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton16.setText("Save");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setText("Delete");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("F U N D S");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Funds Name:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Country:");

        fCmbCountry.setMaximumRowCount(40);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Fund Category:");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Talent:");

        fApplyDate.setDateFormatString("YYYY-MM-dd");

        fEndDate.setDateFormatString("YYYY-MM-dd");

        fCmbProjectStatus.setToolTipText("");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Project Status:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Fund End Date:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Fund Apply Date:");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFundName)
                                        .addGroup(jPanel12Layout.createSequentialGroup()
                                            .addGap(45, 45, 45)
                                            .addComponent(fCmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(fCmbCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fCmbProjectStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fApplyDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fCmbTalent, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFundName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fCmbCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fCmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fCmbTalent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fApplyDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fCmbProjectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        tblfund.setAutoCreateRowSorter(true);
        tblfund.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblfund.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblfundMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblfund);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 595, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1123, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Funds", jPanel4);

        jPanel21.setBackground(new java.awt.Color(0, 0, 0));
        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("A D D  U S E R S");

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Add Email & Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Password");

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel32.setText("Email");

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setText("User Type");

        cmbUType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "User", "Admin", "Editor" }));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                    .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbUType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addComponent(jLabel32)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbUType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel24.setBackground(new java.awt.Color(0, 0, 0));

        jButton17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton17.setText("ADD");

        jButton19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton19.setText("Update");

        jButton18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton18.setText("Delate");

        jButton20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton20.setText("Clean");

        jButton39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton39.setText("ADD");

        jButton40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton40.setText("Update");

        jButton41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton41.setText("Delate");

        jButton42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton42.setText("Clean");

        jButton43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton43.setText("Delate");

        jButton44.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton44.setText("Clean");

        jButton45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton45.setText("ADD");

        jButton46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton46.setText("Update");

        jButton47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton47.setText("ADD");

        jButton48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton48.setText("Clean");

        jButton49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton49.setText("Update");

        jButton50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton50.setText("Delate");

        jButton51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton51.setText("Update");

        jButton52.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton52.setText("Delate");

        jButton53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton53.setText("ADD");

        jButton54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton54.setText("Clean");

        jButton55.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton55.setText("Clean");

        jButton56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton56.setText("Update");

        jButton57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton57.setText("ADD");

        jButton58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton58.setText("Delate");

        jButton59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton59.setText("Update");

        jButton60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton60.setText("ADD");

        jButton61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton61.setText("Clean");

        jButton62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton62.setText("Delate");

        jButton63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton63.setText("Update");

        jButton64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton64.setText("ADD");

        jButton65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton65.setText("Clean");

        jButton66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton66.setText("Delate");

        jButton67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton67.setText("Update");

        jButton68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton68.setText("ADD");

        jButton69.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton69.setText("Delate");

        jButton70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton70.setText("Clean");

        jButton71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton71.setText("Update");

        jButton72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton72.setText("ADD");

        jButton73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton73.setText("Clean");

        jButton74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton74.setText("Delate");

        jButton75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton75.setText("Update");

        jButton76.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton76.setText("ADD");

        jButton77.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton77.setText("Delate");

        jButton78.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton78.setText("Clean");

        jButton79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton79.setText("Delate");

        jButton80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton80.setText("Clean");

        jButton81.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton81.setText("ADD");

        jButton82.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton82.setText("Update");

        jButton83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton83.setText("Clean");

        jButton84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton84.setText("ADD");

        jButton85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton85.setText("Update");

        jButton86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton86.setText("Delate");

        jButton87.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton87.setText("ADD");

        jButton88.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton88.setText("Delate");

        jButton89.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton89.setText("Clean");

        jButton90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton90.setText("Update");

        jButton91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton91.setText("Clean");

        jButton92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton92.setText("Delate");

        jButton93.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton93.setText("Update");

        jButton94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton94.setText("ADD");

        jButton95.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton95.setText("Delate");

        jButton96.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton96.setText("Clean");

        jButton97.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton97.setText("ADD");

        jButton98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton98.setText("Update");

        jButton99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton99.setText("Clean");

        jButton100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton100.setText("Delate");

        jButton101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton101.setText("ADD");

        jButton102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton102.setText("Update");

        jButton103.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton103.setText("Delate");

        jButton104.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton104.setText("Clean");

        jButton105.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton105.setText("Update");

        jButton106.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton106.setText("ADD");

        jButton107.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton107.setText("Update");

        jButton108.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton108.setText("Delate");

        jButton109.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton109.setText("Clean");

        jButton110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton110.setText("ADD");

        jButton111.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton111.setText("Update");

        jButton112.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton112.setText("Delate");

        jButton113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton113.setText("Clean");

        jButton114.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton114.setText("ADD");

        jButton115.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton115.setText("Clean");

        jButton116.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton116.setText("ADD");

        jButton117.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton117.setText("Delate");

        jButton118.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton118.setText("Update");

        jButton119.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton119.setText("Clean");

        jButton120.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton120.setText("ADD");

        jButton121.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton121.setText("Delate");

        jButton122.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton122.setText("Update");

        jButton123.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton123.setText("Clean");

        jButton124.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton124.setText("ADD");

        jButton125.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton125.setText("Update");

        jButton126.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton126.setText("Delate");

        jButton127.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton127.setText("ADD");

        jButton128.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton128.setText("Update");

        jButton129.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton129.setText("Clean");

        jButton130.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton130.setText("Delate");

        jButton131.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton131.setText("Clean");

        jButton132.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton132.setText("ADD");

        jButton133.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton133.setText("Update");

        jButton134.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton134.setText("Delate");

        jButton135.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton135.setText("ADD");

        jButton136.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton136.setText("Clean");

        jButton137.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton137.setText("Delate");

        jButton138.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton138.setText("Update");

        jButton139.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton139.setText("Delate");

        jButton140.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton140.setText("Update");

        jButton141.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton141.setText("ADD");

        jButton142.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton142.setText("Clean");

        jButton143.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton143.setText("Delate");

        jButton144.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton144.setText("ADD");

        jButton145.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton145.setText("Update");

        jButton146.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton146.setText("Clean");

        jButton147.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton147.setText("ADD");

        jButton148.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton148.setText("Delate");

        jButton149.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton149.setText("Clean");

        jButton150.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton150.setText("Update");

        jButton151.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton151.setText("ADD");

        jButton152.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton152.setText("Delate");

        jButton153.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton153.setText("Update");

        jButton154.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton154.setText("Clean");

        jButton155.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton155.setText("ADD");

        jButton156.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton156.setText("Delate");

        jButton157.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton157.setText("Clean");

        jButton158.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton158.setText("Update");

        btnUserClean.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUserClean.setText("Clean");
        btnUserClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserCleanActionPerformed(evt);
            }
        });

        btnUserAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUserAdd.setText("ADD");
        btnUserAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserAddActionPerformed(evt);
            }
        });

        btnUserUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUserUpdate.setText("Update");
        btnUserUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserUpdateActionPerformed(evt);
            }
        });

        btnUserDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUserDelete.setText("Delete");
        btnUserDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton18)
                        .addGap(10, 10, 10)
                        .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton39, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton41)
                        .addGap(10, 10, 10)
                        .addComponent(jButton42, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton45, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton43)
                        .addGap(10, 10, 10)
                        .addComponent(jButton44, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton47, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton50)
                        .addGap(10, 10, 10)
                        .addComponent(jButton48, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton53, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton52)
                        .addGap(10, 10, 10)
                        .addComponent(jButton54, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton57, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton56)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton58)
                        .addGap(10, 10, 10)
                        .addComponent(jButton55, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton60, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton59)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton62)
                        .addGap(10, 10, 10)
                        .addComponent(jButton61, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton64, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton66)
                        .addGap(10, 10, 10)
                        .addComponent(jButton65, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton68, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton67)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton69)
                        .addGap(10, 10, 10)
                        .addComponent(jButton70, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton72, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton71)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton74)
                        .addGap(10, 10, 10)
                        .addComponent(jButton73, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton76, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton77)
                        .addGap(10, 10, 10)
                        .addComponent(jButton78, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton81, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton82)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton79)
                        .addGap(10, 10, 10)
                        .addComponent(jButton80, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton84, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton85)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton86)
                        .addGap(10, 10, 10)
                        .addComponent(jButton83, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton87, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton90)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton88)
                        .addGap(10, 10, 10)
                        .addComponent(jButton89, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton94, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton93)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton92)
                        .addGap(10, 10, 10)
                        .addComponent(jButton91, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton97, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton98)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton95)
                        .addGap(10, 10, 10)
                        .addComponent(jButton96, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton101, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton102)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton100)
                        .addGap(10, 10, 10)
                        .addComponent(jButton99, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton106, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton105)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton103)
                        .addGap(10, 10, 10)
                        .addComponent(jButton104, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton110, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton107)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton108)
                        .addGap(10, 10, 10)
                        .addComponent(jButton109, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton114, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton111)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton112)
                        .addGap(10, 10, 10)
                        .addComponent(jButton113, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton116, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton118)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton117)
                        .addGap(10, 10, 10)
                        .addComponent(jButton115, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton120, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton122)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton121)
                        .addGap(10, 10, 10)
                        .addComponent(jButton119, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton124, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton125)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton126)
                        .addGap(10, 10, 10)
                        .addComponent(jButton123, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton127, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton128)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton130)
                        .addGap(10, 10, 10)
                        .addComponent(jButton129, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton132, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton133)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton134)
                        .addGap(10, 10, 10)
                        .addComponent(jButton131, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton135, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton138)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton137)
                        .addGap(10, 10, 10)
                        .addComponent(jButton136, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton141, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton139)
                        .addGap(10, 10, 10)
                        .addComponent(jButton142, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton144, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton145)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton143)
                        .addGap(10, 10, 10)
                        .addComponent(jButton146, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton147, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton150)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton148)
                        .addGap(10, 10, 10)
                        .addComponent(jButton149, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton151, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton153)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton152)
                        .addGap(10, 10, 10)
                        .addComponent(jButton154, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jButton155, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton158)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton156)
                        .addGap(10, 10, 10)
                        .addComponent(jButton157, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(btnUserAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUserUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUserDelete)
                        .addGap(10, 10, 10)
                        .addComponent(btnUserClean, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUserUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUserAdd))
                    .addComponent(btnUserDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUserClean, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton158, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton155))
                    .addComponent(jButton156, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton157, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton153, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton151))
                    .addComponent(jButton152, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton154, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton150, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton147))
                    .addComponent(jButton148, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton149, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton145, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton144))
                    .addComponent(jButton143, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton146, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton140, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton141))
                    .addComponent(jButton139, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton142, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton138, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton135))
                    .addComponent(jButton137, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton136, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton133, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton132))
                    .addComponent(jButton134, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton131, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton128, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton127))
                    .addComponent(jButton130, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton129, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton125, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton124))
                    .addComponent(jButton126, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton123, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton120))
                    .addComponent(jButton121, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton119, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton118, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton116))
                    .addComponent(jButton117, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton115, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton111, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton114))
                    .addComponent(jButton112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton113, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton107, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton110))
                    .addComponent(jButton108, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton109, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton105, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton106))
                    .addComponent(jButton103, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton104, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton101))
                    .addComponent(jButton100, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton99, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton98, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton97))
                    .addComponent(jButton95, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton96, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton93, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton94))
                    .addComponent(jButton92, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton91, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton90, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton87))
                    .addComponent(jButton88, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton89, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton85, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton84))
                    .addComponent(jButton86, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton83, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton81))
                    .addComponent(jButton79, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton80, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton75, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton76))
                    .addComponent(jButton77, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton78, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton71, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton72))
                    .addComponent(jButton74, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton73, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton67, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton68))
                    .addComponent(jButton69, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton70, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton64))
                    .addComponent(jButton66, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton65, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton60))
                    .addComponent(jButton62, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton56, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton57))
                    .addComponent(jButton58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton55, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton53))
                    .addComponent(jButton52, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton49, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton47))
                    .addComponent(jButton50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton45))
                    .addComponent(jButton43, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton44, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton39))
                    .addComponent(jButton41, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton17))
                    .addComponent(jButton18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable4);

        jTabbedPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Name Of Category:");

        btncategoryAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncategoryAdd.setText("ADD");
        btncategoryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoryAddActionPerformed(evt);
            }
        });

        tblcategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Category"
            }
        ));
        tblcategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblcategoryMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tblcategory);

        btncategoryUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btncategoryUpdate.setText("UPDATE");
        btncategoryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncategoryUpdateActionPerformed(evt);
            }
        });

        btnCategoryDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCategoryDelete.setText("Delete");
        btnCategoryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCategoryDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcategoryadd, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btncategoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btncategoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcategoryadd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncategoryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncategoryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCategoryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("Category", jPanel15);

        jPanel26.setBackground(new java.awt.Color(255, 255, 153));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setText("Name Of Country:");

        btnCountryAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCountryAdd.setText("ADD");
        btnCountryAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountryAddActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable6MouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jTable6);

        btnCountryUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCountryUpdate.setText("UPDATE");
        btnCountryUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountryUpdateActionPerformed(evt);
            }
        });

        btnCountryDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCountryDelete.setText("Delete");
        btnCountryDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCountryDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel26Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnCountryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCountryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCountryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel26Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCountryAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCountryUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCountryDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel16Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Country", jPanel16);

        jPanel27.setBackground(new java.awt.Color(255, 255, 102));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setText(" Premiere Status:");

        btnaddPremere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnaddPremere.setText("ADD");
        btnaddPremere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddPremereActionPerformed(evt);
            }
        });

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable7MouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(jTable7);

        btnUpdatePremere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdatePremere.setText("UPDATE");
        btnUpdatePremere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePremereActionPerformed(evt);
            }
        });

        btnDeletePremere.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeletePremere.setText("Delete");
        btnDeletePremere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletePremereActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPremeare, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel27Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnaddPremere, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUpdatePremere, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDeletePremere, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPremeare, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaddPremere, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePremere, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletePremere, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel17Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Premiere Status:", jPanel17);

        jPanel28.setBackground(new java.awt.Color(255, 255, 51));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setText("Entry Fee:");

        btnentryfeeAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnentryfeeAdd.setText("ADD");
        btnentryfeeAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentryfeeAddActionPerformed(evt);
            }
        });

        tblentryfee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblentryfee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblentryfeeMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(tblentryfee);

        btnentryfeeUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnentryfeeUpdate.setText("UPDATE");
        btnentryfeeUpdate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnentryfeeUpdateMouseClicked(evt);
            }
        });
        btnentryfeeUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentryfeeUpdateActionPerformed(evt);
            }
        });

        btnentryfeeDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnentryfeeDelete.setText("Delete");
        btnentryfeeDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnentryfeeDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtentryfee, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel28Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnentryfeeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnentryfeeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnentryfeeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane11, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel28Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtentryfee, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnentryfeeAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnentryfeeUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnentryfeeDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel18Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Entry Fee", jPanel18);

        jPanel29.setBackground(new java.awt.Color(255, 255, 0));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setText("Duration Requirment:");

        btnDurationAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDurationAdd.setText("ADD");
        btnDurationAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDurationAddActionPerformed(evt);
            }
        });

        tblDuration.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblDuration.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDurationMouseClicked(evt);
            }
        });
        jScrollPane12.setViewportView(tblDuration);

        btnDurationUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDurationUpdate.setText("UPDATE");
        btnDurationUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDurationUpdateActionPerformed(evt);
            }
        });

        btnDurationDelate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDurationDelate.setText("Delete");
        btnDurationDelate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDurationDelateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(btnDurationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDurationUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnDurationDelate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel29Layout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE))
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel29Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDurationAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDurationUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDurationDelate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel19Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Duration Requirment", jPanel19);

        jPanel30.setBackground(new java.awt.Color(204, 204, 0));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setText("Project Status:");

        btnProjectStatusAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProjectStatusAdd.setText("ADD");
        btnProjectStatusAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectStatusAddActionPerformed(evt);
            }
        });

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable10MouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(jTable10);

        btnProjectStatusUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProjectStatusUpdate.setText("UPDATE");
        btnProjectStatusUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectStatusUpdateActionPerformed(evt);
            }
        });

        btnProjectStatusDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnProjectStatusDelete.setText("Delete");
        btnProjectStatusDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProjectStatusDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtProjectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel30Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnProjectStatusAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProjectStatusUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnProjectStatusDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel30Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtProjectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProjectStatusAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProjectStatusUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProjectStatusDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel20Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Project Status:", jPanel20);

        jPanel31.setBackground(new java.awt.Color(153, 153, 0));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setText("Taelent:");

        btnTalentAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTalentAdd.setText("ADD");
        btnTalentAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTalentAddActionPerformed(evt);
            }
        });

        tblTalent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblTalent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblTalentMouseClicked(evt);
            }
        });
        jScrollPane14.setViewportView(tblTalent);

        btnTalentUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTalentUpdate.setText("UPDATE");
        btnTalentUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTalentUpdateActionPerformed(evt);
            }
        });

        btnTalentDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTalentDelete.setText("Delete");
        btnTalentDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTalentDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTalent))
                    .addGroup(jPanel31Layout.createSequentialGroup()
                        .addComponent(btnTalentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTalentUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTalentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane14, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE))
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel31Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTalent, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTalentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTalentUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTalentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
            .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1098, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
            .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel25Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("Talent", jPanel25);

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane2)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane6)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("ADDED", jPanel21);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Refesh");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Help");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Help Option");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        pTitle.setText("");
        pDirector.setText("");
        pProjectLink.setText("");
        pSynopsis.setText("");
        pAbout.setText("");
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MousePressed

    private void btncategoryAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoryAddActionPerformed

        String categoryAdd = txtcategoryadd.getText();
        try {
            String quary = "INSERT INTO `category`(`category`) VALUES ('" + categoryAdd + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");

                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getCategory();

    }//GEN-LAST:event_btncategoryAddActionPerformed

    private void btncategoryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncategoryUpdateActionPerformed

        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblcategory.getModel();
            if (tblcategory.getModel().getRowCount() > 0) {
                if (tblcategory.getSelectedRowCount() == 1) {
                    int rowIndex = tblcategory.getSelectedRow();
                    int id = (Integer) tblcategory.getModel().getValueAt(rowIndex, 0);
                    String category = tblcategory.getModel().getValueAt(rowIndex, 1).toString();

                    String a = txtcategoryadd.getText();
                    String sql2 = "UPDATE `category` SET `category`='" + a + "' WHERE `id`='" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getCategory();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }


    }//GEN-LAST:event_btncategoryUpdateActionPerformed

    private void tblcategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblcategoryMouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) tblcategory.getModel();
        if (tblcategory.getModel().getRowCount() > 0) {
            if (tblcategory.getSelectedRowCount() == 1) {
                int rowIndex = tblcategory.getSelectedRow();
                int id = (Integer) tblcategory.getModel().getValueAt(rowIndex, 0);
                String category = tblcategory.getModel().getValueAt(rowIndex, 1).toString();
                txtcategoryadd.setText(category);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_tblcategoryMouseClicked

    private void btnCategoryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCategoryDeleteActionPerformed

        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblcategory.getModel();
            if (tblcategory.getModel().getRowCount() > 0) {
                if (tblcategory.getSelectedRowCount() == 1) {
                    int rowIndex = tblcategory.getSelectedRow();
                    int id = (Integer) tblcategory.getModel().getValueAt(rowIndex, 0);
                    String category = tblcategory.getModel().getValueAt(rowIndex, 1).toString();
                    txtcategoryadd.setText(category);

                    String a = txtcategoryadd.getText();
                    String sql2 = "DELETE FROM `category` WHERE category = '" + category + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }

    }//GEN-LAST:event_btnCategoryDeleteActionPerformed

    private void btnCountryAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountryAddActionPerformed
        String countryAdd = jTextField12.getText();
        try {
            String quary = "INSERT INTO `country`(`country`) VALUES ('" + countryAdd + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");
                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getCountry();
    }//GEN-LAST:event_btnCountryAddActionPerformed

    private void btnCountryUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountryUpdateActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable6.getModel();
            if (jTable6.getModel().getRowCount() > 0) {
                if (jTable6.getSelectedRowCount() == 1) {
                    int rowIndex = jTable6.getSelectedRow();
                    int id = (Integer) jTable6.getModel().getValueAt(rowIndex, 0);
                    String country = jTable6.getModel().getValueAt(rowIndex, 1).toString();
                    //jTextField12.setText(country);

                    String as = jTextField12.getText();
                    String sql2 = "UPDATE `country` SET `country`='" + as + "' WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getCountry();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }


    }//GEN-LAST:event_btnCountryUpdateActionPerformed

    private void btnCountryDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCountryDeleteActionPerformed

        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable6.getModel();
            if (jTable6.getModel().getRowCount() > 0) {
                if (jTable6.getSelectedRowCount() == 1) {
                    int rowIndex = jTable6.getSelectedRow();
                    int id = (Integer) jTable6.getModel().getValueAt(rowIndex, 0);
                    String country = jTable6.getModel().getValueAt(rowIndex, 1).toString();
                    jTextField12.setText(country);

                    String a = jTextField12.getText();
                    String sql2 = "DELETE FROM `country` WHERE country = '" + country + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }

    }//GEN-LAST:event_btnCountryDeleteActionPerformed

    private void jTable6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable6MouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) jTable6.getModel();
        if (jTable6.getModel().getRowCount() > 0) {
            if (jTable6.getSelectedRowCount() == 1) {
                int rowIndex = jTable6.getSelectedRow();
                int id = (Integer) jTable6.getModel().getValueAt(rowIndex, 0);
                String category = jTable6.getModel().getValueAt(rowIndex, 1).toString();
                jTextField12.setText(category);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_jTable6MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AdminPane ad = new AdminPane();
        this.setVisible(false);
        ad.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnaddPremereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddPremereActionPerformed
        String premereAdd = txtPremeare.getText();
        try {
            String quary = "INSERT INTO `premeire`(`premeireStatus`) VALUES ('" + premereAdd + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");

                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getPremere();

    }//GEN-LAST:event_btnaddPremereActionPerformed

    private void btnUpdatePremereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePremereActionPerformed

        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable7.getModel();
            if (jTable7.getModel().getRowCount() > 0) {
                if (jTable7.getSelectedRowCount() == 1) {
                    int rowIndex = jTable7.getSelectedRow();
                    int id = (Integer) jTable7.getModel().getValueAt(rowIndex, 0);
                    String country = jTable7.getModel().getValueAt(rowIndex, 1).toString();
                    //txtPremeare.setText(country);

                    String as = txtPremeare.getText();
                    String sql2 = "UPDATE `premeire` SET `premeireStatus`='" + as + "' WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getPremere();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnUpdatePremereActionPerformed

    private void btnDeletePremereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletePremereActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable7.getModel();
            if (jTable7.getModel().getRowCount() > 0) {
                if (jTable7.getSelectedRowCount() == 1) {
                    int rowIndex = jTable7.getSelectedRow();
                    int id = (Integer) jTable7.getModel().getValueAt(rowIndex, 0);
                    String Pstatus = jTable7.getModel().getValueAt(rowIndex, 1).toString();
                    txtPremeare.setText(Pstatus);

                    String a = txtPremeare.getText();
                    String sql2 = "DELETE FROM `premeire` WHERE premeireStatus = '" + Pstatus + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }


    }//GEN-LAST:event_btnDeletePremereActionPerformed

    private void jTable7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable7MouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) jTable7.getModel();
        if (jTable7.getModel().getRowCount() > 0) {
            if (jTable7.getSelectedRowCount() == 1) {
                int rowIndex = jTable7.getSelectedRow();
                int id = (Integer) jTable7.getModel().getValueAt(rowIndex, 0);
                String category = jTable7.getModel().getValueAt(rowIndex, 1).toString();
                txtPremeare.setText(category);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_jTable7MouseClicked

    private void btnentryfeeAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentryfeeAddActionPerformed
        String premereAdd = txtentryfee.getText();
        try {
            String quary = "INSERT INTO `entryfee`(`fee`) VALUES ('" + premereAdd + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");

                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getEntryFee();
    }//GEN-LAST:event_btnentryfeeAddActionPerformed

    private void btnentryfeeUpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnentryfeeUpdateMouseClicked
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblentryfee.getModel();
            if (tblentryfee.getModel().getRowCount() > 0) {
                if (tblentryfee.getSelectedRowCount() == 1) {
                    int rowIndex = tblentryfee.getSelectedRow();
                    int id = (Integer) tblentryfee.getModel().getValueAt(rowIndex, 0);
                    String country = tblentryfee.getModel().getValueAt(rowIndex, 1).toString();
                    String as = txtentryfee.getText();
                    String sql2 = "UPDATE `entryfee` SET `fee`='" + as + "' WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnentryfeeUpdateMouseClicked

    private void btnentryfeeDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentryfeeDeleteActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblentryfee.getModel();
            if (tblentryfee.getModel().getRowCount() > 0) {
                if (tblentryfee.getSelectedRowCount() == 1) {
                    int rowIndex = tblentryfee.getSelectedRow();
                    int id = (Integer) tblentryfee.getModel().getValueAt(rowIndex, 0);
                    String Pstatus = tblentryfee.getModel().getValueAt(rowIndex, 1).toString();
                    String sql2 = "DELETE FROM `entryfee` WHERE fee = '" + Pstatus + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnentryfeeDeleteActionPerformed

    private void tblentryfeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblentryfeeMouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) tblentryfee.getModel();
        if (tblentryfee.getModel().getRowCount() > 0) {
            if (tblentryfee.getSelectedRowCount() == 1) {
                int rowIndex = tblentryfee.getSelectedRow();
                int id = (Integer) tblentryfee.getModel().getValueAt(rowIndex, 0);
                String category = tblentryfee.getModel().getValueAt(rowIndex, 1).toString();
                txtentryfee.setText(category);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_tblentryfeeMouseClicked

    private void tblDurationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDurationMouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) tblDuration.getModel();
        if (tblDuration.getModel().getRowCount() > 0) {
            if (tblDuration.getSelectedRowCount() == 1) {
                int rowIndex = tblDuration.getSelectedRow();
                int id = (Integer) tblDuration.getModel().getValueAt(rowIndex, 0);
                String category = tblDuration.getModel().getValueAt(rowIndex, 1).toString();
                txtDuration.setText(category);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_tblDurationMouseClicked

    private void btnDurationAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDurationAddActionPerformed
        String premereAdd = txtDuration.getText();
        try {
            String quary = "INSERT INTO `duration`(`duration`) VALUES ('" + premereAdd + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");

                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getDuration();
    }//GEN-LAST:event_btnDurationAddActionPerformed

    private void btnDurationUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDurationUpdateActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblDuration.getModel();
            if (tblDuration.getModel().getRowCount() > 0) {
                if (tblDuration.getSelectedRowCount() == 1) {
                    int rowIndex = tblDuration.getSelectedRow();
                    int id = (Integer) tblDuration.getModel().getValueAt(rowIndex, 0);
                    String country = tblDuration.getModel().getValueAt(rowIndex, 1).toString();
                    String as = txtDuration.getText();
                    String sql2 = "UPDATE `duration` SET `duration`='" + as + "' WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getDuration();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }


    }//GEN-LAST:event_btnDurationUpdateActionPerformed

    private void btnDurationDelateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDurationDelateActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblDuration.getModel();
            if (tblDuration.getModel().getRowCount() > 0) {
                if (tblDuration.getSelectedRowCount() == 1) {
                    int rowIndex = tblDuration.getSelectedRow();
                    int id = (Integer) tblDuration.getModel().getValueAt(rowIndex, 0);
                    String Pstatus = tblDuration.getModel().getValueAt(rowIndex, 1).toString();
                    String sql2 = "DELETE FROM `duration` WHERE duration = '" + Pstatus + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnDurationDelateActionPerformed

    private void btnProjectStatusAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectStatusAddActionPerformed
        String premereAdd = txtProjectStatus.getText();
        try {
            String quary = "INSERT INTO `p_status`(`project_status`) VALUES ('" + premereAdd + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");

                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getProjectStatus();
    }//GEN-LAST:event_btnProjectStatusAddActionPerformed

    private void btnProjectStatusUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectStatusUpdateActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable10.getModel();
            if (jTable10.getModel().getRowCount() > 0) {
                if (jTable10.getSelectedRowCount() == 1) {
                    int rowIndex = jTable10.getSelectedRow();
                    int id = (Integer) jTable10.getModel().getValueAt(rowIndex, 0);
                    String country = jTable10.getModel().getValueAt(rowIndex, 1).toString();
                    String as = txtProjectStatus.getText();
                    String sql2 = "UPDATE `p_status` SET `project_status`='" + as + "' WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getProjectStatus();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnProjectStatusUpdateActionPerformed

    private void btnProjectStatusDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProjectStatusDeleteActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable10.getModel();
            if (jTable10.getModel().getRowCount() > 0) {
                if (jTable10.getSelectedRowCount() == 1) {
                    int rowIndex = jTable10.getSelectedRow();
                    int id = (Integer) jTable10.getModel().getValueAt(rowIndex, 0);
                    String Pstatus = jTable10.getModel().getValueAt(rowIndex, 1).toString();
                    String sql2 = "DELETE FROM `p_status` WHERE project_status = '" + Pstatus + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnProjectStatusDeleteActionPerformed

    private void jTable10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable10MouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) jTable10.getModel();
        if (jTable10.getModel().getRowCount() > 0) {
            if (jTable10.getSelectedRowCount() == 1) {
                int rowIndex = jTable10.getSelectedRow();
                int id = (Integer) jTable10.getModel().getValueAt(rowIndex, 0);
                String category = jTable10.getModel().getValueAt(rowIndex, 1).toString();
                txtProjectStatus.setText(category);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_jTable10MouseClicked

    private void btnTalentAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTalentAddActionPerformed
        String premereAdd = txtTalent.getText();
        try {
            String quary = "INSERT INTO `taelent`(`taelent`) VALUES ('" + premereAdd + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");

                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getTalent();

    }//GEN-LAST:event_btnTalentAddActionPerformed

    private void btnTalentUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTalentUpdateActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblTalent.getModel();
            if (tblTalent.getModel().getRowCount() > 0) {
                if (tblTalent.getSelectedRowCount() == 1) {
                    int rowIndex = tblTalent.getSelectedRow();
                    int id = (Integer) tblTalent.getModel().getValueAt(rowIndex, 0);
                    String country = tblTalent.getModel().getValueAt(rowIndex, 1).toString();
                    String as = txtTalent.getText();
                    String sql2 = "UPDATE `taelent` SET `taelent`='" + as + "' WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getTalent();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnTalentUpdateActionPerformed

    private void btnTalentDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTalentDeleteActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblTalent.getModel();
            if (tblTalent.getModel().getRowCount() > 0) {
                if (tblTalent.getSelectedRowCount() == 1) {
                    int rowIndex = tblTalent.getSelectedRow();
                    int id = (Integer) tblTalent.getModel().getValueAt(rowIndex, 0);
                    String Pstatus = tblTalent.getModel().getValueAt(rowIndex, 1).toString();
                    String sql2 = "DELETE FROM `taelent` WHERE taelent = '" + Pstatus + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnTalentDeleteActionPerformed

    private void tblTalentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblTalentMouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) tblTalent.getModel();
        if (tblTalent.getModel().getRowCount() > 0) {
            if (tblTalent.getSelectedRowCount() == 1) {
                int rowIndex = tblTalent.getSelectedRow();
                int id = (Integer) tblTalent.getModel().getValueAt(rowIndex, 0);
                String category = tblTalent.getModel().getValueAt(rowIndex, 1).toString();
                txtTalent.setText(category);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_tblTalentMouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) jTable4.getModel();
        if (jTable4.getModel().getRowCount() > 0) {
            if (jTable4.getSelectedRowCount() == 1) {
                int rowIndex = jTable4.getSelectedRow();
                int id = (Integer) jTable4.getModel().getValueAt(rowIndex, 0);
                String email = jTable4.getModel().getValueAt(rowIndex, 1).toString();
                String Password = jTable4.getModel().getValueAt(rowIndex, 2).toString();
                String type = jTable4.getModel().getValueAt(rowIndex, 3).toString();

                txtEmail.setText(email);
                txtPassword.setText(Password);
                cmbUType.setSelectedItem(type);
                sid.setId(id);

            }
        }
    }//GEN-LAST:event_jTable4MouseClicked

    private void btnUserAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserAddActionPerformed
        String email = txtEmail.getText();
        String pass = txtPassword.getText();
        String utype = cmbUType.getSelectedItem().toString();
        try {
            String quary = "INSERT INTO `user`(`email`, `password`, `type`) VALUES ('" + email + "','" + pass + "','" + utype + "')";
            boolean rs = d.statement.execute(quary);
            while (rs = true) {
                JOptionPane.showMessageDialog(null, "Successfull");

                break;
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
        getUser();

    }//GEN-LAST:event_btnUserAddActionPerformed

    private void btnUserUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserUpdateActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable4.getModel();
            if (jTable4.getModel().getRowCount() > 0) {
                if (jTable4.getSelectedRowCount() == 1) {
                    int rowIndex = jTable4.getSelectedRow();
                    int id = (Integer) jTable4.getModel().getValueAt(rowIndex, 0);
                    String country = jTable4.getModel().getValueAt(rowIndex, 1).toString();
                    String email = txtEmail.getText();
                    String pass = txtPassword.getText();
                    String utype = cmbUType.getSelectedItem().toString();

                    String sql2 = "UPDATE `user` SET `email`='" + email + "',`password`='" + pass + "',`type`='" + utype + "' WHERE `id`='" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getUser();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }

    }//GEN-LAST:event_btnUserUpdateActionPerformed

    private void btnUserDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserDeleteActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable4.getModel();
            if (jTable4.getModel().getRowCount() > 0) {
                if (jTable4.getSelectedRowCount() == 1) {
                    int rowIndex = jTable4.getSelectedRow();
                    
                    int id = (Integer) jTable4.getModel().getValueAt(rowIndex, 0);
                    String Pstatus = jTable4.getModel().getValueAt(rowIndex, 1).toString();
                    String sql2 = "DELETE FROM `user` WHERE id = '" + id + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnUserDeleteActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        try {
            String name = txtFName.getText();
            String country = cmbCountry.getSelectedItem().toString();
            String category = cmbCategory.getSelectedItem().toString();

            java.sql.Date startDate = new java.sql.Date(entryStartDate.getDate().getTime());
            java.sql.Date endDate = new java.sql.Date(EntryEndDate.getDate().getTime());
            java.sql.Date festivalDate = new java.sql.Date(FestivalDate.getDate().getTime());
            java.sql.Date productionDate = new java.sql.Date(productiondate.getDate().getTime());

            String premereStatus = cmbPremire.getSelectedItem().toString();
            String festivalRating = cmbfestivalRating.getSelectedItem().toString();
            String festivalWeb = festivalWebsite.getText();
            String about = aboutFestival.getText();
            double Entryfee = Double.parseDouble(cmbEntryfee.getSelectedItem().toString());
            double duration = Double.parseDouble(cmbduration.getSelectedItem().toString());

            String sql = "INSERT INTO `festival`(`festival_name`, `country`, `category`, `entry_start_date`, `entry_deadline`, `festival_date`, `premire_status`, `production_date`, `festival_rating`, `festival_website`, `about`, `entry_fee`, `duration`) "
                    + "VALUES ('" + name + "','" + country + "','" + category + "','" + startDate + "','" + endDate + "','" + festivalDate + "','" + premereStatus + "','" + productionDate + "','" + festivalRating + "','" + festivalWeb + "','" + about + "','" + Entryfee + "','" + duration + "')";
            d.statement.executeUpdate(sql);

            getFestival();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnUserCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserCleanActionPerformed

        txtEmail.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnUserCleanActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        txtFName.setText("");
        festivalWebsite.setText("");
        aboutFestival.setText("");

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getModel().getRowCount() > 0) {
            if (jTable1.getSelectedRowCount() == 1) {
                try {
                    int rowIndex = jTable1.getSelectedRow();
                    int id = (Integer) jTable1.getModel().getValueAt(rowIndex, 0);
                    String festival_name = jTable1.getModel().getValueAt(rowIndex, 1).toString();
                    String country = jTable1.getModel().getValueAt(rowIndex, 2).toString();
                    String category = jTable1.getModel().getValueAt(rowIndex, 3).toString();

                    Date entry_start_date = (Date) mdlInv.getValueAt(rowIndex, 4);
                    Date entry_deadline = (Date) mdlInv.getValueAt(rowIndex, 5);
                    Date festival_date = (Date) mdlInv.getValueAt(rowIndex, 6);
                    Date production_date = (Date) mdlInv.getValueAt(rowIndex, 8);

                    String premire_status = jTable1.getModel().getValueAt(rowIndex, 7).toString();

                    String festival_rating = jTable1.getModel().getValueAt(rowIndex, 9).toString();
                    String festival_website = jTable1.getModel().getValueAt(rowIndex, 10).toString();
                    String about = jTable1.getModel().getValueAt(rowIndex, 11).toString();
                    double entry_fee =(Double) jTable1.getModel().getValueAt(rowIndex, 12);
                    double duration = (Double)jTable1.getModel().getValueAt(rowIndex, 13);

                    txtFName.setText(festival_name);
                    cmbCountry.setSelectedItem(country);
                    cmbCategory.setSelectedItem(category);
                    entryStartDate.setDate(entry_start_date);
                    EntryEndDate.setDate(entry_deadline);
                    FestivalDate.setDate(festival_date);
                    productiondate.setDate(production_date);
                    cmbPremire.setSelectedItem(premire_status);
                    cmbfestivalRating.setSelectedItem(festival_rating);
                    festivalWebsite.setText(festival_website);
                    aboutFestival.setText(about);
                    cmbEntryfee.setSelectedItem(String.format("%.2f", entry_fee));
                    cmbduration.setSelectedItem(String.format("%.2f", duration));

                    sid.setId(id);
                } catch (Exception ex) {
                    Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable1.getModel();
            if (jTable1.getModel().getRowCount() > 0) {
                if (jTable1.getSelectedRowCount() == 1) {
                    int rowIndex = jTable1.getSelectedRow();

                    String name = txtFName.getText();
                    String country = cmbCountry.getSelectedItem().toString();
                    String category = cmbCategory.getSelectedItem().toString();

                    java.sql.Date startDate = new java.sql.Date(entryStartDate.getDate().getTime());
                    java.sql.Date endDate = new java.sql.Date(EntryEndDate.getDate().getTime());
                    java.sql.Date festivalDate = new java.sql.Date(FestivalDate.getDate().getTime());
                    java.sql.Date productionDate = new java.sql.Date(productiondate.getDate().getTime());

                    String premereStatus = cmbPremire.getSelectedItem().toString();
                    String festivalRating = cmbfestivalRating.getSelectedItem().toString();
                    String festivalWeb = festivalWebsite.getText();
                    String about = aboutFestival.getText();
                    double Entryfee = Double.parseDouble(cmbEntryfee.getSelectedItem().toString());
                    double duration = Double.parseDouble(cmbduration.getSelectedItem().toString());

                    String sql2 = "UPDATE `festival` SET `festival_name`='" + name + "', `country`='" + country + "', `category`='" + category + "', `entry_start_date`='" + startDate + "',"
                            + " `entry_deadline`='" + endDate + "', `festival_date`='" + festivalDate + "', `premire_status`='" + premereStatus + "', `production_date`='" + productionDate + "',"
                            + " `festival_rating`='" + festivalRating + "', `festival_website`='" + festivalWeb + "', `about`='" + about + "', `entry_fee`='" + Entryfee + "',"
                            + " `duration`='" + duration + "' WHERE id = '" + sid.getId() + "'";

                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getFestival();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) jTable1.getModel();
            if (jTable1.getModel().getRowCount() > 0) {
                if (jTable1.getSelectedRowCount() == 1) {
                    int rowIndex = jTable1.getSelectedRow();

                    String sql2 = "DELETE FROM `festival` WHERE id = '" + sid.getId() + "'";

                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            String title = pTitle.getText();
            String director = pDirector.getText();
            String category = pcmbCategory.getSelectedItem().toString();
            java.sql.Date productionDate = new java.sql.Date(pProductionDate.getDate().getTime());
            String duration = pcmbDuration.getSelectedItem().toString();
            String premereStatus = pcmbPremereStatus.getSelectedItem().toString();
            String projectLink = pProjectLink.getText();
            String synopsis = pSynopsis.getText();
            String about = pAbout.getText();
            String projectStatus = pcmbProjectStatus.getSelectedItem().toString();

            String sql = "INSERT INTO `project`(`title`, `director`, `category`, `production_date`, `duration`, `premeire_Status`, `project_link`, `synopsis`, `about`, `project_status`) VALUES "
                    + "('" + title + "','" + director + "','" + category + "','" + productionDate + "','" + duration + "','" + premereStatus + "','" + projectLink + "','" + synopsis + "','" + about + "','" + projectStatus + "')";
            d.statement.executeUpdate(sql);

            getProject();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void tblprojectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblprojectMouseClicked
        DefaultTableModel mdlInvs = (DefaultTableModel) tblproject.getModel();
        if (tblproject.getModel().getRowCount() > 0) {
            if (tblproject.getSelectedRowCount() == 1) {
                try {
                    int rowIndex = tblproject.getSelectedRow();
                    int id = (Integer) tblproject.getModel().getValueAt(rowIndex, 0);
                    String title = tblproject.getModel().getValueAt(rowIndex, 1).toString();
                    String director = tblproject.getModel().getValueAt(rowIndex, 2).toString();
                    String category = tblproject.getModel().getValueAt(rowIndex, 3).toString();
                    Date ss = (Date) mdlInvs.getValueAt(rowIndex, 4);
                    double durationRequirment = (Double)tblproject.getModel().getValueAt(rowIndex, 5);
                    String premereStatus = tblproject.getModel().getValueAt(rowIndex, 6).toString();
                    String projectLink = tblproject.getModel().getValueAt(rowIndex, 7).toString();
                    String sinopsis = tblproject.getModel().getValueAt(rowIndex, 8).toString();
                    String aboutProject = tblproject.getModel().getValueAt(rowIndex, 9).toString();
                    String projectStatus = tblproject.getModel().getValueAt(rowIndex, 10).toString();

                    pTitle.setText(title);
                    pDirector.setText(director);
                    pcmbCategory.setSelectedItem(category);
                    pProductionDate.setDate(ss);
                    //pcmbDuration.setSelectedItem(durationRequirment);
                    pcmbPremereStatus.setSelectedItem(premereStatus);
                    pProjectLink.setText(projectLink);
                    pSynopsis.setText(sinopsis);
                    pAbout.setText(aboutProject);
                    pcmbProjectStatus.setSelectedItem(projectStatus);
                    //fEntryFee.setSelectedItem(String.format("%.2f", entry_fee));
                    pcmbDuration.setSelectedItem(String.format("%.2f", durationRequirment));

                    sid.setId(id);
                } catch (Exception ex) {
                    Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_tblprojectMouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblproject.getModel();
            if (tblproject.getModel().getRowCount() > 0) {
                if (tblproject.getSelectedRowCount() == 1) {
                    int rowIndex = tblproject.getSelectedRow();

                    String title = pTitle.getText();
                    String director = pDirector.getText();
                    String category = pcmbCategory.getSelectedItem().toString();
                    java.sql.Date productionDate = new java.sql.Date(pProductionDate.getDate().getTime());
                    String duration = pcmbDuration.getSelectedItem().toString();
                    String premereStatus = pcmbPremereStatus.getSelectedItem().toString();
                    String projectLink = pProjectLink.getText();
                    String synopsis = pSynopsis.getText();
                    String about = pAbout.getText();
                    String projectStatus = pcmbProjectStatus.getSelectedItem().toString();

                    String sql2 = "UPDATE `project` SET `title`='" + title + "',`director`='" + director + "',`category`='" + category + "',`production_date`='" + productionDate + "',`duration`='" + duration + "',`premeire_Status`='" + premereStatus + "',`project_link`='" + projectLink + "',`synopsis`='" + synopsis + "',`about`='" + about + "',`project_status`='" + projectStatus + "' WHERE id = '" + sid.getId() + "'";

                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");

                    mdlInv.setRowCount(0);
                    getProject();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblproject.getModel();
            if (tblproject.getModel().getRowCount() > 0) {
                if (tblproject.getSelectedRowCount() == 1) {
                    int rowIndex = tblproject.getSelectedRow();

                    String sql2 = "DELETE FROM `project` WHERE id = '" + sid.getId() + "'";

                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.removeRow(rowIndex);

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try {
            String name = txtFundName.getText();
            String country = fCmbCountry.getSelectedItem().toString();
            String category = fCmbCategory.getSelectedItem().toString();
            String talent = fCmbTalent.getSelectedItem().toString();
            java.sql.Date fundApplyDate = new java.sql.Date(fApplyDate.getDate().getTime());
            java.sql.Date fundEndDate = new java.sql.Date(fEndDate.getDate().getTime());
            String projectStatus = fCmbProjectStatus.getSelectedItem().toString();
            String sql = "INSERT INTO `fund`(`country`, `fund_name`, `category`, `talent`, `apply_date`, `apply_end_date`, `project_status`) VALUES"
                    + " ('" + country + "','" + name + "','" + category + "','" + talent + "','" + fundApplyDate + "','" + fundEndDate + "','" + projectStatus + "')";
            d.statement.executeUpdate(sql);

            getFund();
        } catch (SQLException ex) {
            Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void tblfundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblfundMouseClicked
        DefaultTableModel mdlInvd = (DefaultTableModel) tblfund.getModel();
        if (tblfund.getModel().getRowCount() > 0) {
            if (tblfund.getSelectedRowCount() == 1) {
                try {
                    int rowIndex = tblfund.getSelectedRow();
                    int id = (Integer) tblfund.getModel().getValueAt(rowIndex, 0);
                    String country = tblfund.getModel().getValueAt(rowIndex, 1).toString();
                    String name = tblfund.getModel().getValueAt(rowIndex, 2).toString();
                    String category = tblfund.getModel().getValueAt(rowIndex, 3).toString();
                    String telent = tblfund.getModel().getValueAt(rowIndex, 4).toString();

                    Date applyDate = (Date) mdlInvd.getValueAt(rowIndex, 5);
                    Date endDate = (Date) mdlInvd.getValueAt(rowIndex, 6);

                    String projectStatus = tblfund.getModel().getValueAt(rowIndex, 7).toString();

                    txtFundName.setText(name);
                    fCmbCountry.setSelectedItem(country);
                    fCmbCategory.setSelectedItem(category);
                    fCmbTalent.setSelectedItem(telent);
                    fApplyDate.setDate(applyDate);
                    fEndDate.setDate(endDate);
                    fCmbProjectStatus.setSelectedItem(projectStatus);
                    sid.setId(id);
                } catch (Exception ex) {
                    Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_tblfundMouseClicked

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        try {
            DefaultTableModel mdlInvd = (DefaultTableModel) tblfund.getModel();
            if (tblfund.getModel().getRowCount() > 0) {
                if (tblfund.getSelectedRowCount() == 1) {
                    int rowIndex = tblproject.getSelectedRow();
                    String name = txtFundName.getText();
                    String country = fCmbCountry.getSelectedItem().toString();
                    String category = fCmbCategory.getSelectedItem().toString();
                    String talent = fCmbTalent.getSelectedItem().toString();
                    java.sql.Date fundApplyDate = new java.sql.Date(fApplyDate.getDate().getTime());
                    java.sql.Date fundEndDate = new java.sql.Date(fEndDate.getDate().getTime());
                    String projectStatus = fCmbProjectStatus.getSelectedItem().toString();
                    String sql = "UPDATE `fund` SET `country`='" + country + "',`fund_name`='" + name + "',`category`='" + category + "',`talent`='" + talent + "',`apply_date`='" + fundApplyDate + "',`apply_end_date`='" + fundEndDate + "',`project_status`='" + projectStatus + "' WHERE id= '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInvd.setRowCount(0);
                    getFund();
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        try {
            DefaultTableModel mdlInvd = (DefaultTableModel) tblfund.getModel();
            if (tblfund.getModel().getRowCount() > 0) {
                if (tblfund.getSelectedRowCount() == 1) {
                    int rowIndex = tblfund.getSelectedRow();
                    String sql = "DELETE FROM `fund` WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInvd.removeRow(rowIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        txtFundName.setText("");
    }//GEN-LAST:event_jButton12ActionPerformed

    private void btnentryfeeUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnentryfeeUpdateActionPerformed

        try {

            DefaultTableModel mdlInv = (DefaultTableModel) tblentryfee.getModel();
            if (tblentryfee.getModel().getRowCount() > 0) {
                if (tblentryfee.getSelectedRowCount() == 1) {
                    int rowIndex = tblentryfee.getSelectedRow();
                    int id = (Integer) tblentryfee.getModel().getValueAt(rowIndex, 0);
                    String country = tblentryfee.getModel().getValueAt(rowIndex, 1).toString();
                    //txtPremeare.setText(country);

                    String as = txtentryfee.getText();
                    String sql2 = "UPDATE `entryfee` SET `fee`='" + as + "' WHERE id = '" + sid.getId() + "'";
                    d.statement.executeUpdate(sql2);
                    JOptionPane.showMessageDialog(null, "ok");
                    mdlInv.setRowCount(0);
                    getEntryFee();

                } else {
                    JOptionPane.showMessageDialog(null, "failed");
                }
            }
        } catch (HeadlessException | SQLException e) {
        }
    }//GEN-LAST:event_btnentryfeeUpdateActionPerformed
    public void getFund() {
        try {
            String Quary = "SELECT * FROM `fund`";
            ResultSet rs = d.statement.executeQuery(Quary);
            tblfund.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getProject() {
        try {
            String Quary = "SELECT * FROM `project`";
            ResultSet rs = d.statement.executeQuery(Quary);
            tblproject.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getFestival() {
        try {
            String Quary = "SELECT * FROM `festival`";
            ResultSet rs = d.statement.executeQuery(Quary);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getCategory() {
        try {
            String Quary = "SELECT * FROM `category`";
            ResultSet rs = d.statement.executeQuery(Quary);
            tblcategory.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getCategoryItem() {
        try {
            String Quary = "SELECT * FROM `category`";
            ResultSet rs = d.statement.executeQuery(Quary);

            while (rs.next()) {
                String aa = rs.getString("category");
                cmbCategory.addItem(aa);
                pcmbCategory.addItem(aa);
                fCmbCategory.addItem(aa);
            }
        } catch (SQLException e) {
        }

    }

    public void getCountry() {
        try {
            String Quary = "SELECT * FROM `country`";
            ResultSet rs = d.statement.executeQuery(Quary);
            jTable6.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getCountryItem() {
        try {
            String Quary = "SELECT * FROM `country`";
            ResultSet rs = d.statement.executeQuery(Quary);

            while (rs.next()) {
                String aa = rs.getString("country");
                cmbCountry.addItem(aa);
                fCmbCountry.addItem(aa);
            }
        } catch (SQLException e) {
        }
    }

    public void getPremere() {
        try {
            String Quary = "SELECT * FROM `premeire`";
            ResultSet rs = d.statement.executeQuery(Quary);
            jTable7.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getPremereItem() {
        try {
            String Quary = "SELECT * FROM `premeire`";
            ResultSet rs = d.statement.executeQuery(Quary);

            while (rs.next()) {
                String aa = rs.getString("premeireStatus");
                cmbPremire.addItem(aa);
                pcmbPremereStatus.addItem(aa);
            }
        } catch (SQLException e) {
        }
    }

    public void getEntryFee() {
        try {
            String Quary = "SELECT * FROM `entryfee`";
            ResultSet rs = d.statement.executeQuery(Quary);
            tblentryfee.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getEntryFeeItem() {
        try {
            String Quary = "SELECT * FROM `entryfee`";
            ResultSet rs = d.statement.executeQuery(Quary);
            while (rs.next()) {
                String aa = rs.getString("fee");
                cmbEntryfee.addItem(aa);
            }
        } catch (SQLException e) {
        }
    }

    public void getDuration() {
        try {
            String Quary = "SELECT * FROM `duration`";
            ResultSet rs = d.statement.executeQuery(Quary);
            tblDuration.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getDurationItem() {
        try {
            String Quary = "SELECT * FROM `duration`";
            ResultSet rs = d.statement.executeQuery(Quary);

            while (rs.next()) {
                String aa = rs.getString("duration");
                cmbduration.addItem(aa);
                pcmbDuration.addItem(aa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }

    }

    public void getProjectStatus() {
        try {
            String Quary = "SELECT * FROM `p_status`";
            ResultSet rs = d.statement.executeQuery(Quary);
            jTable10.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getProjectStatusItem() {
        try {
            String Quary = "SELECT * FROM `p_status`";
            ResultSet rs = d.statement.executeQuery(Quary);

            while (rs.next()) {
                String aa = rs.getString("project_status");
                pcmbProjectStatus.addItem(aa);
               // pcmbProjectStatus.addItem(aa);
                fCmbProjectStatus.addItem(aa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }

    }

    public void getTalent() {
        try {
            String Quary = "SELECT * FROM `taelent`";
            ResultSet rs = d.statement.executeQuery(Quary);
            tblTalent.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getTalentItem() {
        try {
            String Quary = "SELECT * FROM `taelent`";
            ResultSet rs = d.statement.executeQuery(Quary);

            while (rs.next()) {
                String aa = rs.getString("taelent");
                fCmbTalent.addItem(aa);
                //fCmbTalent.addItem(aa);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }

    }

    public void getUser() {
        try {
            String Quary = "SELECT * FROM `user`";
            ResultSet rs = d.statement.executeQuery(Quary);
            jTable4.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new AdminPane().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser EntryEndDate;
    private com.toedter.calendar.JDateChooser FestivalDate;
    private javax.swing.JTextArea aboutFestival;
    private javax.swing.JButton btnCategoryDelete;
    private javax.swing.JButton btnCountryAdd;
    private javax.swing.JButton btnCountryDelete;
    private javax.swing.JButton btnCountryUpdate;
    private javax.swing.JButton btnDeletePremere;
    private javax.swing.JButton btnDurationAdd;
    private javax.swing.JButton btnDurationDelate;
    private javax.swing.JButton btnDurationUpdate;
    private javax.swing.JButton btnProjectStatusAdd;
    private javax.swing.JButton btnProjectStatusDelete;
    private javax.swing.JButton btnProjectStatusUpdate;
    private javax.swing.JButton btnTalentAdd;
    private javax.swing.JButton btnTalentDelete;
    private javax.swing.JButton btnTalentUpdate;
    private javax.swing.JButton btnUpdatePremere;
    private javax.swing.JButton btnUserAdd;
    private javax.swing.JButton btnUserClean;
    private javax.swing.JButton btnUserDelete;
    private javax.swing.JButton btnUserUpdate;
    private javax.swing.JButton btnaddPremere;
    private javax.swing.JButton btncategoryAdd;
    private javax.swing.JButton btncategoryUpdate;
    public javax.swing.JButton btnentryfeeAdd;
    public javax.swing.JButton btnentryfeeDelete;
    public javax.swing.JButton btnentryfeeUpdate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbCountry;
    public javax.swing.JComboBox<String> cmbEntryfee;
    private javax.swing.JComboBox<String> cmbPremire;
    private javax.swing.JComboBox<String> cmbUType;
    private javax.swing.JComboBox<String> cmbduration;
    private javax.swing.JComboBox<String> cmbfestivalRating;
    private com.toedter.calendar.JDateChooser entryStartDate;
    private com.toedter.calendar.JDateChooser fApplyDate;
    private javax.swing.JComboBox<String> fCmbCategory;
    private javax.swing.JComboBox<String> fCmbCountry;
    private javax.swing.JComboBox<String> fCmbProjectStatus;
    private javax.swing.JComboBox<String> fCmbTalent;
    private com.toedter.calendar.JDateChooser fEndDate;
    private javax.swing.JTextField festivalWebsite;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton100;
    private javax.swing.JButton jButton101;
    private javax.swing.JButton jButton102;
    private javax.swing.JButton jButton103;
    private javax.swing.JButton jButton104;
    private javax.swing.JButton jButton105;
    private javax.swing.JButton jButton106;
    private javax.swing.JButton jButton107;
    private javax.swing.JButton jButton108;
    private javax.swing.JButton jButton109;
    private javax.swing.JButton jButton110;
    private javax.swing.JButton jButton111;
    private javax.swing.JButton jButton112;
    private javax.swing.JButton jButton113;
    private javax.swing.JButton jButton114;
    private javax.swing.JButton jButton115;
    private javax.swing.JButton jButton116;
    private javax.swing.JButton jButton117;
    private javax.swing.JButton jButton118;
    private javax.swing.JButton jButton119;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton120;
    private javax.swing.JButton jButton121;
    private javax.swing.JButton jButton122;
    private javax.swing.JButton jButton123;
    private javax.swing.JButton jButton124;
    private javax.swing.JButton jButton125;
    private javax.swing.JButton jButton126;
    private javax.swing.JButton jButton127;
    private javax.swing.JButton jButton128;
    private javax.swing.JButton jButton129;
    private javax.swing.JButton jButton130;
    private javax.swing.JButton jButton131;
    private javax.swing.JButton jButton132;
    private javax.swing.JButton jButton133;
    private javax.swing.JButton jButton134;
    private javax.swing.JButton jButton135;
    private javax.swing.JButton jButton136;
    private javax.swing.JButton jButton137;
    private javax.swing.JButton jButton138;
    private javax.swing.JButton jButton139;
    private javax.swing.JButton jButton140;
    private javax.swing.JButton jButton141;
    private javax.swing.JButton jButton142;
    private javax.swing.JButton jButton143;
    private javax.swing.JButton jButton144;
    private javax.swing.JButton jButton145;
    private javax.swing.JButton jButton146;
    private javax.swing.JButton jButton147;
    private javax.swing.JButton jButton148;
    private javax.swing.JButton jButton149;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton150;
    private javax.swing.JButton jButton151;
    private javax.swing.JButton jButton152;
    private javax.swing.JButton jButton153;
    private javax.swing.JButton jButton154;
    private javax.swing.JButton jButton155;
    private javax.swing.JButton jButton156;
    private javax.swing.JButton jButton157;
    private javax.swing.JButton jButton158;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton69;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton70;
    private javax.swing.JButton jButton71;
    private javax.swing.JButton jButton72;
    private javax.swing.JButton jButton73;
    private javax.swing.JButton jButton74;
    private javax.swing.JButton jButton75;
    private javax.swing.JButton jButton76;
    private javax.swing.JButton jButton77;
    private javax.swing.JButton jButton78;
    private javax.swing.JButton jButton79;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton80;
    private javax.swing.JButton jButton81;
    private javax.swing.JButton jButton82;
    private javax.swing.JButton jButton83;
    private javax.swing.JButton jButton84;
    private javax.swing.JButton jButton85;
    private javax.swing.JButton jButton86;
    private javax.swing.JButton jButton87;
    private javax.swing.JButton jButton88;
    private javax.swing.JButton jButton89;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton90;
    private javax.swing.JButton jButton91;
    private javax.swing.JButton jButton92;
    private javax.swing.JButton jButton93;
    private javax.swing.JButton jButton94;
    private javax.swing.JButton jButton95;
    private javax.swing.JButton jButton96;
    private javax.swing.JButton jButton97;
    private javax.swing.JButton jButton98;
    private javax.swing.JButton jButton99;
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
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable10;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable6;
    private javax.swing.JTable jTable7;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextArea pAbout;
    private javax.swing.JTextField pDirector;
    private com.toedter.calendar.JDateChooser pProductionDate;
    private javax.swing.JTextField pProjectLink;
    private javax.swing.JTextField pSynopsis;
    private javax.swing.JTextField pTitle;
    private javax.swing.JComboBox<String> pcmbCategory;
    private javax.swing.JComboBox<String> pcmbDuration;
    private javax.swing.JComboBox<String> pcmbPremereStatus;
    private javax.swing.JComboBox<String> pcmbProjectStatus;
    private com.toedter.calendar.JDateChooser productiondate;
    private javax.swing.JTable tblDuration;
    private javax.swing.JTable tblTalent;
    private javax.swing.JTable tblcategory;
    public javax.swing.JTable tblentryfee;
    private javax.swing.JTable tblfund;
    private javax.swing.JTable tblproject;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtFundName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPremeare;
    private javax.swing.JTextField txtProjectStatus;
    private javax.swing.JTextField txtTalent;
    private javax.swing.JTextField txtcategoryadd;
    public javax.swing.JTextField txtentryfee;
    // End of variables declaration//GEN-END:variables

}
