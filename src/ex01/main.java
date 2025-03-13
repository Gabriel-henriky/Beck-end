package ex01;

//1. Criar uma classe "Carro" com os atributos marca, modelo e ano. No main, instanciar um objeto
//dessa classe e exibir os valores dos atributos.
public class main {
    public static void main(String[] args) {
        Carro jetta = new Carro();
        jetta.setMarca("Volkswagen");
        jetta.setModelo("GLI");
        jetta.setAno(2024);

        System.out.println(jetta.getMarca());
        System.out.println(jetta.getModelo());  //ex 01
        System.out.println(jetta.getAno());



        jetta.exibirDados();

    }
}
