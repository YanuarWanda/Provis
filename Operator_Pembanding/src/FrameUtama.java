/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yanua
 */
public class FrameUtama extends javax.swing.JFrame {
    int nilai_a, nilai_b;
    boolean hasil;
    
    /**
     * Creates new form FrameUtama
     */
    public FrameUtama() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtPertama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtKedua = new javax.swing.JTextField();
        btnSama = new javax.swing.JButton();
        btnTidakSama = new javax.swing.JButton();
        btnLebih = new javax.swing.JButton();
        btnKurang = new javax.swing.JButton();
        btnLebihSama = new javax.swing.JButton();
        btnKurangSama = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtHasil = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PROGRAM OPERATOR PEMBANDING");

        jLabel2.setText("Nilai A");

        jLabel3.setText("Nilai B");

        btnSama.setText("==");
        btnSama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSamaActionPerformed(evt);
            }
        });

        btnTidakSama.setText("!=");
        btnTidakSama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTidakSamaActionPerformed(evt);
            }
        });

        btnLebih.setText(">");
        btnLebih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLebihActionPerformed(evt);
            }
        });

        btnKurang.setText("<");
        btnKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangActionPerformed(evt);
            }
        });

        btnLebihSama.setText(">=");
        btnLebihSama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLebihSamaActionPerformed(evt);
            }
        });

        btnKurangSama.setText("<=");
        btnKurangSama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKurangSamaActionPerformed(evt);
            }
        });

        jLabel4.setText("Hasil");

        jLabel5.setText("DIBUAT OLEH: ABC");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnSama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTidakSama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLebih)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKurang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLebihSama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnKurangSama)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPertama, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(85, 85, 85))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPertama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKedua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSama)
                    .addComponent(btnTidakSama)
                    .addComponent(btnLebih)
                    .addComponent(btnKurang)
                    .addComponent(btnLebihSama)
                    .addComponent(btnKurangSama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSamaActionPerformed
        // TODO add your handling code here:
        nilai_a = Integer.valueOf(txtPertama.getText());
        nilai_b = Integer.valueOf(txtKedua.getText());

        hasil = (nilai_a == nilai_b);

        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnSamaActionPerformed

    private void btnTidakSamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTidakSamaActionPerformed
        // TODO add your handling code here:
        nilai_a = Integer.valueOf(txtPertama.getText());
        nilai_b = Integer.valueOf(txtKedua.getText());

        hasil = (nilai_a != nilai_b);

        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnTidakSamaActionPerformed

    private void btnLebihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLebihActionPerformed
        // TODO add your handling code here:
        nilai_a = Integer.valueOf(txtPertama.getText());
        nilai_b = Integer.valueOf(txtKedua.getText());

        hasil = (nilai_a > nilai_b);

        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnLebihActionPerformed

    private void btnKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangActionPerformed
        // TODO add your handling code here:
        nilai_a = Integer.valueOf(txtPertama.getText());
        nilai_b = Integer.valueOf(txtKedua.getText());

        hasil = (nilai_a < nilai_b);

        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnKurangActionPerformed

    private void btnLebihSamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLebihSamaActionPerformed
        // TODO add your handling code here:
        nilai_a = Integer.valueOf(txtPertama.getText());
        nilai_b = Integer.valueOf(txtKedua.getText());

        hasil = (nilai_a >= nilai_b);

        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnLebihSamaActionPerformed

    private void btnKurangSamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKurangSamaActionPerformed
        // TODO add your handling code here:
        nilai_a = Integer.valueOf(txtPertama.getText());
        nilai_b = Integer.valueOf(txtKedua.getText());

        hasil = (nilai_a <= nilai_b);

        txtHasil.setText(String.valueOf(hasil));
    }//GEN-LAST:event_btnKurangSamaActionPerformed

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
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKurang;
    private javax.swing.JButton btnKurangSama;
    private javax.swing.JButton btnLebih;
    private javax.swing.JButton btnLebihSama;
    private javax.swing.JButton btnSama;
    private javax.swing.JButton btnTidakSama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtHasil;
    private javax.swing.JTextField txtKedua;
    private javax.swing.JTextField txtPertama;
    // End of variables declaration//GEN-END:variables
}
