import java.util.ArrayList;
import java.util.List;

public class cartãoDeCredito {

    private double limite;
    private double saldo;
    private List<compra> compras;


    public cartãoDeCredito(double limite) {
        this.limite = limite;
        this.saldo =limite;
        this.compras = new ArrayList<>();
    }

    public boolean lançaCompra(compra compra) {
        if(this.saldo > compra.getValor()) {
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true;
        }
        return false;
    }

    public double getLimite() {
        return limite;
    }
    public  double getSaldo() {
        return saldo;
    }
    public List<compra> getCompras() {
        return compras;
    }
}
