package nz.ac.eit.amazingtranslator;

public interface ITranslationDatasource {
    int initializeDictionaries();
    int getReverseTranslationOf(String word);
    String getTranslationOf(int number,int languageOption) throws LanguageNotSupportedException,NumberOutOfRangeException;
}
