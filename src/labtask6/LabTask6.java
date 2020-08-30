//Student's Full Name- Tasfique Enam
//Student's ID- J16020825/5886429
//Modification Date 17/06/2019
package labtask6;
import java.util.stream.DoubleStream;


public class LabTask6 {
    
    public static void main(String[] args) {
        double [] priceArray = {110.2,220.33,32.43,412.23,456.66,346.44,380.54,800.76,469.33,123.22,211.34,312.34,413.55,214.55,15.22,16.35,17.44,18.59,19.90,20.21};
        //a
        System.out.print("Price values. ");
        DoubleStream.of(priceArray)
                .sorted()
                .forEach(value -> System.out.printf("%.2f ", value));   
        System.out.println();
        
        //b
        System.out.printf("%nSum: %.2f%n", DoubleStream.of(priceArray).sum());
        
        //c
        System.out.printf("Expensive: %.2f%n", DoubleStream.of(priceArray).max().getAsDouble());
        System.out.printf("Cheapest: %.2f%n", DoubleStream.of(priceArray).min().getAsDouble());
        System.out.printf("Cheapest: %.2f%n", DoubleStream.of(priceArray).average().getAsDouble());
        
        //d
        System.out.printf("Display of values over 100 ");
        DoubleStream.of(priceArray)
                .filter(value -> value > 100)
                .sorted()
                .forEach(value -> System.out.printf("%.2f ", value));
        System.out.println("Count of values over 100 " + 
        DoubleStream.of(priceArray)
                .filter(value -> value > 100).count());
        
        //e
        System.out.println("Increase all prices to 10% of its original price ");
        DoubleStream.of(priceArray)
                .map(value -> value * 1.1)
                .sorted()
                .forEach(value -> System.out.printf("%.2f ", value));
        //f
        System.out.print("Display all prices that are in the range of RM100 and RM500 inclusive");
        DoubleStream.of(priceArray)
                .filter(value -> value >= 100 && value <=500)
                .forEach(value -> System.out.print(value + " "));
        
        
        
        //System.out.print("Count of values over 100 ");
        //DoubleStream.of(priceArr).filter(value -> value > 100).count();
        //System.out.println();
        //DoubleStream.of(priceArr).filter(value -> value > 100).count();
        //Arrays.stream(priceArr).sorted().forEach(c -> System.out.printf("%d", priceArr));
    }
    
}
