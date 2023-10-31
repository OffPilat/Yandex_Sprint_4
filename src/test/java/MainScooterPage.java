import java.time.Duration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(Parameterized.class)
public class MainScooterPage {
    private WebDriver webDriver;
    private final String text;
    private final String xpathSelectorButton;
    private final String panelSelector;

    public MainScooterPage(String text, String xpathSelectorButton, String panelSelector) {
        this.text = text;
        this.xpathSelectorButton = xpathSelectorButton;
        this.panelSelector = panelSelector;
    }

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        this.webDriver = new ChromeDriver(options);
    }

    @Parameters
    public static Object[][] getListParam() {
        return new Object[][]{{"Сутки — 400 рублей. Оплата курьеру — наличными или картой.", ".//div[@class='accordion__item'][1]/div/div[@role='button']", "div#accordion__panel-0 p"}, {"Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.", ".//div[@class='accordion__item'][2]/div/div[@role='button']", "div#accordion__panel-1 p"}, {"Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.", ".//div[@class='accordion__item'][3]/div/div[@role='button']", "div#accordion__panel-2 p"}, {"Только начиная с завтрашнего дня. Но скоро станем расторопнее.", ".//div[@class='accordion__item'][4]/div/div[@role='button']", "div#accordion__panel-3 p"}, {"Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.", ".//div[@class='accordion__item'][5]/div/div[@role='button']", "div#accordion__panel-4 p"}, {"Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.", ".//div[@class='accordion__item'][6]/div/div[@role='button']", "div#accordion__panel-5 p"}, {"Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.", ".//div[@class='accordion__item'][7]/div/div[@role='button']", "div#accordion__panel-6 p"}, {"Да, обязательно. Всем самокатов! И Москве, и Московской области.", ".//div[@class='accordion__item'][8]/div/div[@role='button']", "div#accordion__panel-7 p"}};
    }

    @Test
    public void ValidationTextDropDownListofQuestions() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps.open("https://qa-scooter.praktikum-services.ru/");
        WebElement element = this.webDriver.findElement(By.xpath(this.xpathSelectorButton));
        ((JavascriptExecutor)this.webDriver).executeScript("arguments[0].scrollIntoView();", new Object[]{element});
        steps.click(By.xpath(this.xpathSelectorButton));
        (new WebDriverWait(this.webDriver, Duration.ofSeconds(2L))).until(ExpectedConditions.attributeToBe(By.xpath(this.xpathSelectorButton), "aria-expanded", "true"));
        String actualtext = this.webDriver.findElement(By.cssSelector(this.panelSelector)).getText();
        Assert.assertEquals("Тексты не совпадают", this.text, actualtext);
    }

    @After
    public void teardown() {
        this.webDriver.quit();
    }
}
