package ex46;


import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;


import static org.junit.jupiter.api.Assertions.*;

class WordFrequencyFinderTest {


    @Test
    void main() throws IOException {
        Map<String, Integer> hm = new TreeMap<String, Integer>();
        var firstVal = hm.keySet().iterator().next();
        var snakeCt = hm.get("snake");
        var badgerCt = hm.get("badger");
        var mushroomCt = hm.get("mushroom");

        assertEquals(3, hm.size());
        assertEquals("snake", firstVal);
        assertEquals(1, snakeCt);
        assertEquals(7, badgerCt);
        assertEquals(2, mushroomCt);
    }
}