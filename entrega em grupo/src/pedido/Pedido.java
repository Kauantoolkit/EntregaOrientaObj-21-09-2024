package pedido;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private LocalDate dataHora;
    private Cliente cliente;
    private List<ItemPedido> itensNoPedido;
    private Endereco enderecoEntrega;

    public Pedido(int numero, LocalDate dataHora, Cliente cliente, Endereco enderecoEntrega) {
        this.numero = numero;
        this.dataHora = dataHora;
        this.cliente = cliente;
        this.enderecoEntrega = enderecoEntrega;
        this.itensNoPedido = new ArrayList<>();
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getDataHora() {
        return dataHora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemPedido> getItensNoPedido() {
        return itensNoPedido;
    }

    public Endereco getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public void adicionarItem(ItemPedido item) {
        this.itensNoPedido.add(item);
    }

    public void removerItem(ItemPedido item) {
        this.itensNoPedido.remove(item);
    }

    public double calcularValorTotal() {
        double total = 0;
        for (ItemPedido item : itensNoPedido) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
