package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClassForSession6 {
    @Test
    public void sampleTest() {
        WebDriver driver ;
        driver=new ChromeDriver();
        driver.navigate().to ("https://www.google.com");
        driver.quit();
    }
}
