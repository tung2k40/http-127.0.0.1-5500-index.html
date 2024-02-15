/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package giai.ptb2;

import java.net.http.WebSocketHandshakeException;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class FormGiaiPTB2 extends javax.swing.JFrame {

    /**
     * Creates new form FormGiaiPTB2
     */
    public FormGiaiPTB2() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        soA = new javax.swing.JTextField();
        soB = new javax.swing.JTextField();
        soC = new javax.swing.JTextField();
        nutGiaiPT = new javax.swing.JButton();
        Nutxoa = new javax.swing.JButton();
        delta = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        X2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(51, 255, 51));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("SOLVING 2ND-ORDER EQUATIONS");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 153));
        jLabel2.setText("Enter A:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 153, 0));
        jLabel3.setText("Enter B: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Enter C: ");

        nutGiaiPT.setBackground(new java.awt.Color(255, 255, 102));
        nutGiaiPT.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        nutGiaiPT.setForeground(new java.awt.Color(255, 51, 51));
        nutGiaiPT.setText("SOLVE EQUATIONS ...");
        nutGiaiPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nutGiaiPTActionPerformed(evt);
            }
        });

        Nutxoa.setBackground(new java.awt.Color(255, 255, 0));
        Nutxoa.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Nutxoa.setForeground(new java.awt.Color(255, 51, 51));
        Nutxoa.setText("DELETE");
        Nutxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NutxoaActionPerformed(evt);
            }
        });

        delta.setBackground(new java.awt.Color(0, 153, 153));
        delta.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        delta.setForeground(new java.awt.Color(51, 0, 255));
        delta.setText("DElTA: ");

        x1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        x1.setForeground(new java.awt.Color(255, 51, 0));
        x1.setText("x1: ");

        X2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        X2.setForeground(new java.awt.Color(255, 51, 0));
        X2.setText("X2: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(soC)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(soA, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(soB, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 72, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nutGiaiPT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Nutxoa)
                                .addGap(143, 143, 143))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(delta))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(x1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(X2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(nutGiaiPT, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Nutxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(soA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(soB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(soC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delta)
                .addGap(34, 34, 34)
                .addComponent(x1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(X2)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nutGiaiPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nutGiaiPTActionPerformed
       //Print to the panel displaying the bug message.
        if(Check_the_input_number() == false)
       {
           JOptionPane.showMessageDialog(this, "Missing entry needs to solve equations. Please re-enter!");
       }
         else{
           double a = Double.parseDouble(soA.getText());
        double b = Double.parseDouble(soB.getText());
              double c = Double.parseDouble(soC.getText());
        // Tính delta
        double deltas = b*b-4*a*c;
        if(deltas < 0){
            delta.setText("DELTA: " + deltas + " < 0 => INCONCLUSIVE EQUATION!");
            x1.setText("X1: INSENSITIVE!");
            X2.setText("X2: INSENSITIVE!");
        }
        else if( deltas == 0)
        {
            delta.setText("DELTA: "+ deltas + "=> EQUATIONS WITH DOUBLE SOLUTIONS X1 = X2 ");
            
            double X1 = (-b+Math.sqrt(deltas)/(2*a));
            double x2 = (-b-Math.sqrt(deltas)/(2*a));
            x1.setText("X1: "+ X1);
            X2.setText("X2: "+ x2);
        }
        else
        {
            delta.setText("DELTA = " + deltas + " > 0 => THE EQUATION HAS 2 DISTINCT SOLUTIONS: ");
 
                     double X1 = (-b+Math.sqrt(deltas)/(2*a));
             double x2 = (-b-Math.sqrt(deltas)/(2*a));
              x1.setText("X1: " + X1);
            X2.setText("X2: "+ x2);
        }
        
       }
        
        double a = Double.parseDouble(soA.getText());
        double b = Double.parseDouble(soB.getText());
        double c = Double.parseDouble(soC.getText());
        
             double deltas = b*b-4*a*c;
        
        
    }//GEN-LAST:event_nutGiaiPTActionPerformed

    private void NutxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NutxoaActionPerformed
        soA.setText("");
        soB.setText("");
        soC.setText("");
    }//GEN-LAST:event_NutxoaActionPerformed
    public boolean Check_the_input_number()
    {
        if(soA.getText().isEmpty() || soB.getText().isEmpty() || soC.getText().isEmpty())
        {
            return false;
        }
        return true;
    }
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
            java.util.logging.Logger.getLogger(FormGiaiPTB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormGiaiPTB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormGiaiPTB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormGiaiPTB2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormGiaiPTB2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nutxoa;
    private javax.swing.JLabel X2;
    private javax.swing.JLabel delta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton nutGiaiPT;
    private javax.swing.JTextField soA;
    private javax.swing.JTextField soB;
    private javax.swing.JTextField soC;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}