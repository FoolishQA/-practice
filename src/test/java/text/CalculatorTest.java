package text;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.TestPage;


public class CalculatorTest {

    private static WebDriver driver;
    private static TestPage searchPage;

    @BeforeAll
    public static void init(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        searchPage = new TestPage(driver);
    }
    @BeforeEach
    public void setup() {
        driver.get("http://google.com");
        searchPage.search("Калькулятор");
    }

    @Test
    @DisplayName("Проверка операций с целыми числами")
    public void test1() {
        WebElement element = searchPage.sign;element.click();
        WebElement element2 = searchPage.sign2;element2.click();
        WebElement element3 = searchPage.sign3;element3.click();
        WebElement element4 = searchPage.sign4;element4.click();
        WebElement element5 = searchPage.sign5;element5.click();
        WebElement element6 = searchPage.sign6;element6.click();
        WebElement element7 = searchPage.sign7;element7.click();
        WebElement element8 = searchPage.sign8;element8.click();
        WebElement element9 = searchPage.sign9;element9.click();
        WebElement element10 = searchPage.sign10;element10.click();
        WebElement element11 = searchPage.sign11;element11.click();
        WebElement element12 = searchPage.sign12;element12.click();
        WebElement element13 = searchPage.sign13;element13.click();
    }

    @Test
    @DisplayName("Проверка деления на ноль")
    public void test2(){
        WebElement element = searchPage.sign14;element.click();
        WebElement element2 = searchPage.sign15;element2.click();
        WebElement element3 = searchPage.sign16;element3.click();
        WebElement element4 = searchPage.sign13;element4.click();
    }

    @Test
    @DisplayName("Проверка ошибки при отсутствии значения")
    public void test3(){
        WebElement element = searchPage.sign17;element.click();
        WebElement element2 = searchPage.sign13;element2.click();
    }

    @AfterAll
    public static void teardown(){
        driver.quit();
    }

}
