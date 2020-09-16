package nz.ac.eit.amazingtranslator;

public class TranslationStubDatasource implements ITranslationDatasource{
    @Override
    public int initializeDictionaries() {
        return 0;
    }

    public int getReverseTranslationOf(String word){
        return 0;
    }

    @Override
    public String getTranslationOf(int number, int languageOption) throws LanguageNotSupportedException, NumberOutOfRangeException {

        if (languageOption==1){
            switch (number){
                case 1:
                    return "Un";
                case 2:
                    return "Deux";
                case 3:
                    return "Trois";
                case 4:
                    return "Quatre";
                case 5:
                    return "Cing";
                case 6:
                    return "Six";
                    //...
                case 12:
                    return "Douze";
                default:
                    throw new NumberOutOfRangeException();
             }
        }
        else if (languageOption==2){
            switch (number){
                case 1:
                    return "Einz";
                case 2:
                    return "Zwei";
                //...
                default:
                    throw new NumberOutOfRangeException();
            }
        }
        else throw new LanguageNotSupportedException();
    }
}
