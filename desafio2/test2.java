import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args)
    { 
      int[] n =new int[3];

      Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Primeiro número: ");
          n[0] = sc.nextInt();
            System.out.println("digite seu Segundo número: ");
              n[1] = sc.nextInt();
                System.out.println("Digite seu Terceiro número: ");
                 n[2] = sc.nextInt();
                  Arrays.sort(n);
                    System.out.println("A ordem crescente é: ");
                      for(int num:n )
                        System.out.printf("%d%n",num);


                  sc.close();  
  }
}
