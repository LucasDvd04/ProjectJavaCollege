package br.com.modelo;

import br.com.controle.ADM;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ADMDAO extends DAO{
    
    public void inserirADM(ADM a) throws Exception {          
    abrirBanco();
    String query = "INSERT INTO administrador (codigoADM,nomeADM) values(?,?);";
    
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setInt(1, a.getLinhas());
    ps.setString(2, a.getNome());
    ps.execute();
    fecharBanco();
    }
       public void inserirLogin(ADM a) throws Exception {          
    abrirBanco();
    String query = "INSERT INTO usuario (usuario,senha,codigoADM) values(?,?,?);";
    ps=(PreparedStatement) con.prepareStatement(query);
    ps.setString(1, a.getUsuario());
    ps.setString(2, a.getSenha());
    ps.setInt(3, a.getLinhas());
    ps.execute();
    JOptionPane.showMessageDialog(null, "Administrador inserido!");
    fecharBanco();
    }
      
      
        public boolean verificarLogin (String usuario) {
            try {
            abrirBanco();
            String query = "SELECT * FROM login;";
            ps = (PreparedStatement) con.prepareStatement(query);
            ps.setString(1,usuario);
            rs = ps.executeQuery();
            return rs.next();
         } 
                catch (SQLException ex) {
            return false;
        }
    
}
               public int validaAdm(ADM a){
        try {
            abrirBanco();
            String query = "select * from administrador;";
            ps = (com.mysql.jdbc.PreparedStatement) con.prepareStatement(query);
            rs = ps.executeQuery();
            rs.last();
            a.setLinhas(rs.getRow());
            return a.getLinhas();
        } catch (SQLException ex) {
            return 0;
        }
        
    }
       
}
