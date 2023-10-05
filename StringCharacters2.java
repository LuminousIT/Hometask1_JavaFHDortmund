import java.util.ArrayList;

public class StringCharacters2 {
        public static void main(String args[]) {
                String text = "To be or not to be, that is the question;"
                                + "Whether `tis nobler in the mind to suffer"
                                + " the slings and arrows of outrageous fortune,"
                                + " or to take arms against a sea of troubles,"
                                + " and by opposing end them?";

                String[] wordsArray = text.split(" ");

                String temp = "";
                for (int i = 0; i < wordsArray.length; i++) {
                        for (int j = i + 1; j < wordsArray.length; j++) {
                                if (wordsArray[i].toLowerCase().compareTo(wordsArray[j].toLowerCase()) > 0) {
                                        temp = wordsArray[i];
                                        wordsArray[i] = wordsArray[j];
                                        wordsArray[j] = temp;
                                }
                        }
                }

                // Words are sorted in ascending order of the first letter. i.e a, b, c, d,
                // e,...
                for (int i = 0; i < wordsArray.length; i++) {
                        System.out.println(wordsArray[i]);
                }
        }
}
