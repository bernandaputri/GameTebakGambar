
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cellular Laboratory
 */
public class stage6 extends javax.swing.JFrame {

    /**
     * Creates new form stage6
     */
    String nama;

    public stage6(String data) {
        initComponents();
        user.setText(data);
        nama = data;
        jawaban.grabFocus();
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
        hallo = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        starzero5 = new javax.swing.JLabel();
        starzero4 = new javax.swing.JLabel();
        starzero3 = new javax.swing.JLabel();
        star3 = new javax.swing.JLabel();
        star2 = new javax.swing.JLabel();
        star1 = new javax.swing.JLabel();
        home = new javax.swing.JButton();
        cek = new javax.swing.JButton();
        jawaban = new javax.swing.JTextField();
        layout = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hallo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        hallo.setForeground(new java.awt.Color(255, 255, 255));
        hallo.setText("Hallo!");
        jPanel1.add(hallo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 110, 50));

        user.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        user.setForeground(new java.awt.Color(255, 255, 255));
        user.setText("user");
        jPanel1.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 160, 50));

        starzero5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star2.png"))); // NOI18N
        jPanel1.add(starzero5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        starzero4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star2.png"))); // NOI18N
        jPanel1.add(starzero4, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        starzero3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star2.png"))); // NOI18N
        jPanel1.add(starzero3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        star3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star1.png"))); // NOI18N
        jPanel1.add(star3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        star2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star1.png"))); // NOI18N
        jPanel1.add(star2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 30, -1, -1));

        star1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/star1.png"))); // NOI18N
        jPanel1.add(star1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 30, -1, -1));

        home.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.png"))); // NOI18N
        home.setBorder(null);
        home.setBorderPainted(false);
        home.setContentAreaFilled(false);
        home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        jPanel1.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cek.setBackground(new java.awt.Color(38, 150, 211));
        cek.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cek.png"))); // NOI18N
        cek.setBorder(null);
        cek.setBorderPainted(false);
        cek.setContentAreaFilled(false);
        cek.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cekMouseClicked(evt);
            }
        });
        jPanel1.add(cek, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, -1, -1));

        jawaban.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jawaban.setBorder(null);
        jPanel1.add(jawaban, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 390, 90));

        layout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6.png"))); // NOI18N
        jPanel1.add(layout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(710, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_homeActionPerformed

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        int pil;
        pil = JOptionPane.showConfirmDialog(this, "Apa Anda ingin meninggalkan permainan ?", "Home", JOptionPane.YES_NO_OPTION);
        if (pil == JOptionPane.YES_OPTION) {
            this.setVisible(false);
            new cover().setVisible(true);
        }
    }//GEN-LAST:event_homeMouseClicked

    int i = 2;
    private void cekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekMouseClicked
        // TODO add your handling code here:
        stage7 obj = new stage7(nama);
        if (jawaban.getText().equals("")) {
        } else {
            if (i >= 0) {
                if (jawaban.getText().equals("menghapus jejakmu")||jawaban.getText().equals("menghapus jejak mu")||jawaban.getText().equals("MENGHAPUS JEJAKMU")||jawaban.getText().equals("MENGHAPUS JEJAK MU")) {
                    this.setVisible(false);
                    obj.setVisible(true);
                } else if (i == 0) {
                    JOptionPane.showMessageDialog(this, "GAME OVER", "Tebak Lagu", JOptionPane.YES_OPTION);
                    this.setVisible(false);
                    new cover().setVisible(true);
                } else {
                    if (i == 2) {
                        star3.setVisible(false);
                    } else if (i == 1) {
                        star2.setVisible(false);
                    }
                    JOptionPane.showMessageDialog(this, "Jawaban Anda SALAH! Kesempatan Menjawab Tersisa " + i + " Kali lagi", "Tebak Lagu", JOptionPane.YES_OPTION);
                    i = i - 1;
                }
            } else {
                this.setVisible(false);
                new cover().setVisible(true);
            }
        }
    }//GEN-LAST:event_cekMouseClicked

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
            java.util.logging.Logger.getLogger(stage6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stage6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stage6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stage6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                new stage6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cek;
    private javax.swing.JLabel hallo;
    private javax.swing.JButton home;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jawaban;
    private javax.swing.JLabel layout;
    private javax.swing.JLabel star1;
    private javax.swing.JLabel star2;
    private javax.swing.JLabel star3;
    private javax.swing.JLabel starzero3;
    private javax.swing.JLabel starzero4;
    private javax.swing.JLabel starzero5;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
