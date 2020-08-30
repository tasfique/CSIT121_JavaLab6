//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 17/06/2019
package labtask6;
import java.io.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class Q2 {
    public static void main(String[]args)throws IOException {
        int index = 0;
        Scanner read = new Scanner (new File("data.txt"));
        Invoice [] arrayObjectInvoice = new Invoice[14];
        
        while(read.hasNext()) {
            String[] textData = new String[5];
            
            for(int i = 0; i <5 && read.hasNext(); i++) {
                textData[i] = read.nextLine();
                
            }
            arrayObjectInvoice[index] = new Invoice (Integer.parseInt(textData[0]), textData[1], textData[2], Integer.parseInt(textData[3]), Double.parseDouble(textData[4]));
            index++;
        }
        //a
        System.out.println("Use lambdas and streams to sort the Invoice objects by description, then display the results");
        
        Function <Invoice, String> byDescription = Invoice::getDescription;
        Comparator<Invoice> descComparator = Comparator.comparing(byDescription);
        System.out.printf("%nDisplay %n");
        Arrays.stream(arrayObjectInvoice)
                .sorted(descComparator)
                .forEach(System.out::println);
                System.out.println("");
        //b
        System.out.println("Use lambdas and streams to sort the Invoice objects by price, then display the results.");
        
        Function <Invoice, Double> byPrice = Invoice::getPrice;
        Comparator<Invoice> priceComparator = Comparator.comparing(byPrice);
        System.out.printf("%nDisplay %n");
        Arrays.stream(arrayObjectInvoice)
                .sorted(priceComparator)
                .forEach(System.out::println);
                System.out.println("");
        //c
        System.out.println("Use lambdas and streams to display the Invoice objects group by type.");
        Map<String, List<Invoice>> groupedByType = Arrays.stream(arrayObjectInvoice).collect(Collectors.groupingBy(Invoice::getType));
        groupedByType.forEach(
                (type, objects) ->
                {
                    System.out.println(type);
                    objects.forEach(
                    typeOfData -> System.out.printf("  %s%n", typeOfData));
                }
        );
        //d
        System.out.println("Use lambdas and streams to map each Invoice to its description and the value of the invoice (quantity *\n" +
        "price). Order the results by Invoice value");
        
        Function<Invoice, Double> functionCalculator = (x ->(x.getQuantity()*x.getPrice()));
        Comparator<Invoice> sortedByCalculation = Comparator.comparing(functionCalculator);
        Arrays.stream(arrayObjectInvoice)
                .sorted(sortedByCalculation)
                .map(x -> String.format("%-18s RM%-10.2f", x.getDescription(), x.getQuantity() * x.getPrice()))
                .forEach(System.out::println);
        System.out.println();
        
        //e
        System.out.println("Re-write (d) to select the Invoice values in the range of RM200 to RM500");
        Predicate<Invoice>rangeValues = x ->((x.getQuantity()*x.getPrice()) >= 200 && (x.getQuantity() * x.getPrice()) <= 500);
        Arrays.stream(arrayObjectInvoice)
                .filter(rangeValues)
                .sorted(sortedByCalculation)
                .map(x -> String.format("%-18s  RM%-10.2f", x.getDescription(), x.getQuantity()*x.getPrice()))
                .forEach(System.out::println);
        
      
    }
    
    
}
