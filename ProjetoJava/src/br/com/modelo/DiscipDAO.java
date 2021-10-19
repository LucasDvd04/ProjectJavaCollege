
package br.com.modelo;

import br.com.controle.Disciplina;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DiscipDAO extends DAO{
    
         public ArrayList<Disciplina> PesquisarTudo () throws Exception {
       ArrayList<Disciplina> disciplinas  = new ArrayList<Disciplina>();
         try{
         abrirBanco();  
         String query = "select codigoTurma, nomeTurma FROM turma";
         ps = (PreparedStatement) con.prepareStatement(query);
         ResultSet tr = ps.executeQuery();
         Disciplina d ;
         while (tr.next()){               
           d = new Disciplina();
           d.setCodigoT(tr.getInt("codigoTurma"));
           d.setNomeT(tr.getString("nomeTurma"));
           disciplinas.add(d);
         } 
         fecharBanco();
       }catch (Exception e){
           System.out.println("Erro " + e.getMessage());
     } 
       return disciplinas;
     }
    
     public void CadastrarDisciplina(Disciplina d) throws Exception{
        abrirBanco();
    String query = "INSERT INTO Disciplina (codigoDisciplina,nomeDisciplina,cargaHoraria,sala,codigoTurma) values(?,?,?,?,?);";
    
    ps=(java.sql.PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, d.getLinhas());
    ps.setString(2,d.getNomeD());
    ps.setInt(3,d.getHora());
    ps.setInt(4,d.getSala());
    ps.setInt(5,d.getCodigoT());
    ps.execute();
    fecharBanco();
    }
             public int validaDisciplina(Disciplina d){
        try {
            abrirBanco();
            String query = "select * from disciplina;";
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = ps.executeQuery();
            rs.last();
            d.setLinhas(rs.getRow());
            return d.getLinhas();
        } catch (SQLException ex) {
            return 0;
        }
}
             public boolean verificarDiscp (String nomeD) {
            try {
            abrirBanco();
            String query = "SELECT nomeDisciplina FROM disciplina WHERE nomeDisciplina = ?;";
            ps = (java.sql.PreparedStatement) con.prepareStatement(query);
            ps.setString(1,nomeD);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
}
}
