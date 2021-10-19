package br.com.modelo;

import br.com.controle.Aluno;
import br.com.controle.Nota;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AlunoDAO extends DAO{
    public ArrayList<Aluno> PesquisarA () throws Exception {
       ArrayList<Aluno> aluno  = new ArrayList<Aluno>();
         try{
         abrirBanco();  
         String query = "select matriculaAluno, nomeAluno, codigoCurso FROM aluno;";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ResultSet tr = ps.executeQuery();
         Aluno a ;
           while (tr.next()){               
           a = new Aluno();
           a.setCodigo(tr.getInt("matriculaAluno"));
           a.setNomeCT(tr.getString("nomeAluno"));
           a.setCodigoCTD(tr.getInt("codigoCurso"));
           aluno.add(a);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     }
     return aluno;
     }

    public ArrayList<Aluno> PesquisarAluno (Aluno a) throws Exception {
       ArrayList<Aluno> aluno  = new ArrayList<Aluno>();
         try{
         abrirBanco();  
         String query = "select a.matriculaAluno, a.nomeAluno, a.email, a.idade, b.a1, b.a2, b.mediaF, c.nomeCurso, d.nomeTurma FROM aluno as a, notas as b, curso as c, turma as d WHERE b.matriculaAluno = a.matriculaAluno AND a.codigoCurso = ? ";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ps.setInt(1, a.getCodigo());
         ResultSet tr = ps.executeQuery();
         Aluno aa ;
         while (tr.next()){               
           aa = new Aluno();
           aa.setCodigo(tr.getInt("matriculaAluno"));
           aa.setNome(tr.getString("nomeAluno"));
           aa.setEmail(tr.getString("email"));
           aa.setNomeCT(tr.getString("nomeCurso"));
           aa.setNomeCTD(tr.getString("nomeTurma"));
           aa.setNota1(tr.getFloat("a1"));
           aa.setNota2(tr.getFloat("a2"));
           aa.setMedia(tr.getFloat("mediaF"));
           aluno.add(a);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return aluno;
     }
     public ArrayList<Aluno> PesquisarTudoC () throws Exception {
       ArrayList<Aluno> aluno  = new ArrayList<Aluno>();
         try{
         abrirBanco();  
         String query = "select codigoCurso,nomeCurso, FROM curso";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ResultSet tr = ps.executeQuery();
         Aluno a ;
         while (tr.next()){               
           a = new Aluno();
           a.setCodigo(tr.getInt("codigoCurso"));
           a.setNomeCT(tr.getString("nomeCurso"));
           aluno.add(a);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return aluno;
     }
      public ArrayList<Aluno> PesquisarTudoT () throws Exception {
       ArrayList<Aluno> aluno  = new ArrayList<Aluno>();
         try{
         abrirBanco();  
         String query = "select codigoTurma, nomeTurma FROM turma";
         ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
         ResultSet tr = ps.executeQuery();
         Aluno t ;
         while (tr.next()){               
           t = new Aluno();
           t.setCodigo(tr.getInt("codigoTurma"));
           t.setNomeCT(tr.getString("nomeTurma"));
           aluno.add(t);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return aluno;
     }
    public void inserirAluno(Aluno a, Aluno b) throws Exception {          
    abrirBanco();
    String query = "INSERT INTO aluno (matriculaAluno,nomeAluno,email,idade,codigoCurso,codigoTurma) values(?,?,?,?,?,?);";
    
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, a.getLinhas());
    ps.setString(2, a.getNome());
    ps.setString(3, a.getEmail());
    ps.setInt(4, a.getIdade());
    ps.setInt(5,a.getCodigo());
    ps.setInt(6,b.getCodigo());
    ps.execute();
    fecharBanco();
    }
       public void inserirAlunoU(Aluno a) throws Exception {          
    abrirBanco();
    String query = "INSERT INTO usuario (usuario,senha,matriculaAluno) values(?,?,?);";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setString(1, a.getUsuario());
    ps.setString(2, a.getSenha());
    ps.setInt(3, a.getLinhas());
    ps.execute();
    JOptionPane.showMessageDialog(null, "Aluno inserido!");
    fecharBanco();
    }
      
   public int validaAluno(Aluno a){
        try {
            abrirBanco();
            String query = "select * from aluno;";
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
