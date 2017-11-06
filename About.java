public class About extends javax.swing.JDialog {
    private static About acerca;
    
    public About(Red padre, boolean modal) {
        super(padre, modal);
        initComponents();
    }//Constructor

    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        setTitle("Acerca de...");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.EtchedBorder());
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.jpg")));
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 90, 120);

        jLabel2.setText("Net Utils");
        jLabel2.setFont(new java.awt.Font("Verdana", 1, 12));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 20, 60, 16);

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        getContentPane().add(jButton1);
        jButton1.setBounds(160, 110, 51, 20);

        jLabel3.setText("Utilidades");
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 40, 90, 16);

        jLabel4.setText("DVD \u00a9 2002");
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 10));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(110, 90, 70, 14);

        jLabel5.setText("para la Red");
        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 60, 80, 17);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(225, 160));
        setLocation((screenSize.width-225)/2,(screenSize.height-160)/2);
    }//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}//About