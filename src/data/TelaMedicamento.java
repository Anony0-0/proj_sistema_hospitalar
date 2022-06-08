
package persistencia;

public class TelaMedicamento {
    private String Medicamento;
    private String Quantidade;
    private String Unidade;
    private String Frequencia;
    private String Acesso;
    private String NomePaciente;

    public String getNomePaciente() {
        return NomePaciente;
    }

    public void setNomePaciente(String NomePaciente) {
        this.NomePaciente = NomePaciente;
    }

    public String getMedicamento() {
        return Medicamento;
    }

    public void setMedicamento(String Medicamento) {
        this.Medicamento = Medicamento;
    }

    public String getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(String Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getUnidade() {
        return Unidade;
    }

    public void setUnidade(String Unidade) {
        this.Unidade = Unidade;
    }

    public String getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(String Frequencia) {
        this.Frequencia = Frequencia;
    }

    public String getAcesso() {
        return Acesso;
    }

    public void setAcesso(String Acesso) {
        this.Acesso = Acesso;
    }
}
