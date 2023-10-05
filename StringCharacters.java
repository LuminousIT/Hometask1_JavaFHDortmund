public class StringCharacters {
        public static void main(String[] args) {
                String text = "To be or not to be, that is the question;"
                                + "Whether `tis nobler in the mind to suffer"
                                + " the slings and arrows of outrageous fortune,"
                                + " or to take arms against a sea of troubles,"
                                + " and by opposing end them?";
                int spaces = 0,
                                vowels = 0,
                                letters = 0, consonants = 0;
                // YOUR CODE HERE
                for (int i = 0; i < text.length(); i++) {
                        char c = text.charAt(i);
                        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                                vowels++;
                        } else if (c == ' ') {
                                spaces++;
                        } else if (c == ',' || c == ';' || c == '`' || c == '?' || c == '.') {
                                letters++;
                        }
                }
                System.out.println("The text contained vowels: " + vowels + "\n" + "consonants: "
                                + (vowels - spaces - letters) + "\n" + "spaces: " + spaces);
        }
}
