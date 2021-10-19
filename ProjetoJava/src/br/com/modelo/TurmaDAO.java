
package br.com.modelo;

import br.com.controle.Turma;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class TurmaDAO extends DAO{
    
    public ArrayList<Turma> PesquisarTudo () throws Exception {
       ArrayList<Turma> turmas = new ArrayList<>();
         try{
         abrirBanco();  
         String query = "select codigoCurso, nomeCurso FROM curso";
         ps = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = ps.executeQuery();
         Turma t ;
         while (tr.next()){               
           t = new Turma();
           t.setCodigo(tr.getInt("codigoCurso"));
           t.setNome(tr.getString("nomeCurso"));
           turmas.add(t);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return turmas;
     }
    
    public void CadastrarTurma(Turma tm) throws Exception{
        abrirBanco();
    String query = "INSERT INTO turma (codigoTurma,nomeTurma,codigoCurso) values(?,?,?);";
    
    ps=(java.sql.PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, tm.getLinhas());
    ps.setString(2,tm.getNomeTurma());
    ps.setInt(3,tm.getCodigo());
    ps.execute();
    fecharBanco();
    }
             public int validaTurma(Turma t){
        try {
            abrirBanco();
            String query = "select * from turma;";
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = ps.executeQuery();
            rs.last();
            t.setLinhas(rs.getRow());
            return t.getLinhas();
        } catch (SQLException ex) {
            return 0;
        }
}
             public boolean verificarTurma (String nomeTurma) {
            try {
            abrirBanco();
            String query = "SELECT nomeTurma FROM turma WHERE nomeTurma = ?;";
            ps = (java.sql.PreparedStatement) con.prepareStatement(query);
            ps.setString(1,nomeTurma);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
}
}
