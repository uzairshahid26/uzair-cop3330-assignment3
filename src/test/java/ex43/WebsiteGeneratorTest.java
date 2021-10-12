package ex43;

import org.junit.Test;

import static org.junit.Assert.*;

 public class WebsiteGeneratorTest {

    //Test to make sure createWebsite works.
    @Test
    public void createWebsite_works() {

//Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/website/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/website/testwebsite.com";
        String actual = wg.createWebsite();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createJSFolder works.
    @Test
    public void createJSFolder_works() {

//Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/website/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/website/testwebsite.com/js";
        String actual = wg.createJSFolder();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createCSFolder works.
    @Test
    public void createCSSFolder_works() {

//Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/website/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/website/testwebsite.com/css";
        String actual = wg.createCSSFolder();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }

    //Test to make sure createHTML works.
    @Test
    public void createHTMl_works() {

//Use the function and save the return value.
        WebsiteGenerator wg = new WebsiteGenerator();

        wg.path = "src/main/java/ex43/website/";
        wg.siteName = "testwebsite.com";
        wg.author = "Jose Valencia";

        String expected = "src/main/java/ex43/website/testwebsite.com/index.html";
        String actual = wg.createHTMl();

//Compare with the expected return value.
        assertEquals(expected, actual);

    }
}