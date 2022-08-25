
public class atividadee {
    public static void main(String[] args) {
        
        Brinquedo b1 = new Brinquedo("Unicornio", (float)34.5);
        b1.setFaixaEtaria("0 a 2");
        b1.mostrar();

        Brinquedo b2 = new Brinquedo("Ponei");
        b2.setFaixaEtaria("3 a 5");
        b2.setPreco((float)34.5);
        b2.mostrar();
 
        Brinquedo b3 = new Brinquedo();
        b3.setFaixaEtaria("6 a 10");
        b3.setPreco((float)34.5);
        b3.setNome("Cavalo");
        b3.mostrar();
 
    }
    
}
