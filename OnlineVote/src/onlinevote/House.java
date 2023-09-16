/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinevote;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.text.SimpleDateFormat;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.proteanit.sql.DbUtils;
public class House extends javax.swing.JFrame {

    /**
     * Creates new form House
     */
    public House() {
        initComponents();
        GetCandidate();
        DisplayHouseTb();
    }

       @SuppressWarnings("unchecked")
         Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement st = null;
       private void GetCandidate() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "password");
            st = Con.createStatement();
            String Query = "Select * from Election";
            Rs = st.executeQuery(Query);
            while (Rs.next()) {
                String ElectId = Rs.getString("eid");
                CandidateId.addItem(ElectId);
            }

        } catch (Exception e) {

        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        HouseNameTb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ADDBtn = new javax.swing.JButton();
        EditTb = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        HouseTb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        HouseIdTb = new javax.swing.JTextPane();
        jLabel4 = new javax.swing.JLabel();
        CandidateId = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Election Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(289, 289, 289)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("NAME");

        HouseNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HouseNameTbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Manage HOUSE");

        ADDBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        ADDBtn.setForeground(new java.awt.Color(255, 102, 0));
        ADDBtn.setText("ADD");
        ADDBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ADDBtnMouseClicked(evt);
            }
        });
        ADDBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDBtnActionPerformed(evt);
            }
        });

        EditTb.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        EditTb.setForeground(new java.awt.Color(255, 102, 0));
        EditTb.setText("EDIT");
        EditTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditTbMouseClicked(evt);
            }
        });
        EditTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditTbActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(255, 102, 0));
        DeleteBtn.setText("DELETE");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        BackBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BackBtn.setForeground(new java.awt.Color(255, 102, 0));
        BackBtn.setText("BACK");
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

        HouseTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Hid", "housename", "cid"
            }
        ));
        HouseTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HouseTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(HouseTb);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("HID");

        jScrollPane2.setViewportView(HouseIdTb);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Candidate");

        CandidateId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateIdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel8)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(208, 208, 208))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ADDBtn)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(HouseNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BackBtn)
                            .addComponent(EditTb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteBtn)
                            .addComponent(CandidateId, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(HouseNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CandidateId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(141, 141, 141)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EditTb)
                            .addComponent(DeleteBtn)
                            .addComponent(ADDBtn))
                        .addGap(33, 33, 33)
                        .addComponent(BackBtn))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HouseNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HouseNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HouseNameTbActionPerformed

    private void ADDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDBtnActionPerformed

    private void EditTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditTbActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void CandidateIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidateIdActionPerformed
int key=-1;
    private void HouseTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HouseTbMouseClicked
        DefaultTableModel model=(DefaultTableModel)HouseTb.getModel();
        int MyIndex=HouseTb.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        HouseNameTb.setText(model.getValueAt(MyIndex,1).toString());
          CandidateId.setSelectedItem(model.getValueAt(MyIndex,2).toString());
    }//GEN-LAST:event_HouseTbMouseClicked
private void DisplayHouseTb()
{
    try{
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
         st=Con.createStatement();
         Rs=st.executeQuery("Select * from House");
        HouseTb.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        
    }
}
    private void ADDBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDBtnMouseClicked
if(HouseNameTb.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Enter The House Name");
        }else
        {
            try{
             
               
                 Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
               PreparedStatement Add=Con.prepareStatement("Insert into House Value(?,?,?)");
               Add.setString(1,HouseIdTb.getText());
               Add.setString(2,HouseNameTb.getText());
               Add.setInt(3, Integer.valueOf(CandidateId.getSelectedItem().toString()));
               int row = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"House is added Successfully");
                 Con.close();
                 DisplayHouseTb();
            }
            catch(Exception e){
               
                JOptionPane.showMessageDialog(this,e);
            }
        }       
    }//GEN-LAST:event_ADDBtnMouseClicked

    private void EditTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditTbMouseClicked
        if (key==-1 ||HouseNameTb.getText().isEmpty() || CandidateId.getSelectedIndex() == -1 ){
            JOptionPane.showMessageDialog(this,"Missing Information");
        }else{
            try{
             //    String Day=String.valueOf(ElectionDate.getDate().getDay());
               // String Month=String.valueOf(ElectionDate.getDate().getMonth());
                //String Year=String.valueOf(ElectionDate.getDate().getYear());
                //String  edate=Day+"/" +Month+ "/"+ Year;
              //  SimpleDateFormat dFormat=new SimpleDateFormat("yyyy-MM-dd");
               //String Date=dFormat.format(ElectionDate.getDate());
               
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
                String Query="Update House set Housename=?,cid=?where Hid=?" ; 
               PreparedStatement UpdateQuery =Con.prepareStatement(Query);
                // UpdateQuery.setString(1,  HouseIdTb.getText());
                
               UpdateQuery.setString(1,HouseNameTb.getText());
                 UpdateQuery.setString(2,(CandidateId.getSelectedItem().toString()));
                 UpdateQuery.setInt(3,  key);
               UpdateQuery.executeUpdate();
                 JOptionPane.showMessageDialog(this,"House Updated+ Successfull");
                 DisplayHouseTb();
            }catch(Exception e){
                 JOptionPane.showMessageDialog(this,e); 
            }
        }
    }//GEN-LAST:event_EditTbMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
         new Mainmenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
         if (key==-1){
            JOptionPane.showMessageDialog(this,"Select The House To Be Deleted");
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
                String Query="Delete from House where Hid="+key; 
                Statement Del =Con.createStatement();
                Del.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this,"House deleted Successfull");
                 DisplayHouseTb();
            }catch(Exception e){
                 JOptionPane.showMessageDialog(this,e); 
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

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
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(House.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new House().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JComboBox<String> CandidateId;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditTb;
    private javax.swing.JTextPane HouseIdTb;
    private javax.swing.JTextField HouseNameTb;
    private javax.swing.JTable HouseTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
