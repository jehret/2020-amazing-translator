package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        TranslationDictionaries dictionaries = new TranslationDictionaries();
        dictionaries.setDatasource(new TranslationInMemoryDatasource());
        dictionaries.initializeDictionaries();

        System.out.println("What is the number to translate (as a numeric or a word)?");
        Scanner scanner=new Scanner(System.in);
        String numberAsString=scanner.nextLine();

        Integer number=null;

        boolean numberToWord=true;
        try {
            number = Integer.parseInt(numberAsString);
            System.out.println(number);
        }
        catch (NumberFormatException nfe) {
            numberToWord=false;
        }

        Integer option = null;
        if (numberToWord) {
            System.out.println("What is language (1-French, 2-German)?");
            String optionAsString = scanner.nextLine();


            try {
                option = Integer.parseInt(optionAsString);
                System.out.println(option);
            } catch (NumberFormatException nfe) {
                System.out.println("The option had to be numeric");
                System.exit(0);
            }
        }

        try {
            if (numberToWord) {
                System.out.println(dictionaries.getTranslationOf(number, option));
            }
            else {
                System.out.println(dictionaries.getReverseTranslationOf(numberAsString));
            }

        } catch (LanguageNotSupportedException e) {
            System.out.println("Only french and german supported");
        } catch (NumberOutOfRangeException e) {
            System.out.println("Number should be between 1 and 30 included");
        }


    }
}
