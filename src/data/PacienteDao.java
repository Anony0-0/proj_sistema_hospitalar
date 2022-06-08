
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class PacienteDao {
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
    
    
    public int Salvar(Paciente pep3){
        int status;
        try {
            st = conn.prepareStatement("INSERT INTO paciente values(?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, pep3.getCPF());
            st.setString(2, pep3.getNome());
            st.setString(3, pep3.getRG());
            st.setString(4, pep3.getDataNasc());
            st.setString(5, pep3.getSexo());
            st.setString(6, pep3.getPNE());
            st.setString(7, pep3.getEndereco());
            st.setString(8, pep3.getSangue());
            st.setString(9, pep3.getCelular());
            st.setString(10, pep3.getSusNumero());
            st.setString(11, pep3.getSusValidade());
            
            status = st.executeUpdate();
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getErrorCode());
            return ex.getErrorCode();
        }
    }
    
    public Paciente Consultar(String cpf){
        
        Paciente Novo_Paciente = new Paciente();
        try {
            st = conn.prepareStatement("SELECT * FROM paciente WHERE cpf = ?");
            st.setString(1,cpf);
            rs = st.executeQuery();
            if(rs.next()){
                Novo_Paciente.setCPF(rs.getString("cpf"));
                Novo_Paciente.setNome(rs.getString("nome"));
                Novo_Paciente.setRG(rs.getString("rg"));
                Novo_Paciente.setDataNasc(rs.getString("nascimento"));
                Novo_Paciente.setSexo(rs.getString("sexo"));
                Novo_Paciente.setPNE(rs.getString("pne"));
                Novo_Paciente.setEndereco(rs.getString("endereco"));
                Novo_Paciente.setSangue(rs.getString("sangue"));
                Novo_Paciente.setCelular(rs.getString("celular"));
                Novo_Paciente.setSusNumero(rs.getString("susnumero"));
                Novo_Paciente.setSusValidade(rs.getString("susvalidade"));
                
                return Novo_Paciente;
            }
            else{
                Novo_Paciente.setCPF("N/A");
                return Novo_Paciente;
            }
        }catch (SQLException ex) {
            Novo_Paciente.setCPF("N/A");
            return Novo_Paciente;
        }
    }
    
    public void Desconectar(){
        try {
            conn.close();
        } catch (SQLException ex) {

        }
    }
}
