//package Net;
import java.net.*;

public class Red extends javax.swing.JFrame {

    public static Red ventana;
    
    public Red() {
        initComponents();
    }//Constructor

    private void initComponents() {//GEN-BEGIN:initComponents
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        getContentPane().setLayout(null);

        setTitle("Net Utils");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel1.setBorder(new javax.swing.border.EtchedBorder());
        jPanel2.setLayout(null);

        jPanel2.setBorder(new javax.swing.border.TitledBorder(null, "LOCAL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10)));
        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Verdana", 0, 10));
        jTextField5.setText("000.000.000.000");
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField5FocusGained(evt);
            }
        });

        jPanel2.add(jTextField5);
        jTextField5.setBounds(10, 20, 220, 20);

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Verdana", 0, 10));
        jTextField6.setText("HOST");
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField6FocusGained(evt);
            }
        });

        jPanel2.add(jTextField6);
        jTextField6.setBounds(10, 50, 220, 20);

        jButton3.setFont(new java.awt.Font("Verdana", 1, 10));
        jButton3.setText("RESOLVER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.add(jButton3);
        jButton3.setBounds(10, 80, 220, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 240, 110);

        jPanel3.setLayout(null);

        jPanel3.setBorder(new javax.swing.border.TitledBorder(null, "REMOTO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 1, 10)));
        jTextField1.setFont(new java.awt.Font("Verdana", 0, 10));
        jTextField1.setText("000.000.000.000");
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
        });

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jPanel3.add(jTextField1);
        jTextField1.setBounds(10, 20, 220, 20);

        jButton1.setText("RESOLVER");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel3.add(jButton1);
        jButton1.setBounds(10, 80, 220, 20);

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Verdana", 0, 10));
        jTextField2.setText("HOST");
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
        });

        jPanel3.add(jTextField2);
        jTextField2.setBounds(10, 50, 220, 20);

        jTextField3.setFont(new java.awt.Font("Verdana", 0, 10));
        jTextField3.setText("HOST");
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
        });

        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField3KeyPressed(evt);
            }
        });

        jPanel3.add(jTextField3);
        jTextField3.setBounds(10, 120, 220, 20);

        jButton2.setText("RESOLVER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel3.add(jButton2);
        jButton2.setBounds(10, 180, 220, 20);

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Verdana", 0, 10));
        jTextField4.setText("000.000.000.000");
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
        });

        jPanel3.add(jTextField4);
        jTextField4.setBounds(10, 150, 220, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 130, 240, 210);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 260, 350);

        jMenu1.setText("Menu");
        jMenuItem1.setText("Borrar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });

        jMenu1.add(jMenuItem1);
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });

        jMenu1.add(jMenuItem2);
        jMenuBar1.add(jMenu1);
        jMenu2.setText("Ayuda");
        jMenuItem4.setText("Acerca de...");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });

        jMenu2.add(jMenuItem4);
        jMenuBar1.add(jMenu2);
        setJMenuBar(jMenuBar1);

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setSize(new java.awt.Dimension(285, 420));
        setLocation((screenSize.width-285)/2,(screenSize.height-420)/2);
    }//GEN-END:initComponents

    private void jTextField3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyPressed
        if(evt.getKeyCode() == 10) {
            ventana.jButton2ActionPerformed(null);
        }//if
    }//GEN-LAST:event_jTextField3KeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode() == 10) {
            ventana.jButton1ActionPerformed(null);
        }//if
    }//GEN-LAST:event_jTextField1KeyPressed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        About acerca = new About(ventana, true);
        acerca.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
        ventana.jTextField4.selectAll();
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
        ventana.jTextField3.selectAll();
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        ventana.jTextField2.selectAll();
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        ventana.jTextField1.selectAll();
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField6FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField6FocusGained
        ventana.jTextField6.selectAll();
    }//GEN-LAST:event_jTextField6FocusGained

    private void jTextField5FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField5FocusGained
        ventana.jTextField5.selectAll();
    }//GEN-LAST:event_jTextField5FocusGained

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        InetAddress Direccion;

        try {
            Direccion = InetAddress.getLocalHost();
            ventana.jTextField5.setText(Direccion.getHostAddress().toUpperCase());
        } catch (Exception e) {
            ventana.jTextField5.setText("DESCONOCIDA");
        }//try-catch
        
        try {
            Direccion = InetAddress.getLocalHost();
            ventana.jTextField6.setText(Direccion.getHostName().toUpperCase());
        } catch (Exception e) {
            ventana.jTextField6.setText("DESCONOCIDO");
        }//try-catch
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        ventana.jTextField1.setText("000.000.000.000");
        ventana.jTextField2.setText("HOST");
        ventana.jTextField3.setText("HOST");
        ventana.jTextField4.setText("000.000.000.000");
        ventana.jTextField5.setText("000.000.000.000");
        ventana.jTextField6.setText("HOST");
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            InetAddress Direccion;
            Direccion = InetAddress.getByName(ventana.jTextField1.getText());
            ventana.jTextField2.setText(Direccion.getHostName().toUpperCase());
        } catch (Exception e) {
            ventana.jTextField2.setText("DESCONOCIDO");
        }//try-catch
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            InetAddress Direccion = InetAddress.getByName(ventana.jTextField3.getText());
            ventana.jTextField4.setText(Direccion.getHostAddress().toUpperCase());
        } catch (Exception e) {
            ventana.jTextField4.setText("DESCONOCIDA");
        }//try-catch
    }//GEN-LAST:event_jButton2ActionPerformed

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    public static void main(String args[]) {
        ventana = new Red();
        ventana.show();
    }//main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables

}//Red