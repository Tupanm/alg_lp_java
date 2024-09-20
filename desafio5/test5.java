import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int i;
            Double[] n= new Double[3];


        Scanner sc = new Scanner(System.in);


                System.out.println("Digite o primeiro número: ");
                    i = sc.nextInt();
                        System.out.println("Digite o segundo número: ");
                            n[0] = sc.nextDouble();
                                System.out.println("Digite o terceiro número: ");
                                    n[1] = sc.nextDouble();
                                        System.out.println("Digite o quarto número: ");
                                            n[2] = sc.nextDouble();


                if(i > 0){
                    if(i % 3 == 0){
                        Arrays.sort(n);
                            for(double num:n)
                                System.out.printf("%f%n",num);
                    } else if (i % 3 == 1) {
                        Arrays.sort(n, Collections.reverseOrder());
                            System.out.println(Arrays.toString(n));
                    } else{
                        Arrays.sort(n);
                            System.out.printf("%f%n%f%n%f%n",n[0],n[2],n[1]);
                    }
                }else{
                    System.out.println("Erro: O primeiro número deve ser positivo.");
                }

    }
}
