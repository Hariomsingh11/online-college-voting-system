/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package onlinevote;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Voting extends javax.swing.JFrame {

    
    public Voting() {
        initComponents();
        DisplayCandidate();
         Bravolb1.setVisible(false);
         VCount();
         VCheck();
    }
    int votingid;
 
    public Voting(int voterid)
    {
        initComponents();
        DisplayCandidate();
         Bravolb1.setVisible(false);
        votingid=voterid;
        JOptionPane.showMessageDialog(this,votingid);
    }
     Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement st = null;
        private void DisplayCandidate()
{
    try{
         Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
         st=Con.createStatement();
         Rs=st.executeQuery("Select * from Candidate");
        CandidateTb.setModel(DbUtils.resultSetToTableModel(Rs));
    }catch(Exception e){
        
    }
} 
    
    @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTb = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        CnameTb = new javax.swing.JLabel();
        CandidatePictureLb1 = new javax.swing.JLabel();
        VOTEBtn = new javax.swing.JButton();
        Bravolb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Election Management System");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(434, 434, 434))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("Your Candidate");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("WELCOME TO INSTITUTION VOTING");

        jButton4.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 102, 0));
        jButton4.setText("BACK");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        CandidateTb.setModel(new javax.swing.table.DefaultTableModel(
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
        CandidateTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTb);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Candidate list");

        CnameTb.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        CnameTb.setForeground(new java.awt.Color(255, 0, 0));
        CnameTb.setText("NAME");

        CandidatePictureLb1.setForeground(new java.awt.Color(204, 0, 51));
        CandidatePictureLb1.setText("               Photos");

        VOTEBtn.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        VOTEBtn.setForeground(new java.awt.Color(0, 0, 204));
        VOTEBtn.setText("VOTE");
        VOTEBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VOTEBtnMouseClicked(evt);
            }
        });
        VOTEBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VOTEBtnActionPerformed(evt);
            }
        });

        Bravolb1.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Bravolb1.setForeground(new java.awt.Color(204, 0, 51));
        Bravolb1.setText("VoteCounted!!!");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 356, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(370, 370, 370))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(494, 494, 494)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(CandidatePictureLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(VOTEBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(Bravolb1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 732, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CnameTb))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CandidatePictureLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CnameTb))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(62, 62, 62)
                                .addComponent(Bravolb1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(VOTEBtn)
                        .addGap(186, 186, 186)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void VOTEBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VOTEBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VOTEBtnActionPerformed
    private ImageIcon ResizePhoto(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(CandidatePictureLb1.getWidth(), CandidatePictureLb1.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;

    }    
    private void FetchPhoto(){
        String Query="Select * from Candidate where CID="+key;
        Statement St;
        ResultSet Rs;
        try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "password");
               St=Con.createStatement();
               Rs=St.executeQuery(Query);
               if(Rs.next())
               {
                    CandidatePictureLb1.setIcon(ResizePhoto(null,Rs.getBytes("cphoto")));
               }
        }catch(Exception e){
            
        }
    }               
    int key =-1;
    int Elecid;
    private void CandidateTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTbMouseClicked
         DefaultTableModel model=(DefaultTableModel)CandidateTb.getModel();
        int MyIndex=CandidateTb.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
       CnameTb.setText(model.getValueAt(MyIndex,1).toString());
        Elecid=Integer.valueOf(model.getValueAt(MyIndex,5).toString());
         FetchPhoto();
    }//GEN-LAST:event_CandidateTbMouseClicked
    int Vid;
      Statement st1=null;
      ResultSet Rs1=null;
     // ResultSet Rs2;
     private void VCount(){
         try{
             st1=Con.createStatement();
             Rs1=st1.executeQuery("Select Max(Voteid) from Voting");
             
             Rs1.next();
             Vid=Rs1.getInt(1)+1;
   // Rs2=st1.executeQuery("Select * from Voting where voteid='"+Vid+"'");
   // Rs2.next();
    
         }catch(Exception Ex){
              
         }
    
}         int Vnumber;
      private void VCheck(){
         try{
             st1=Con.createStatement();
             Rs1=st1.executeQuery("Select count(*) from Voting where Vid='"+votingid+" 'and eid ='"+Elecid+"' ");
            if(Rs1.next()){
                Vnumber=1;
            }else{
                Vnumber=0;
              }
         //    Rs1.next();
       //      Vnumber=Rs1.getInt(1)+1;
    
    
         }catch(Exception Ex){
              
         }
    
}
    private void VOTEBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VOTEBtnMouseClicked
        VCheck();  
        if(key==-1)
        {
            JOptionPane.showMessageDialog(this,"Enter The Candidate");
            
        }
     //     else if(votingi) {
     //        JOptionPane.showMessageDialog(this,"You cannot vote twice" );
    //}
        else
        {
            
            try{
                
               VCount();
              
              
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
               PreparedStatement Add=Con.prepareStatement("Insert into Voting Value(?,?,?,?)");
           //    Add.setInt(1, votingid);
                Add.setInt(1,  Vid);
               Add.setInt(2, votingid);
                Add.setInt(3,Elecid);
                Add.setInt(4, key);
               int row = Add.executeUpdate();
                 JOptionPane.showMessageDialog(this,"Vote is added Successfully");
                 Con.close();
                 Bravolb1.setVisible(true);
                 DisplayCandidate();
                 VOTEBtn.setVisible(false);
               //  PreparedStatement UpdateQuery =Con.prepareStatement("Update voting set voted=1 where voteid="+Rs2.getString("voteid"));
                 //UpdateQuery.executeUpdate();

              
            }
            catch(Exception e){
               
                JOptionPane.showMessageDialog(this,e);
            }
        }
 
    }//GEN-LAST:event_VOTEBtnMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
    new login() .setVisible(true);
       // new VoterMainmenu() .setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4MouseClicked

   
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Voting().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bravolb1;
    private javax.swing.JLabel CandidatePictureLb1;
    private javax.swing.JTable CandidateTb;
    private javax.swing.JLabel CnameTb;
    private javax.swing.JButton VOTEBtn;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
