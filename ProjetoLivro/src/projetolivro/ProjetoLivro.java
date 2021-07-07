package projetolivro;
public class ProjetoLivro {
public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro [3];
        
        p[0] = new Pessoa("Pedro", 22, "M");
        p[1] = new Pessoa("Maria", 25, "F");
        
        l[0] = new Livro("A senhora do Lago", "andrzej sapkowski", 350, p[0]);
        l[1] = new Livro("O batismo do combate", "andrzej sapkowski", 460, p[1]);
        l[2] = new Livro("Tempo de tempestade", "andrzej sapkowski", 600, p[0]);
        
        l[0].abrir();
        l[0].folhear(400);
        l[0].avançarPag();        
        System.out.println(l[0].detalhes());
    }
}
