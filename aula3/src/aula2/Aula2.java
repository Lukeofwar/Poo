package aula2;

public class Aula2 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();

        c1.modelo = "injex pen";
        c1.cor = "verde";
        // c1.ponta = 0.51f;
        c1.carga = 80;
        // c1.tampada = false;
        c1.destampar();
        c1.status();
        c1.rabiscar();

    }
}
