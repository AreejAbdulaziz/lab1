import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        ///////////1///////////
        /*System.out.println("Enter two numbers");
        int  number1=s.nextInt();
        int  number2=s.nextInt();
        int sum=number1+number2;
        int multiply=number1*number2;
        int subtract=number1-number2;
        int reminder=number1%number2;
        int divide =number1/number2;
        System.out.println( "sum of " + number1 + " and "+ number2 + "="+ sum);
        System.out.println( "multiply  of " + number1 + " and "+ number2 + "="+ multiply);
        System.out.println( "subtract  of " + number1 + " and "+ number2 + "="+ subtract);
        System.out.println( "reminder  of " + number1 + " and "+ number2 + "="+ reminder);
        System.out.println( "divide  of " + number1 + " and "+ number2 + "="+ divide); */

        //////////////2/////////////
        /* System.out.println("Enter number");
        int number= s.nextInt();
        for (int i = 1; i <= 10; i++) {
            {
                System.out.println(number + "*" + i + "="+ number * i);
        } */

        //////////////3////////////

       /* System.out.println("Enter the radius");
        double radius=s.nextDouble();
        double o=3.14;
        double perimeter=o*radius*2;
        double area = o*Math.pow(radius, 2);
        System.out.println(" the perimeter : " + perimeter + "," + "area : "+ area);
        */

        /////////////4/////////////
/* int a,b,c,sum;
double Average;
        System.out.println("Enter number");
        a=s.nextInt();
        System.out.println("Enter number");
        b=s.nextInt();
        System.out.println("Enter number");
        c=s.nextInt();
        sum=a+b+c;
        Average=sum/3;
        System.out.println("Average of the numbers is : " + Average); */
        /////////////5////////////
        /* System.out.println("Enter first integer");
        int num1=s.nextInt();
        System.out.println("Enter second integer");
        int num2=s.nextInt();
        System.out.println("Enter third integer");
        int num3=s.nextInt();
        int result = num1 + num2 ;
        if(num3==result) {
            System.out.println("true");
        } else System.out.println("false"); */

        /////////////6////////////
      /*  System.out.println("Enter your text: ");
        String text=s.nextLine();
        StringBuilder sb =new StringBuilder(text);
        System.out.println(sb.reverse());  */

       /* ////////////7//////////////
        System.out.println("Enter your number: ");
        int number=s.nextInt();
        if(number%2==0) {
            System.out.println("The number is Even ");
        } else System.out.println("The number is Odd "); */

        /////////////////8////////////
       /* System.out.println("Enter temperature in Centigrade ");
        int c =s.nextInt();
        double f=(c*1.8)+32;
        System.out.println("temperature in Fahrenheit is : " + f ); */

        /////////////////9////////////
       /*  System.out.println("Enter string ");
        String string =s.next();
        System.out.println("Enter number ");
        int index=s.nextInt();
        System.out.println(string.charAt(index) ); */

        ////////////////10/////////////
       /* System.out.println("Enter Widht ");
        double Wight =s.nextDouble();
        System.out.println("Enter Height ");
        double Height =s.nextDouble();
        System.out.println("Area is " + Wight *Height);
        System.out.println("Perimeter is " + (Wight + Height)*2); */

        ///////////////11//////////////
       /* System.out.println("Enter two integers ");
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        if (number1 != number2) {
            System.out.println(number1 + " !=" + number2);
        } else if (number1 <= number2)

        {
            System.out.println(number1 +"<="+ number2);
        } else if(number1<number2) {
            System.out.println(number1+"<"+number2);
    } */

        /////////////12/////////
        /* System.out.println("Enter seconds ");
        int second = s.nextInt();
        int t1=second%60;
        int t2=second/60;
        int t3=t2%60;
        t2=t2/60;
        System.out.println(t2 +" : "+ t3 + " : " + t1); */

        ////////////13///////////
        /* System.out.println("Enter first number ");
        int num1 = s.nextInt();
        System.out.println("Enter second number ");
        int num2 = s.nextInt();
        System.out.println("Enter third number ");
        int num3 = s.nextInt();
        System.out.println("Enter fourth number ");
        int num4 = s.nextInt();
        if(num1==num2&&num2==num3&&num3==num4) {
            System.out.println("numbers are equal ");
        } else System.out.println("numbers are not equal! "); */

        ///////////////////14/////////////
        /* System.out.println("Enter number ");
        int num1 = s.nextInt();
        if(num1>1) {
            System.out.println("Positive number ");
        }
        else if(num1<1) {
            System.out.println("Negative number ");
        }
        else System.out.println("Zero"); */

        /////////////////16////////////////
       /* System.out.println("Enter number ");
        int num1 = s.nextInt();
        int reversed=0;
        System.out.println("original number " + num1);
        while(num1!=0) {
            int t = num1%10;
            reversed=reversed*10+t;
            num1 /=10;
        }
        System.out.println("reversed number : " + reversed); */

        ////////////////17////////////////



    }}