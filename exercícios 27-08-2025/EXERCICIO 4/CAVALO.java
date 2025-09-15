public class Cavalo extends Animal {
    
    public void galopar() {
        System.out.println(nome + " está galopando!");
    }
    
    @Override
    public void emitirSom() {
        System.out.println(nome + " relincha: 'Relinchou!'");
    }
}