package Test1;

import net.bytebuddy.matcher.ElementMatcher;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class resultCenterCallme {



 /*
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;*/
    public class HepsiburadaaaTest {
        private WebDriver driver;
        private Map<String, Object> vars;
        JavascriptExecutor js;
        @Before
        public void setUp() {
            driver = new ChromeDriver();
            js = (JavascriptExecutor) driver;
            vars = new HashMap<String, Object>();
        }
        @After
        public void tearDown() {
            driver.quit();
        }
        @Test
        public void hepsiburadaaa() {
            driver.get("https://www.hepsiburada.com/cozummerkezi");
            driver.manage().window().setSize(new Dimension(1552, 832));
            driver.findElement(By.cssSelector(".btn:nth-child(2) > button")).click();
            driver.findElement(By.cssSelector(".parent-category:nth-child(3) .text")).click();
            driver.findElement(By.cssSelector("#faq-188 > .cell-content")).click();
            js.executeScript("window.scrollTo(0,920.7999877929688)");
            driver.findElement(By.cssSelector(".container:nth-child(2) .text")).click();
            driver.findElement(By.id("txtUserName")).click();
            driver.findElement(By.id("txtUserName")).sendKeys("mstgltn6@gmail.com");
            driver.findElement(By.id("btnLogin")).click();
            driver.findElement(By.id("txtPassword")).click();
            driver.findElement(By.id("txtPassword")).sendKeys("Mst13520!");
            driver.findElement(By.id("btnEmailSelect")).click();
            driver.findElement(By.cssSelector(".button-primary > button")).click();
            driver.findElement(By.cssSelector(".main-body")).click();
            assertThat(driver.findElement(By.cssSelector(".main-text")).getText(), is("Talebiniz oluşturuldu"));
        }

        private void assertThat(String text, ElementMatcher.Junction<Object> talebiniz_oluşturuldu) {
        }
    }

}
