public class UnboxingOfString {
    public static void main(String[] args) {
        System.out.printf("input: %s\n", args[0]);
        System.out.printf("result: %s", unboxing(args[0]));
    }

    static String unboxing(String input) {

        char[] inputString = input.toCharArray();
        StringBuffer sb = new StringBuffer("");
        StringBuffer output = new StringBuffer("");
        int digit = 1;

        for (int i = 0; i < inputString.length; i++) {

            if (Character.isDigit(inputString[i])) {
                digit = Integer.parseInt(String.valueOf(inputString[i]));
            }

            else if (inputString[i] == '[') {
                int x = i + 1;
                while (x < inputString.length) {
                    if (inputString[x] == ']') break;
                    sb.append(inputString[x]);
                    ++x;
                }
                for (int j = 0; j < digit - 1 ; j++) {
                    output.append(sb);
                }

            } else if (Character.isLetter(inputString[i])) {
                output.append(inputString[i]);
            }
            sb = new StringBuffer("");

        }
        return output.toString();
    }
}