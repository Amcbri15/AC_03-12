package nyc.c4q.Amcbri15;

/**
 * Created by c4q-anthony-mcbride on 3/12/15.
 */
public class Methods {

   /* public static void speak() {
        System.out.println("Hello!");
    }

    public static void shoutOut(String name, int age){
        System.out.println("Hey " + name + "!" + " You are " + age + "-years-old!");
    }


    public static String getGreeting() {
        return "Ohayo";
    }
    */

    public static int sum() {
        int result = 0;
        for (int i = 0; i < 10; i++) {
            result++;
            System.out.println(result);
        }
        return result;
    }

    public static void main(String[] args) {
        //speak();
       //speak();

        //String n = "Anthony";
        //shoutOut(n, 28);
        //shoutOut("McBride", 28);

        //String greeting = getGreeting();
        //System.out.println(greeting);
        //System.out.println(getGreeting());

        System.out.println(sum());
    }

}
