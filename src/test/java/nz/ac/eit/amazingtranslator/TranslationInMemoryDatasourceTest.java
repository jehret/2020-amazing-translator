package nz.ac.eit.amazingtranslator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TranslationInMemoryDatasourceTest {

    private TranslationInMemoryDatasource datasource;

    @Before
    public void setup() {
        datasource = new TranslationInMemoryDatasource();
        datasource.initializeDictionaries();
    }

    @Test
    public void getReverseTranslationOf_Deux_return2(){
        Assert.assertEquals(2,datasource.getReverseTranslationOf("Deux"));
    }

    @Test
    public void getReverseTranslationOf_Trois_return3(){
        Assert.assertEquals(3,datasource.getReverseTranslationOf("Trois"));
    }

    @Test
    public void getReverseTranslationOf_trois_return3(){
        Assert.assertEquals(3,datasource.getReverseTranslationOf("trois"));
    }
}
