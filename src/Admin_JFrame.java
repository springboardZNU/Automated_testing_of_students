import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Protein
 */
public class Admin_JFrame extends javax.swing.JFrame {
byte count=0;
byte count_mass=0;
int lab;
    Connection dbConnection;
    Statement statement;
    /**
     * Creates new form Admin_JFrame
     */
    public Admin_JFrame() {
        initComponents();
        loadCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abstract-blurry-creative-gaussian-blur.jpg"))); // NOI18N
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(710, 320));
        setPreferredSize(new java.awt.Dimension(705, 300));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 310, 34));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 50, 60));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 14, 590, 34));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(jLabel4.getFont().deriveFont(jLabel4.getFont().getStyle() | java.awt.Font.BOLD, jLabel4.getFont().getSize()+9));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Б.");
        jLabel4.setToolTipText("");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, 31));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(jLabel5.getFont().deriveFont(jLabel5.getFont().getStyle() | java.awt.Font.BOLD, jLabel5.getFont().getSize()+9));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Питання");
        jLabel5.setToolTipText("");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, -1, 31));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(jLabel7.getFont().deriveFont(jLabel7.getFont().getStyle() | java.awt.Font.BOLD, jLabel7.getFont().getSize()+9));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("А.");
        jLabel7.setToolTipText("");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, 31));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(jLabel8.getFont().deriveFont(jLabel8.getFont().getStyle() | java.awt.Font.BOLD, jLabel8.getFont().getSize()+9));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("В.");
        jLabel8.setToolTipText("");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel8.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, 31));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(jLabel9.getFont().deriveFont(jLabel9.getFont().getStyle() | java.awt.Font.BOLD, jLabel9.getFont().getSize()+9));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Г.");
        jLabel9.setToolTipText("");
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel9.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, 31));
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 310, 34));
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 310, 34));
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 310, 34));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " ", "А.", "Б.", "В.", "Г." }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 80, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(jLabel10.getFont().deriveFont(jLabel10.getFont().getStyle() | java.awt.Font.BOLD, jLabel10.getFont().getSize()+9));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Лабораторна:");
        jLabel10.setToolTipText("");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel10.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 227, 160, -1));

        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 140, -1));

        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 140, -1));

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(jLabel17.getFont().deriveFont(jLabel17.getFont().getStyle() | java.awt.Font.BOLD, jLabel17.getFont().getSize()+9));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Правильний варіант:");
        jLabel17.setToolTipText("");
        jLabel17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel17.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, -1));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(jLabel18.getFont().deriveFont(jLabel18.getFont().getStyle() | java.awt.Font.BOLD, jLabel18.getFont().getSize()+9));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Тема:");
        jLabel18.setToolTipText("");
        jLabel18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel18.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 60, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abstract-blurry-creative-gaussian-blur.jpg"))); // NOI18N
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 300));

        jTabbedPane1.addTab("Додати", jPanel1);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(jLabel14.getFont().deriveFont(jLabel14.getFont().getStyle() | java.awt.Font.BOLD, jLabel14.getFont().getSize()+9));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Тема ЛР:");
        jLabel14.setToolTipText("");
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 31));
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 640, 34));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.setFocusPainted(false);
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 50, 60));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { " " }));
        jComboBox3.setToolTipText("");
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 310, 30));

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setFont(jLabel16.getFont().deriveFont(jLabel16.getFont().getStyle() | java.awt.Font.BOLD, jLabel16.getFont().getSize()+9));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Лр:");
        jLabel16.setToolTipText("");
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel16.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, 40, 31));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh-icon.png"))); // NOI18N
        jButton4.setToolTipText("");
        jButton4.setContentAreaFilled(false);
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 55, 40, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abstract-blurry-creative-gaussian-blur.jpg"))); // NOI18N
        jLabel15.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 300));

        jTabbedPane1.addTab("ЛР", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 610, 34));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(jLabel11.getFont().deriveFont(jLabel11.getFont().getStyle() | java.awt.Font.BOLD, jLabel11.getFont().getSize()+9));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Тема:");
        jLabel11.setToolTipText("");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 17, -1, 31));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton2MouseReleased(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 50, 60));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/abstract-blurry-creative-gaussian-blur.jpg"))); // NOI18N
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 290));

        jTabbedPane1.addTab("Додати теми", jPanel3);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equals(jTextField1.getText())||"".equals(jTextField2.getText())||"".equals(jTextField3.getText())||"".equals(jTextField4.getText())||"".equals(jTextField5.getText())||jComboBox1.getSelectedIndex()==0||jComboBox4.getSelectedIndex()==0){
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/Data-Delete-database-icon.png"));    
            JOptionPane.showMessageDialog(null, "Заповнені не всі поля!", "ПОМИЛКА", JOptionPane.INFORMATION_MESSAGE,icon);
        }
        else{
        String Question = jTextField1.getText();
        String answer_a = jTextField5.getText();
        String answer_b = jTextField2.getText();
        String answer_c = jTextField3.getText();
        String answer_d = jTextField4.getText();
        byte correctAnswer = (byte) jComboBox1.getSelectedIndex();
        String insertTableSQL = "INSERT INTO  `testing_of_students`.`questions` (\n" +
            "`idQuestion` ,\n" +
            "`idLab` ,\n" +    
            "`Question` ,\n" +
            "`answer_a` ,\n" +
            "`answer_b` ,\n" +
            "`answer_c` ,\n" +
            "`answer_d` ,\n" +
            "`correctAnswerID`\n" +
            ")\n" +
            "VALUES (\n" +
            "NULL , '"+lab+"', '"+Question+"',  '"+answer_a+"',  '"+answer_b+"',  '"+answer_c+"',  '"+answer_d+"',  '"+correctAnswer+"'\n" +
            ");";              
        try {
            dbConnection = MainJFrame.getDBConnection();
            statement = dbConnection.createStatement();
            // выполнить SQL запрос
            statement.executeUpdate(insertTableSQL);
            System.out.println("Is created!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (dbConnection != null) {
                try {
                    dbConnection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(Admin_JFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon_2.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon_3.png")));
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png")));
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon_2.png")));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png")));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon_3.png")));
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseReleased
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png")));
    }//GEN-LAST:event_jButton2MouseReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    String topic;
    
    topic = jTextField6.getText();
        String insertTableSQL ="INSERT INTO  `testing_of_students`.`topic` (\n" +
        "`idTopic` ,\n" +
        "`topic`\n" +
        ")\n" +
        "VALUES (\n" +
        "NULL ,  '"+topic+"'\n" +
        ");";
        dbConnection = MainJFrame.getDBConnection();
        try {
            statement = dbConnection.createStatement();
            statement.executeUpdate(insertTableSQL);
            System.out.println("Is created!");
            jTextField6.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Admin_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon_2.png")));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png")));
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon_3.png")));
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add-to-database-icon.png")));
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        if (jComboBox3.getSelectedIndex() != 0 && !"".equals(jTextField8.getText())) {
            String labName = jTextField8.getText();
            byte topic = (byte) jComboBox3.getSelectedIndex();
            String insertTableSQL = "INSERT INTO  `testing_of_students`.`lab` (\n" +
                                    "`idLab` ,\n" +
                                    "`labName` ,\n" +
                                    "`topicID`\n" +
                                    ")\n" +
                                    "VALUES (\n" +
                                    "NULL ,  '"+ labName +"',  '"+ topic +"'\n" +
                                    ");";
            dbConnection = MainJFrame.getDBConnection();
            try {
                statement = dbConnection.createStatement();
                statement.executeUpdate(insertTableSQL);
                System.out.println("Is created!");
                jTextField8.setText("");
                jComboBox3.setSelectedIndex(0);
            } catch (SQLException ex) {
                Logger.getLogger(Admin_JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }


        } else {
            ImageIcon icon = new ImageIcon(getClass().getResource("/images/Data-Delete-database-icon.png"));
            JOptionPane.showMessageDialog(null, "Заповнені не всі поля!", "ERROR", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
 private void loadCombo(){
        if (count == 0) {
            //ArrayList<String> list = new ArrayList<String>();
            dbConnection = MainJFrame.getDBConnection();
            try {
                jComboBox2.addItem(" ");
                statement = dbConnection.createStatement();
                String selectTableSQL = "SELECT `idTopic`,`topic` FROM `topic` WHERE 1";
                ResultSet rs_login;
                rs_login = statement.executeQuery(selectTableSQL);

                while (rs_login.next()) {
                    jComboBox3.addItem(rs_login.getString("topic"));
                    jComboBox2.addItem(rs_login.getString("topic"));
                    //count_mass++;
                }
            } catch (SQLException ex) {
                Logger.getLogger(Admin_JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            count++;
        }
 
 }
    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        jComboBox3.removeAllItems();
        jComboBox3.addItem(" ");
        count=0;
        loadCombo();
    }//GEN-LAST:event_jButton4MouseEntered

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible

        dbConnection = MainJFrame.getDBConnection();
        byte topicID = (byte) jComboBox2.getSelectedIndex();
        jComboBox4.removeAllItems();
        jComboBox4.addItem(" ");
        System.out.println(topicID);
        try {
            statement = dbConnection.createStatement();
            String selectTableSQL = "SELECT  `idLab` ,  `labName` ,  `topicID` \n"
            + "FROM  `lab` \n"
            + "WHERE  `topicID` =" + topicID + "";
            ResultSet rs_lab;
            rs_lab = statement.executeQuery(selectTableSQL);

            while (rs_lab.next()) {
                jComboBox4.addItem(rs_lab.getString("labName"));
                lab = Integer.valueOf(rs_lab.getString("idLab"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Admin_JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

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
            java.util.logging.Logger.getLogger(Admin_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_JFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
