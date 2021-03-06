/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package administrateurs;

import articles.article;
import users.user;
import ventes.vente;

/**
 *
 * @author Hichem
 */
public class administrateur extends javax.swing.JFrame {

    /**
     * Creates new form administrateur
     */
    public administrateur() {
        initComponents();
    }

    user us;
    vente ve;
    article ar;
   // facture fa;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        gestionvente = new java.awt.Button();
        gestionuser = new java.awt.Button();
        button3 = new java.awt.Button();
        gestionarticle = new java.awt.Button();
        deconnexion = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrateur");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        gestionvente.setBackground(new java.awt.Color(102, 0, 51));
        gestionvente.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        gestionvente.setLabel("Gestion des ventes");
        gestionvente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionventeActionPerformed(evt);
            }
        });

        gestionuser.setBackground(new java.awt.Color(102, 0, 51));
        gestionuser.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        gestionuser.setLabel("Gestion des utilisateurs");
        gestionuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionuserActionPerformed(evt);
            }
        });

        button3.setBackground(new java.awt.Color(102, 0, 51));
        button3.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        button3.setLabel("Gestion des Factures");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        gestionarticle.setActionCommand("gestionaryicel");
        gestionarticle.setBackground(new java.awt.Color(102, 0, 51));
        gestionarticle.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        gestionarticle.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        gestionarticle.setLabel("Gestion des articles");
        gestionarticle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarticleActionPerformed(evt);
            }
        });

        deconnexion.setBackground(new java.awt.Color(0, 102, 102));
        deconnexion.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        deconnexion.setLabel("Deconnexion");
        deconnexion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deconnexionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gestionvente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gestionuser, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
            .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(gestionarticle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(deconnexion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gestionarticle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(gestionuser, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(gestionvente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(deconnexion, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        gestionarticle.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(159, 159, 159))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void gestionuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionuserActionPerformed
        // TODO add your handling code here:
                us=new user();
                us.setVisible(true); 
    }//GEN-LAST:event_gestionuserActionPerformed

    private void gestionarticleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarticleActionPerformed
        // TODO add your handling code here:
                //setVisible(false);
                ar=new article();
                ar.setVisible(true); 
    }//GEN-LAST:event_gestionarticleActionPerformed

    private void gestionventeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionventeActionPerformed
        // TODO add your handling code here:
                ve=new vente();
                ve.setVisible(true); 
    }//GEN-LAST:event_gestionventeActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
               // facture fa=new facture();
               // fa.setVisible(true); 
    }//GEN-LAST:event_button3ActionPerformed

    private void deconnexionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deconnexionActionPerformed
        // TODO add your handling code here:
        ve.setVisible(false);
        us.setVisible(false);
        ar.setVisible(false);
        setVisible(false);
    }//GEN-LAST:event_deconnexionActionPerformed

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
            java.util.logging.Logger.getLogger(administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new administrateur().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button3;
    private java.awt.Button deconnexion;
    private java.awt.Button gestionarticle;
    private java.awt.Button gestionuser;
    private java.awt.Button gestionvente;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
