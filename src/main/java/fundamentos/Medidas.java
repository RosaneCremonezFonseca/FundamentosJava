// - 1 Pacote
package fundamentos;
//bibliotecas
import java.util.Scanner;

//classes
public class Medidas {
    //3.1 Atributos
    // cria e liga o Scanner
    static Scanner entrada= new Scanner(System.in);//variavel global//instanciar o objeto de leitura do console

    //metodos e funções
    public static void main(String[] args){
        //variavel que vai receber a leitura
        String opcao; //variavel
        int area = 0;// vai receber o resultado dos calculos de area

        System.out.println("Escolha o Calculo de Desejado");
        System.out.println("(1) - Area do Quadrado");
        System.out.println("(2) - Area do Retagulo");
        System.out.println("(3) - Area do Triangulo");
        System.out.println("(4) - Area do Circulo");

        // fazer se comunicar com as funções
        opcao = entrada.nextLine();// leitura da opcao
        switch(opcao){
            case "1":
                area = calcularAreaDoQuadrado();
                break;
            case "2":
                //ToDo: calcular area do retangulo// quer dizer pendente, a fazer
                break;
            default:
                System.out.println("Valor Inválido: " + opcao);
        }
        if (area > 0) {
            System.out.println("A area é de " + area + " m²");
        }
    }

    // função
    public static int calcularAreaDoQuadrado(){
        // Scanner é uma classe do util, o nome que se dá é o objeto(nesse caso entrada)
        //new Scanner é o estanciar o Scanner(uma copia provisória)
        //System.in : criamos o objeto pra ler uma entrada no console
        // variaveis
        //criar uma variavel para ele fazer a leitura
        int lado;// é o tamanho do lado do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt();// leitura do tamanho do lado e guarda no lado
        return lado * lado;// fazer a conta, elevado a 2 e já retorna o resultado

    }


}
