package aula2;
public class Aula2 {
      public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.cor = "Azul";
       c1.modelo ="Injex Pen";
       c1.ponta = 0.5f;
       c1.tampar();
       c1.status();
       c1.rabiscar();
       
       Caneta c2 = new Caneta();
       c2.modelo = "Faber Catell";
       c2.cor = "preta"
       c2.ponta = 2.5f;
       c2.rabiscar();
       c2.status();
       c2.destampar();
      
    }
    
}
