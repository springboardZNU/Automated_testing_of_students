
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Protein
 */
public class Testing_JFrame extends javax.swing.JFrame {
byte check=0,labID;
Connection dbConnection = null;
Statement statement = null;
private int count=0;
private int countnext=0;
private int countCorrectAnswer=0;
private int correctAnswer;
private String hostName, hostAddress,stud_name,group;
        ArrayList<Integer> list = new ArrayList<Integer>();
    /**
     * Creates new form Testing_JFrame
     */

    public Testing_JFrame(String group,String stud_name,String hostName,String hostAddress,byte lab) throws SQLException {
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        jLabel2.setVisible(false);
        jLabel3.setVisible(false);
        this.hostName = hostName;
        this.hostAddress = hostAddress;
        this.stud_name = stud_name;
        this.group = group;
        this.labID = lab;
        dbConnection = MainJFrame.getDBConnection();
        statement = dbConnection.createStatement();
        String selectTableSQL="SELECT idQuestion,Question FROM `questions` WHERE idLab = "+ lab;
        ResultSet rs_login = statement.executeQuery(selectTableSQL);

        while (rs_login.next()) {
                count++;
                System.out.println(count+rs_login.getString("Question"));
                list.add(Integer.valueOf(rs_login.getString("idQuestion")));
       }
        NextQuestion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_end.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 290, 70, 60));

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() | java.awt.Font.BOLD, jLabel3.getFont().getSize()+7));
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Catering-Cafe-icon.png"))); // NOI18N
        jLabel3.setText("Завершити тестування");
        jLabel3.setToolTipText("");
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 230, 100));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 60, 360, 90));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_1.png"))); // NOI18N
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
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 130, 50));

        buttonGroup.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton2.setText("jRadioButton2");
        jRadioButton2.setContentAreaFilled(false);
        jRadioButton2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png"))); // NOI18N
        jRadioButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton2MousePressed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 320, -1));
        jRadioButton2.getAccessibleContext().setAccessibleName("");

        buttonGroup.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton4.setText("jRadioButton4");
        jRadioButton4.setContentAreaFilled(false);
        jRadioButton4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jRadioButton4.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png"))); // NOI18N
        jRadioButton4.setName(""); // NOI18N
        jRadioButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton4MousePressed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 310, -1));
        jRadioButton4.getAccessibleContext().setAccessibleName("");

        buttonGroup.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton3.setText("jRadioButton3");
        jRadioButton3.setContentAreaFilled(false);
        jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png"))); // NOI18N
        jRadioButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton3MousePressed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 310, -1));
        jRadioButton3.getAccessibleContext().setAccessibleName("");

        buttonGroup.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(51, 51, 51));
        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png"))); // NOI18N
        jRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jRadioButton1MousePressed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 300, -1));
        jRadioButton1.getAccessibleContext().setAccessibleName("");

        jLabel.setFont(jLabel.getFont().deriveFont(jLabel.getFont().getStyle() | java.awt.Font.BOLD, jLabel.getFont().getSize()+9));
        jLabel.setForeground(new java.awt.Color(51, 51, 51));
        jLabel.setText("Питання");
        jLabel.setToolTipText("");
        jLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 570, 31));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/notebook-blog-post.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 720, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void NextQuestion() throws SQLException{
        if(countnext<this.count){
        String selectTableSQL="SELECT `idLab`, `Question`,`idQuestion`,`answer_a`,`answer_b`,`answer_c`,`answer_d`,`correctAnswerID` FROM `questions` WHERE idQuestion = "+list.get(countnext)+" AND idLab = "+ labID;
        ResultSet rs_login = statement.executeQuery(selectTableSQL);
        while (rs_login.next()) {
                jLabel.setText(rs_login.getString("Question"));
                jRadioButton1.setText(rs_login.getString("answer_a"));
                jRadioButton2.setText(rs_login.getString("answer_b"));
                jRadioButton3.setText(rs_login.getString("answer_c"));
                jRadioButton4.setText(rs_login.getString("answer_d"));
                correctAnswer= Integer.valueOf(rs_login.getString("correctAnswerID"));
       }
       countnext++;
       }
        else{
        jRadioButton1.setVisible(false);
        jRadioButton2.setVisible(false);
        jRadioButton3.setVisible(false);
        jRadioButton4.setVisible(false);
        jLabel.setText(Integer.toString(countCorrectAnswer));
        String selectTableSQL = "INSERT INTO  `testing_of_students`.`results_of_students` (\n" +
                                "`idResult` ,\n" +
                                "`labID` ,\n" +
                                "`studGgroup` ,\n" +
                                "`studentName` ,\n" +
                                "`hostName` ,\n" +
                                "`hostAddress` ,\n" +
                                "`result`\n" +
                                ")\n" +
                                "VALUES (\n" +
                                "NULL , '"+ labID +"', '"+ group +"',  '"+ stud_name +"',  '"+ hostName +"',  '"+ hostAddress +"',  '"+ countCorrectAnswer +"'\n" +
                                ");";
        statement.executeUpdate(selectTableSQL);
        jButton1.setVisible(false);
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        }
    }
    
    private void jRadioButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton1MousePressed
      jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png")));
      jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      check=1;  
    }//GEN-LAST:event_jRadioButton1MousePressed

    private void jRadioButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton2MousePressed
      jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png")));
      jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      check=2;
    }//GEN-LAST:event_jRadioButton2MousePressed

    private void jRadioButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton3MousePressed
      jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png")));
      jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      check=3;
    }//GEN-LAST:event_jRadioButton3MousePressed

    private void jRadioButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jRadioButton4MousePressed
      jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png")));
      jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      check=4;
    }//GEN-LAST:event_jRadioButton4MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(check!=0)
      {
        try {
           if(correctAnswer==check){
           countCorrectAnswer++;
           }
           NextQuestion();
           check=0;
        } catch (SQLException ex) {
        }
      }
      jRadioButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
      jRadioButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uncheck.png")));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_2.png")));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_1.png")));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_3.png")));
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/next_1.png")));
    }//GEN-LAST:event_jButton1MouseReleased

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel3MousePressed
  
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
            java.util.logging.Logger.getLogger(Testing_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testing_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testing_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testing_JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                //new Testing_JFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
