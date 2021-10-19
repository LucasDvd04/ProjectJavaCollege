
package br.com.modelo;

import br.com.controle.Login;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LoginDAO  extends DAO{
    
    public boolean verificaLogar (String usuario, String senha, Login log) {
            try {
            abrirBanco();
            String query = "SELECT * FROM usuario WHERE Usuario = ? and Senha = ?;";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1,usuario);
            ps.setString(2,senha);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
    }      
    
}
