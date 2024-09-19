import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Main {

    public static void main(String[] args)
    { 

      Scanner sc = new Scanner(System.in);
        String data1,data2,data3;
          
          System.out.println("Digite a primeira data: ");
            data1 = sc.nextLine();
              System.out.println("Digite a segunda data: "); 
                data2 = sc.nextLine();
                  System.out.println("Digite a terceira data: ");
                    data3 = sc.nextLine();
                      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                      

                      try{
                        LocalDate date1 = LocalDate.parse(data1,formatter);
                          LocalDate date2 = LocalDate.parse(data2,formatter);
                            LocalDate date3 = LocalDate.parse(data3,formatter);

                              System.out.println("Data 1: "+ date1.format(formatter));
                                System.out.println("Data 2: "+ date2.format(formatter));
                                  System.out.println("Data 3: "+ date3.format(formatter));
                                    if (date3.isAfter(date1) && date3.isBefore(date2)) {
                                      System.out.println("A data 3 está entre as datas 1 e 2.");
                                    }else if(date3.isBefore(date1) && date3.isAfter(date2)){
                                      System.out.println("A data 3 está entre as datas 1 e 2.");
                                    }else{
                                      System.out.println("A data 3 não está entre as datas 1 e 2.");
                                    }
                      } 
                      catch(DateTimeParseException e){
                        System.out.println("Formato de data Inválido");
                      }
                  sc.close();  
  }
}
