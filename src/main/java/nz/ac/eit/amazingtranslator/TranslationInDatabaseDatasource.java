package nz.ac.eit.amazingtranslator;

public class TranslationInDatabaseDatasource implements ITranslationDatasource{
    @Override
    public int initializeDictionaries() {
        //Do something
        return 0;
    }

    @Override
    public int getReverseTranslationOf(String word) {
        return 0;
    }

    @Override
    public String getTranslationOf(int number, int languageOption) throws LanguageNotSupportedException, NumberOutOfRangeException {
        //Connect database
        return null;
    }
}
