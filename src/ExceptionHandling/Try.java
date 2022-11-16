package ExceptionHandling;

public class Try {
    public static void main(String[] args) {
        try {
            int data = 1234 / 0;
        } catch(ArithmeticException e){System.out.println(e);}


        System.out.println("Print hello");

        }
    }

