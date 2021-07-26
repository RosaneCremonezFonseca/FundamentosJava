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
        String opcao = ""; //variavel - "" pra declarar qlq coisa...
        int area = 0;// vai receber o resultado dos calculos de area
        // comando while (enquanto)
        // != DIFERENTE
        // || (SHIFT E AS DUAS BARRAS_ É "OU"
        // && SERIA "E"
        //! OPCAO quer dizer se opção diferente
        //toUpperCase transforma qualquer opção em maicusculo

        while(!opcao.toUpperCase().equals("S")) {

            System.out.println("Escolha o Calculo de Desejado");
            System.out.println("(1) - Area do Quadrado");
            System.out.println("(2) - Area do Retagulo");
            System.out.println("(3) - Area do Triangulo");
            System.out.println("(4) - Area do Circulo");
            System.out.println("(5) - Tabuada ");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(S)  - Sair");

            // fazer se comunicar com as funções
            opcao = entrada.nextLine();// leitura da opcao
            switch (opcao) {
                case "1":
                    area = calcularAreaDoQuadrado();
                    break;
                case "2":
                    area = calcularAreaDoRetangulo();
                    break;
                case "3":
                    area = calcularAreaDoTriangulo();
                    break;
                case "5":
                    tabuada();
                    break;
                case "6":
                    fibonacci();
                    break;

                case "7":
                    contagemRegressiva();
                    break;
                case "S":
                case "s":
                    System.out.println("Agradecemos pela preferencia!  Fui!!");// aqui seria um fim para o While...
                    break;
                default:
                    System.out.println("Valor Inválido: " + opcao);
            }
            if (area > 0) {
                System.out.println("A area é de " + area + " m²");
            }
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

        // Desenhar uma linha
        //System.out.println("####");
        // fazer um for para ele fazer contagem, um laço, vai repetir até chegar a quantidade do lado
      //  for(int coluna = 1; coluna <= lado; coluna ++){
        //    System.out.print("▓");// imagem pega no mapa de caracteres para desenhar um tapete. só um caracter que ele desenha
       // }
        //System.out.println(""); //para pular de linha


        // Desenhar o quadrado
        for( int linha = 1; linha <= lado; linha ++){
            for(int coluna = 1; coluna <= lado; coluna ++){
                System.out.print("■");
            }
            System.out.println("");//pular de linha
        }

        System.out.println(""); //para pular de linha
        return lado * lado;// fazer a conta, multiplicado a 2 e já retorna o resultado



    }

   public static int calcularAreaDoRetangulo(){
        int altura;
        int base;

       System.out.println("Digite a altura:  ");
       altura = entrada.nextInt();
       System.out.println("Digite o base:  " );
       base = entrada.nextInt();
       return altura * base;

   }

   public static int calcularAreaDoTriangulo(){
       int altura;
       int base;

       System.out.println("Digite a altura:  ");
       altura = entrada.nextInt();
       System.out.println("Digite o base:  " );
       base = entrada.nextInt();
       return (altura * base)/2;
   }

   // criar um método para tabuada
    public static void tabuada(){
        System.out.print("Vocé quer calcular a tabuada de qual numero? ");
        byte numero = entrada.nextByte();// ler um numero de 0 a 255
        // i de indice
        for(byte i = 1; i<=10; i++){
            System.out.print(numero * i + " ");

        }
    }

    public static void fibonacci(){
        System.out.print("Quantos numeros deseja calcular na sequencia?");
        byte numero = entrada.nextByte();//faz a leitura do dado, e saber o que o usuario vai escolher
        // porque um switch? e porque é pra ver quantas vezes ele irá executar e tem mais de 2 comportamentos padrões tem 3 ou mais
        switch(numero){
            case 0:
                System.out.println(" A sequencia esta vazia");
                break;
            case 1:
                System.out.println(" sequencia de Fibonacci: 1");
                break;
            default:
                int num1 = 1;
                int num2 = 1;
                System.out.println(" sequencia de Fibonacci: 1 ");
                for(byte i = 2; i <= numero; i ++){
                   int fib = num1 + num2;
                    System.out.print(fib + " ");
                    num1 = num2;
                    num2 = fib;

                }
        }
    }


    public static void contagemRegressiva(){
        System.out.println("Começar a contagem apartir de qual numero?");
        int numero = entrada.nextInt();

        System.out.println("Diminuindo de quantos em quantos numeros por vez?");// outra pergunta para o usuário
        int decrescimo = entrada.nextInt();

        for(int i = numero; i >= 1; i -= decrescimo) {
            System.out.println(i);
        }
    }
}
