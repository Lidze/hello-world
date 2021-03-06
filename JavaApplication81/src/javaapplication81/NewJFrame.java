/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication81;

import java.awt.Point;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author student
 */
public class NewJFrame extends javax.swing.JFrame {
    
    private final int STEP = 5;
    private int kx,ky;
    private moveThread moveThread;
    
    
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        kx = ky = 1;
        Random rnd = new Random();
        jPanel1.setLayout(null);
        jBox.setLocation(rnd.nextInt(jPanel1.getWidth()-jBox.getWidth()), 
                rnd.nextInt(jPanel1.getHeight()-jBox.getHeight()));
        
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
        jBox = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jBtnStart = new javax.swing.JButton();
        jBntStop = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jBtnDelay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 255, 51));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));

        jBox.setBackground(new java.awt.Color(255, 255, 0));
        jBox.setPreferredSize(new java.awt.Dimension(20, 20));

        javax.swing.GroupLayout jBoxLayout = new javax.swing.GroupLayout(jBox);
        jBox.setLayout(jBoxLayout);
        jBoxLayout.setHorizontalGroup(
            jBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jBoxLayout.setVerticalGroup(
            jBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(343, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jBtnStart.setText("START");
        jBtnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JStartMove(evt);
            }
        });

        jBntStop.setText("STOP");
        jBntStop.setEnabled(false);
        jBntStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMoveStop(evt);
            }
        });

        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitUp(evt);
            }
        });

        jLabel1.setText("Dellay");

        jTextField1.setText("50");

        jBtnDelay.setText("Set delay");
        jBtnDelay.setEnabled(false);
        jBtnDelay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSetDelay(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnStart)
                .addGap(18, 18, 18)
                .addComponent(jBntStop, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBtnDelay)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(jBtnExit)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBntStop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtnDelay))
                    .addComponent(jBtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JStartMove(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JStartMove
       moveThread = new moveThread(this, convertDelay());
       seitchBtns();
       moveThread.start();
    }//GEN-LAST:event_JStartMove

    private void jMoveStop(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMoveStop
       moveThread.stop();
       seitchBtns();
    }//GEN-LAST:event_jMoveStop

    private int convertDelay(){
        int delay;
        try{
        delay=Integer.parseInt(jTextField1.getText());
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Wrong delay value! Reset tu 50!");
            jTextField1.setText("50");
            return 50;
        }
        if(delay < 10){
            JOptionPane.showMessageDialog(this, "Too little delay! Reset ro 10!");
            jTextField1.setText("10");
            return 10;
        } else if (delay > 10000){
            JOptionPane.showMessageDialog(this, "To big delay! Reset to 10000! ");
            jTextField1.setText("10000");
            return 10000;
        }
        return delay;
    }
    
    
    private void jExitUp(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitUp
        this.dispose();
    }//GEN-LAST:event_jExitUp

    private void jSetDelay(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSetDelay
       moveThread.setDelay(convertDelay());
    }//GEN-LAST:event_jSetDelay
    
    private void seitchBtns(){
        jBtnDelay.setEnabled(!jBtnDelay.isEnabled());
        jBtnExit.setEnabled(!jBtnExit.isEnabled());
        jBtnStart.setEnabled(!jBtnStart.isEnabled());
        jBntStop.setEnabled(!jBntStop.isEnabled());
    }
    
    public void moveBox(){
        Point p = jBox.getLocation();
        if((p.x > jPanel1.getWidth()-jBox.getWidth())
                ||(p.x <0)) kx = -kx;
        if((p.y > jPanel1.getHeight()- jBox.getHeight())||(p.y < 0)) ky = -ky;
        p.move(p.x + kx*STEP, p.y + ky*STEP);
        jBox.setLocation(p);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBntStop;
    private javax.swing.JPanel jBox;
    private javax.swing.JButton jBtnDelay;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
