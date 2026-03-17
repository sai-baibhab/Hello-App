public class HelloApp {

    public static void main(String[] args) {

        String name = "World";

        if (args.length > 0) {

            StringBuilder sb = new StringBuilder();

            for (String n : args) {
                sb.append(n).append(", ");   // always add comma
            }

            // remove last ", "
            if (sb.length() > 0) {
                name = sb.substring(0, sb.length() - 2);
            }
        }

        System.out.println("Hello, " + name + "!");
    }
}