package br.com.modelo;

import br.com.controle.Curso;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CursoDAO extends DAO{
    public void inserirCurso(Curso a) throws Exception {          
    abrirBanco();
    String query = "INSERT INTO curso (codigoCurso,nomeCurso,sigla) values(?,?,?);";
    
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, a.getLinhas());
    ps.setString(2, a.getNome());
    ps.setString(3,a.getSigla());
    ps.execute();
    fecharBanco();
    }
    public boolean verificarCurso (String nomeCurso) {
            try {
            abrirBanco();
            String query = "SELECT nomeCurso FROM curso WHERE nomeCurso = ?;";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1,nomeCurso);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
    
}
               public int validaCurso(Curso c){
        try {
            abrirBanco();
            String query = "select * from curso;";
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = ps.executeQuery();
            rs.last();
            c.setLinhas(rs.getRow());
            return c.getLinhas();
        } catch (SQLException ex) {
            return 0;
        }
               }
}
