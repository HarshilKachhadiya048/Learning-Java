import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! ");
        System.out.println("Hello " + "Amigos"); // Simply show in the terminal
        System.out.println();
        System.out.println(1000 + 5000);    // Same as cout in C++

        // Variables in the JAVA

        /* 
            Primitives :
            boolean, int, char, long, float, double, short, byte

        */

        int n1 = 20;
        int n2 = 30;
        int res = n1 + n2;
        System.out.println(res);  // 50
        double sigma = 2.74;
        boolean flag = true;
        char ch = 'A';

        int amount = 1_000_000_009;
        System.out.println(amount);

        // arithmetic opertors 
        
        /*
            Order for the Calculations : Brackets, Orders, Division, 
                                         Multiplication, Addition, Subtraction 
        */

        int num1 = 15;
        int num2 = 9;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // Increment & Decrement Operator

        int r = 0;
        System.out.println(r++);     // 0
        System.out.println(r--);     // 1
        System.out.println(++r);     // 1
        System.out.println(--r);     // 0

        // comparison operators  ( <, <= , > , >= , == , != )

        System.out.println(25 > 10);  // True
        System.out.println(25 <= 25); // True
        System.out.println(45 != 45); // False

        System.out.println();
        boolean isAdult = 20 >= 15;
        System.out.println(isAdult);  // True

        // Reassignment

        num1 *= num2;  // 15*9
        System.out.println(num1);

        num1 += num2;  // (15*9) + 9
        System.out.println(num1);

        // Strings in JAVA

        String Brand = "Amigos";
        String Value = "Code";
        String ChangeValue = Brand + Value;
        System.out.println(ChangeValue.toUpperCase()); // AMIGOSCODE
        System.out.println(ChangeValue.toLowerCase()); // amigoscode
        System.out.println(ChangeValue.substring(0,6)); // Amigos

        System.out.println("    ".isEmpty()); // False
        System.out.println("    ".isBlank()); // True
        System.out.println("  H  ".trim()); // H

        // Reference Types/Objects

        int prem = 10;   // Primitive Variable
        Point pointA = new Point(10,20);  // Point class (Object Variable)
        System.out.println("pointA = " + pointA);
        pointA.move(10, 25);
        System.out.println("pointA = " + pointA);

        // Arrays in JAVA

        int[] arr = new int[4]; // Can't change the size after initialization
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 8;

        System.out.println(); 
        System.out.println(Arrays.toString(arr));  // [5, 6, 7, 8]
        char[] ch1 = new char[5];
        ch1[0] = 'H';
        ch1[1] = 'e';
        ch1[2] = 'l';
        ch1[3] = 'l';
        ch1[4] = 'o';

        System.out.println(Arrays.toString(ch1));  // [H, e, l, l, o]
        System.out.println(ch1.length); // 5

        String[] names = {"Akash", "Tarang", "Raj"}; 
        System.out.println(Arrays.toString(names));  // [Akash, Tarang, Raj]

        // Arrays with null values

        int[] A = new int[4]; 
        A[0] = 5;
        A[1] = 6;

        System.out.println(Arrays.toString(A)); // [5 6 0 0] (Default value is zero)

        Arrays.fill(A, -1);  // Other default value
        A[0] = 5;
        A[1] = 6;
        System.out.println(Arrays.toString(A)); // [5, 6, -1, -1] 

        String[] nes = new String[3]; 
        nes[1] = "Raj";
        System.out.println(Arrays.toString(nes));  // [null, Raj, null]

        // Loops and Arrays

        String[] name_val = {
            "Akash", "Tarang", "Raj", "Kaushal", "Tushar"
        };

        for (int i=0; i < name_val.length; i++){
            System.out.println(name_val[i]);
        }

        // If statements 

        boolean isTrue = true;

        if(isTrue)
            System.out.println("This code runs when true");
        else
            System.out.println("This code runs when false");

        System.out.println("This code will always runs");

        // Packages in JAVA

        /*
            A Package is a folder that allows you to structure any given project 
        */

        // Methods : A method is a block of code which only run when its invokes 

        /*
            - Access Modifier
            - Optional static
            - Return type
            - Name
            - Optional Parameters
            - Method Body
            - Optional return value

            Public static void main(String[] args){
                // body
            }
        */

        int res1 = add(100, 100);  // invokes the add method
        int res2 = add(500, 1000);
        System.out.println(res1); 
        System.out.println(res2);


        // Use of Cat Class
        Cat cat = new Cat();
        cat.name = "Soy";
        cat.meow();  // Soy : meow...

    }

    // Add Method inside the Main class
    private static int add(int x, int y){
        int res = x + y;
        return res;
    }

    // Classes
    static class Cat{
        String name;    // Property
        void meow(){    // Behavior
            System.out.println(name + " : meow...");
        }
    }
    
}
