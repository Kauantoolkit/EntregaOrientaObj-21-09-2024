import pedido.*;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criar produtos
        Produto produto1 = new Produto("Notebook", 2500.00);
        Produto produto2 = new Produto("Mouse", 50.00);

        // Criar cliente
        Cliente cliente = new Cliente("João", "12345678900");

        // Criar endereços e cadastrar para o cliente
        Endereco endereco1 = new Endereco("12345-000", "São Paulo", "Rua A", "100", true);
        Endereco endereco2 = new Endereco("67890-000", "Rio de Janeiro", "Rua B", "200", false);
        cliente.cadastrarEndereco(endereco1);
        cliente.cadastrarEndereco(endereco2);

        // Criar pedido
        Pedido pedido = new Pedido(1, LocalDate.now(), cliente, endereco1);

        // Criar itens do pedido
        ItemPedido item1 = new ItemPedido(produto1, 1);  // 1 Notebook
        ItemPedido item2 = new ItemPedido(produto2, 2);  // 2 Mouses

        // Adicionar itens ao pedido
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);

        // Exibir informações do pedido
        System.out.println("Pedido Número: " + pedido.getNumero());

        System.out.println("Cliente: " + pedido.getCliente());
        System.out.println("Endereço de Entrega: " + pedido.getEnderecoEntrega());

        // Listar itens no pedido
        System.out.println("Itens no Pedido:");
        List<ItemPedido> itens = pedido.getItensNoPedido();
        for (ItemPedido item : itens) {
            System.out.println("- Produto: " + item.getProduto().getNome() + " | Quantidade: " + item.getQuantidade() + " | Subtotal: " + item.calcularSubtotal());
        }

        // Calcular o valor total do pedido
        double valorTotal = pedido.calcularValorTotal();
        System.out.println("Valor Total do Pedido: " + valorTotal);
    }
}
