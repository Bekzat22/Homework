import java.lang.String;
public class Main {
    public static void main(String[] args) {

        System.out.println(Ddd(22,22));
        System.out.println(Ddd(21,26));
        System.out.println(Ddd(27,22));
        System.out.println(Ddd(80,-25));
        System.out.println(Ddd(11,-44));

    }


     public static String Ddd(int age, int temperature) {

             String.valueOf(age);
             String.valueOf(temperature);
         if(age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30){
             System.out.println("Можно идти гулять");
         } else if(age < 20 && temperature >= 0 && temperature <= 28){
             System.out.println("Можно идти гулять");
         } else if(age > 45 && temperature >= -10 && temperature <= 25){
             System.out.println("Можно идти гулять");
         } else{
             System.out.println("Оставайтесь дома");
         }

         return "Age = " + age + " Temperature = " + temperature;

     }
}