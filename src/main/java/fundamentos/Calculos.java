package fundamentos;
// importação da classe medidas
import static fundamentos.Medidas.entrada;
import static fundamentos.Medidas.tabuada;

public class Calculos {

    // trazer a função tabuada do Medidas // tem que importar
    public static void main(String[] args){
        System.out.print("Deseja calcular a tabuada? <S/N>");
        String resposta = entrada.nextLine();
        switch (resposta){
            case "S":
            case "s":
                tabuada();
                break;
            default:
                System.out.println("Dgitou outro texto deferente de \"S\"");
        }


    }
}
