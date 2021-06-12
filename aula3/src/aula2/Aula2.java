package aula2;

public class Aula2 {

    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        //c1.ponta = 0.5f;0
        c1.carga = 75;
        //c1.tampada = false;
        c1.tampar();
        c1.modelo = "layssa";
        c1.cor = "vermelha";      
        c1.status();
        c1.rabiscar();
        

    }
}
