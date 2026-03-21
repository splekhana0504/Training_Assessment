package Module10;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence = "Java is easy";
        String[] words = sentence.split(" ");

        for (String word : words) {
            String rev = new StringBuilder(word).reverse().toString();
            System.out.print(rev + " ");
        }
    }
}