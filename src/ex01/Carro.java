package ex01;
//2. Adicione um método exibirDados() na classe Carro, que imprime os valores dos atributos. No main,
//crie um objeto e chame esse método.
public class Carro {
   String marca;
   String modelo;
   int ano;

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void exibirDados(){
        System.out.println(getAno());
        System.out.println(getMarca());
        System.out.println(getModelo());
    }
    }
