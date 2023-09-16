/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinevote;

/**
 *
 * @author Maadurga computer
 */
public class Mainmenu extends javax.swing.JFrame {

    /**
     * Creates new form Mainmenu
     */
    public Mainmenu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        CandidatePictureLb2 = new javax.swing.JLabel();
        CandidatePictureLb3 = new javax.swing.JLabel();
        CandidatePictureLb5 = new javax.swing.JLabel();
        CandidatePictureLb6 = new javax.swing.JLabel();
        CandidatePictureLb7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ElectionBtn = new javax.swing.JButton();
        CandidateBtn = new javax.swing.JButton();
        VoterBtn = new javax.swing.JButton();
        HouseBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ResultBtn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 0, 51));
        jLabel7.setText("Election Management System");

        CandidatePictureLb2.setForeground(new java.awt.Color(204, 0, 51));
        CandidatePictureLb2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maadurga computer\\Pictures\\election.jpg")); // NOI18N
        CandidatePictureLb2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatePictureLb2MouseClicked(evt);
            }
        });

        CandidatePictureLb3.setForeground(new java.awt.Color(204, 0, 51));
        CandidatePictureLb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevote/Candidate.jpg"))); // NOI18N
        CandidatePictureLb3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatePictureLb3MouseClicked(evt);
            }
        });

        CandidatePictureLb5.setForeground(new java.awt.Color(204, 0, 51));
        CandidatePictureLb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinevote/voter.jpg"))); // NOI18N
        CandidatePictureLb5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatePictureLb5MouseClicked(evt);
            }
        });

        CandidatePictureLb6.setForeground(new java.awt.Color(204, 0, 51));
        CandidatePictureLb6.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maadurga computer\\Pictures\\electionresult.jpg")); // NOI18N
        CandidatePictureLb6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatePictureLb6MouseClicked(evt);
            }
        });

        CandidatePictureLb7.setForeground(new java.awt.Color(204, 0, 51));
        CandidatePictureLb7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Maadurga computer\\Pictures\\house.png")); // NOI18N
        CandidatePictureLb7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatePictureLb7MouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 19, Short.MAX_VALUE)
        );

        ElectionBtn.setText("Election");
        ElectionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionBtnActionPerformed(evt);
            }
        });

        CandidateBtn.setText("Candidate");
        CandidateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateBtnActionPerformed(evt);
            }
        });

        VoterBtn.setText("Voter");
        VoterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoterBtnActionPerformed(evt);
            }
        });

        HouseBtn.setText("House");
        HouseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("BackBtn");
        BackBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackBtnMouseClicked(evt);
            }
        });
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        ResultBtn1.setText("Result");
        ResultBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResultBtn1MouseClicked(evt);
            }
        });
        ResultBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResultBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ElectionBtn)
                .addGap(132, 132, 132)
                .addComponent(CandidateBtn)
                .addGap(153, 153, 153)
                .addComponent(VoterBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HouseBtn)
                .addGap(389, 389, 389))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CandidatePictureLb2)
                        .addGap(73, 73, 73)
                        .addComponent(CandidatePictureLb3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(CandidatePictureLb5)
                                .addGap(133, 133, 133)
                                .addComponent(CandidatePictureLb7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                                .addComponent(CandidatePictureLb6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BackBtn)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(997, Short.MAX_VALUE)
                    .addComponent(ResultBtn1)
                    .addGap(133, 133, 133)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BackBtn)
                        .addGap(18, 18, 18)
                        .addComponent(CandidatePictureLb6, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(59, 59, 59)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CandidatePictureLb5)
                                    .addComponent(CandidatePictureLb3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CandidatePictureLb2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(CandidatePictureLb7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(VoterBtn)
                            .addComponent(CandidateBtn)
                            .addComponent(ElectionBtn)
                            .addComponent(HouseBtn))
                        .addContainerGap(33, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(254, Short.MAX_VALUE)
                    .addComponent(ResultBtn1)
                    .addGap(27, 27, 27)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CandidatePictureLb2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatePictureLb2MouseClicked
     
    }//GEN-LAST:event_CandidatePictureLb2MouseClicked

    private void CandidatePictureLb3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatePictureLb3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidatePictureLb3MouseClicked

    private void CandidatePictureLb5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatePictureLb5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidatePictureLb5MouseClicked

    private void CandidatePictureLb6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatePictureLb6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidatePictureLb6MouseClicked

    private void ElectionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionBtnActionPerformed
     new Election().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_ElectionBtnActionPerformed

    private void CandidateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateBtnActionPerformed
     new candidate().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_CandidateBtnActionPerformed

    private void VoterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoterBtnActionPerformed
        new Voter().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_VoterBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
    //    new login().setVisible(true);
    // this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ResultBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResultBtn1ActionPerformed
        new DashBord().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ResultBtn1ActionPerformed

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
        new login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void ResultBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResultBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ResultBtn1MouseClicked

    private void HouseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseBtnActionPerformed
       new House().setVisible(true);
         this.dispose();
    }//GEN-LAST:event_HouseBtnActionPerformed

    private void CandidatePictureLb7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatePictureLb7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidatePictureLb7MouseClicked

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
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mainmenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mainmenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton CandidateBtn;
    private javax.swing.JLabel CandidatePictureLb2;
    private javax.swing.JLabel CandidatePictureLb3;
    private javax.swing.JLabel CandidatePictureLb5;
    private javax.swing.JLabel CandidatePictureLb6;
    private javax.swing.JLabel CandidatePictureLb7;
    private javax.swing.JButton ElectionBtn;
    private javax.swing.JButton HouseBtn;
    private javax.swing.JButton ResultBtn1;
    private javax.swing.JButton VoterBtn;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
