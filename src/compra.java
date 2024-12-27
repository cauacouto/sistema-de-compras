public class compra implements Comparable<compra> {


    private String descricao;
    private double valor;

    public compra(String descrição, double valor) {
        this.descricao = descrição;
        this.valor = valor;
    }


    public String getDescricão() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }


    @Override
    public String toString() {
        return "compra: descrição" + descricao +
                ", valor= " + valor;


    }


    @Override
    public int compareTo(compra outracompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outracompra.valor));
    }
}



