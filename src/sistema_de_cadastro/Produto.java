package sistema_de_cadastro;

/**
 *
 * @author aguac
 */
public class Produto {
    
    //atributos
    private String nome;
    private double valor;
    private double peso;
    private String descricao;
    private String tamanho;
    private static int id = 0;
    
    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    
    //construtores
    public Produto() {
        id++;
    }

    public Produto(String nome, double valor, double peso, String descricao, String tamanho) {
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
        this.descricao = descricao;
        this.tamanho = tamanho;
        id++;
    }
    
    
}
