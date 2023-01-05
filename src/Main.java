import java.lang.String;
public class Main {
    public static void main(String[] args) {

         System.out.println(Ddd(26,20));
        System.out.println(Ddd(31,-20));
        System.out.println(Ddd(25,44));
        System.out.println(Ddd(10,8));
        System.out.println(Ddd(25,77));

    }


     public static String Ddd(int age, int temperature) {


         if(age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
             System.out.println("Можно идти гулять");
         } else if(age < 20 && temperature >= 0 && temperature <= 28){
             System.out.println("Можно идти гулять");
         } else if(age > 45 && temperature >= -10 && temperature <= 25){
             System.out.println("Можно идти гулять");
         } else{
             System.out.println("Оставайтесь дома");
         }

         return "Age = " + age   + " "+"Temperature =" + temperature;

     }
}
