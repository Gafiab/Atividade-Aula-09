public class Main {
    public static void main(String[] args) {
        try {
            Cliente cliente = new Cliente("João Silva", "joao@email.com", 25);
            cliente.setPlano(new PlanoPremium());
            cliente.adicionarTreino(new Treino("Peito e Tríceps", 4, 12));
            cliente.adicionarTreino(new Treino("Costas e Bíceps", 3, 10));

            System.out.println(cliente);
            System.out.println("Plano: " + cliente.getPlano().getNome());
            for (Treino t : cliente.getTreinos()) {
                t.exibirTreino();
            }

            new PagamentoService().processarPagamento(cliente);

            // Teste de erro (cliente menor de idade)
            new Cliente("Maria", "maria@email.com", 14);

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado no sistema.");
            e.printStackTrace();
        }
    }
}