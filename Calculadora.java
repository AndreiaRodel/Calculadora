import java.util.Scanner;

public class Calculadora {
    public static void main(String [] args) {
        System.out.println("CALCULADORA SIMPLES");

        int opcao;
        do {
            System.out.println("1- Somar");
            System.out.println("2- Subtrair");
            System.out.println("3- Multiplicar");
            System.out.println("4- Dividir");
            System.out.print("Escolha a opção desejada: (0 para sair) ");
        
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            processar(opcao);
        } while (opcao != 0);
    }
    public static void processar(int opcao) {
        Scanner scanner = new Scanner(System.in);

        switch(opcao) {
            case 1: {
                System.out.println("SOMANDO DOIS NÚMEROS");
            
            

                System.out.print("Digite o primeiro número:  ");
                int numero1 = scanner.nextInt();

                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int soma = numero1 + numero2;

                System.out.println("A soma dos dois números é:  " + soma);
                break;
            }
            case 2: {
            System.out.println("SUBTRAINDO DOIS NÚMEROS");
        
            System.out.print("Digite o primeiro número:  ");
            int numero1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextInt();
            int resultado = numero1 - numero2;

            System.out.println("A subtração dos dois números é:  " + resultado);
            break;
        }
            case 3: {
                System.out.println("MULTIPLICAR DOIS NÚMEROS");
            
                System.out.print("Digite o primeiro número:  ");
                int numero1 = scanner.nextInt();
    
                System.out.print("Digite o segundo número: ");
                int numero2 = scanner.nextInt();
                int vezes = numero1 * numero2;
    
                System.out.println("A multiplicação dos dois números é:  " + vezes);
                break;
            }

            case 4: {
                System.out.println("DIVIDIR DOIS NÚMEROS");
            
                System.out.print("Digite o primeiro número:  ");
                double numero1 = scanner.nextInt();
    
                System.out.print("Digite o segundo número: ");
                double numero2 = scanner.nextInt();
                
                if (numero2 == 0) {
                    System.out.println("Equação impossível");
                } else {
                double divisao = numero1 / numero2;
                System.out.println("A divisão dos dois números é:  " + divisao);
                }
                break;
            }
        }
    }
}
