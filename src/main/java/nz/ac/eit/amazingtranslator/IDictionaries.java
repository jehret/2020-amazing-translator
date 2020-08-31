package nz.ac.eit.amazingtranslator;

public interface IDictionaries {

    void initializeDatasource();
    String getFromDatasource(int number,int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException;
    boolean isInitialized();
}
