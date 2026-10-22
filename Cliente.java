

public class Cliente {
    private String nome;
    private String email;
    private int idade;

    public Cliente(String nome, String email, int idade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome é obrigatório!");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido!");
        }
        if (idade < 15) {
            throw new IllegalArgumentException("Idade mínima é 15 anos!");
        }
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public int getIdade() { return idade; }

    @Override
    public String toString() {
        return "Cliente: " + nome + " | " + email + " | " + idade + " anos";
    }
}