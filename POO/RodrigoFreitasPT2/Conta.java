package POO.RodrigoFreitasPT2;

public class Conta {

    private Integer valor;

    public Conta() {
        this.valor = 50;
    }

    public Conta(Integer valor) {
        this.valor = valor;
    }
    
    public void view() {
        System.out.println(this.valor);
    }
}
