package nz.ac.eit.amazingtranslator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TranslationDictionariesTest {

    private TranslationDictionaries dictionaries;

    @Before
    public void setup(){
        dictionaries=new TranslationDictionaries();
        dictionaries.setDictionaries(new StubDictionary());
        dictionaries.initializeDictionaries();
    }

    @Test
    public void getTranslationOf_12InFrench_returnDouze(){
        try {
            Assert.assertEquals("12 in french should have returned Douze","Douze",dictionaries.getTranslationOf(12,1));
        } catch (LanguageNotSupportedException e) {
            //Assert.fail();
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have any translation available");
        }
    }

    @Test
    public void getTranslationOf_12WithUnsupportedLanguage_throwsLanguageNotSupportedException(){

        try {
            Assert.assertEquals("12 in french should have returned Douze","Douze",dictionaries.getTranslationOf(12,4));
            Assert.fail("It should fail with an unsupported language");
        } catch (LanguageNotSupportedException e) {

        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have any translation available");
        }
    }

    @Test(expected = LanguageNotSupportedException.class)
    public void getTranslationOf_12WithUnsupportedLanguage_throwsLanguageNotSupportedException_moreAccurate() throws LanguageNotSupportedException{
        try {
            Assert.assertEquals("12 in french should have returned Douze","Douze",dictionaries.getTranslationOf(12,4));
            Assert.fail("It should fail with an unsupported language");
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have any translation available");
        }
    }

}
