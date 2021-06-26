package atividades;
public class Atividades {
    public static void main(String[] args) {
        Conta c1 = new Conta();   
        c1.setNumConta(1111);
        c1.setDono("Jubileu");
        c1.abrirConta("CC");
        
        Conta c2 = new Conta();
        c2.setNumConta(2222);
        c2.setDono("Creuza");
        c2.abrirConta("CP");
        
        c1.depositar(600);
        c2.depositar(500);
        c2.sacar(200);
        c1.sacar(150);
        c1.estadoAtual();
        c2.estadoAtual();
        
    }
       
}
