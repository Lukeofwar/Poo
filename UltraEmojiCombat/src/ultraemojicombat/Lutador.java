package ultraemojicombat;
public class Lutador {
    // Atributos
       private String nome;
       private String nacionalidade;
       private float idade;
       private float altura;
       private float peso;  
       private String categoria;
       private int vitorias, derrotas, empates;
              
    // Métodos Públicos
       public void apresentar() {
           System.out.println("---------------------------------------------");
           System.out.println("Chegou a hora! Apresentamos o lutador " + this.getNome());
           System.out.println("Diretamente de: " + this.getNacionalidade());
           System.out.println("Com " + this.getIdade() + "anos e " + this.getAltura());
           System.out.println("Pesando " + this.getPeso() + "kg");
           System.out.println("Ganhou: " + this.getVitorias());
           System.out.println("Perdeu: " + this.getDerrotas());
           System.out.println("Empatou: " + this.getEmpates());
       }
       public void status() {
           System.out.println(this.getNome() + " é um peso " + this.getCategoria()) ;
           System.out.println("Ganhou " + this.getVitorias() + " vezes");
           System.out.println("Perdeu " + this.getDerrotas() + " vezes");
           System.out.println("Empatou " + this.getEmpates() + " vezes");
       }
       public void ganharLuta() {
           this.setVitorias(this.getVitorias() + 1);
       }
       public void perderLuta() {
           this.setDerrotas(this.getDerrotas() + 1);
       }
       public void empatarLuta() {
           this.setEmpates(this.getEmpates() + 1);
       }
    // Métodos Especiais

    public Lutador(String no, String na, float id, float al,
            float pe, int vi, int de, int em) {
         
        this.nome = no ;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
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

    
    
    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
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
        if (this.peso < 52.2) {
            this.categoria =  "Inválido";    
       
        } else if (this.peso <= 70.3){
            this.categoria = "leve";
            
        } else if (this.peso <= 83.9) {
            this.categoria = "Médio";
            
        } else if (this.peso <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
       
}
