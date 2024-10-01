/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tareanodoscirculares;

import javax.swing.JOptionPane;

/**
 *
 * @author SCIS2-27
 */
public class View extends javax.swing.JFrame {
    TareaNodosCirculares tarea = new TareaNodosCirculares();
    /**
     * Creates new form View
     */
    public View() {
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

        addPerson = new javax.swing.JButton();
        showList = new javax.swing.JButton();
        showBeforeAfter = new javax.swing.JButton();
        mostAge = new javax.swing.JButton();
        deleteMenores = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addPerson.setText("Añadir Persona");
        addPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPersonActionPerformed(evt);
            }
        });

        showList.setText("Mostrar Lista");
        showList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showListActionPerformed(evt);
            }
        });

        showBeforeAfter.setText("Posición");
        showBeforeAfter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBeforeAfterActionPerformed(evt);
            }
        });

        mostAge.setText("Mayores de Edad");
        mostAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostAgeActionPerformed(evt);
            }
        });

        deleteMenores.setText("Eliminar Menores");
        deleteMenores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(showList)
                    .addComponent(addPerson))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(mostAge)
                        .addGap(18, 18, 18)
                        .addComponent(deleteMenores))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(showBeforeAfter)))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPerson)
                    .addComponent(mostAge)
                    .addComponent(deleteMenores))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showList)
                    .addComponent(showBeforeAfter))
                .addGap(128, 128, 128))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPersonActionPerformed
        try{
            tarea.insertarLista(JOptionPane.showInputDialog("Inserte su nombre: "), Integer.parseInt(JOptionPane.showInputDialog("Inserte su edad: ")));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Datos ingresados erroneamente.");
        }
    }//GEN-LAST:event_addPersonActionPerformed

    private void showListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListActionPerformed
        tarea.imprimir();
    }//GEN-LAST:event_showListActionPerformed

    private void showBeforeAfterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBeforeAfterActionPerformed
        tarea.posicion(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición:")));
    }//GEN-LAST:event_showBeforeAfterActionPerformed

    private void mostAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostAgeActionPerformed
        tarea.mayoresPosicion();
    }//GEN-LAST:event_mostAgeActionPerformed

    private void deleteMenoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteMenoresActionPerformed
        tarea.eliminarMenores();
    }//GEN-LAST:event_deleteMenoresActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addPerson;
    private javax.swing.JButton deleteMenores;
    private javax.swing.JButton mostAge;
    private javax.swing.JButton showBeforeAfter;
    private javax.swing.JButton showList;
    // End of variables declaration//GEN-END:variables
}
