
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TelaExamesDao {

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

    public boolean salvar(TelaExa telaEx) {

        try {
            st = con.prepareStatement("INSERT INTO exames VALUES(?,?,?,?)");
            st.setString(1, telaEx.getExames());
            st.setString(2, telaEx.getDataAtendimento());
            st.setString(3, telaEx.getCid10());
            st.setString(4, telaEx.getConclusao());
            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
        }

    }
}
