
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TelaAltaDao {

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

    public boolean salvar(TelaAlta tAlta) {

        try {
            st = con.prepareStatement("INSERT INTO alta VALUES(?,?,?,?)");
            st.setString(1, tAlta.getMotivo());
            st.setString(2, tAlta.getCId10());
            st.setString(3, tAlta.getConclusao());
            st.setString(4, tAlta.getNomePaciente());

            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
        }

    }
}
