package aula2;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status() {
        System.out.println("Carga: " + this.carga + "50%" );
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Está tampada? "  + this.tampada);
    }
      
    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! não posso rabiscar." + "\n");
    } else {
            System.out.println("Estou rabiscando.");
    
      }
}
    void tampar() {
       this.tampada = true
    }
    void destampar() {  
        this.tampada = false
    }
    
}
