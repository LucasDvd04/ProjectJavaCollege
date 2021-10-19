package br.com.modelo;

import br.com.controle.Professor;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ProfDAO extends DAO {
    
       public ArrayList<Professor> PesquisarTudo () throws Exception {
       ArrayList<Professor> professor  = new ArrayList<Professor>();
         try{
         abrirBanco();  
         String query = "select codigoDisciplina, nomeDisciplina FROM disciplina";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ResultSet tr = ps.executeQuery();
         Professor p ;
         while (tr.next()){               
           p = new Professor();
           p.setCodigo(tr.getInt("codigoDisciplina"));
           p.setNomeD(tr.getString("nomeDisciplina"));
           professor.add(p);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return professor;
     }
    public void inserirProf(Professor p) throws Exception {          
    abrirBanco();
    String query = "INSERT INTO professor (matriculaProfessor,nomeProfessor,email,idade,codigoDisciplina) values(?,?,?,?,?);";
    
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, p.getLinhas());
    ps.setString(2, p.getNome());
    ps.setString(3, p.getEmail());
    ps.setInt(4, p.getIdade());
    ps.setInt(5,p.getCodigo());
    ps.execute();
    fecharBanco();
    }
       public void inserirProfL(Professor p) throws Exception {          
    abrirBanco();
    String query = "INSERT INTO usuario (usuario,senha,matriculaProfessor) values(?,?,?);";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setString(1, p.getUsuario());
    ps.setString(2, p.getSenha());
    ps.setInt(3, p.getLinhas());
    ps.execute();
    JOptionPane.showMessageDialog(null, "Professor inserido!");
    fecharBanco();
    }
      
   public int validaProf(Professor p){
        try {
            abrirBanco();
            String query = "select * from professor;";
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = ps.executeQuery();
            rs.last();
            p.setLinhas(rs.getRow());
            return p.getLinhas();
        } catch (SQLException ex) {
            return 0;
        }
        
    }
     public boolean verificarProf (String email) {
            try {
            abrirBanco();
            String query = "SELECT email FROM professor WHERE email = ?;";
            ps = (java.sql.PreparedStatement) con.prepareStatement(query);
            ps.setString(1,email);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
     }
     public boolean verificarU (String userP) {
            try {
            abrirBanco();
            String query = "SELECT usuario FROM usuario WHERE usuario = ?;";
            ps = (java.sql.PreparedStatement) con.prepareStatement(query);
            ps.setString(1,userP);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
     }
}
