
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//import data.pep;
//import data.PepDao;

/**
 *
 * @author casa
 */
public class PepDao {

    private Connection con;
    private PreparedStatement st;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pep3", "root", "");
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            return false;

        }

    }

    public boolean salvar(pep pep3) {

        try {
            st = con.prepareStatement("INSERT INTO prontuariocadastro VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            st.setString(1, pep3.getNome());
            st.setString(2, pep3.getNascimento());
            st.setString(3, pep3.getResponsavel());
            st.setString(4, pep3.getRelacao());
            st.setString(5, pep3.getRg());
            st.setString(6, pep3.getCpf());
            st.setString(7, pep3.getOutrodocumento2());
            st.setString(8, pep3.getDocumentocomplementar());
            st.setString(9, pep3.getSexo());
            st.setString(10, pep3.getRaca());
            st.setString(11, pep3.getNomedamae());
            st.setString(12, pep3.getNomedopai());
            st.setString(13, pep3.getEmail());
            st.setString(14, pep3.getTelefone());
            st.setString(15, pep3.getEstadocivil());
            st.setString(16, pep3.getTiposanguineo());

            st.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        }

    }

    
}


        

       

