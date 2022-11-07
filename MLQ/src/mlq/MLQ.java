/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mlq;

import java.awt.GridBagConstraints;
import java.util.ArrayList;
import javax.swing.JProgressBar;

/**
 *
 * @author ivan_
 */
public class MLQ extends javax.swing.JFrame {
    private ArrayList<JProgressBar> progressBars = new ArrayList<>();
    private SRTScheduler SRTScheduler;
    private RRScheduler RRScheduler;
    private FCFSScheduler FCFSScheduler;
    
    /**
     * Creates new form View
     */
    public MLQ() {
        initComponents();
        this.setTitle("Algoritmo SRT");
        this.setLocationRelativeTo(null);
        SRTScheduler = new SRTScheduler(this.jTextArea1);
        RRScheduler = new RRScheduler(this.jTextArea1);
        FCFSScheduler = new FCFSScheduler(this.jTextArea1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pbContainer = new javax.swing.JPanel();
        newProcessButton = new javax.swing.JButton();
        executeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        newRR = new javax.swing.JButton();
        newFCFS = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jLabel1.setText("Planificadores - Cola Múltiple");

        pbContainer.setPreferredSize(new java.awt.Dimension(630, 800));

        javax.swing.GroupLayout pbContainerLayout = new javax.swing.GroupLayout(pbContainer);
        pbContainer.setLayout(pbContainerLayout);
        pbContainerLayout.setHorizontalGroup(
            pbContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 642, Short.MAX_VALUE)
        );
        pbContainerLayout.setVerticalGroup(
            pbContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(pbContainer);

        newProcessButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newProcessButton.setText("Nuevo SRT");
        newProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newProcessButtonActionPerformed(evt);
            }
        });

        executeButton.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        executeButton.setText("Ejecutar");
        executeButton.setEnabled(false);
        executeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeButtonActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        newRR.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newRR.setText("Nuevo RR");
        newRR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRRActionPerformed(evt);
            }
        });

        newFCFS.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        newFCFS.setText("Nuevo FCFS");
        newFCFS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFCFSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(executeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(newRR, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newProcessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(newFCFS, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(newRR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newProcessButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newFCFS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(executeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addNewProcess(String scheduler){
        int STEP_SIZE = 20;
        int i = this.progressBars.size();
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = i;
        c.gridx = 0;
        c.weightx = 620;
        c.weighty = 1;
        JProgressBar pb = new JProgressBar();
        pb.setBounds(6, (38*i) + 6, 630, 32);
        pb.setBackground(Utils.getRandomColor());
        pb.setStringPainted(true);
        
        int steps = Utils.getRandomNumber(60, 300);
        BCP bcp = new BCP(scheduler, steps, i+1);

        switch(scheduler){
            case "SRT":
                bcp.setStepSize(50);
                new ThreadWork(bcp, pb, SRTScheduler, this.jTextArea1);
                this.SRTScheduler.raiseNewFlag();
                break;
            case "RR":
                bcp.setStepSize(50);
                new ThreadWork(bcp, pb, RRScheduler, this.jTextArea1);
                break;
            case "FCFS":
                bcp.setStepSize(50);
                new ThreadWork(bcp, pb, FCFSScheduler, this.jTextArea1);
                break;
        }
        
        this.progressBars.add(pb);
        this.pbContainer.add(pb, c);
        this.pbContainer.revalidate();
        this.pbContainer.repaint();
        if(i <= 1){
            this.executeButton.setEnabled(true);
        }
        this.validate();
        this.repaint();
        
    }
    private void newProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newProcessButtonActionPerformed
        // TODO add your handling code here:
        this.addNewProcess("SRT");
    }//GEN-LAST:event_newProcessButtonActionPerformed

    private void executeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeButtonActionPerformed
        // TODO add your handling code here
        Utils.log("Ejecutando procesos", this.jTextArea1);
        this.executeButton.setEnabled(false);
        this.SRTScheduler.start();
        this.RRScheduler.start();
        this.FCFSScheduler.start();
    }//GEN-LAST:event_executeButtonActionPerformed

    private void newRRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRRActionPerformed
        // TODO add your handling code here:
        this.addNewProcess("RR");
    }//GEN-LAST:event_newRRActionPerformed

    private void newFCFSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFCFSActionPerformed
        // TODO add your handling code here:
        this.addNewProcess("FCFS");
    }//GEN-LAST:event_newFCFSActionPerformed

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
            java.util.logging.Logger.getLogger(MLQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MLQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MLQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MLQ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MLQ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton executeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton newFCFS;
    private javax.swing.JButton newProcessButton;
    private javax.swing.JButton newRR;
    private javax.swing.JPanel pbContainer;
    // End of variables declaration//GEN-END:variables
}
