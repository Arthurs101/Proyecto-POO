/*
Clase encargada de la interaccion en el menu de acciones
es decir la bista en sí
 */
package Vistas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author Bryan
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Selection = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        Output = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Obtener = new javax.swing.JButton();
        Refresh = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        SESION = new javax.swing.JButton();
        Admin = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Load = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        deleteB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Path = new javax.swing.JTextField();
        Warner = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        web = new javax.swing.JRadioButton();
        text = new javax.swing.JRadioButton();
        DELETEWARNER = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Seleccionar Recurso:");

        Selection.setBackground(new java.awt.Color(255, 255, 255));
        Selection.setToolTipText("");

        Output.setBackground(new java.awt.Color(255, 255, 255));
        Output.setColumns(20);
        Output.setForeground(new java.awt.Color(51, 51, 51));
        Output.setRows(5);
        jScrollPane4.setViewportView(Output);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Contenido: ");

        Obtener.setBackground(new java.awt.Color(255, 255, 255));
        Obtener.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Obtener.setForeground(new java.awt.Color(51, 51, 51));
        Obtener.setText("Obtener");

        Refresh.setBackground(new java.awt.Color(255, 255, 255));
        Refresh.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Refresh.setForeground(new java.awt.Color(51, 51, 51));
        Refresh.setText("Refrescar");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/recursos.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        SESION.setText("Cerrar Sesion");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(Selection, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Obtener)
                                .addGap(18, 18, 18)
                                .addComponent(Refresh))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 308, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SESION)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Obtener)
                            .addComponent(Refresh))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SESION)
                .addGap(23, 23, 23))
        );

        jTabbedPane1.addTab("Selección", jPanel1);

        Admin.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Directorio del Recurso:");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Borrar Recurso:");

        Load.setBackground(new java.awt.Color(255, 255, 255));
        Load.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Load.setForeground(new java.awt.Color(51, 51, 51));
        Load.setText("Cargar");

        Delete.setBackground(new java.awt.Color(255, 255, 255));
        Delete.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Delete.setForeground(new java.awt.Color(51, 51, 51));
        Delete.setText("Borrar");

        deleteB.setBackground(new java.awt.Color(255, 255, 255));
        deleteB.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        deleteB.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Nombre del Recurso");

        name.setBackground(new java.awt.Color(255, 255, 255));
        name.setForeground(new java.awt.Color(0, 0, 0));

        Path.setBackground(new java.awt.Color(255, 255, 255));
        Path.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/directorios.png"))); // NOI18N
        jLabel8.setText("jLabel8");

        buttonGroup1.add(web);
        web.setText("contenido web");

        buttonGroup1.add(text);
        text.setText("Archivo .txt");

        DELETEWARNER.setBackground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteB, 0, 303, Short.MAX_VALUE)
                    .addComponent(Path)
                    .addComponent(name)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(web)
                            .addComponent(text)))
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(Warner))
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DELETEWARNER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 338, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(55, Short.MAX_VALUE))
                    .addGroup(AdminLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Path, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Load, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(AdminLayout.createSequentialGroup()
                                .addComponent(web)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(text)))
                        .addGap(5, 5, 5)
                        .addComponent(Warner)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DELETEWARNER, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
        );

        jTabbedPane1.addTab("Gestión de recursos", Admin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    public javax.swing.JLabel DELETEWARNER;
    public javax.swing.JButton Delete;
    private javax.swing.JButton Load;
    public javax.swing.JButton Obtener;
    public javax.swing.JTextArea Output;
    private javax.swing.JTextField Path;
    public javax.swing.JButton Refresh;
    public javax.swing.JButton SESION;
    public javax.swing.JComboBox<String> Selection;
    public javax.swing.JLabel Warner;
    private javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.JComboBox<String> deleteB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField name;
    private javax.swing.JRadioButton text;
    private javax.swing.JRadioButton web;
    // End of variables declaration//GEN-END:variables

    
public String[] getNew(){//obtener array de datos del nuevo curso
    String d[] = new String[3]; 
    d[0] = name.getText();
    if(web.isSelected()){
        d[1] = Path.getText();
        d[2] = "web";
   }else if(text.isSelected()){
       try{
        String content = "";
        d[2] = "txt"; 
        BufferedReader bf = new BufferedReader(new FileReader (Path.getText()));//si es un texto leerlo
        String line;  
        while((line = bf.readLine()) != null){
              content += line; 
        }
        d[1] = content; 
       } catch (FileNotFoundException ex) {
        d[1] = null;
        d[2] = "txt"; 
       } catch (Exception e){
        d[1] = null;   
        d[2] = null; 
       }
   }
    return d; 
}
public javax.swing.JButton getLoad(){
    return Load; 
}
public void setOptions(ArrayList<String> a){//colocar todos los cursos disponibles (también sirve para refrescar las combo box)
    Selection.removeAllItems();
    deleteB.removeAllItems();
    if(!a.isEmpty()){
    a.forEach(option -> Selection.addItem(option) );
    a.forEach(option -> deleteB.addItem(option) );
   
    }
}

public void SetOutput(String r){//recibir el archivo y mostrar su contenido
    Output.setText(r);
}



}
