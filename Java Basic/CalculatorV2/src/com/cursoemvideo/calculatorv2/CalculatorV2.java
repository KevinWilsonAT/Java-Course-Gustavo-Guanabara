/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.cursoemvideo.calculatorv2;

/**
 *
 * @author kevin
 */
public class CalculatorV2 extends javax.swing.JFrame {

    /**
     * Creates new form CalculatorV2
     */
    public CalculatorV2() {
        initComponents();
        pnlScreenBottom.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlScreen = new javax.swing.JPanel();
        lblNumberInsert = new javax.swing.JLabel();
        spnValueSelected = new javax.swing.JSpinner();
        btnCalculate = new javax.swing.JButton();
        pnlScreenBottom = new javax.swing.JPanel();
        sprOperationResult = new javax.swing.JSeparator();
        lblAbsoluteValue = new javax.swing.JLabel();
        lblAbsoluteValueScreen = new javax.swing.JLabel();
        lblDivision2RestScreen = new javax.swing.JLabel();
        lblCubicRootScreen = new javax.swing.JLabel();
        lbl3PotentiationScreen = new javax.swing.JLabel();
        lblSquareRootScreen = new javax.swing.JLabel();
        lblDivision2Rest = new javax.swing.JLabel();
        lbl3Potentiation = new javax.swing.JLabel();
        lblSquareRoot = new javax.swing.JLabel();
        lblCubicRoot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNumberInsert.setText("Insert a Number:");

        spnValueSelected.setModel(new javax.swing.SpinnerNumberModel(1, -50, 50, 1));

        btnCalculate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-matemática-50.png"))); // NOI18N
        btnCalculate.setText("Calculate");
        btnCalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlScreenLayout = new javax.swing.GroupLayout(pnlScreen);
        pnlScreen.setLayout(pnlScreenLayout);
        pnlScreenLayout.setHorizontalGroup(
            pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScreenLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlScreenLayout.createSequentialGroup()
                        .addComponent(lblNumberInsert)
                        .addGap(25, 25, 25)
                        .addComponent(spnValueSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnlScreenLayout.setVerticalGroup(
            pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScreenLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnValueSelected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumberInsert))
                .addGap(24, 24, 24)
                .addComponent(btnCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        lblAbsoluteValue.setText("Absolute Value:");

        lblAbsoluteValueScreen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAbsoluteValueScreen.setText("0");

        lblDivision2RestScreen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDivision2RestScreen.setText("0");

        lblCubicRootScreen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCubicRootScreen.setText("0");

        lbl3PotentiationScreen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl3PotentiationScreen.setText("0");

        lblSquareRootScreen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblSquareRootScreen.setText("0");

        lblDivision2Rest.setText("By 2 division rest:");

        lbl3Potentiation.setText("Cubic Potentiation:");

        lblSquareRoot.setText("Square Root:");

        lblCubicRoot.setText("Cubic Root:");

        javax.swing.GroupLayout pnlScreenBottomLayout = new javax.swing.GroupLayout(pnlScreenBottom);
        pnlScreenBottom.setLayout(pnlScreenBottomLayout);
        pnlScreenBottomLayout.setHorizontalGroup(
            pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlScreenBottomLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlScreenBottomLayout.createSequentialGroup()
                        .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblDivision2Rest, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl3Potentiation, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSquareRoot, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCubicRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAbsoluteValue, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlScreenBottomLayout.createSequentialGroup()
                                .addComponent(lblAbsoluteValueScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblDivision2RestScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl3PotentiationScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblSquareRootScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCubicRootScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(sprOperationResult))
                .addContainerGap())
        );
        pnlScreenBottomLayout.setVerticalGroup(
            pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlScreenBottomLayout.createSequentialGroup()
                .addComponent(sprOperationResult, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlScreenBottomLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlScreenBottomLayout.createSequentialGroup()
                                .addComponent(lblDivision2Rest)
                                .addGap(18, 18, 18)
                                .addComponent(lbl3Potentiation)
                                .addGap(18, 18, 18)
                                .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblSquareRoot)
                                    .addComponent(lblSquareRootScreen))
                                .addGap(18, 18, 18)
                                .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCubicRoot)
                                    .addComponent(lblCubicRootScreen)))
                            .addComponent(lblDivision2RestScreen))
                        .addGap(18, 18, 18))
                    .addGroup(pnlScreenBottomLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lbl3PotentiationScreen)
                        .addGap(90, 90, 90)))
                .addGroup(pnlScreenBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAbsoluteValue)
                    .addComponent(lblAbsoluteValueScreen))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnlScreenBottom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlScreen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlScreenBottom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateActionPerformed
        // TODO add your handling code here:
        pnlScreenBottom.setVisible(true);
        
        int number = Integer.parseInt(spnValueSelected.getValue().toString());
        
        int div2rest = number % 2;
        lblDivision2RestScreen.setText(Integer.toString(div2rest));
        double pow3 = Math.pow(number, 3);
        lbl3PotentiationScreen.setText(Double.toString(pow3));
        double sqroot = Math.sqrt(number);
        lblSquareRootScreen.setText(Double.toString(sqroot));
        double cbroot = Math.cbrt(number);
        lblCubicRootScreen.setText(Double.toString(cbroot));
        int absNumber = Math.abs(number);
        lblAbsoluteValueScreen.setText(Integer.toString(absNumber));
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
            java.util.logging.Logger.getLogger(CalculatorV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculate;
    private javax.swing.JLabel lbl3Potentiation;
    private javax.swing.JLabel lbl3PotentiationScreen;
    private javax.swing.JLabel lblAbsoluteValue;
    private javax.swing.JLabel lblAbsoluteValueScreen;
    private javax.swing.JLabel lblCubicRoot;
    private javax.swing.JLabel lblCubicRootScreen;
    private javax.swing.JLabel lblDivision2Rest;
    private javax.swing.JLabel lblDivision2RestScreen;
    private javax.swing.JLabel lblNumberInsert;
    private javax.swing.JLabel lblSquareRoot;
    private javax.swing.JLabel lblSquareRootScreen;
    private javax.swing.JPanel pnlScreen;
    private javax.swing.JPanel pnlScreenBottom;
    private javax.swing.JSpinner spnValueSelected;
    private javax.swing.JSeparator sprOperationResult;
    // End of variables declaration//GEN-END:variables
}