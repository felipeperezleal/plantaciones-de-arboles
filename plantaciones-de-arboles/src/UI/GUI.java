package UI;

import data.Arbol;
import java.util.Random;
import javax.swing.table.DefaultTableModel;
import logic.ArrayListArbol;

public class GUI extends javax.swing.JFrame {
    static DefaultTableModel datos;
    static ArrayListArbol lista;

    /**
     * Creates new form UI
     */
    public GUI() {
        initComponents();
        this.setTitle("Plantaciones de Árboles");
        this.setLocationRelativeTo(this);
        this.setResizable(false);
        lista = new ArrayListArbol();
        
        datos = new DefaultTableModel();
        datos.addColumn("Nombre");
        datos.addColumn("Tipo");
        datos.addColumn("Etapa de Crecimiento");
        datos.addColumn("Género");
        datos.addColumn("Especie");
        datos.addColumn("Desarrollo");
        datos.addColumn("Requerimientos Nutricionales");
        datos.addColumn("Coordenadas");
        datos.addColumn("Enfermedades");
        
        for(int i=0;i<100000;i++){          
            Random rnd = new Random();
            int num = rnd.nextInt(10);                  
            String[] fila = new String[9];
            String dato1 = getRandomString(10);
            String dato2 = getRandomString(5);
            String dato3 = String.valueOf(num);
            String dato4 = getRandomString(7);
            String dato5 = getRandomString(20);
            String dato6 = getRandomString(15);
            String dato7 = getRandomString(15);
            String dato8 = getRandomString(6);
            String dato9 = getRandomString(8);
            
            fila[0] = dato1;
            fila[1] = dato2;
            fila[2] = dato3;
            fila[3] = dato4;
            fila[4] = dato5;
            fila[5] = dato6;
            fila[6] = dato7;
            fila[7] = dato8;
            fila[8] = dato9;
            Arbol tree = new Arbol(dato1, dato2, num, dato4, dato5, dato6, dato7, dato8, dato9);
            lista.insert(tree);
            datos.addRow(fila);
        }
        
        this.jTableDatos.setModel(datos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonQueue = new javax.swing.JButton();
        jButtonLinkedList = new javax.swing.JButton();
        jButtonStack = new javax.swing.JButton();
        jLabelTabla = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabelEstructura = new javax.swing.JLabel();
        jButtonBinaryTree = new javax.swing.JButton();
        jButtonHashing = new javax.swing.JButton();
        jMenu = new javax.swing.JMenuBar();
        item1 = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jItemAyuda = new javax.swing.JMenu();
        jMenuItemAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Plantaciones de árboles");

        jButtonQueue.setText("Cola");
        jButtonQueue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQueueActionPerformed(evt);
            }
        });

        jButtonLinkedList.setText("Salir");
        jButtonLinkedList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLinkedListActionPerformed(evt);
            }
        });

        jButtonStack.setText("Pila");
        jButtonStack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStackActionPerformed(evt);
            }
        });

        jLabelTabla.setText("Tabla de datos");

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableDatos);

        jLabelEstructura.setText("Estructura a utilizar:");

        jButtonBinaryTree.setText("Árbol Binario");
        jButtonBinaryTree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBinaryTreeActionPerformed(evt);
            }
        });

        jButtonHashing.setText("Hashing");
        jButtonHashing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHashingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonStack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonQueue, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jLabelEstructura)
                    .addComponent(jButtonBinaryTree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonLinkedList, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(jButtonHashing, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTabla)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEstructura)
                    .addComponent(jLabelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonQueue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonStack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBinaryTree)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonHashing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonLinkedList)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        item1.setText("Archivo");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        item1.add(jMenuItemSalir);

        jMenu.add(item1);

        jItemAyuda.setText("Ayuda");

        jMenuItemAcercaDe.setText("Acerca de...");
        jMenuItemAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAcercaDeActionPerformed(evt);
            }
        });
        jItemAyuda.add(jMenuItemAcercaDe);

        jMenu.add(jItemAyuda);

        setJMenuBar(jMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuItemAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAcercaDeActionPerformed
        // TODO add your handling code here:
        Acerca acerca = new Acerca(this, rootPaneCheckingEnabled);
        acerca.setVisible(true);
    }//GEN-LAST:event_jMenuItemAcercaDeActionPerformed

    private void jButtonQueueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQueueActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Queue cola = new Queue();
        cola.setVisible(true);
    }//GEN-LAST:event_jButtonQueueActionPerformed

    private void jButtonLinkedListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLinkedListActionPerformed
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jButtonLinkedListActionPerformed

    private void jButtonStackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Stack pila = new Stack();
        pila.setVisible(true);
    }//GEN-LAST:event_jButtonStackActionPerformed

    private void jButtonBinaryTreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBinaryTreeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        BinaryTree arbol = new BinaryTree();
        arbol.setVisible(true);
    }//GEN-LAST:event_jButtonBinaryTreeActionPerformed

    private void jButtonHashingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHashingActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Hashing hash = new Hashing();
        hash.setVisible(true);
    }//GEN-LAST:event_jButtonHashingActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu item1;
    private javax.swing.JButton jButtonBinaryTree;
    private javax.swing.JButton jButtonHashing;
    private javax.swing.JButton jButtonLinkedList;
    private javax.swing.JButton jButtonQueue;
    private javax.swing.JButton jButtonStack;
    private javax.swing.JMenu jItemAyuda;
    private javax.swing.JLabel jLabelEstructura;
    private javax.swing.JLabel jLabelTabla;
    private javax.swing.JMenuBar jMenu;
    private javax.swing.JMenuItem jMenuItemAcercaDe;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables

    private String getRandomString(int l) {
        String characters = "abcdefghijklmnopqrstuvwxyz";    
        char[] text = new char[l];
        Random r = new Random();
        String str = "";
        
        for(int i = 0; i < l; i++){
            text[i] = characters.charAt(r.nextInt(characters.length()));
        }
        
        for(int i = 0; i < l; i++){
            str += text[i];
        }
        
        return str;
    }
    
    public static DefaultTableModel getTable(){
        return datos;
    }
}
