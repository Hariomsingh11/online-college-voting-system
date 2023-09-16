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

public class candidate extends javax.swing.JFrame {

    public candidate() {
        initComponents();
        GetElection();
        DisplayCandidate();
        
    }
    @SuppressWarnings("unchecked")
     Connection Con = null;
    PreparedStatement Pst = null;
    ResultSet Rs = null;
    Statement st = null;
     private void GetElection() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "password");
            st = Con.createStatement();
            String Query = "Select * from Election";
            Rs = st.executeQuery(Query);
            while (Rs.next()) {
                String ElectId = Rs.getString("eid");
                ElectionCb.addItem(ElectId);
            }

        } catch (Exception e) {

        }
    }
int cid;
      Statement st1=null;
      ResultSet Rs1=null;
     private void CandCount(){
         try{
             st1=Con.createStatement();
             Rs1=st1.executeQuery("Select Max(cid) from Candidate");
             Rs1.next();
             cid=Rs1.getInt(1)+1;
    
    
         }catch(Exception Ex){
              
         }
     }
     
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CandidateNameTb = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ADDBtn = new javax.swing.JButton();
        EDITBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CandidateTb = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        CAge = new javax.swing.JTextPane();
        CandidateGenTb = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ElectionCb = new javax.swing.JComboBox<>();
        img = new javax.swing.JLabel();
        CandidatePictureLb1 = new javax.swing.JLabel();
        BrowseBtn = new javax.swing.JButton();

        jPanel2.setBackground(new java.awt.Color(255, 102, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1073, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 75, Short.MAX_VALUE)
        );

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
                .addGap(372, 372, 372))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("NAME");

        CandidateNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateNameTbActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("Manage Candidate");

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

        EDITBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        EDITBtn.setForeground(new java.awt.Color(255, 102, 0));
        EDITBtn.setText("EDIT");
        EDITBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EDITBtnMouseClicked(evt);
            }
        });
        EDITBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITBtnActionPerformed(evt);
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

        CandidateTb.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CID", "CANDIDATE NAME", "CAGE", "CGENDER", "PHOTOS", "ELECTIONID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        CandidateTb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidateTbMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CandidateTb);
        if (CandidateTb.getColumnModel().getColumnCount() > 0) {
            CandidateTb.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("AGE");

        jScrollPane2.setViewportView(CAge);

        CandidateGenTb.setForeground(new java.awt.Color(255, 102, 0));
        CandidateGenTb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        CandidateGenTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CandidateGenTbActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 51));
        jLabel4.setText("Election");

        ElectionCb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ElectionCbActionPerformed(evt);
            }
        });

        img.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        img.setForeground(new java.awt.Color(204, 0, 51));
        img.setText("    Photo");

        CandidatePictureLb1.setForeground(new java.awt.Color(204, 0, 51));
        CandidatePictureLb1.setText("               Photos");
        CandidatePictureLb1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CandidatePictureLb1MouseClicked(evt);
            }
        });

        BrowseBtn.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        BrowseBtn.setForeground(new java.awt.Color(0, 0, 204));
        BrowseBtn.setText("Browse");
        BrowseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BrowseBtnMouseClicked(evt);
            }
        });
        BrowseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BrowseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ADDBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DeleteBtn)
                                .addGap(388, 388, 388))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(160, 160, 160)
                                        .addComponent(CandidateNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel8)
                                                .addGap(92, 92, 92)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(CandidatePictureLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(CandidateGenTb, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(226, 226, 226))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(img, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BackBtn)
                            .addComponent(BrowseBtn)
                            .addComponent(EDITBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CandidateNameTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(img))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CandidatePictureLb1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ElectionCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BrowseBtn)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ADDBtn)
                            .addComponent(DeleteBtn)
                            .addComponent(EDITBtn)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CandidateGenTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addComponent(BackBtn)
                .addGap(94, 94, 94))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CandidateNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidateNameTbActionPerformed

    private void ADDBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ADDBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackBtnActionPerformed

    private void CandidateGenTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CandidateGenTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CandidateGenTbActionPerformed

    private void ElectionCbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ElectionCbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ElectionCbActionPerformed

    private void BrowseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BrowseBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BrowseBtnActionPerformed

    private void CandidatePictureLb1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidatePictureLb1MouseClicked

    }//GEN-LAST:event_CandidatePictureLb1MouseClicked
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

    String imgpath = null;
    private void BrowseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BrowseBtnMouseClicked
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images", "jpg", "gif", "png");
        chooser.addChoosableFileFilter(filter);
        int result = chooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedfile = chooser.getSelectedFile();
            String path = selectedfile.getAbsolutePath();
            CandidatePictureLb1.setIcon(ResizePhoto(path, null));
            imgpath = path;
        }
    }//GEN-LAST:event_BrowseBtnMouseClicked
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
    private void ADDBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ADDBtnMouseClicked
        // TODO add your handling code here:
        if (CAge.getText().isEmpty() || CandidateNameTb.getText().isEmpty() || ElectionCb.getSelectedIndex() == -1 || CandidateGenTb.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "MissingInformation");
        } else {
            try {
                  CandCount();
                Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/election", "root", "password");
                PreparedStatement Add = Con.prepareStatement("Insert into Candidate Value(?,?,?,?,?,?)");
                InputStream img = new FileInputStream(imgpath);
             //  Add.setString(1, Candidateid.getText());
             Add.setInt(1,cid);
                Add.setString(2, CandidateNameTb.getText());
                Add.setInt(3, Integer.valueOf(CAge.getText()));
                Add.setString(4, CandidateGenTb.getSelectedItem().toString());
                Add.setBlob(5, img);
                Add.setInt(6, Integer.valueOf(ElectionCb.getSelectedItem().toString()));
                int row = Add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Candidate is added Successfully");
                Con.close();
                DisplayCandidate();
            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this, ex);

            }
        }
    }//GEN-LAST:event_ADDBtnMouseClicked
      private void FetchPhoto(){
        String Query="Select cphoto from Candidate where CID="+key;
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
    int key=-1;
    private void CandidateTbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CandidateTbMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)CandidateTb.getModel();
        int MyIndex=CandidateTb.getSelectedRow();
        key=Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        CandidateNameTb.setText(model.getValueAt(MyIndex,1).toString());
        CAge.setText(model.getValueAt(MyIndex,2).toString());
        CandidateGenTb.setSelectedItem(model.getValueAt(MyIndex,3).toString());
        ElectionCb.setSelectedItem(model.getValueAt(MyIndex,5).toString());
         FetchPhoto();
    }//GEN-LAST:event_CandidateTbMouseClicked

    private void EDITBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EDITBtnActionPerformed

    private void EDITBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EDITBtnMouseClicked

    /* if (key==-1 ||CAge.getText().isEmpty() || CandidateNameTb.getText().isEmpty() || ElectionCb.getSelectedIndex() == -1 || CandidateGenTb.getSelectedIndex() == -1){
           JOptionPane.showMessageDialog(this,"Missing Information");
        }*/
        if(imgpath!=null){
            try{
               CandCount();
                InputStream img=new FileInputStream(imgpath);
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
                String Query="Update Candidate set cname=?,cage=?,cgen=?,cphoto=?,celect=? where cid=?" ;
                PreparedStatement UpdateQuery =Con.prepareStatement(Query);
                UpdateQuery.setString(1,CandidateNameTb.getText());
                UpdateQuery.setInt(2,Integer.valueOf(CAge.getText().toString()));
                UpdateQuery.setString(3,CandidateGenTb.getSelectedItem().toString());
                UpdateQuery.setBlob(4,img);
                UpdateQuery.setString(5,(ElectionCb.getSelectedItem().toString())); 
            UpdateQuery.setInt(6,key);
              UpdateQuery.executeUpdate();
             if( UpdateQuery.executeUpdate()==1){
                  JOptionPane.showMessageDialog(this,"Candidate is updated successfully");
                  DisplayCandidate();
              }else{
                    JOptionPane.showMessageDialog(this,"Missing Information" );
              }
                           }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
            }
        }else{
               JOptionPane.showMessageDialog(this,"Select Photo");
              CandidatePictureLb1.setIcon(null);
              CandidatePictureLb1.setText("");
         }
    }//GEN-LAST:event_EDITBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        // TODO add your handling code here:
         if (key==-1){
            JOptionPane.showMessageDialog(this,"Select The Candidate To Be Deleted");
        }else{
            try{
                Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/election","root","password");
                String Query="Delete from Candidate where cid="+key; 
                Statement Del =Con.createStatement();
                Del.executeUpdate(Query);
                 JOptionPane.showMessageDialog(this,"Candidate deleted Successfull");
                 DisplayCandidate();
            }catch(Exception e){
                 JOptionPane.showMessageDialog(this,e); 
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void BackBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackBtnMouseClicked
         new Mainmenu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new candidate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDBtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton BrowseBtn;
    private javax.swing.JTextPane CAge;
    private javax.swing.JComboBox<String> CandidateGenTb;
    private javax.swing.JTextField CandidateNameTb;
    private javax.swing.JLabel CandidatePictureLb1;
    private javax.swing.JTable CandidateTb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EDITBtn;
    private javax.swing.JComboBox<String> ElectionCb;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    

}
