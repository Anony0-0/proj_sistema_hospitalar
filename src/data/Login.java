package data;

public class Login {
    //Atributos
    private String Usuario;
    private String Senha;
    private String Nome;
    private String Cargo;
    
    
    //Construtor da classe

    public Login() {
    }
    
    //Metodo Get e Setter

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
}
