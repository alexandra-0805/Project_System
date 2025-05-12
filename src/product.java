
public class product extends javax.swing.JFrame {
    public product() {
        initComponents();
        this.setLocationRelativeTo(null); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabelproduct = new javax.swing.JLabel();
        jButtonPerishableFood = new javax.swing.JButton();
        jButtonSnacks = new javax.swing.JButton();
        jButtonBeverage = new javax.swing.JButton();
        jButtonHygiene = new javax.swing.JButton();
        jButtonHousehold = new javax.swing.JButton();
        jLabeltitle1 = new javax.swing.JLabel();
        jLabeltitle2 = new javax.swing.JLabel();
        jButtonDashboard = new javax.swing.JButton();
        jButtonProduct = new javax.swing.JButton();
        jButtonReports = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Product");

        jPanel1.setBackground(new java.awt.Color(213, 199, 163));

        jPanel2.setBackground(new java.awt.Color(242, 226, 177));

        jLabelproduct.setFont(new java.awt.Font("Leelawadee UI", 1, 36)); // NOI18N
        jLabelproduct.setText("PRODUCT");

        jButtonPerishableFood.setBackground(new java.awt.Color(246, 240, 240));
        jButtonPerishableFood.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonPerishableFood.setText("PERISHABLE FOOD");
        jButtonPerishableFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPerishableFoodActionPerformed(evt);
            }
        });

        jButtonSnacks.setBackground(new java.awt.Color(246, 240, 240));
        jButtonSnacks.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonSnacks.setText("SNACKS");
        jButtonSnacks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSnacksActionPerformed(evt);
            }
        });

        jButtonBeverage.setBackground(new java.awt.Color(246, 240, 240));
        jButtonBeverage.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonBeverage.setText("BEVERAGE");
        jButtonBeverage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBeverageActionPerformed(evt);
            }
        });

        jButtonHygiene.setBackground(new java.awt.Color(246, 240, 240));
        jButtonHygiene.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonHygiene.setText("HYGIENE ESSENTIALS");
        jButtonHygiene.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHygieneActionPerformed(evt);
            }
        });

        jButtonHousehold.setBackground(new java.awt.Color(246, 240, 240));
        jButtonHousehold.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonHousehold.setText("HOUSEHOLD ESSENTIALS");
        jButtonHousehold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHouseholdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButtonHousehold, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonHygiene, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBeverage, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addComponent(jLabelproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(138, 138, 138)
                            .addComponent(jButtonPerishableFood, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabelproduct)
                .addGap(18, 18, 18)
                .addComponent(jButtonPerishableFood, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSnacks, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBeverage, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHygiene, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonHousehold, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        jLabeltitle1.setFont(new java.awt.Font("Leelawadee UI", 1, 24)); // NOI18N
        jLabeltitle1.setText("CONVENIENCE STORE");

        jLabeltitle2.setBackground(new java.awt.Color(246, 240, 240));
        jLabeltitle2.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabeltitle2.setText("INVENTORY SYSTEM");

        jButtonDashboard.setBackground(new java.awt.Color(246, 240, 240));
        jButtonDashboard.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonDashboard.setText("DASHBOARD");
        jButtonDashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashboardActionPerformed(evt);
            }
        });

        jButtonProduct.setBackground(new java.awt.Color(246, 240, 240));
        jButtonProduct.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonProduct.setText("PRODUCT");
        jButtonProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProductActionPerformed(evt);
            }
        });

        jButtonReports.setBackground(new java.awt.Color(246, 240, 240));
        jButtonReports.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jButtonReports.setText("REPORTS");
        jButtonReports.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonReportsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabeltitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonReports, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabeltitle2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabeltitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabeltitle2)
                .addGap(58, 58, 58)
                .addComponent(jButtonDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButtonProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButtonReports, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashboardActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new dashboard().setVisible(true);
    }//GEN-LAST:event_jButtonDashboardActionPerformed

    private void jButtonPerishableFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPerishableFoodActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new perishable_food().setVisible(true);
    }//GEN-LAST:event_jButtonPerishableFoodActionPerformed

    private void jButtonSnacksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSnacksActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new snacks().setVisible(true);
    }//GEN-LAST:event_jButtonSnacksActionPerformed

    private void jButtonBeverageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBeverageActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new beverage().setVisible(true);
    }//GEN-LAST:event_jButtonBeverageActionPerformed

    private void jButtonHygieneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHygieneActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new hygiene_essentials().setVisible(true);
    }//GEN-LAST:event_jButtonHygieneActionPerformed

    private void jButtonHouseholdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHouseholdActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new household_essentials().setVisible(true);
    }//GEN-LAST:event_jButtonHouseholdActionPerformed

    private void jButtonProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProductActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new product().setVisible(true);
    }//GEN-LAST:event_jButtonProductActionPerformed

    private void jButtonReportsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonReportsActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new reports().setVisible(true);
    }//GEN-LAST:event_jButtonReportsActionPerformed

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
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBeverage;
    private javax.swing.JButton jButtonDashboard;
    private javax.swing.JButton jButtonHousehold;
    private javax.swing.JButton jButtonHygiene;
    private javax.swing.JButton jButtonPerishableFood;
    private javax.swing.JButton jButtonProduct;
    private javax.swing.JButton jButtonReports;
    private javax.swing.JButton jButtonSnacks;
    private javax.swing.JLabel jLabelproduct;
    private javax.swing.JLabel jLabeltitle1;
    private javax.swing.JLabel jLabeltitle2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
