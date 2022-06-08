
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class TelaAdmissaoDao {
    
    private Connection con;
    private PreparedStatement st;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            return true;

        } catch (ClassNotFoundException | SQLException ex) {
            return false;

        }

    }

    public boolean salvar(TelaAdmissao telaA) {

        try {
            st = con.prepareStatement("INSERT INTO admissao VALUES(?,?,?,?,?,?,?,?)");
            st.setString(1, telaA.getNomePaciente());
            st.setString(2, telaA.getDataPrimeiroSintoma());
            st.setString(3, telaA.getCovidConfirmado());
            st.setString(4, telaA.getQueixa());
            st.setString(5, telaA.getDiagnostico());
            st.setString(6, telaA.getCid10());
            st.setString(7, telaA.getPlanoTerapeutico());
            st.setString(8, telaA.getDataAtendimento());
            st.executeUpdate();
            return true;
        
        } catch (SQLException ex) {
            return false;
        }

    }
    
}
