public class HelloApp {

    public static void main(String[] args) {

        String name = "World";  

        if (args.length > 0) {
            name = args[0];      // take input if provided
        }

        System.out.println("Hello, " + name + "!");
    }
}