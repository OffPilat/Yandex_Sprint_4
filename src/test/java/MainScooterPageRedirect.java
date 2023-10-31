import java.time.Duration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MainScooterPageRedirect {
    private WebDriver webDriver;

    public MainScooterPageRedirect() {
    }

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        this.webDriver = new ChromeDriver(options);
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10L));
    }

    @Test
    public void clickingHeaderClientOrderForm() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps.open("https://qa-scooter.praktikum-services.ru/").click(selectorsMainPage.getorderButtonHeader());
        Assert.assertEquals("Для кого самокат", this.webDriver.findElement(By.cssSelector("div .Order_Header__BZXOb")).getText());
    }

    @Test
    public void clickingCenterClientOrderForm() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps.open("https://qa-scooter.praktikum-services.ru/").find(selectorsMainPage.orderButtonFinish()).click(selectorsMainPage.orderButtonFinish());
        Assert.assertEquals("Для кого самокат", this.webDriver.findElement(By.cssSelector("div .Order_Header__BZXOb")).getText());
    }

    @Test
    public void clickingScooterLogo() {
        SelectorsMainPage selectorsMainPage = new SelectorsMainPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps.open("https://qa-scooter.praktikum-services.ru/").click(selectorsMainPage.linkbuttonmainpageScooter());
        Assert.assertEquals("УЧЕБНЫЙ ТРЕНАЖЕР", this.webDriver.findElement(By.cssSelector("div .Header_Disclaimer__3VEni")).getText());
    }

    @After
    public void teardown() {
        this.webDriver.quit();
    }
}
