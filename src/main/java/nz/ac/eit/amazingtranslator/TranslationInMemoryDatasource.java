package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TranslationInMemoryDatasource implements ITranslationDatasource {

    private List<String> germanTranslations=new ArrayList<>();
    private List<String> frenchTranslations=new ArrayList<>();

    public int initializeDictionaries(){

        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        //...

        frenchTranslations.add("Un");
        frenchTranslations.add("Deux");
        frenchTranslations.add("Trois");
        frenchTranslations.add("Quatre");
        frenchTranslations.add("Cinq");
        frenchTranslations.add("Six");
        frenchTranslations.add("Sept");
        frenchTranslations.add("Huit");
        frenchTranslations.add("Neuf");
        frenchTranslations.add("Dix");
        frenchTranslations.add("Onze");
        frenchTranslations.add("Douze");
        //...

        return frenchTranslations.size();
    }

    public int getReverseTranslationOf(String word){

        List<String> lowerCaseGerman=germanTranslations.stream().map(nextWord -> nextWord.toLowerCase()).collect(Collectors.toList());
        List<String> lowerCaseFrench=frenchTranslations.stream().map(nextWord -> nextWord.toLowerCase()).collect(Collectors.toList());

        int index=lowerCaseGerman.indexOf(word.toLowerCase());
        if (index==-1){
            index=lowerCaseFrench.indexOf(word.toLowerCase());
        }

        return index+1;
    }

    public String getTranslationOf(int number,int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException{

        if (number<1 || number>30){
            throw new NumberOutOfRangeException();
        }

        //...Check that the option is 1 or 2

        if (languageOption==1){
            return frenchTranslations.get(number-1);
        }
        else if (languageOption==2){
            return germanTranslations.get(number-1);
        }
        else {
            throw new LanguageNotSupportedException();
        }

    }

}
