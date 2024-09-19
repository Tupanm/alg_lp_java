import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {
        
    
        Scanner sc = new Scanner(System.in);
            int n1,n2,n3;

                System.out.println("Digite o primeiro número: ");
                    n1 = sc.nextInt();
                        System.out.println("Digite o segundo número: ");
                            n2 = sc.nextInt();
                                System.out.println("Digite o terceiro número: ");
                                    n3 = sc.nextInt();
                
                if(n1 <= 0 || n2 <= 0 || n3 <=0 ){
                    System.out.println("Os números devem ser positivos!");
                }else{
                if(n1 == n2 && n1 == n3){
                    System.out.println("O Triângulo é Equilátero.");
                }else if(n1 == n2 || n1 == n3 || n2 == n3){
                    System.out.println("O Triângulo é Isósceles.");
                }else{
                    System.out.println("O Triângulo é Escaleno");
                } 
            }
                    sc.close();
    } 
}
