/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mypackage;
import java.util.Arrays;
import javax.swing.ImageIcon;

/**
 *
 * @author Sonny
 */
public class Faktorial extends javax.swing.JFrame {

    /**
     * Creates new form Faktorial
     */
    public Faktorial() {
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

        jButton1 = new javax.swing.JButton();
        InputField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        SendTextVypocet = new javax.swing.JLabel();
        SendText = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Faktorial");
        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        setMaximumSize(new java.awt.Dimension(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 300));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setText("Vypočítat");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(200, 200, 90, 22);

        InputField.setToolTipText("Zadej n číslo");
        InputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFieldActionPerformed(evt);
            }
        });
        InputField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InputFieldKeyTyped(evt);
            }
        });
        getContentPane().add(InputField);
        InputField.setBounds(120, 160, 261, 22);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Faktorial");
        jLabel2.setToolTipText("");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 10, 210, 50);

        SendTextVypocet.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SendTextVypocet.setForeground(new java.awt.Color(255, 255, 255));
        SendTextVypocet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(SendTextVypocet);
        SendTextVypocet.setBounds(10, 130, 480, 20);

        SendText.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SendText.setForeground(new java.awt.Color(255, 255, 255));
        SendText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(SendText);
        SendText.setBounds(20, 80, 460, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\theso\\OneDrive\\Plocha\\abstract-luxury-gradient-blue-background-smooth-dark-blue-with-black-vignette-studio-banner.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        /*
        Zadani
        Navrhněte algoritmus, který vypočítá hodnotu n!, kde n je zadané číslo. Součástí algoritmu bude ošetření vstupu proti nesprávnému výsledku (přetečení)
        */
        
        //Proměné    
        int faktorial = 1;
        int inputFaktorial = Integer.parseInt(InputField.getText());  // převedení vstupu na int
        int pole[] = new int[inputFaktorial+1]; //pole pro zaznamenání výpočtu
        

       //Základní ošetření vstupu
      
        if(inputFaktorial == 0){
            SendText.setText("Hodnota nesmí být záporná!");
        }
        else if (inputFaktorial == 1){
            SendText.setText("Výsledek je 1");
        }
        else if (inputFaktorial > 33 ){
            SendText.setText("Omluváme se, ale takové číslo je příliš veliké a nezvládneme ho");
            SendTextVypocet.setText(" ");
        }
        else{
            //Výpočet faktorialu        
            for(int i = 1; i <= inputFaktorial; i++){
                faktorial = faktorial * i; // výpočet konečného výsledku se po ukončení cyklu uloží do proměnné faktorial
                pole[i] = faktorial; //zaznamenání výpočtu do pole
      
            }
            
            //výpisy výsledků uživateli
            
            SendTextVypocet.setText(Arrays.toString(pole));
            SendText.setText("Factorial z " +inputFaktorial+ " je: " +faktorial);

        }       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void InputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InputFieldActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
           ImageIcon icon = new ImageIcon("Faktorial/src/mypackage/img/icon.png"); // nastaveni icony programu
           setIconImage(icon.getImage());
           
    }//GEN-LAST:event_formWindowActivated

    private void InputFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InputFieldKeyTyped
        char input = evt.getKeyChar(); //uloží do proměnné při každém zadaní klavesy danou hodnotu
        if(!Character.isDigit(input)){ // pokud neni roven čislu tak event zakaze zapsat hodnotu
           evt.consume();
           
        }
            
    }//GEN-LAST:event_InputFieldKeyTyped

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
            java.util.logging.Logger.getLogger(Faktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Faktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Faktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Faktorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Faktorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField InputField;
    private javax.swing.JLabel SendText;
    private javax.swing.JLabel SendTextVypocet;
    public javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
