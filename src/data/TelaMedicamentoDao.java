package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TelaMedicamentoDao {

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

    public boolean salvar(TelaMedicamento telaM) {

        try {
            st = con.prepareStatement("INSERT INTO medicamentos VALUES(?,?,?,?,?,?)");
            st.setString(1, telaM.getMedicamento());
            st.setString(2, telaM.getQuantidade());
            st.setString(3, telaM.getUnidade());
            st.setString(4, telaM.getFrequencia());
            st.setString(5, telaM.getAcesso());
            st.setString(6, telaM.getNomePaciente());
            st.executeUpdate();
            return true;

        } catch (SQLException ex) {
            return false;
        }

    }
}
