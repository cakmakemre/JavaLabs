/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author emre
 */
public class Kütüphane extends javax.swing.JFrame {

    double[] prices = new double[]{3.5, 2.8, 10, 7.4, 6.9};

    public Kütüphane() {
        initComponents();
        setSize(650, 300);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        book5 = new javax.swing.JLabel();
        book1 = new javax.swing.JLabel();
        book2 = new javax.swing.JLabel();
        book3 = new javax.swing.JLabel();
        book4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        book1Q = new javax.swing.JTextField();
        book2Q = new javax.swing.JTextField();
        book3Q = new javax.swing.JTextField();
        book4Q = new javax.swing.JTextField();
        book5Q = new javax.swing.JTextField();
        bookselectText = new javax.swing.JLabel();
        bookSecme = new javax.swing.JComboBox<>();
        totalButton = new javax.swing.JToggleButton();
        showButton = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        book5.setText("Book 5:");
        getContentPane().add(book5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        book1.setText("Book 1:");
        getContentPane().add(book1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        book2.setText("Book 2:");
        getContentPane().add(book2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        book3.setText("Book 3:");
        getContentPane().add(book3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        book4.setText("Book 4:");
        getContentPane().add(book4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        getContentPane().add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        book1Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book1QActionPerformed(evt);
            }
        });
        getContentPane().add(book1Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 50, -1));
        getContentPane().add(book2Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 50, -1));

        book3Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                book3QActionPerformed(evt);
            }
        });
        getContentPane().add(book3Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 50, -1));
        getContentPane().add(book4Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 50, -1));
        getContentPane().add(book5Q, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 196, 50, 30));

        bookselectText.setText("Select Book");
        getContentPane().add(bookselectText, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 26, 80, 30));

        bookSecme.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        getContentPane().add(bookSecme, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, -1, -1));

        totalButton.setText("TOTAL");
        totalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(totalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 80, -1, -1));

        showButton.setText("SHOW");
        showButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showButtonActionPerformed(evt);
            }
        });
        getContentPane().add(showButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, -1, -1));

        textArea.setColumns(20);
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        int book1 = Integer.parseInt(book1Q.getText());
        int book2 = Integer.parseInt(book2Q.getText());
        int book3 = Integer.parseInt(book3Q.getText());
        int book4 = Integer.parseInt(book4Q.getText());
        int book5 = Integer.parseInt(book5Q.getText());

        prices[0] = book1 * prices[0];
        prices[1] = book2 * prices[1];
        prices[2] = book3 * prices[2];
        prices[3] = book4 * prices[3];
        prices[4] = book5 * prices[4];


    }//GEN-LAST:event_addButtonActionPerformed

    private void book1QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book1QActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book1QActionPerformed

    private void book3QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book3QActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_book3QActionPerformed

    private void showButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showButtonActionPerformed
        if (bookSecme.getSelectedIndex() == 0) {
            textArea.setText("Book 1 Price is: " + prices[0]);
        } else if (bookSecme.getSelectedIndex() == 1) {
            textArea.setText("Book 2 Price is: " + prices[1]);
        } else if (bookSecme.getSelectedIndex() == 2) {
            textArea.setText("Book 3 Price is: " + prices[2]);
        } else if (bookSecme.getSelectedIndex() == 3) {
            textArea.setText("Book 4 Price is: " + prices[3]);
        } else {
            textArea.setText("Book 5 Price is: " + prices[4]);
        }

    }//GEN-LAST:event_showButtonActionPerformed

    private void totalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalButtonActionPerformed
        double total = 0;
        int i = 0;
        for (i = 0; i < 5; i++) {
            total = total + prices[i];
        }
        textArea.setText("TOTAL is: " + total);
    }//GEN-LAST:event_totalButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Kütüphane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kütüphane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kütüphane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kütüphane.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kütüphane().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel book1;
    private javax.swing.JTextField book1Q;
    private javax.swing.JLabel book2;
    private javax.swing.JTextField book2Q;
    private javax.swing.JLabel book3;
    private javax.swing.JTextField book3Q;
    private javax.swing.JLabel book4;
    private javax.swing.JTextField book4Q;
    private javax.swing.JLabel book5;
    private javax.swing.JTextField book5Q;
    private javax.swing.JComboBox<String> bookSecme;
    private javax.swing.JLabel bookselectText;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton showButton;
    private javax.swing.JTextArea textArea;
    private javax.swing.JToggleButton totalButton;
    // End of variables declaration//GEN-END:variables
}
