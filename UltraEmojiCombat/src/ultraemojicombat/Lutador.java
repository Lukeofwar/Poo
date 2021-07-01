package ultraemojicombat;
public class Lutador {
    // Atributos
       private String nome;
       private float nacionalidade;
       private float idade;
       private float altura;
       private float peso;
       private String categoria;
       private int vitorias, derrotas, empates;
              
    // Métodos Públicos
       public void apresentar() {
           
       }
       public void status() {
           
       }
       public void ganharLuta() {
           
       }
       public void perderLuta() {
           
       }
       public void empatarLuta() {
           
       }
    // Métodos Especiais

    public Lutador(String no, float na, float id, float al,
            float pe, int vi, int de, int em) {
        
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.peso = pe;
        this.vitorias = vi;
        this.derrotas = de;
        this.empates = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(float nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getIdade() {
        return idade;
    }

    public void setIdade(float idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
       
}
