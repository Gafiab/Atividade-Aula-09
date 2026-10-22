import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ClienteTest {

    @Test
    public void deveCadastrarClienteValido() {
        Cliente c = new Cliente("João", "joao@email.com", 20);
        assertEquals("João", c.getNome());
    }

    @Test
    public void naoDeveCadastrarClienteMenorDeIdade() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cliente("João", "joao@email.com", 14));
    }

    @Test
    public void naoDeveCadastrarEmailInvalido() {
        assertThrows(IllegalArgumentException.class,
                () -> new Cliente("João", "email-invalido", 20));
    }

    @Test
    public void deveAdicionarTreino() {
        Cliente c = new Cliente("João", "joao@email.com", 20);
        c.adicionarTreino(new Treino("Perna", 4, 12));
        assertEquals(1, c.getTreinos().size());
    }
}