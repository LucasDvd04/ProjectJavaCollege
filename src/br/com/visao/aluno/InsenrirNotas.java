/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.visao.aluno;

import br.com.controle.Nota;
import br.com.modelo.NotaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author My&Lucas
 */
public class InsenrirNotas extends javax.swing.JFrame {

    /**
     * Creates new form IsenrirNotas
     */
   
    
    public InsenrirNotas() {
        initComponents();
           try{
               NotaDAO  ndc = new NotaDAO();
               Nota nc = new Nota();
               
            ArrayList<Nota> nota = ndc.PesquisarTudoC();
            for(int i = 0; i < nota.size();i++){
                nc = nota.get(i);
                jCcurso.addItem(nc);
            }
        }
            catch(Exception e){
            System.out.println("Erro " + e.getMessage());
            }
         
         
        
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRa1 = new javax.swing.JRadioButton();
        jRa2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jTnota = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jCnome = new javax.swing.JComboBox<>();
        jCcurso = new javax.swing.JComboBox<>();
        jCturma = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCdisciplina = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLmat = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setText("Inserir Notas");

        jLabel2.setText("Aluno:");

        buttonGroup1.add(jRa1);
        jRa1.setText("A1");

        buttonGroup1.add(jRa2);
        jRa2.setText("A2");

        jLabel3.setText("Nota:");

        jButton1.setText("Inserir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCnome.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>" }));
        jCnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCnomeActionPerformed(evt);
            }
        });

        jCcurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>" }));
        jCcurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCcursoActionPerformed(evt);
            }
        });

        jCturma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>" }));
        jCturma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCturmaActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso:");

        jLabel5.setText("Turma:");

        jCdisciplina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecionar>" }));

        jLabel6.setText("Disciplina:");

        jLmat.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(77, 77, 77)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(62, 62, 62)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton1)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTnota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jRa1)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jRa2))
                                .addComponent(jCnome, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCturma, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCcurso, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCdisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLmat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCcurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCturma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addComponent(jLmat, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCdisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRa1)
                    .addComponent(jLabel3)
                    .addComponent(jTnota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRa2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCturmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCturmaActionPerformed
        // TODO add your handling code here:
            
             Nota tt = new Nota();
             tt = (Nota) jCturma.getSelectedItem();
            try{
               NotaDAO  ndd = new NotaDAO();
               Nota nd = new Nota();
             ArrayList<Nota> nota = ndd.PesquisarTudoD(tt);
                jCdisciplina.removeAllItems();
            for(int i = 0; i < nota.size();i++){
                nd = nota.get(i);
                jCdisciplina.addItem(nd);
            }
        }
            catch(Exception e){
            System.out.println("Erro " + e.getMessage());
            }
            
             Nota tn = new Nota();
             tn = (Nota) jCturma.getSelectedItem();
            try{
               NotaDAO  nd = new NotaDAO();
               Nota na = new Nota();
               
            ArrayList<Nota> nota = nd.PesquisarTudo(tn);
            jCnome.removeAllItems();
            for(int i = 0; i < nota.size();i++){
                na = nota.get(i);
                jCnome.addItem(na);
            }
        }
            catch(Exception e){
            System.out.println("Erro " + e.getMessage());
            }
       
    }//GEN-LAST:event_jCturmaActionPerformed

    private void jCcursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCcursoActionPerformed
        // TODO add your handling code here:
             Nota ct = new Nota();
             ct = (Nota) jCcurso.getSelectedItem();
        try{
               NotaDAO  ndt = new NotaDAO();
               Nota nt = new Nota();
             ArrayList<Nota> nota = ndt.PesquisarTudoT(ct);
             jCturma.removeAllItems();
            for(int i = 0; i < nota.size();i++){
                nt = nota.get(i);
                jCturma.addItem(nt);
            }
        }
            catch(Exception e){
            System.out.println("Erro " + e.getMessage());
            }
        
    }//GEN-LAST:event_jCcursoActionPerformed

    private void jCnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCnomeActionPerformed
        // TODO add your handling code here:
        try{
            Nota an = new Nota();
            an = (Nota) jCnome.getSelectedItem();
            jLmat.setText(String.valueOf(an.getCodigoCTD()));
    }catch(Exception e){
                
    }
    }//GEN-LAST:event_jCnomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         NotaDAO ndao = new NotaDAO();
        InsenrirNotas a = new InsenrirNotas();
         if(jCcurso.getSelectedItem().equals("<Selecionar>")){
            JOptionPane.showMessageDialog(null, "Escolha o curso!");
            jCcurso.requestFocus();}
         else{
            
             if(jCturma.getSelectedItem().equals("<Selecionar>")){
                JOptionPane.showMessageDialog(null, "Escolha a turma!");
                jCturma.requestFocus();}
             else{
               
                  if(jCnome.getSelectedItem().equals("<Selecionar>")){
                    JOptionPane.showMessageDialog(null, "Escolha a turma!");
                    jCnome.requestFocus();}
                  else{
                       if(jCdisciplina.getSelectedItem().equals("<Selecionar>")){
                          JOptionPane.showMessageDialog(null, "Escolha a turma!");
                          jCdisciplina.requestFocus();}
                       else{
                           if(jTnota.getText().trim().isEmpty()){
                              JOptionPane.showMessageDialog(null, "Preencha o nome da Turma!");
                              jTnota.requestFocus();
                            }else{
                                 try{
                Nota nota = new Nota();
                Nota curso = (Nota) jCcurso.getSelectedItem();
                Nota turma = (Nota) jCturma.getSelectedItem();
                Nota nome = (Nota) jCnome.getSelectedItem();
                Nota discip = (Nota) jCdisciplina.getSelectedItem();
                
               
                    if(jRa1.isSelected()){
                        nota.setNota1(Float.valueOf(jTnota.getText()));
                        ndao.validaNota(nota);
                        ndao.inserirNota1(nota, nome , discip, curso);
                    }
                    else if(jRa2.isSelected()){
                        nota.setNota2(Float.valueOf(jTnota.getText()));
                        ndao.inserirNota2(nota,nome,discip);
                     
                        
                        try{
               NotaDAO  nmf = new NotaDAO();
               Nota mf = new Nota();
               
            ArrayList<Nota> notaf = nmf.consultaNota(nome, discip);
            for(int i = 0; i < notaf.size();i++){
                mf = notaf.get(i);
            }
            nota.setMediaF(mf.getNota1(),mf.getNota2());
        }
            catch(Exception e){
            System.out.println("Erro " + e.getMessage());
            }
    
                    ndao.inserirMedia(nota, nome, discip);
                    jCcurso.setSelectedItem(null);
                    jCturma.setSelectedItem(null);
                    jCdisciplina.setSelectedItem(null);
                    jCnome.setSelectedItem(null);
                    jCcurso.requestFocus();
                    
                    }
                    
                                 }catch(Exception ex) {
                    System.out.println("erro" + ex);  
                }
                         
                  }
                       
                      }
             }
         }
    }//GEN-LAST:event_jButton1ActionPerformed
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
            java.util.logging.Logger.getLogger(InsenrirNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsenrirNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsenrirNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsenrirNotas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsenrirNotas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<Object> jCcurso;
    private javax.swing.JComboBox<Object> jCdisciplina;
    private javax.swing.JComboBox<Object> jCnome;
    private javax.swing.JComboBox<Object> jCturma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLmat;
    private javax.swing.JRadioButton jRa1;
    private javax.swing.JRadioButton jRa2;
    private javax.swing.JTextField jTnota;
    // End of variables declaration//GEN-END:variables
}
