public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {

            // Join all names with comma
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < args.length; i++) {
                sb.append(args[i]);

                if (i != args.length - 1) {
                    sb.append(", ");
                }
            }

            name = sb.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}