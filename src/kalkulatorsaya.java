/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arya Kamandanu
 */
public class kalkulatorsaya extends javax.swing.JFrame {

    /**
     * Creates new form kalkulatorsaya
     */
    public kalkulatorsaya() {
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

        devide = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        time = new javax.swing.JButton();
        bil1 = new javax.swing.JTextField();
        bil2 = new javax.swing.JTextField();
        hasil = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        devide.setText("/");
        devide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devideActionPerformed(evt);
            }
        });
        getContentPane().add(devide, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, -1, -1));

        plus.setText("+");
        plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusActionPerformed(evt);
            }
        });
        getContentPane().add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        minus.setText("-");
        minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusActionPerformed(evt);
            }
        });
        getContentPane().add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, -1, -1));

        time.setText("x");
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeActionPerformed(evt);
            }
        });
        getContentPane().add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        bil1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bil1ActionPerformed(evt);
            }
        });
        getContentPane().add(bil1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 140, -1));
        getContentPane().add(bil2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 140, -1));
        getContentPane().add(hasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 140, -1));

        jLabel1.setText("Bil 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 30, 20));

        jLabel2.setText("Hasil");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 40, 20));

        jLabel3.setText("Bil 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 40, 20));

        jLabel4.setFont(new java.awt.Font("Ruach LET", 3, 24)); // NOI18N
        jLabel4.setText("Kalkulator");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, 140, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bil1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bil1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bil1ActionPerformed

    private void plusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_plusActionPerformed
         int Bil1 = Integer.parseInt(bil1.getText());
        int Bil2 = Integer.parseInt(bil2.getText());
        int hasilkali = Bil1+Bil2;
        
        hasil.setText(String.valueOf(hasilkali));
    }//GEN-LAST:event_plusActionPerformed

    private void minusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minusActionPerformed
         int Bil1 = Integer.parseInt(bil1.getText());
        int Bil2 = Integer.parseInt(bil2.getText());
        int hasilkurang = Bil1-Bil2;
        
        hasil.setText(String.valueOf(hasilkurang));
    }//GEN-LAST:event_minusActionPerformed

    private void timeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeActionPerformed
        int Bil1 = Integer.parseInt(bil1.getText());
        int Bil2 = Integer.parseInt(bil2.getText());
        int hasilkali = Bil1*Bil2;
        
        hasil.setText(String.valueOf(hasilkali));
    }//GEN-LAST:event_timeActionPerformed

    private void devideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devideActionPerformed
       int Bil1 = Integer.parseInt(bil1.getText());
        int Bil2 = Integer.parseInt(bil2.getText());
        double hasilbagi = Bil1/Bil2;
        
        hasil.setText(String.valueOf(hasilbagi));
    }//GEN-LAST:event_devideActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulatorsaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulatorsaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulatorsaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulatorsaya.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulatorsaya().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bil1;
    private javax.swing.JTextField bil2;
    private javax.swing.JButton devide;
    private javax.swing.JTextField hasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton minus;
    private javax.swing.JButton plus;
    private javax.swing.JButton time;
    // End of variables declaration//GEN-END:variables
}
