package nz.ac.eit.amazingtranslator;

import java.util.ArrayList;
import java.util.List;

public class TranslationDictionaries {

    private IDictionaries dictionaries;

    public boolean initializeDictionaries(){

        dictionaries.initializeDatasource();
        //...
        return dictionaries.isInitialized();
    }

    public String getTranslationOf(int number,int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException{


        return dictionaries.getFromDatasource(number,languageOption);




    }

    public void setDictionaries(IDictionaries dictionaries) {
        this.dictionaries = dictionaries;
    }
}
