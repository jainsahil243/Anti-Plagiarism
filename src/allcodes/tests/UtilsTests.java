package allcodes.tests;

import allcodes.codesearch.Languages;
import allcodes.codesearch.Locations;
import allcodes.codesearch.Utils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the Utils class.
 */
public class UtilsTests {
    /**
     * Tests the languageId for Java.
     */
    @Test
    public void javaLanguageId() {
        assertEquals(Utils.languageEnumToId(Languages.JAVA), 23);
    }

    /**
     * Tests the locationId for GitHub.
     */
    @Test
    public void gitHubLocationId() {
        assertEquals(Utils.locationEnumToId(Locations.GITHUB), 2);
    }
}
