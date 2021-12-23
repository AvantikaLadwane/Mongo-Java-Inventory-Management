import java.net.UnknownHostException;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoException;
import com.mongodb.*;
import javax.swing.JLabel;
import javax.swing.JTextField;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Geeta
 */
public class form2 extends javax.swing.JFrame {

    public form2() {
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

        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ProductDetails = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        pro_quant = new javax.swing.JTextField();
        pro_type = new javax.swing.JComboBox<>();
        pro_company = new javax.swing.JTextField();
        pro_insert = new javax.swing.JButton();
        pro_price = new javax.swing.JTextField();
        pro_id1 = new javax.swing.JTextField();
        pro_update = new javax.swing.JButton();
        pro_clear = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pro_id = new javax.swing.JTextField();
        pro_search = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel5.setText(" Name :");

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        ProductDetails.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        ProductDetails.setForeground(new java.awt.Color(255, 255, 255));
        ProductDetails.setText("PRODUCT DETAILS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(ProductDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(ProductDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jLabel6.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("NoOfStocks :");

        jLabel7.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Product type :");

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Price  :");

        jLabel3.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Manufacturing Company :");

        pro_quant.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        pro_quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_quantActionPerformed(evt);
            }
        });

        pro_type.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        pro_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mobile", "Computer", "Laptop", "Smart Tv", "Other accessories", " " }));
        pro_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_typeActionPerformed(evt);
            }
        });

        pro_company.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        pro_company.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_companyActionPerformed(evt);
            }
        });

        pro_insert.setBackground(new java.awt.Color(51, 153, 0));
        pro_insert.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pro_insert.setForeground(new java.awt.Color(255, 255, 255));
        pro_insert.setText("Add");
        pro_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_insertActionPerformed(evt);
            }
        });

        pro_price.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        pro_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_priceActionPerformed(evt);
            }
        });

        pro_id1.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        pro_id1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_id1ActionPerformed(evt);
            }
        });

        pro_update.setBackground(new java.awt.Color(102, 102, 102));
        pro_update.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pro_update.setText("Update");
        pro_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_updateActionPerformed(evt);
            }
        });

        pro_clear.setBackground(new java.awt.Color(102, 102, 102));
        pro_clear.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pro_clear.setText("Clear");
        pro_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_clearActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Product id :");

        jButton1.setBackground(new java.awt.Color(255, 0, 0));
        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(pro_update, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pro_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(pro_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_company, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_price, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_type, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pro_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_id1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pro_type, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro_price, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pro_company, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pro_quant, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pro_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addContainerGap())
        );

        pro_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_idActionPerformed(evt);
            }
        });

        pro_search.setBackground(new java.awt.Color(102, 102, 102));
        pro_search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pro_search.setText("Search");
        pro_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pro_searchActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Product id :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pro_id, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(pro_search, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_id, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pro_search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pro_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_clearActionPerformed
        this.setVisible(false);
        new form2().setVisible(true);
    }//GEN-LAST:event_pro_clearActionPerformed

    private void pro_quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_quantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_quantActionPerformed

    private void pro_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_typeActionPerformed

    private void pro_companyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_companyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_companyActionPerformed

    private void pro_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_insertActionPerformed
        MongoClient mongoClient = null;
        try{
             MongoClient mongo = new MongoClient("localhost", 27017);
             DB db = mongo.getDB("Inventory");
             DBCollection coll = db.getCollection("Product_details"); 
             
             BasicDBObject doc = new BasicDBObject("Product_id",pro_id1.getText()).append("Product_type",pro_type.getSelectedItem())
                     .append("Price",pro_price.getText()).append("Company",pro_company.getText()).append("Quantity",pro_quant.getText());

             if(pro_id1.getText().equals(""))
             {
             JOptionPane.showMessageDialog(this,"PLEASE ENTER PRODUCT ID","ERROR",JOptionPane.ERROR_MESSAGE);   
             }
             else{
             coll.insert(doc);
             JOptionPane.showMessageDialog(this,"Record Inserted in Database","Msg",JOptionPane.ERROR_MESSAGE);   
        }
        }
         catch (UnknownHostException e) {
            e.printStackTrace();
         } catch (MongoException e) {
	    e.printStackTrace();
         }
	
    }//GEN-LAST:event_pro_insertActionPerformed

    private void pro_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_idActionPerformed

    private void pro_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_searchActionPerformed
        MongoClient mongoClient = null;
        try{
        mongoClient = new MongoClient( "localhost",27017);
        DB db = mongoClient.getDB("Inventory");
        DBCollection coll = db.getCollection("Product_details");
       
        BasicDBObject search = new BasicDBObject();
        search.put("Product_id",pro_id.getText());
        DBCursor cursor = coll.find(search);

        if(cursor.hasNext())
        {
        DBObject search1=cursor.next();

        pro_id1.setText((String)search1.get("Product_id"));
        pro_type.setSelectedItem((String)search1.get("Product_type"));  
        pro_price.setText((String)search1.get("Price"));
        pro_company.setText((String)search1.get("Company"));
        pro_quant.setText((String)search1.get("Quantity"));
        }
        else
        {
        JOptionPane.showMessageDialog(this,"NOT FOUND..INVALID!!");
        }
       }catch (UnknownHostException e) {
                   e.printStackTrace();
               } catch (MongoException e) {
                   e.printStackTrace();
               }
    }//GEN-LAST:event_pro_searchActionPerformed

    private void pro_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_updateActionPerformed
      try{
        MongoClient mongoClient = null;
        mongoClient = new MongoClient( "localhost",27017);
        DB db = mongoClient.getDB("Inventory");
        DBCollection coll = db.getCollection("Product_details");

        BasicDBObject newdocument = new BasicDBObject();
        newdocument.append("$set",new BasicDBObject().append("Price",pro_price.getText()));
     
        BasicDBObject searchQuery = new BasicDBObject().append("Product_id",pro_id.getText());
        coll.update(searchQuery, newdocument);
        
         JOptionPane.showMessageDialog(this,"Record Updated Successfully in Database","Msg",JOptionPane.DEFAULT_OPTION);
        }catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_pro_updateActionPerformed

    private void pro_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_priceActionPerformed

    private void pro_id1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pro_id1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pro_id1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            MongoClient mongoClient = null;
            mongoClient = new MongoClient( "localhost",27017);
            DB db = mongoClient.getDB("Inventory");
            DBCollection coll = db.getCollection("Product_details");

            BasicDBObject search = new BasicDBObject();
            search.put("Product_id",pro_id.getText());
            coll.remove(search);
            JOptionPane.showMessageDialog(this, "Record Deleted", "Msg", JOptionPane.ERROR_MESSAGE);
        }
         catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (MongoException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ProductDetails;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    public javax.swing.JLabel jLabel8;
    public javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton pro_clear;
    private javax.swing.JTextField pro_company;
    private javax.swing.JTextField pro_id;
    private javax.swing.JTextField pro_id1;
    private javax.swing.JButton pro_insert;
    private javax.swing.JTextField pro_price;
    private javax.swing.JTextField pro_quant;
    private javax.swing.JButton pro_search;
    private javax.swing.JComboBox<String> pro_type;
    private javax.swing.JButton pro_update;
    // End of variables declaration//GEN-END:variables
}
