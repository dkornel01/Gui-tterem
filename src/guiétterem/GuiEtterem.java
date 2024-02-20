/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package guiétterem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;

/**
 *
 * @author dobrocsi.kornel
 */
public class GuiEtterem extends javax.swing.JFrame {

    private List<String>desk1=new ArrayList<>();
    private List<String>desk2=new ArrayList<>();
    private List<String>desk3=new ArrayList<>();
    private List<String>desk4=new ArrayList<>();
    public GuiEtterem() {
        initComponents();
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        uj = new javax.swing.JButton();
        felvétel = new javax.swing.JButton();
        torles = new javax.swing.JButton();
        Asztalok = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ár = new javax.swing.JSpinner();
        ujétel = new javax.swing.JTextField();
        oszlop = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        előétel = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        főétel = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        desszert = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        kiválasztott = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        kiirás2 = new javax.swing.JButton();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        Nyomtatás = new javax.swing.JButton();
        KiIrás = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        uj.setText("Új étel felvétele");
        uj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujActionPerformed(evt);
            }
        });

        felvétel.setText("Felvétel");
        felvétel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                felvételActionPerformed(evt);
            }
        });

        torles.setText("Törles");
        torles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                torlesActionPerformed(evt);
            }
        });

        Asztalok.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Desk 1", "Desk 2", "Desk 3", "Desk 4" }));
        Asztalok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsztalokActionPerformed(evt);
            }
        });

        jLabel1.setText("Új étel neve:");

        jLabel2.setText("Új étel ára:");

        jLabel3.setText("Új oszlop:");

        ujétel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ujételActionPerformed(evt);
            }
        });

        oszlop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "előétel", "főétel", "desszert" }));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menü"));

        előétel.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Gyümölcs leves: 3000", "Hús leves: 2000", " ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(előétel);

        főétel.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Bécsi Szelet: 2500", "Somlói Galuska: 2000", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(főétel);

        desszert.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Csoki Totra: 4000", "Linzer: 3500" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(desszert);

        jScrollPane4.setViewportView(kiválasztott);

        jLabel4.setText("Előétel");

        jLabel5.setText("Főétel");

        jLabel6.setText("Desszert");

        jLabel7.setText("Kiválasztottak");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        kiirás2.setText("Kiirás");
        kiirás2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kiirás2ActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(uj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(felvétel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(torles, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Asztalok, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ár, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(ujétel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(oszlop, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(kiirás2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Asztalok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oszlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ár, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ujétel, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(felvétel)
                        .addGap(88, 88, 88)
                        .addComponent(torles)
                        .addGap(87, 87, 87)
                        .addComponent(kiirás2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uj)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(Asztalok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ujétel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ár, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(oszlop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(felvétel)
                    .addComponent(torles)
                    .addComponent(uj)
                    .addComponent(kiirás2))
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab1", jDesktopPane1);

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        Nyomtatás.setText("nyomtatás");
        Nyomtatás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NyomtatásActionPerformed(evt);
            }
        });

        KiIrás.setText("KiIrás");
        KiIrás.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KiIrásActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(jLayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(Nyomtatás, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(KiIrás, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLayeredPane1)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(KiIrás)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
                        .addComponent(Nyomtatás)))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nyomtatás)
                    .addComponent(KiIrás)))
        );

        jTabbedPane1.addTab("tab2", jDesktopPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void torlesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_torlesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_torlesActionPerformed

    private void ujActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujActionPerformed
        int tipus=oszlop.getSelectedIndex();
        Object osszeg = ár.getValue();
        String uj_etel=ujétel.getText();
        switch (tipus){
            case 0 -> elöetel_adas(uj_etel, osszeg);
            case 1 -> föétel_adas(uj_etel, osszeg);
            case 2 -> desszert_adas(uj_etel, osszeg);
        }
    }//GEN-LAST:event_ujActionPerformed

    private void elöetel_adas(String uj_etel, Object osszeg) {
        ListModel<String>kiv=előétel.getModel();
        DefaultListModel def=new DefaultListModel();
        for (int i=0;i<kiv.getSize();i++){
            def.add(i, kiv.getElementAt(i));
        }
        def.addElement(uj_etel+": "+osszeg);
        előétel.setModel(def);
    }

    private void AsztalokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsztalokActionPerformed
        int asztal_szam=Asztalok.getSelectedIndex();
        ListModel<String>kiv=kiválasztott.getModel();
        DefaultListModel def=new DefaultListModel();
        switch(asztal_szam){
            case 0:
            AszalValasztas(def,desk1);
            break;
            case 1:
             AszalValasztas(def,desk2);
            break;
             case 2:
             AszalValasztas(def,desk3);
            break;
             case 3:
             AszalValasztas(def,desk4);
            break;
        }
        kiválasztott.setModel(def);
    }//GEN-LAST:event_AsztalokActionPerformed

    private void AszalValasztas(DefaultListModel def,List<String> desk) {
        for (int i=0;i<desk.size();i++){
            def.add(i,desk.get(i));
        }
    }

    private void ujételActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ujételActionPerformed
        
    }//GEN-LAST:event_ujételActionPerformed

    private void NyomtatásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NyomtatásActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NyomtatásActionPerformed

    private void felvételActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_felvételActionPerformed
        ListModel<String>kiv=kiválasztott.getModel();
        DefaultListModel def=new DefaultListModel();
        for (int i=0;i<kiv.getSize();i++){
            def.add(i, kiv.getElementAt(i));
        }
        def.addElement(előétel.getSelectedValue());
        def.addElement(főétel.getSelectedValue());
        def.addElement(desszert.getSelectedValue());
        kiválasztott.setModel(def);
        int asztal_szam=Asztalok.getSelectedIndex();
        switch(asztal_szam){
            case 0:
            desk_toltes(desk1);
            break;
            case 1:
             desk_toltes(desk2);
            break;
             case 2:
             desk_toltes(desk3);
            break;
             case 3:
             desk_toltes(desk4);
            break;
        }
    }//GEN-LAST:event_felvételActionPerformed

    private void kiirás2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kiirás2ActionPerformed
        String txt="arak.txt";
        Path path=Paths.get(txt);
        String kimenet="";
        ListModel<String>kiv=előétel.getModel();
        kimenet = betoltes(kiv, kimenet);
        kiv=főétel.getModel();
        kimenet = betoltes(kiv, kimenet);
        kiv=desszert.getModel();
        kimenet = betoltes(kiv, kimenet);
        try {
            Files.write(path, kimenet.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(GuiEtterem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kiirás2ActionPerformed

    private void KiIrásActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KiIrásActionPerformed
       String txt="asztalok.txt";
        Path path=Paths.get(txt);
        String kimenet="";
        List<String>tarto=desk1;
        kimenet=asztal_osszerakas(tarto, kimenet);
        tarto=desk2;
        kimenet=asztal_osszerakas(tarto, kimenet);
        tarto=desk3;
        kimenet=asztal_osszerakas(tarto, kimenet);
        tarto=desk4;
        kimenet=asztal_osszerakas(tarto, kimenet);
        try {
            Files.write(path, kimenet.getBytes());
        } catch (IOException ex) {
            Logger.getLogger(GuiEtterem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_KiIrásActionPerformed

    private String asztal_osszerakas(List<String> tarto, String kimenet) {
        for (int i=0;i<tarto.size();i++){
            kimenet+=tarto.get(i)+"\n";
        }
        kimenet+="\n";
        return kimenet;
    }

    private String betoltes(ListModel<String> kiv, String kimenet) {
        for (int i=0;i<=kiv.getSize()-1;i++){
            kimenet+=kiv.getElementAt(i)+"\n";
        }
        return kimenet;
    }

    private void desk_toltes(List<String> desk) {
        desk.add(előétel.getSelectedValue());
        desk.add(főétel.getSelectedValue());
        desk.add(desszert.getSelectedValue());
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
            java.util.logging.Logger.getLogger(GuiEtterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiEtterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiEtterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiEtterem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiEtterem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Asztalok;
    private javax.swing.JButton KiIrás;
    private javax.swing.JButton Nyomtatás;
    private javax.swing.JList<String> desszert;
    private javax.swing.JList<String> előétel;
    private javax.swing.JButton felvétel;
    private javax.swing.JList<String> főétel;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton kiirás2;
    private javax.swing.JList<String> kiválasztott;
    private javax.swing.JComboBox<String> oszlop;
    private javax.swing.JButton torles;
    private javax.swing.JButton uj;
    private javax.swing.JTextField ujétel;
    private javax.swing.JSpinner ár;
    // End of variables declaration//GEN-END:variables

    private void föétel_adas(String uj_etel, Object osszeg) {
        ListModel<String>kiv=főétel.getModel();
        DefaultListModel def=new DefaultListModel();
        for (int i=0;i<kiv.getSize();i++){
            def.add(i, kiv.getElementAt(i));
        }
        def.addElement(uj_etel+": "+osszeg);
        főétel.setModel(def);
    }

    private void desszert_adas(String uj_etel, Object osszeg) {
        ListModel<String>kiv=desszert.getModel();
        DefaultListModel def=new DefaultListModel();
        for (int i=0;i<kiv.getSize();i++){
            def.add(i, kiv.getElementAt(i));
        }
        def.addElement(uj_etel+": "+osszeg);
        desszert.setModel(def);
    }
}
