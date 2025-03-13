package ex02;

public class Pessoa {

    String nome;
    String nomeSocial;
    int idade;
    String endereco;

    public Pessoa(String nome, int idade, String endereco, String nomeSocial) {
        this.nome = nome;
        this.endereco = endereco;
        this.nomeSocial = nomeSocial;
        this.idade = idade;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setnomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <1) {
            System.out.println("Idade inválida");
        }else{
            System.out.println("idade válida");
        }
        this.idade = idade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", nomeSocial='" + nomeSocial + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}



