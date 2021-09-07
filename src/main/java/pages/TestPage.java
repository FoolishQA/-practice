package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.PageFactory.initElements;

public class TestPage {

    @FindBy(css = "input.gLFyf.gsfi")
    private WebElement searchInput;

    @FindBy(xpath = "//div[@jsname='j93WEe']")
    public WebElement sign;

    @FindBy(xpath = "//div[@jsname='N10B9']")
    public WebElement sign2;

    @FindBy(xpath = "//div[@jsname='XSr6wc']")
    public WebElement sign3;

    @FindBy(xpath = "//div[@jsname='lVjWed']")
    public WebElement sign4;

    @FindBy(xpath = "//div[@jsname='qCp9A']")
    public WebElement sign5;

    @FindBy(xpath = "//div[@jsname='YovRWb']")
    public WebElement sign6;

    @FindBy(xpath = "//div[@jsname='KN1kY']")
    public WebElement sign7;

    @FindBy(xpath = "//div[@jsname='pPHzQc']")
    public WebElement sign8;

    @FindBy(xpath = "//div[@jsname='xAP7E']")
    public WebElement sign9;

    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    public WebElement sign10;

    @FindBy(xpath = "//div[@jsname='WxTTNd']")
    public WebElement sign11;

    @FindBy(xpath = "//div[@jsname='Ax5wH']")
    public WebElement sign12;

    @FindBy(xpath = "//div[@jsname='Pt8tGc']")
    public WebElement sign13;

    @FindBy(xpath = "//div[@jsname='abcgof']")
    public WebElement sign14;

    @FindBy(xpath = "//div[@jsname='WxTTNd']")
    public WebElement sign15;

    @FindBy(xpath = "//div[@jsname='bkEvMb']")
    public WebElement sign16;

    @FindBy(xpath = "//div[@jsname='aN1RFf']")
    public WebElement sign17;




    public TestPage(WebDriver driver) {
        initElements(driver, this);
    }

    public void search(String text) {
        searchInput.sendKeys(text, Keys.ENTER);

    }
}
