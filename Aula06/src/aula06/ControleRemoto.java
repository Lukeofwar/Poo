package aula06;
public class ControleRemoto implements Controlador {
    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    // Métodos Especiais
    public ControleRemoto() {
       this.volume = 50;
       this.ligado = false;
       this.tocando = false;   
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    @SuppressWarnings("empty-statement")
    public void abrirMenu() {
        System.out.println("Está ligado ? " + this.getLigado());
        System.out.println("Está tocando ? " + this.getTocando());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("()");
    }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu...");     
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
            this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 1);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() & getVolume() > 0) {
           this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        
    }

    @Override
    public void play() {
        
    }

    @Override
    public void pause() {
        
    }
    
    
}
