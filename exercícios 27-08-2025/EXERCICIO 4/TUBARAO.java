public class Tubarao extends Animal {
    
    @Override
    public void emitirSom() {
        System.out.println(nome + " não emite sons, ele desliza silenciosamente.");
    }
    
    public void nadar() {
        System.out.println(nome + " está nadando rápido para caçar!");
    }
}