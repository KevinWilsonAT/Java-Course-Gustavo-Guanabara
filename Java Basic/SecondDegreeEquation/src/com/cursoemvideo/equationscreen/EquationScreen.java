/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cursoemvideo.equationscreen;

/**
 *
 * @author kevin
 */
public class EquationScreen extends javax.swing.JFrame {

    /**
     * Creates new form EquationScreen
     */
    public EquationScreen() {
        initComponents();
        pnlResults.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnANumber = new javax.swing.JSpinner();
        lblAIncognito = new javax.swing.JLabel();
        spnBNumber = new javax.swing.JSpinner();
        lblBIncognito = new javax.swing.JLabel();
        spnCNumber = new javax.swing.JSpinner();
        lblCNumber = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblDelta = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblSquaredMinus4Times = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblTimes = new javax.swing.JLabel();
        lblC = new javax.swing.JLabel();
        btnCalculate = new javax.swing.JButton();
        pnlResults = new javax.swing.JPanel();
        lblDeltaValue = new javax.swing.JLabel();
        lblDeltaValueNumber = new javax.swing.JLabel();
        lblRootType = new javax.swing.JLabel();
        lblRootTypeResult = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        spnANumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnANumber.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnANumberStateChanged(evt);
            }
        });

        lblAIncognito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAIncognito.setText("<html>x<sup>2</sup> +</html>");
        lblAIncognito.setToolTipText("");

        spnBNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnBNumber.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnBNumberStateChanged(evt);
            }
        });

        lblBIncognito.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblBIncognito.setText("x +");
        lblBIncognito.setToolTipText("");

        spnCNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        spnCNumber.setToolTipText("");
        spnCNumber.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCNumberStateChanged(evt);
            }
        });

        lblCNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblCNumber.setText("= 0");
        lblCNumber.setToolTipText("");

        lblDelta.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblDelta.setText("<html>&Delta; = </html>");

        lblB.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblB.setText("b");

        lblSquaredMinus4Times.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblSquaredMinus4Times.setText("<html><sup>2</sup>-4 . </html>");

        lblA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblA.setText("a");

        lblTimes.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTimes.setText(".");

        lblC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblC.setText("c");

        btnCalculate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCalculate.setText("<html>Calculate &Delta;</html>");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        lblDeltaValue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDeltaValue.setText("<html>&Delta;'s Value:</html>");

        lblDeltaValueNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDeltaValueNumber.setForeground(new java.awt.Color(0, 0, 255));
        lblDeltaValueNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDeltaValueNumber.setText("0");

        lblRootType.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRootType.setText("Root Types:");

        lblRootTypeResult.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblRootTypeResult.setForeground(new java.awt.Color(0, 0, 255));
        lblRootTypeResult.setText("0");

        javax.swing.GroupLayout pnlResultsLayout = new javax.swing.GroupLayout(pnlResults);
        pnlResults.setLayout(pnlResultsLayout);
        pnlResultsLayout.setHorizontalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultsLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDeltaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRootType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDeltaValueNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRootTypeResult, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        pnlResultsLayout.setVerticalGroup(
            pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlResultsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeltaValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeltaValueNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlResultsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRootType)
                    .addComponent(lblRootTypeResult))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlResults, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spnANumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAIncognito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spnBNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblBIncognito))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblDelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblB)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblSquaredMinus4Times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblA)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTimes)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblC)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblCNumber)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnANumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAIncognito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spnBNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBIncognito)
                    .addComponent(spnCNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCNumber))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDelta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblB)
                    .addComponent(lblSquaredMinus4Times, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblA)
                    .addComponent(lblTimes)
                    .addComponent(lblC))
                .addGap(18, 18, 18)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlResults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void spnANumberStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnANumberStateChanged
        // TODO add your handling code here:
        lblA.setText(spnANumber.getValue().toString());
    }//GEN-LAST:event_spnANumberStateChanged

    private void spnBNumberStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnBNumberStateChanged
        // TODO add your handling code here:
        lblB.setText(spnBNumber.getValue().toString());
    }//GEN-LAST:event_spnBNumberStateChanged

    private void spnCNumberStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCNumberStateChanged
        // TODO add your handling code here:
        lblC.setText(spnCNumber.getValue().toString());
    }//GEN-LAST:event_spnCNumberStateChanged

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        pnlResults.setVisible(true);
        
        int A = Integer.parseInt(spnANumber.getValue().toString());
        int B = Integer.parseInt(spnBNumber.getValue().toString());
        int C = Integer.parseInt(spnCNumber.getValue().toString());
        
        double delta = Math.pow(B, 2) - 4 * A * C;
        lblDeltaValueNumber.setText(String.format("%.1f", delta));
        
        if (delta < 0){
            lblRootTypeResult.setText("<html>Doesn't exist<br>real roots</html>");
        }
        else{
            lblRootTypeResult.setText("<html>Exists real roots</html>");
        }        
    }//GEN-LAST:event_btnCalculateActionPerformed
    
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
            java.util.logging.Logger.getLogger(EquationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EquationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EquationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EquationScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EquationScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblAIncognito;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblBIncognito;
    private javax.swing.JLabel lblC;
    private javax.swing.JLabel lblCNumber;
    private javax.swing.JLabel lblDelta;
    private javax.swing.JLabel lblDeltaValue;
    private javax.swing.JLabel lblDeltaValueNumber;
    private javax.swing.JLabel lblRootType;
    private javax.swing.JLabel lblRootTypeResult;
    private javax.swing.JLabel lblSquaredMinus4Times;
    private javax.swing.JLabel lblTimes;
    private javax.swing.JPanel pnlResults;
    private javax.swing.JSpinner spnANumber;
    private javax.swing.JSpinner spnBNumber;
    private javax.swing.JSpinner spnCNumber;
    // End of variables declaration//GEN-END:variables
}