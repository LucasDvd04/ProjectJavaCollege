package br.com.modelo;

import br.com.controle.Aluno;
import br.com.controle.Nota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class NotaDAO extends DAO{
    public ArrayList<Nota> PesquisarTudo (Nota at) throws Exception {
       ArrayList<Nota> notas  = new ArrayList<>();
         try{
         abrirBanco();  
         String query = "select matriculaAluno, nomeAluno FROM aluno WHERE codigoTurma = ?;";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ps.setInt(1,at.getCodigoCTD());
         ResultSet tr = ps.executeQuery();
         Nota a ;
         while (tr.next()){               
           a = new Nota();
           a.setCodigoCTD(tr.getInt("matriculaAluno"));
           a.setNomeCTD(tr.getString("nomeAluno"));
           notas.add(a);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return notas;
     }
     public ArrayList<Nota> PesquisarTudoC () throws Exception {
       ArrayList<Nota> notas  = new ArrayList<>();
         try{
         abrirBanco();  
         String query = "select codigoCurso, nomeCurso FROM curso;";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ResultSet tr = ps.executeQuery();
         Nota c ;
         while (tr.next()){               
           c = new Nota();
           c.setCodigoCTD(tr.getInt("codigoCurso"));
           c.setNomeCTD(tr.getString("nomeCurso"));
           notas.add(c);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return notas;
     }
      public ArrayList<Nota> PesquisarTudoT (Nota ct) throws Exception {
       ArrayList<Nota> notas  = new ArrayList<>();
         try{
         abrirBanco();  
         String query = "select codigoTurma, nomeTurma FROM turma WHERE codigoCurso = ?;";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ps.setInt(1,ct.getCodigoCTD());
         ResultSet tr = ps.executeQuery();
         Nota t ;
         while (tr.next()){               
           t = new Nota();
           t.setCodigoCTD(tr.getInt("codigoTurma"));
           t.setNomeCTD(tr.getString("nomeTurma"));
           notas.add(t);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return notas;
     }
        public ArrayList<Nota> PesquisarTudoD (Nota tt) throws Exception {
       ArrayList<Nota> notas  = new ArrayList<>();
         try{
         abrirBanco();  
         String query = "select codigoDisciplina, nomeDisciplina FROM disciplina WHERE codigoTurma = ?;";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ps.setInt(1,tt.getCodigoCTD());
         ResultSet tr = ps.executeQuery();
         Nota t ;
         while (tr.next()){               
           t = new Nota();
           t.setCodigoCTD(tr.getInt("codigoDisciplina"));
           t.setNomeCTD(tr.getString("nomeDisciplina"));
           notas.add(t);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return notas;
     }
    public void inserirNota1(Nota a, Nota b, Nota c, Nota d) throws Exception {          
    abrirBanco();
   String query = "INSERT INTO notas (codigoNotas,a1,matriculaAluno,codigoDisciplina,codigoCurso) values(?,?,?,?,?);";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, a.getLinhas());
    ps.setFloat(2, a.getNota1());
    ps.setInt(3, b.getCodigoCTD());
    ps.setInt(4, c.getCodigoCTD());
    ps.setInt(5, d.getCodigoCTD());
    ps.execute();
    fecharBanco();
        JOptionPane.showMessageDialog(null,"Nota A1 inserida!");
    }
          
     public void inserirNota2(Nota a, Nota b, Nota c) throws Exception {          
    abrirBanco();
   String query = "UPDATE notas SET a2 = ? WHERE matriculaAluno = ? AND codigoDisciplina = ?;";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setFloat(1, a.getNota2());
    ps.setInt(2, b.getCodigoCTD());
    ps.setInt(3, c.getCodigoCTD());
    ps.execute();
    fecharBanco();
    JOptionPane.showMessageDialog(null,"Nota A2 inserida!");
    }
       public ArrayList<Nota> consultaNota (Nota a, Nota b) throws Exception {
       ArrayList<Nota> notas  = new ArrayList<>();
         try{
         abrirBanco();  
         String query = "SELECT a1, a2 FROM notas where  matriculaAluno = ? AND codigoDisciplina = ?;";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ps.setInt(1,a.getCodigoCTD());
         ps.setInt(2,b.getCodigoCTD());
         ResultSet tr = ps.executeQuery();
         Nota t ;
         while (tr.next()){               
           t = new Nota();
           t.setNota1(tr.getFloat("a1"));
           t.setNota2(tr.getFloat("a2"));
           notas.add(t);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return notas;
     }
       public void inserirMedia(Nota a, Nota b, Nota c) throws Exception {          
    abrirBanco();
   String query = "UPDATE notas SET mediaF = ? WHERE matriculaAluno = ? AND codigoDisciplina = ?;";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setFloat(1, a.getMediaF());
    ps.setInt(2, b.getCodigoCTD());
    ps.setInt(3, c.getCodigoCTD());
    ps.execute();
    fecharBanco();
        JOptionPane.showMessageDialog(null,"Media Final:"+a.getMediaF());
    }
      
   public int validaNota(Nota a){
        try {
            abrirBanco();
            String query = "select * from notas;";
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = ps.executeQuery();
            rs.last();
            a.setLinhas(rs.getRow());
            return a.getLinhas();
        } catch (SQLException ex) {
            return 0;
        }
        
    }
     public boolean verificarProf (String email) {
            try {
            abrirBanco();
            String query = "SELECT email FROM aluno WHERE email = ?;";
            ps = (java.sql.PreparedStatement) con.prepareStatement(query);
            ps.setString(1,email);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
     }
     public boolean verificarU (String userA) {
            try {
            abrirBanco();
            String query = "SELECT usuario FROM usuario WHERE usuario = ?;";
            ps = (java.sql.PreparedStatement) con.prepareStatement(query);
            ps.setString(1,userA);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
     }
}
