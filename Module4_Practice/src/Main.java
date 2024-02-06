public class Main
{
    public static void main(String[] args)
    {
        // question 1
        System.out.println("Hello world!");

        // question2
        int total = 0;
        for (int i = 0; i < 11; ++i) { total += i; }
        System.out.println(total);

        // question3
        total = 1;
        for (int i = 1; i < 11; ++i) { total *= i; }
        System.out.println(total);

        // question4
        float total2 = 1000.0f;
        for (int i = 0; i < 4; ++i) { total2 *= 0.5f; }
        System.out.println(total2);

        // question5
        System.out.println("*******");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println("*******");
    }
}