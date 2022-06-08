
package data;

import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;


public class LoginDao {
    
    Connection conn;
    PreparedStatement st;
    ResultSet rs;
    public boolean Conectar(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pep3","root","murevenge246");
            return true;
        } catch (ClassNotFoundException | SQLException ex) {
            return false;
        }
    }
    
    public int Salvar(Login pep3){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO TelaLogin values(?,?,?,?)");
            st.setString(1, pep3.getUsuario());
            st.setString(2, pep3.getSenha());
            st.setString(3, pep3.getNome());
            st.setString(4, pep3.getCargo());
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
    
    public Login Consultar(String usuario){
        
        Login Login_Banco = new Login();
        try {
            st = conn.prepareStatement("SELECT * FROM cadastro_login WHERE usuario = ?");
            st.setString(1,usuario);
            rs = st.executeQuery();
            if(rs.next()){
                Login_Banco.setUsuario(rs.getString("usuario"));
                Login_Banco.setSenha(rs.getString("senha"));
                return Login_Banco;
            }
            else{
                Login_Banco.setUsuario("N/A");
                return Login_Banco;
            }
        }catch (SQLException ex) {
            Login_Banco.setUsuario("N/A");
            return Login_Banco;
        }
    }
    
    public void Desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }
}
