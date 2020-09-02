package nz.ac.eit.amazingtranslator;

public class TranslationDictionaries {

    private ITranslationDatasource datasource;

    public int initializeDictionaries(){
        return datasource.initializeDictionaries();
    }

    public String getTranslationOf(int number,int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException{
       //100 other lines
        return datasource.getTranslationOf(number,languageOption);
    }

    public void setDatasource(ITranslationDatasource datasource) {
        this.datasource = datasource;
    }
}
