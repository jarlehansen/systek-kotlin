package nullsafety;

public class Main {

    public static void main(String[] args) {
        String value = "abc";

        value = null;

        value.length();
    }
}
