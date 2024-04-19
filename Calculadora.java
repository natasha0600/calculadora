package github;

import java.util.Scanner;

public class Calculadora {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Calculadora: ");
            System.out.println("Digite o primeiro numero");
            int n1 = sc.nextInt();
            System.out.println("Digite o segundo numero");
            int n2 = sc.nextInt();

            System.out.println("Escolha\n 1-Somar\n 2-Subtrair\n 3-Multiplicar\n 4-Dividir");
            int escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    int soma= n1+n2;
                    System.out.println("Soma: "+soma);
                    break;
                case 2:
                    int sub = n1-n2;
                    System.out.println("Subtração: "+sub);
                    break;
                case 3:
                    int mul = n1*n2;
                    System.out.println("Multiplicação: "+mul);
                    break;
                case 4:
                    int div = n1/n2;
                    System.out.println("Divisão: "+div);
                    break;
            }
        }
    }


