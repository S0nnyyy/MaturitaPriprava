/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kokotina;

import java.util.Random;

/**
 *
 * @author Administrator
 */
public class osm extends javax.swing.JFrame {

    /**
     * Creates new form osm
     */
    public osm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(jButton1)
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(jButton1)
                .addContainerGap(152, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        /*
        Zadani
        Navrhněte algoritmus, který v poli 10 × 10 určí počet sudých hodnot, počet lichých hodnot a počet a souřadnice nul (0). Pole naplňte náhodnými celými čísly z intervalu <0; 9>
        */
        Random rand = new Random();
        int pole[][] = new int[10][10];
        int sude = 0;
        int liche = 0;
        int pocetNull = 0;
        int nulyX = 0;
        int nulyY = 0;
        
        //naplneni pole
        for(int i = 0; i < pole.length; i++){
            for(int j = 0; j < pole.length; j++){
                pole[i][j] = rand.nextInt(9);
                    
            }
        }
        
        //hledani sudych a lichych cisel
        for(int i = 0; i < pole.length; i++){
            for(int j = 0; j < pole.length; j++){
                if(pole[i][j] % 2 == 0){
                    sude++;
                }
                else{
                    liche++;
                }
                    
            }
        }
        
        for(int i = 0; i < pole.length; i++){
            for(int j = 0; j < pole.length; j++){
                if(pole[i][j] == 0){
                    pocetNull++;
                    nulyY = i+1;
                    nulyX = j+1;
                    System.out.println("Souradnice jsou Y "+nulyY+" X "+nulyX);
                    
                }
            }
        }
            //Výpis hodnot z pole
            for(int a = 0; a < pole.length; a++){
                for(int b = 0; b < pole.length; b++){
                    System.out.print(pole[a][b]+ " "); 
                }
                System.out.println(" ");
            }
            System.out.println("Sude "+sude+" "+"Liche"+liche);
            System.out.println("Pocet nul je "+pocetNull);
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
            java.util.logging.Logger.getLogger(osm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(osm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(osm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(osm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new osm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    // End of variables declaration                   
}
