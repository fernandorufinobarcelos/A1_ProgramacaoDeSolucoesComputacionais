import java.util.Scanner;
 
public class Prova-A1f {


  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    //entrada
    System.out.println("Digite a placa do veículo: ");
    String placa = teclado.next();
    System.out.println("Digite o valor do litro do combustível: ");
    float valor = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 60 KM/H: ");
    float k60 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 80 KM/H: ");
    float k80 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 100 KM/H: ");
    float k100 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 120 KM/H: ");
    float k120 = teclado.nextFloat();
    System.out.println("Digite a quantidade de quilômetros rodados a 140 KM/H: ");
    float k140 = teclado.nextFloat();

    //litros por Km
    double lkm60 = k60/30.7;
    double lkm80 = k80/26.8;
    double lkm100 = k100/22.4;
    double lkm120 = k120/18.1;
    double lkm140 = k140/14.5;

    //litros total
    double total = lkm60+lkm80+lkm100+lkm120+lkm140;

    //velocidade media ponderada
    double media = ((k60*60)+(k80*80)+(k100*100)+(k120*120)+(k140*140))/100;

    //custo total
    double custo = valor*lkm60+valor*lkm80+valor*lkm100+valor*lkm120+valor*lkm140;

    //saida
    System.out.println("Placa do veículo: " + placa);
    System.out.printf("Consumo total:  %.4f litros %n", total);
    System.out.printf("Valor total: R$    %.2f %n", custo);
    System.out.println("Velocidade média ponderada:  " + media + "Km");

    teclado.close();
  }
}