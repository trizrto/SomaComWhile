import java.util.Scanner;
//codigo com a função de fazer o número ser repitido até ele dar 0
//usando o while como apoio, usando essa mesma função vou fazer um código parecido
//esse terá a mesma estrutura do mesmo, mas com a função de repetir uma senha
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int soma = 0;
    System.out.println("programa que some números inteiros até que entre o número 0");
    while (x != 0) {
      x = sc.nextInt();
      soma = soma + x;

     
    }
     
    if (x == 0){
      System.out.println("Aceito");
    }
    System.out.println(soma);
    sc.close();
  }

}