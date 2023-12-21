import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        int opcao = 0;
        String nome;
        int plana_espa;

    Scanner leia = new Scanner(System.in);

        System.out.print("olá, bem vindo a calculadora, por favor digite o seu nome: ");
        nome = leia.next();


        while (true) {
            System.out.println(nome + " " + "selecione qual das figuras você deseja calcular\n 1 - Plana\n 2 - Espaciais");

            plana_espa = leia.nextInt();

           if(plana_espa == 1){
                try {
                    System.out.println(nome + " " + "selecione que forma geometrica deseja calcular\n 1 - quadrado\n 2 - retangulo\n 3 - circulo" +
                            "\n 4 - triangulo \n 5 - hexagono \n 0 - caso queira sair");
                    opcao = leia.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("por favor insira somente numeros");
                    leia.next();
                    continue;
                }

           }
           else if (plana_espa == 2){
               try {
                   System.out.println(nome + " " + "selecione as figuras que voce deseja calcular\n 6 - cubo\n 7 - paralelepipido\n 8 - cilindro\n 9 - cone" +
                           "\n 10 - piramide\n 11 - esfera \n 0 - caso queira sair");
                   opcao = leia.nextInt();
               }catch (InputMismatchException e){
                   System.out.println("por favor insira somente os numeros");
                   leia.next();
                   continue;
               }

           }

            if (opcao == 0){
               System.out.println("okay" + " "+ nome + " " + "até a proxima");
               break;
           }
            try {
                switch (opcao) {
                    case 1 -> {
                        Calcular_quadrado quadrado = new Calcular_quadrado(5);
                        System.out.println(quadrado.calcularArea());
                        System.out.println(quadrado.calcularPerimetro());
                        System.out.println(quadrado.retornaResumoDaForma(3));
                    }
                    case 2 -> {
                        Calcular_retangulo retangulo = new Calcular_retangulo(4, 2);
                        System.out.println(retangulo.calcularArea());
                        System.out.println(retangulo.calcularPerimetro());
                        System.out.println(retangulo.retornaResumoDaForma(5));
                    }
                    case 3 -> {
                        Calcular_circulo circulo = new Calcular_circulo(2);
                        System.out.println(circulo.calcularArea());
                        System.out.println(circulo.calcularPerimetro());
                        System.out.println(circulo.retornaResumoDaForma(9));
                    }
                    case 4 -> {
                        Calcular_triangulo triangulo = new Calcular_triangulo(4);
                        System.out.println(triangulo.calcularArea());
                        System.out.println(triangulo.calcularPerimetro());
                        System.out.println(triangulo.retornaResumoDaForma(2));
                    }
                    case 5 -> {
                        Calcular_hexagono hexagono = new Calcular_hexagono(8);
                        System.out.println(hexagono.calcularArea());
                        System.out.println(hexagono.calcularPerimetro());
                        System.out.println(hexagono.retornaResumoDaForma(2));
                    }
            }
            }catch (InputMismatchException e){
                System.out.println("por favor insira uma das opções do menu");
                leia.next();
                continue;
            }
            switch (opcao) {
                case 6 -> {
                    Calcular_cubo cubo = new Calcular_cubo(2);
                    System.out.println(cubo.calcularVolume());
                    System.out.println(cubo.calcularAreaSuperficial());
                    System.out.println(cubo.retornaResumoDaForma(3));
                }
                case 7 -> {
                    Calcular_paralelepipido paralelepipido = new Calcular_paralelepipido(4, 2,8);
                    System.out.println(paralelepipido.calcularVolume());
                    System.out.println(paralelepipido.calcularAreaSuperficial());
                    System.out.println(paralelepipido.retornaResumoDaForma(5));
                }
                case 8 -> {
                    Calcular_cilindro cilindro = new Calcular_cilindro(2,2);
                    System.out.println(cilindro.calcularVolume());
                    System.out.println(cilindro.calcularAreaSuperficial());
                    System.out.println(cilindro.retornaResumoDaForma(9));
                }
                case 9 -> {
                    Calcular_cone cone = new Calcular_cone(4,6);
                    System.out.println(cone.calcularVolume());
                    System.out.println(cone.calcularAreaSuperficial());
                    System.out.println(cone.retornaResumoDaForma(2));
                }
                case 10 -> {
                    Calcular_piramide piramide= new Calcular_piramide(8,4,2,5);
                    System.out.println(piramide.calcularVolume());
                    System.out.println(piramide.calcularAreaSuperficial());
                    System.out.println(piramide.retornaResumoDaForma(2));
                }
                case 11 ->{
                    Calcular_esfera esfera = new Calcular_esfera(7);
                    System.out.println(esfera.calcularVolume());
                    System.out.println(esfera.calcularAreaSuperficial());
                    System.out.println(esfera.retornaResumoDaForma(8));
                }

            }




        }
    }



}
