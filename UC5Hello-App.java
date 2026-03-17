public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {

            StringBuilder sb = new StringBuilder();
            boolean first = true;

            for (String n : args) {

                if (!first) {
                    sb.append(", ");
                }

                sb.append(n);
                first = false;
            }

            name = sb.toString();
        }

        System.out.println("Hello, " + name + "!");
    }
}