package aula2;
public class Aula2 {
      public static void main(String[] args) {
       Caneta c1 = new Caneta();
       
        c1.cor = "Azul cristal";
        c1.ponta = 0.6f;
        c1.tampar();
        c1.modelo = "Bic cristal";
        c1.status();
        c1.rabiscar()  ;
        
        Caneta c2 = new Caneta();
        c2.modelo = "kkkk";
        c2.cor = "preta";
        c2.destampar();   
        c2.status();
        c2.rabiscar();
        
        }   
}
