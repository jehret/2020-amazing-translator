package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class RealOneDictionary implements IDictionaries{

    private List<String> germanTranslations=new ArrayList<>();
    private List<String> frenchTranslations=new ArrayList<>();

    @Override
    public void initializeDatasource() {
        germanTranslations.add("Einz");
        germanTranslations.add("Zwei");
        germanTranslations.add("Drei");
        germanTranslations.add("4");
        germanTranslations.add("5");
        germanTranslations.add("6");
        germanTranslations.add("7");
        germanTranslations.add("8");
        germanTranslations.add("9");
        germanTranslations.add("10");
        germanTranslations.add("11");
        germanTranslations.add("12");
        germanTranslations.add("13");
        germanTranslations.add("14");
        germanTranslations.add("15");
        germanTranslations.add("16");
        germanTranslations.add("17");
        germanTranslations.add("18");
        germanTranslations.add("19");
        germanTranslations.add("20");
        germanTranslations.add("21");
        germanTranslations.add("22");
        germanTranslations.add("23");
        germanTranslations.add("24");
        germanTranslations.add("25");
        germanTranslations.add("26");
        germanTranslations.add("27");
        germanTranslations.add("28");
        germanTranslations.add("29");
        germanTranslations.add("30");

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
        frenchTranslations.add("Treize");
        frenchTranslations.add("Quatorze");
        frenchTranslations.add("Quinze");
        frenchTranslations.add("Seize");
        frenchTranslations.add("Dix-Sept");
        frenchTranslations.add("Dix-Huit");
        frenchTranslations.add("Dix-neuf");
        frenchTranslations.add("Vingt");
        frenchTranslations.add("21");
        frenchTranslations.add("22");
        frenchTranslations.add("23");
        frenchTranslations.add("24");
        frenchTranslations.add("25");
        frenchTranslations.add("26");
        frenchTranslations.add("27");
        frenchTranslations.add("28");
        frenchTranslations.add("29");
        frenchTranslations.add("30");
    }

    @Override
    public String getFromDatasource(int number, int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException{
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

    @Override
    public boolean isInitialized() {
        return frenchTranslations.size()==30 && germanTranslations.size()==30;
    }
}
