package nz.ac.eit.amazingtranslator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TranslationDictionariesTest {

    private TranslationDictionaries translationDictionaries;

    @Before
    public void setup(){
        translationDictionaries=new TranslationDictionaries();

        //Stub
        //translationDictionaries.setDatasource(new TranslationStubDatasource());
        //Mock
        ITranslationDatasource mock=Mockito.mock(ITranslationDatasource.class);
        try {
            Mockito.when(mock.getTranslationOf(1,1)).thenReturn("Un");
            Mockito.when(mock.getTranslationOf(2,1)).thenReturn("Deux");
            Mockito.when(mock.getTranslationOf(12,1)).thenReturn("Douze");
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        }
        translationDictionaries.setDatasource(mock);
        //
        translationDictionaries.initializeDictionaries();
    }

    @Test
    public void getTranslationOf_12InFrench_returnDouze(){

        try {
            String result=translationDictionaries.getTranslationOf(12,1);
            Assert.assertEquals("The translation of 12 in French should be Douze","Douze",result);
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void getTranslationOf_13InFrench_returnTreize(){
        try {
            String result=translationDictionaries.getTranslationOf(13,1);
            Assert.assertEquals("The translation of 13 in French should be Treize","Treize",result);
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (Throwable th) {
            Assert.fail("The code is on error");
        }
    }

    @Test
    public void getTranslationOf_1InFrench_returnUn(){
        try {
            String result=translationDictionaries.getTranslationOf(1,1);
            Assert.assertEquals("The translation of 1 in French should be Un","Un",result);
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        }
    }

    @Test(expected=NumberOutOfRangeException.class)
    public void getTranslationOf_31InFrench_throwNumberOutOfRangeException() throws NumberOutOfRangeException {
        try {
            String result=translationDictionaries.getTranslationOf(31,1);
        } catch (LanguageNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
