package KhonaTokig;

import JavaClasses.FestData;
import JavaClasses.DBconnection;
import JavaClasses.FundPojo;
import JavaClasses.IdStore;
import JavaClasses.ProjectPojo;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class User extends javax.swing.JFrame {

    IdStore sid = new IdStore();
    DBconnection d = new DBconnection();

    public User() {
        initComponents();
        getFund();
        getProject();
        getFestival();
        getCategoryItem();
        getCountryItem();
        getPremereItem();
        getEntryFeeItem();
        getDurationItem();
        getProjectStatusItem();
        getTalentItem();
        jButton29.setEnabled(false);
        jButton28.setEnabled(false);
        jButton27.setEnabled(false);
        fundProject.setEnabled(false);        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
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
        fName = new javax.swing.JTextField();
        fCountry = new javax.swing.JComboBox<>();
        fEntryStartDate = new com.toedter.calendar.JDateChooser();
        fEntryendDate = new com.toedter.calendar.JDateChooser();
        fFestivalDate = new com.toedter.calendar.JDateChooser();
        fProductionDate = new com.toedter.calendar.JDateChooser();
        fPremereStatus = new javax.swing.JComboBox<>();
        fRating = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        fEntryFee = new javax.swing.JComboBox<>();
        jLabel32 = new javax.swing.JLabel();
        fLessOrGreat = new javax.swing.JComboBox<>();
        fDuration = new javax.swing.JComboBox<>();
        fCategory = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        fromDate = new com.toedter.calendar.JDateChooser();
        toDate = new com.toedter.calendar.JDateChooser();
        cmbDateCategory = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtProject = new javax.swing.JTextField();
        txtDirector = new javax.swing.JTextField();
        cmbCategory = new javax.swing.JComboBox<>();
        productionDate = new com.toedter.calendar.JDateChooser();
        cmbPStatus = new javax.swing.JComboBox<>();
        jLabel38 = new javax.swing.JLabel();
        cmbDuration = new javax.swing.JComboBox<>();
        cmbProStatus = new javax.swing.JComboBox<>();
        cmbLessOrGreat1 = new javax.swing.JComboBox<>();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        cmbDate = new javax.swing.JComboBox<>();
        jDateChooser22 = new com.toedter.calendar.JDateChooser();
        jDateChooser23 = new com.toedter.calendar.JDateChooser();
        jButton10 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        fundProject = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtFundName = new javax.swing.JTextField();
        cmbFundCategory = new javax.swing.JComboBox<>();
        FapplyDate = new com.toedter.calendar.JDateChooser();
        fApplyEndDate = new com.toedter.calendar.JDateChooser();
        jLabel33 = new javax.swing.JLabel();
        cmbFProjectStatus = new javax.swing.JComboBox<>();
        cmbFundTaelent = new javax.swing.JComboBox<>();
        jLabel31 = new javax.swing.JLabel();
        cmbFundCountry = new javax.swing.JComboBox<>();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jDateChooser20 = new com.toedter.calendar.JDateChooser();
        jDateChooser21 = new com.toedter.calendar.JDateChooser();
        jButton9 = new javax.swing.JButton();
        jComboBox17 = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
        jTabbedPane1.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));

        jPanel8.setBackground(new java.awt.Color(0, 0, 0));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton27.setText("Project");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        fCountry.setMaximumRowCount(40);

        fEntryStartDate.setDateFormatString("yyyy-MM-dd");

        fEntryendDate.setDateFormatString("yyyy-MM-dd");

        fFestivalDate.setDateFormatString("yyyy-MM-dd");

        fProductionDate.setDateFormatString("yyyy-MM-dd");

        fRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Here", "1", "2", "3", "4", "5", "6", "7" }));

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel30.setText("Entry Fee:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel32.setText("Duration Requirment:");

        fLessOrGreat.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fLessOrGreat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">", "<=", ">=" }));

        fDuration.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(28, 28, 28)
                                .addComponent(fName))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fCountry, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fEntryendDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(fEntryStartDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fFestivalDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(fProductionDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                    .addComponent(fCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(171, 171, 171)
                                .addComponent(fRating, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fPremereStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel30)
                                    .addComponent(jLabel32))
                                .addGap(137, 137, 137)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addComponent(fLessOrGreat, 0, 65, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fEntryFee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
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
                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fEntryStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEntryendDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fFestivalDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fPremereStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fProductionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fEntryFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fLessOrGreat)
                    .addComponent(fDuration))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        fromDate.setDateFormatString("yyyy-MM-dd");

        toDate.setDateFormatString("yyyy-MM-dd");

        cmbDateCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Entry Start Date", "Entry Deadline", "Festival Date", "Production Date" }));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(cmbDateCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fromDate, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(toDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fromDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbDateCategory)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel10.setBackground(new java.awt.Color(0, 0, 0));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton8.setText("Search");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton28.setText("Fund");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jButton29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton29.setText("Festival");
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jButton29, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        jLabel23.setText("Project Status:");

        productionDate.setDateFormatString("yyyy-MM-dd");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("Duration Requirment:");

        cmbLessOrGreat1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbLessOrGreat1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "=", "<", ">", "<=", ">=" }));

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
                                    .addComponent(jLabel14))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtProject)
                                    .addComponent(txtDirector)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cmbCategory, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(productionDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbPStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cmbProStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel9Layout.createSequentialGroup()
                                        .addComponent(cmbLessOrGreat1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbDuration, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
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
                            .addComponent(txtProject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbPStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbProStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLessOrGreat1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(cmbDuration))
                .addGap(252, 252, 252)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        cmbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Production Date" }));

        jDateChooser22.setDateFormatString("yyyy-MM-dd");

        jDateChooser23.setDateFormatString("yyyy-MM-dd");

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("Search");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(cmbDate, 0, 131, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser22, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser23, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel12.setBackground(new java.awt.Color(153, 153, 153));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        fundProject.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        fundProject.setText("Project");
        fundProject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fundProjectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fundProject, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fundProject, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("F U N D S");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setText("Funds Name:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel22.setText("Fund Category:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel26.setText("Country:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setText("Fund Apply Date:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel29.setText("Project Status:");

        FapplyDate.setDateFormatString("yyyy-MM-dd");

        fApplyEndDate.setDateFormatString("yyyy-MM-dd");

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setText("Fund Apply End Date:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel31.setText("Talent:");

        cmbFundCountry.setMaximumRowCount(40);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                            .addComponent(cmbFundCategory, 0, 228, Short.MAX_VALUE)))
                                    .addComponent(cmbFundCountry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbFProjectStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FapplyDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fApplyEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cmbFundTaelent, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addGap(0, 42, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFundName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFundCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFundCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFundTaelent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FapplyDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fApplyEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbFProjectStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(0, 0, 0));

        jTable3.setAutoCreateRowSorter(true);
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(jTable3);

        jDateChooser20.setDateFormatString("yyyy-MM-dd");

        jDateChooser21.setDateFormatString("yyyy-MM-dd");

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jComboBox17.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fund Apply Date", "Fund Apply End Date" }));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDateChooser21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(5, 5, 5))
            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jDateChooser20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jComboBox17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
            .addGap(0, 1033, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Funds", jPanel4);

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem1.setText("Restart");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setText("Exit");
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

    public void getFund() {
        try {
            String Quary = "SELECT * FROM `fund`";
            ResultSet rs = d.statement.executeQuery(Quary);
            jTable3.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }
    }

    public void getProject() {
        try {
            String Quary = "SELECT * FROM `project`";
            ResultSet rs = d.statement.executeQuery(Quary);
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));

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

    public void getCategoryItem() {
        try {
            String Quary = "SELECT * FROM `category`";
            ResultSet rs = d.statement.executeQuery(Quary);
            cmbFundCategory.addItem("Select Here");
            cmbCategory.addItem("Select Here");
            fCategory.addItem("Select Here");
            while (rs.next()) {
                String aa = rs.getString("category");

                cmbFundCategory.addItem(aa);
                cmbCategory.addItem(aa);
                fCategory.addItem(aa);
            }
        } catch (SQLException e) {
        }

    }

    public void getCountryItem() {
        try {
            String Quary = "SELECT * FROM `country`";
            ResultSet rs = d.statement.executeQuery(Quary);
            cmbFundCountry.addItem("Select Here");
            fCountry.addItem("Select Here");
            while (rs.next()) {
                String aa = rs.getString("country");
                cmbFundCountry.addItem(aa);
                fCountry.addItem(aa);
            }
        } catch (SQLException e) {
        }
    }

    public void getPremereItem() {
        try {
            String Quary = "SELECT * FROM `premeire`";
            ResultSet rs = d.statement.executeQuery(Quary);
            cmbPStatus.addItem("Select Here");
            fPremereStatus.addItem("Select Here");
            while (rs.next()) {
                String aa = rs.getString("premeireStatus");
                cmbPStatus.addItem(aa);
                fPremereStatus.addItem(aa);

            }
        } catch (SQLException e) {
        }
    }

    public void getEntryFeeItem() {
        try {
            String Quary = "SELECT * FROM `entryfee`";
            ResultSet rs = d.statement.executeQuery(Quary);
            fEntryFee.addItem("Select Here");
            while (rs.next()) {
                String aa = rs.getString("fee");
                fEntryFee.addItem(aa);
            }
        } catch (SQLException e) {
        }
    }

    public void getDurationItem() {
        try {
            String Quary = "SELECT * FROM `duration`";
            ResultSet rs = d.statement.executeQuery(Quary);
            cmbDuration.addItem("Select Here");
            fDuration.addItem("Select Here");
            while (rs.next()) {
                String aa = rs.getString("duration");
                cmbDuration.addItem(aa);
                fDuration.addItem(aa);
            }
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
                cmbFProjectStatus.addItem(aa);
                cmbProStatus.addItem(aa);

            }
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
                cmbFundTaelent.addItem(aa);

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Failed");
        }

    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        User us = new User();
        us.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        String premire_status = fPremereStatus.getSelectedItem().toString();
        sid.setPremireStatus(premire_status);
        String cstegory = fCategory.getSelectedItem().toString();
        sid.setCategory(cstegory);
        double Duretion = Double.parseDouble(fDuration.getSelectedItem().toString());
        sid.setTextM(Duretion);
        String lessor = fLessOrGreat.getSelectedItem().toString();
        sid.setLessOrGreater(lessor);

        Project fs = new Project();

        fs.setVisible(true);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        Fund fss = new Fund();
        fss.setVisible(true);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed

        String lessor = cmbLessOrGreat1.getSelectedItem().toString();
        ProjectPojo.setLessor(lessor);
        Festival fs = new Festival();
        fs.setVisible(true);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void fundProjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fundProjectActionPerformed
        Fund_Project fsf = new Fund_Project();
        fsf.setVisible(true);
    }//GEN-LAST:event_fundProjectActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        boolean ok = false;
        int condition = 0;
        String sql = "SELECT * FROM `festival` WHERE ";
        if (!fName.getText().equals("")) {
            String festivalName = fName.getText();
            if (condition < 1) {
                String q = "festival_name = '" + festivalName + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND festival_name = '" + festivalName + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        if (fCountry.getSelectedIndex() > 0) {
            String country = fCountry.getSelectedItem().toString();
            if (condition < 1) {
                String q = "country = '" + country + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND country = '" + country + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }

        if (fCategory.getSelectedIndex() > 0) {
            String cstegory = fCategory.getSelectedItem().toString();
            if (condition < 1) {
                String q = "category = '" + cstegory + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND category = '" + cstegory + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        String sd = ((JTextField) fEntryStartDate.getDateEditor().getUiComponent()).getText();
        if (!sd.equals("")) {
            java.sql.Date startDate = new java.sql.Date(fEntryStartDate.getDate().getTime());
            //Date startDate = (Date) fEntryStartDate.getDate();
            if (condition < 1) {
                String q = "entry_start_date = '" + startDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND entry_start_date = '" + startDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }
        String ed = ((JTextField) fEntryendDate.getDateEditor().getUiComponent()).getText();
        if (!ed.equals("")) {
            java.sql.Date endDate = new java.sql.Date(fEntryendDate.getDate().getTime());
            //Date endDate = (Date) fEntryendDate.getDate();
            if (condition < 1) {
                String q = "entry_deadline = '" + endDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND entry_deadline = '" + endDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }
        if (fRating.getSelectedIndex() > 0) {
            String festival_rating = fRating.getSelectedItem().toString();
            if (condition < 1) {
                String q = "festival_rating= '" + festival_rating + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND festival_rating = '" + festival_rating + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        String fd = ((JTextField) fFestivalDate.getDateEditor().getUiComponent()).getText();
        if (!fd.equals("")) {
            java.sql.Date festivalDate = new java.sql.Date(fFestivalDate.getDate().getTime());
            //Date festivalDate = (Date) fFestivalDate.getDate();
            if (condition < 1) {
                String q = "festival_date = '" + festivalDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND festival_date = '" + festivalDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        String pd = ((JTextField) fProductionDate.getDateEditor().getUiComponent()).getText();
        if (!pd.equals("")) {
            java.sql.Date productionDate = new java.sql.Date(fProductionDate.getDate().getTime());
            //Date productionDate = (Date) fProductionDate.getDate();
            if (condition < 1) {
                String q = "production_date = '" + productionDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND production_date = '" + productionDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }

        if (fPremereStatus.getSelectedIndex() > 0) {
            String premire_status = fPremereStatus.getSelectedItem().toString();
            if (condition < 1) {
                String q = "premire_status = '" + premire_status + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND premire_status = '" + premire_status + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }

        if (fEntryFee.getSelectedIndex() > 0) {
            double Entryfee = Double.parseDouble(fEntryFee.getSelectedItem().toString());
            if (condition < 1) {

                String q = "entry_fee = '" + Entryfee + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND entry_fee = '" + Entryfee + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }

        if (fDuration.getSelectedIndex() > 0) {
            double duration = Double.parseDouble(fDuration.getSelectedItem().toString());
            String lessOrgreat = fLessOrGreat.getSelectedItem().toString();
            if (condition < 1) {

                String q = "duration " + lessOrgreat + " " + duration + " ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND duration " + lessOrgreat + " " + duration + " ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }

        if (ok) {

            try {
                ResultSet rs = d.statement.executeQuery(sql);
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

                condition = 0;

            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) jTable1.getModel();
        FestData fd = new FestData();
        if (jTable1.getModel().getRowCount() > 0) {
            if (jTable1.getSelectedRowCount() == 1) {
                try {

                    int rowIndex = jTable1.getSelectedRow();
                    int id = (Integer) jTable1.getModel().getValueAt(rowIndex, 0);
                    IdStore.setId(id);
                    String festival_name = jTable1.getModel().getValueAt(rowIndex, 1).toString();
                    fd.setFestival_name(festival_name);
                    String country = jTable1.getModel().getValueAt(rowIndex, 2).toString();
                    fd.setCountry(country);
                    String category = jTable1.getModel().getValueAt(rowIndex, 3).toString();
                    fd.setCategory(category);
                    Date entry_start_date = (Date) mdlInv.getValueAt(rowIndex, 4);
                    fd.setEntry_start_date(entry_start_date);
                    Date entry_deadline = (Date) mdlInv.getValueAt(rowIndex, 5);
                    fd.setEntry_deadline(entry_deadline);
                    Date festival_date = (Date) mdlInv.getValueAt(rowIndex, 6);
                    fd.setFestival_date(festival_date);
                    Date production_date = (Date) mdlInv.getValueAt(rowIndex, 8);
                    fd.setProduction_date(production_date);
                    String premire_status = jTable1.getModel().getValueAt(rowIndex, 7).toString();
                    fd.setPremire_status(premire_status);
                    String festival_rating = jTable1.getModel().getValueAt(rowIndex, 9).toString();
                    fd.setFestival_rating(festival_rating);
                    String festival_website = jTable1.getModel().getValueAt(rowIndex, 10).toString();
                    fd.setFestival_website(festival_website);
                    String about = jTable1.getModel().getValueAt(rowIndex, 11).toString();
                    fd.setAbout(about);
                    double entry_fee = (Double) jTable1.getModel().getValueAt(rowIndex, 12);
                    fd.setEntry_fee(entry_fee);
                    double duration = (Double) jTable1.getModel().getValueAt(rowIndex, 13);
                    fd.setDuration(duration);

                    fName.setText(festival_name);
                    fCountry.setSelectedItem(country);
                    fCategory.setSelectedItem(category);
                    fEntryStartDate.setDate(entry_start_date);
                    fEntryendDate.setDate(entry_deadline);
                    fFestivalDate.setDate(festival_date);
                    fProductionDate.setDate(production_date);
                    fPremereStatus.setSelectedItem(premire_status);
                    fRating.setSelectedItem(festival_rating);
                    fEntryFee.setSelectedItem(String.format("%.2f", entry_fee));
                    fDuration.setSelectedItem(String.format("%.2f", duration));
                    sid.setId(id);
                    jButton27.setEnabled(true);

                } catch (Exception ex) {
                    Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String dc = cmbDateCategory.getSelectedItem().toString();
        String colName = "";
        if (dc.equals("Entry Start Date")) {
            colName = "entry_start_date";
        } else if (dc.equals("Entry Deadline")) {
            colName = "entry_deadline";
        } else if (dc.equals("Festival Date")) {
            colName = "festival_date";
        } else if (dc.equals("Production Date")) {
            colName = "production_date";
        }
        boolean ok = false;
        String fd = ((JTextField) fromDate.getDateEditor().getUiComponent()).getText();
        String td = ((JTextField) toDate.getDateEditor().getUiComponent()).getText();
        String sql = "";
        if (!fd.equals("") && !td.equals("")) {
            java.sql.Date from_date = new java.sql.Date(fromDate.getDate().getTime());
            java.sql.Date to_date = new java.sql.Date(toDate.getDate().getTime());
            sql = "SELECT * FROM `festival` WHERE " + colName + " BETWEEN '" + from_date + "' AND '" + to_date + "'";
            ok = true;
        }
        if (ok) {
            try {
                ResultSet rs = d.statement.executeQuery(sql);
                jTable1.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException ex) {
                Logger.getLogger(User.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        boolean ok = false;
        int condition = 0;
        String sql = "SELECT * FROM `project` WHERE ";
        if (!txtProject.getText().equals("")) {
            String projectName = txtProject.getText();
            if (condition < 1) {
                String q = "title = '" + projectName + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND title = '" + projectName + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }

        if (!txtDirector.getText().equals("")) {
            String director = txtDirector.getText();
            if (condition < 1) {
                String q = "director = '" + director + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND director = '" + director + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        if (cmbCategory.getSelectedIndex() > 0) {
            String category = cmbCategory.getSelectedItem().toString();
            if (condition < 1) {
                String q = "category = '" + category + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND category = '" + category + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        String pDate = ((JTextField) productionDate.getDateEditor().getUiComponent()).getText();
        if (!pDate.equals("")) {
            java.sql.Date proDate = new java.sql.Date(productionDate.getDate().getTime());
            if (condition < 1) {
                String q = "production_date = '" + proDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND production_date = '" + proDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }

        if (cmbPStatus.getSelectedIndex() > 0) {
            String premereStatus = cmbPStatus.getSelectedItem().toString();
            if (condition < 1) {
                String q = "premeire_Status = '" + premereStatus + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND premeire_Status = '" + premereStatus + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        if (cmbProStatus.getSelectedIndex() > 0) {
            String projectStatus = cmbProStatus.getSelectedItem().toString();
            if (condition < 1) {
                String q = "project_status = '" + projectStatus + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND project_status = '" + projectStatus + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }
        if (cmbDuration.getSelectedIndex() > 0) {
            double duration = Double.parseDouble(cmbDuration.getSelectedItem().toString());
            String lessOrgreat = cmbLessOrGreat1.getSelectedItem().toString();
            if (condition < 1) {

                String q = "duration " + lessOrgreat + " " + duration + " ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND duration " + lessOrgreat + " " + duration + " ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;

        }

        if (ok) {

            try {
                ResultSet rs = d.statement.executeQuery(sql);
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));

                condition = 0;

            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        String dc = cmbDate.getSelectedItem().toString();
        String colName = "";
        if (dc.equals("Production Date")) {
            colName = "production_date";
        }
        boolean ok = false;
        String fd = ((JTextField) jDateChooser22.getDateEditor().getUiComponent()).getText();
        String td = ((JTextField) jDateChooser23.getDateEditor().getUiComponent()).getText();
        String sql = "";
        if (!fd.equals("") && !td.equals("")) {
            java.sql.Date from_date = new java.sql.Date(jDateChooser22.getDate().getTime());
            java.sql.Date to_date = new java.sql.Date(jDateChooser23.getDate().getTime());
            sql = "SELECT * FROM `project` WHERE " + colName + " BETWEEN '" + from_date + "' AND '" + to_date + "'";
            ok = true;
        }
        if (ok) {
            try {
                ResultSet rs = d.statement.executeQuery(sql);
                jTable2.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException ex) {
                Logger.getLogger(User.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        DefaultTableModel mdlInv = (DefaultTableModel) jTable2.getModel();
        ProjectPojo fd = new ProjectPojo();
        if (jTable2.getModel().getRowCount() > 0) {
            if (jTable2.getSelectedRowCount() == 1) {
                try {

                    int rowIndex = jTable2.getSelectedRow();
                    int id = (Integer) jTable2.getModel().getValueAt(rowIndex, 0);
                    String title = jTable2.getModel().getValueAt(rowIndex, 1).toString();
                    fd.setTitle(title);
                    String director = jTable2.getModel().getValueAt(rowIndex, 2).toString();
                    fd.setDirector(director);
                    String category = jTable2.getModel().getValueAt(rowIndex, 3).toString();
                    fd.setCategory(category);
                    Date production_date = (Date) mdlInv.getValueAt(rowIndex, 4);
                    fd.setDate(production_date);
                    double duration = (Double) jTable2.getModel().getValueAt(rowIndex, 5);
                    fd.setDuration(duration);
                    String premire_status = jTable2.getModel().getValueAt(rowIndex, 6).toString();
                    fd.setPremeireStatus(premire_status);
                    String proLink = jTable2.getModel().getValueAt(rowIndex, 7).toString();
                    fd.setProjectlink(proLink);
                    String synopsis = jTable2.getModel().getValueAt(rowIndex, 8).toString();
                    fd.setSynopsis(synopsis);
                    String about = jTable2.getModel().getValueAt(rowIndex, 9).toString();
                    fd.setAbout(about);
                    String project_status = jTable2.getModel().getValueAt(rowIndex, 10).toString();
                    fd.setProject_status(project_status);

                    txtProject.setText(title);
                    txtDirector.setText(director);
                    cmbCategory.setSelectedItem(category);
                    productionDate.setDate(production_date);
                    cmbPStatus.setSelectedItem(premire_status);
                    cmbProStatus.setSelectedItem(project_status);
                    cmbDuration.setSelectedItem(String.format("%.2f", duration));
                    IdStore.setId(id);
                    jButton29.setEnabled(true);
                    jButton28.setEnabled(true);
                    

                } catch (Exception ex) {
                    Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        boolean ok = false;
        int condition = 0;
        String sql = "SELECT * FROM `fund` WHERE ";
        if (!txtFundName.getText().equals("")) {
            String fundName = txtFundName.getText();
            if (condition < 1) {
                String q = "fund_name = '" + fundName + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND fund_name = '" + fundName + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }
        if (cmbFundCountry.getSelectedIndex() > 0) {
            String country = cmbFundCountry.getSelectedItem().toString();
            if (condition < 1) {
                String q = "country = '" + country + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND country = '" + country + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }
        if (cmbFundCategory.getSelectedIndex() > 0) {
            String category = cmbFundCategory.getSelectedItem().toString();
            if (condition < 1) {
                String q = "category = '" + category + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND category = '" + category + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }
        if (cmbFundTaelent.getSelectedIndex() > 0) {
            String telent = cmbFundTaelent.getSelectedItem().toString();
            if (condition < 1) {
                String q = "talent = '" + telent + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND talent = '" + telent + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }

        String pDate = ((JTextField) FapplyDate.getDateEditor().getUiComponent()).getText();
        if (!pDate.equals("")) {
            java.sql.Date proDate = new java.sql.Date(FapplyDate.getDate().getTime());
            if (condition < 1) {
                String q = "apply_date = '" + proDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND apply_date = '" + proDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }
        String lDate = ((JTextField) fApplyEndDate.getDateEditor().getUiComponent()).getText();
        if (!lDate.equals("")) {
            java.sql.Date prosDate = new java.sql.Date(fApplyEndDate.getDate().getTime());
            if (condition < 1) {
                String q = "apply_end_date = '" + prosDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND apply_end_date = '" + prosDate + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }

        if (cmbFProjectStatus.getSelectedIndex() > 0) {
            String pStatus = cmbFProjectStatus.getSelectedItem().toString();
            if (condition < 1) {
                String q = "project_status = '" + pStatus + "' ";
                sql = sql + q;
                condition = condition + 1;
            } else {
                String q = "AND project_status = '" + pStatus + "' ";
                sql = sql + q;
                condition = condition + 1;
            }
            ok = true;
        }

        if (ok) {

            try {
                ResultSet rs = d.statement.executeQuery(sql);
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));

                condition = 0;

            } catch (SQLException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String dc = jComboBox17.getSelectedItem().toString();
        String colName = "";
        if (dc.equals("Fund Apply Date")) {
            colName = "apply_date";
        } else if (dc.equals("Fund Apply End Date")) {
            colName = "apply_end_date";
        }

        boolean ok = false;
        String fd = ((JTextField) jDateChooser20.getDateEditor().getUiComponent()).getText();
        String td = ((JTextField) jDateChooser21.getDateEditor().getUiComponent()).getText();
        String sql = "";
        if (!fd.equals("") && !td.equals("")) {
            java.sql.Date from_date = new java.sql.Date(jDateChooser20.getDate().getTime());
            java.sql.Date to_date = new java.sql.Date(jDateChooser21.getDate().getTime());
            sql = "SELECT * FROM `fund` WHERE " + colName + " BETWEEN '" + from_date + "' AND '" + to_date + "'";
            ok = true;
        }
        if (ok) {
            try {
                ResultSet rs = d.statement.executeQuery(sql);
                jTable3.setModel(DbUtils.resultSetToTableModel(rs));

            } catch (SQLException ex) {
                Logger.getLogger(User.class
                        .getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        FundPojo fd = new FundPojo();
        DefaultTableModel mdlInv = (DefaultTableModel) jTable3.getModel();
        if (jTable3.getModel().getRowCount() > 0) {
            if (jTable3.getSelectedRowCount() == 1) {
                try {

                    int rowIndex = jTable3.getSelectedRow();
                    
                    int id = (Integer) jTable3.getModel().getValueAt(rowIndex, 0);
                    fd.setId(id);
                    String Country = jTable3.getModel().getValueAt(rowIndex, 1).toString();
                    fd.setCountry(Country);
                    String  FundName= jTable3.getModel().getValueAt(rowIndex, 2).toString();
                    fd.setFundName(FundName);
                    String category = jTable3.getModel().getValueAt(rowIndex, 3).toString();
                    fd.setCategory(category);
                    String telent = jTable3.getModel().getValueAt(rowIndex, 4).toString();
                    fd.setTelent(telent);
                    Date applyDate = (Date) mdlInv.getValueAt(rowIndex, 5);
                    fd.setApplyDate(applyDate);
                    Date endDate = (Date) mdlInv.getValueAt(rowIndex, 6);
                    fd.setEndDate(endDate);
                    String project_status = jTable3.getModel().getValueAt(rowIndex, 7).toString();
                    fd.setProjectStatus(project_status);

                    IdStore.setId(id);
                    txtFundName.setText(FundName);
                    cmbFundCountry.setSelectedItem(Country);
                    cmbFundCategory.setSelectedItem(category);
                    cmbFundTaelent.setSelectedItem(telent);
                    FapplyDate.setDate(applyDate);
                    fApplyEndDate.setDate(endDate);
                    cmbFProjectStatus.setSelectedItem(project_status);
                    fundProject.setEnabled(true);
                    

                } catch (Exception ex) {
                    Logger.getLogger(AdminPane.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        }
    }//GEN-LAST:event_jTable3MouseClicked

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
       LogIn ln = new LogIn();
       ln.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new User().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser FapplyDate;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbDate;
    private javax.swing.JComboBox<String> cmbDateCategory;
    private javax.swing.JComboBox<String> cmbDuration;
    private javax.swing.JComboBox<String> cmbFProjectStatus;
    private javax.swing.JComboBox<String> cmbFundCategory;
    private javax.swing.JComboBox<String> cmbFundCountry;
    private javax.swing.JComboBox<String> cmbFundTaelent;
    private javax.swing.JComboBox<String> cmbLessOrGreat1;
    private javax.swing.JComboBox<String> cmbPStatus;
    private javax.swing.JComboBox<String> cmbProStatus;
    private com.toedter.calendar.JDateChooser fApplyEndDate;
    private javax.swing.JComboBox<String> fCategory;
    private javax.swing.JComboBox<String> fCountry;
    private javax.swing.JComboBox<String> fDuration;
    private javax.swing.JComboBox<String> fEntryFee;
    private com.toedter.calendar.JDateChooser fEntryStartDate;
    private com.toedter.calendar.JDateChooser fEntryendDate;
    private com.toedter.calendar.JDateChooser fFestivalDate;
    private javax.swing.JComboBox<String> fLessOrGreat;
    private javax.swing.JTextField fName;
    private javax.swing.JComboBox<String> fPremereStatus;
    private com.toedter.calendar.JDateChooser fProductionDate;
    private javax.swing.JComboBox<String> fRating;
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JButton fundProject;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox17;
    private com.toedter.calendar.JDateChooser jDateChooser20;
    private com.toedter.calendar.JDateChooser jDateChooser21;
    private com.toedter.calendar.JDateChooser jDateChooser22;
    private com.toedter.calendar.JDateChooser jDateChooser23;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private com.toedter.calendar.JDateChooser productionDate;
    private com.toedter.calendar.JDateChooser toDate;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtFundName;
    private javax.swing.JTextField txtProject;
    // End of variables declaration//GEN-END:variables
}
