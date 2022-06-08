
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TelaEvolucaoDao {

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

    public boolean salvar(TelaEvo telaE) {

        try {
            st = con.prepareStatement("INSERT INTO evolucao VALUES(?,?,?)");
            st.setString(1, telaE.getNomePaciente());
            st.setString(2, telaE.getDataAtendimento());
            st.setString(3, telaE.getEvolucao());
            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
        }

    }

}
