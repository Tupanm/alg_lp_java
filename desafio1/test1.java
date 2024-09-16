import java.util.Scanner;

public class Main
{

public static void main(String[] args) {
Double n1,n2,f;

Scanner sc = new Scanner(System.in); // Corrected line

System.out.println("Digite sua primeira nota: ");
n1 = sc.nextDouble();
System.out.printf("Falta %.2f para passar direto \n", 14.0 - n1);
System.out.println("Digite sua segunda nota: ");
n2 = sc.nextDouble();

            Double m = (n1 + n2)/2;
         if (m >= 7.0){
             System.out.printf("Você foi aprovado! Sua média é: %.2f%n",m);
         }     else if (m > 4.0 && m < 7.0) {
                   System.out.printf("Você vai pra final! Sua média é: %.2f%n ",m);
                       System.out.println("Digite a nota da final: ");
                           f = sc.nextDouble();

            Double mf = (m + f)/2;
                               if(mf >= 5.0){
                                   System.out.printf("Você foi aprovado na final! Sua média final é: %.2f%n",mf);
                                       }else{ System.out.printf("Você foi reprovado na final! Sua média foi: %.2f%n",mf);
                                       }
           } else{
               System.out.println("Você foi reprovado! Sua média foi: "+ m);
           } sc.close();
}
}
