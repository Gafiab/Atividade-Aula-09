public abstract class Plano {
    protected String nome;
    protected double valorBase;

    public Plano(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    public abstract double calcularMensalidade();

    public String getNome() { return nome; }
}