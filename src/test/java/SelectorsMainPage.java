import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectorsMainPage {
    private final WebDriver webDriver;
    public static final String URL_MAIN_PAGE = "https://qa-scooter.praktikum-services.ru/";
    private By accordingItemButton1 = By.xpath(".//div[@class='accordion__item'][1]/div/div[@role='button']");
    private By accordingItemButton2 = By.xpath(".//div[@class='accordion__item'][2]/div/div[@role='button']");
    private By accordingItemButton3 = By.xpath(".//div[@class='accordion__item'][3]/div/div[@role='button']");
    private By accordingItemButton4 = By.xpath(".//div[@class='accordion__item'][4]/div/div[@role='button']");
    private By accordingItemButton5 = By.xpath(".//div[@class='accordion__item'][5]/div/div[@role='button']");
    private By accordingItemButton6 = By.xpath(".//div[@class='accordion__item'][6]/div/div[@role='button']");
    private By accordingItemButton7 = By.xpath(".//div[@class='accordion__item'][7]/div/div[@role='button']");
    private By accordingItemButton8 = By.xpath(".//div[@class='accordion__item'][8]/div/div[@role='button']");
    private By accordingItemButton1Text = By.cssSelector("#accordion__panel-0 p");
    private By accordingItemButton2Text = By.cssSelector("#accordion__panel-1 p");
    private By accordingItemButton3Text = By.cssSelector("#accordion__panel-2 p");
    private By accordingItemButton4Text = By.cssSelector("#accordion__panel-3 p");
    private By accordingItemButton5Text = By.cssSelector("#accordion__panel-4 p");
    private By accordingItemButton6Text = By.cssSelector("#accordion__panel-5 p");
    private By accordingItemButton7Text = By.cssSelector("#accordion__panel-6 p");
    private By accordingItemButton8Text = By.cssSelector("#accordion__panel-7 p");
    private By orderButtonHeader = By.cssSelector(".Header_Nav__AGCXC .Button_Button__ra12g");
    private By orderButtonFinish = By.cssSelector(".Home_FinishButton__1_cWm .Button_Button__ra12g");
    private By linkbuttonmainpageScooter = By.xpath(".//a[contains (@class, 'LogoScooter')]");
    private By linkbuttonmainpageYandex = By.xpath(".//a[contains (@class, 'LogoYandex')]");
    public static final String URL_YANDEX_MAIN_PAGE = "https://dzen.ru/";

    public By getAccordingItemButton1() {
        return this.accordingItemButton1;
    }

    public By getAccordingItemButton2() {
        return this.accordingItemButton2;
    }

    public By getAccordingItemButton3() {
        return this.accordingItemButton3;
    }

    public By getAccordingItemButton4() {
        return this.accordingItemButton4;
    }

    public By getAccordingItemButton5() {
        return this.accordingItemButton5;
    }

    public By getAccordingItemButton6() {
        return this.accordingItemButton6;
    }

    public By getAccordingItemButton7() {
        return this.accordingItemButton7;
    }

    public By getAccordingItemButton8() {
        return this.accordingItemButton8;
    }

    public SelectorsMainPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void clickaccordingItemButton(String accordingItemButton) {
        WebElement element = this.webDriver.findElement(By.xpath(accordingItemButton));
        ((JavascriptExecutor)this.webDriver).executeScript("arguments[0].scrollIntoView();", new Object[]{element});
        this.webDriver.findElement(By.xpath(accordingItemButton)).click();
    }

    public By getorderButtonHeader() {
        return this.orderButtonHeader;
    }

    public By orderButtonFinish() {
        return this.orderButtonFinish;
    }

    public By linkbuttonmainpageScooter() {
        return this.linkbuttonmainpageScooter;
    }

    public By linkbuttonmainpageYandex() {
        return this.linkbuttonmainpageYandex;
    }
}
