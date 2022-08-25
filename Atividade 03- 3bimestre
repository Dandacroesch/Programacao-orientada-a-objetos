import javax.swing.JOptionPane;

public class Brinquedo{
    private String nome;
    private String faixaEtaria = "error";
    private float preco;


    public Brinquedo(){

    }
    public Brinquedo(String nome){
        this.nome = nome;
    }
    public Brinquedo(String nome, float preco){
        this.preco = preco;
        this.nome = nome;
    }

    public void mostrar(){
        System.out.println(String.format("Produto --- : %s\nPreço ----- : %.2f\nFaixa Etária: %s\n", this.nome, this.preco, this.faixaEtaria));
    }


    public String getFaixaEtaria(){
        return this.faixaEtaria;
    }
    public void setFaixaEtaria(String uni){
        if(uni ==  "0 a 2" || uni == "3 a 5" || uni == "6 a 10" || uni == "acima de 10"){
            this.faixaEtaria = uni+" anos";
        }
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setPreco(float preco){
        this.preco = preco;
    }
}


