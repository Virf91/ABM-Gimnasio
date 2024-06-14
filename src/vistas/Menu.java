
package vistas;

public class Menu extends javax.swing.JFrame {

    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMCargaDatos = new javax.swing.JMenu();
        jMSocio = new javax.swing.JMenuItem();
        jMEntrenador = new javax.swing.JMenuItem();
        jMClase = new javax.swing.JMenuItem();
        jMAsistencia = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMGestion = new javax.swing.JMenu();
        jMConsultasClase = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMConsultasEntrenadores = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Menu.png"))); // NOI18N

        escritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 692, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jMCargaDatos.setText("Gestion Datos");
        jMCargaDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMCargaDatosActionPerformed(evt);
            }
        });

        jMSocio.setText("Socio");
        jMSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSocioActionPerformed(evt);
            }
        });
        jMCargaDatos.add(jMSocio);

        jMEntrenador.setText("Entrenador");
        jMEntrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMEntrenadorActionPerformed(evt);
            }
        });
        jMCargaDatos.add(jMEntrenador);

        jMClase.setText("Clase");
        jMClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMClaseActionPerformed(evt);
            }
        });
        jMCargaDatos.add(jMClase);

        jMAsistencia.setText("Asistencia");
        jMAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAsistenciaActionPerformed(evt);
            }
        });
        jMCargaDatos.add(jMAsistencia);

        jMenuItem1.setText("Membresia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMCargaDatos.add(jMenuItem1);

        jMenuBar1.add(jMCargaDatos);

        jMGestion.setText("Consultas");

        jMConsultasClase.setText("Consultas de Clases");
        jMConsultasClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultasClaseActionPerformed(evt);
            }
        });
        jMGestion.add(jMConsultasClase);

        jMenuItem2.setText("Consultas de Socios");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMGestion.add(jMenuItem2);

        jMConsultasEntrenadores.setText("Consultas de Entrenadores");
        jMConsultasEntrenadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultasEntrenadoresActionPerformed(evt);
            }
        });
        jMGestion.add(jMConsultasEntrenadores);

        jMenuBar1.add(jMGestion);

        jMenu3.setText("Salir");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSocioActionPerformed
        escritorio.removeAll();// limpia las ventanas
        escritorio.repaint();// se redibuja el escritorio
        GestionSocios gav = new GestionSocios();// se crea una instancia de la ventana, y por defecto es invisble
        gav.setVisible(true);// colocamos que sea visible  
        gav.setLocation(10, 10);
        escritorio.add(gav);//agrego al escritorio la ventana 
        escritorio.moveToFront(gav);// traigo al frente la ventana    }  
    }//GEN-LAST:event_jMSocioActionPerformed

    private void jMEntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMEntrenadorActionPerformed
        escritorio.removeAll();// limpia las ventanas
        escritorio.repaint();// se redibuja el escritorio
        GestionEntrenador gav = new GestionEntrenador();// se crea una instancia de la ventana, y por defecto es invisble
        gav.setVisible(true);// colocamos que sea visible  
        gav.setLocation(10, 10);
        escritorio.add(gav);//agrego al escritorio la ventana 
        escritorio.moveToFront(gav);// traigo al frente la ventana    }
    }//GEN-LAST:event_jMEntrenadorActionPerformed

    private void jMClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMClaseActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionClase gclase = new GestionClase();
        gclase.setVisible(true);
        gclase.setLocation(10, 10);
        escritorio.add(gclase);
        escritorio.moveToFront(gclase);
    }//GEN-LAST:event_jMClaseActionPerformed

    private void jMConsultasClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasClaseActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultasClase consClase = new ConsultasClase();
        consClase.setVisible(true);
        consClase.setLocation(10, 10);
        escritorio.add(consClase);
        escritorio.moveToFront(consClase);
    }//GEN-LAST:event_jMConsultasClaseActionPerformed

    private void jMAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAsistenciaActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionAsistencia gAs = new GestionAsistencia();
        gAs.setVisible(true);
        gAs.setLocation(10, 10);
        escritorio.add(gAs);
        escritorio.moveToFront(gAs);
    }//GEN-LAST:event_jMAsistenciaActionPerformed

    private void jMCargaDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMCargaDatosActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionMembresia mem = new GestionMembresia();
        mem.setVisible(true);
        mem.setLocation(10, 10);
        escritorio.add(mem);
        escritorio.moveToFront(mem);

    }//GEN-LAST:event_jMCargaDatosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        GestionMembresia mem = new GestionMembresia();
        mem.setVisible(true);
        mem.setLocation(10, 10);
        escritorio.add(mem);
        escritorio.moveToFront(mem);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultaSocios consClase = new ConsultaSocios();
        consClase.setVisible(true);
        consClase.setLocation(10, 10);
        escritorio.add(consClase);
        escritorio.moveToFront(consClase);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMConsultasEntrenadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultasEntrenadoresActionPerformed
        escritorio.removeAll();
        escritorio.repaint();
        ConsultasEntrenador consEnt = new ConsultasEntrenador();
        consEnt.setVisible(true);
        consEnt.setLocation(10, 10);
        escritorio.add(consEnt);
        escritorio.moveToFront(consEnt);
    }//GEN-LAST:event_jMConsultasEntrenadoresActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMAsistencia;
    private javax.swing.JMenu jMCargaDatos;
    private javax.swing.JMenuItem jMClase;
    private javax.swing.JMenuItem jMConsultasClase;
    private javax.swing.JMenuItem jMConsultasEntrenadores;
    private javax.swing.JMenuItem jMEntrenador;
    private javax.swing.JMenu jMGestion;
    private javax.swing.JMenuItem jMSocio;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
