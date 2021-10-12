package ex41;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.*;

public class NameSorterTest {

    private ArrayList<String[]> nameList = new ArrayList<>();
    private NameSorterTest writeNamesToFile = new NameSorterTest();
    private final NameSorter getNameList = new NameSorter();

    @Test
    public void testReadNames() {


    }


    @Test
    public boolean testOutputNames(ArrayList<String[]> nameList, String pathname) {
        this.nameList.add(new String[]{"banjo li"});
        this.nameList.add(new String[]{"banjo bi"});
        this.nameList.add(new String[]{"banjo ki"});
        this.nameList.add(new String[]{"banjo ti"});
        pathname = "src/test/java/ex41/exercise41_output.txt";
        assertTrue(writeNamesToFile.testOutputNames(this.nameList, pathname));


        return false;
    }
}