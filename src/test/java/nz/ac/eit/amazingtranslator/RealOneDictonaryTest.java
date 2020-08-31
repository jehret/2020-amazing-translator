package nz.ac.eit.amazingtranslator;

import org.junit.Assert;
import org.junit.Test;

public class RealOneDictonaryTest {

    @Test
    public void initializeDatasource_shoudReturnInitializedDictionary() {
        RealOneDictionary dictionary=new RealOneDictionary();
        dictionary.initializeDatasource();
        Assert.assertTrue("The dictionary is not initialized",dictionary.isInitialized());
    }

    @Test
    public void getFromDatasource_12InFrench_returnDouze() {
        RealOneDictionary dictionary=new RealOneDictionary();
        dictionary.initializeDatasource();
        try {
            Assert.assertEquals("12 in french should have returned Douze","Douze",dictionary.getFromDatasource(12,1));
        } catch (LanguageNotSupportedException e) {
            //Assert.fail();
            e.printStackTrace();
        } catch (NumberOutOfRangeException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e){
            Assert.fail("12 does not have any translation available");
        }
    }

}
