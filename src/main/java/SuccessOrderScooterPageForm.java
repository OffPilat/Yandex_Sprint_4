
import java.time.Duration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SuccessOrderScooterPageForm {
    private WebDriver webDriver;

    public SuccessOrderScooterPageForm() {
    }

    @Before
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments(new String[]{"--remote-allow-origins=*"});
        this.webDriver = new ChromeDriver(options);
        this.webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2L));
    }

    @Test
    public void successpassClientOrderForm1() {
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps.open("https://qa-scooter.praktikum-services.ru/order").inputText(selectorsOrderPage.getnameFieldorderForm(), "Иван").inputText(selectorsOrderPage.getsurnameFieldorderForm(), "Иванов").inputText(selectorsOrderPage.getaddressFieldorderForm(), "Ленина 1").click(selectorsOrderPage.getmetroFieldorderForm()).click(selectorsOrderPage.getmetrostationorderForm()).inputText(selectorsOrderPage.getphoneFieldorderForm(), "99279344115").click(selectorsOrderPage.getbuttonNextorderForm());
        Assert.assertEquals("Про аренду", this.webDriver.findElement(By.cssSelector("div .Order_Header__BZXOb")).getText());
        steps.click(selectorsOrderPage.getcalendarfieldorderForm()).click(selectorsOrderPage.setdataCalendarfield("30-е октября 2023")).click(selectorsOrderPage.getrentperiodfield()).click(selectorsOrderPage.setrentperioselectdropwdownfield(1)).click(selectorsOrderPage.getcheckboxColor1()).inputText(selectorsOrderPage.getCommentFieldorderForm(), "Комментарий").click(selectorsOrderPage.getbuttonOrderorderForm()).click(selectorsOrderPage.getbuttonYesorderForm());
        Assert.assertEquals("Заказ оформлен", this.webDriver.findElement(By.cssSelector("div .Order_ModalHeader__3FDaJ")).getText());
    }

    @Test
    public void successpassClientOrderForm2() {
        SelectorsOrderPage selectorsOrderPage = new SelectorsOrderPage(this.webDriver);
        Steps steps = new Steps(this.webDriver);
        steps.open("https://qa-scooter.praktikum-services.ru/order").inputText(selectorsOrderPage.getnameFieldorderForm(), "Гаврила").inputText(selectorsOrderPage.getsurnameFieldorderForm(), "Ротенберг").inputText(selectorsOrderPage.getaddressFieldorderForm(), "Москва, Волоколамское шоссе 1").click(selectorsOrderPage.getmetroFieldorderForm()).click(selectorsOrderPage.getmetrostationorderForm()).inputText(selectorsOrderPage.getphoneFieldorderForm(), "123456789123").click(selectorsOrderPage.getbuttonNextorderForm());
        Assert.assertEquals("Про аренду", this.webDriver.findElement(By.cssSelector("div .Order_Header__BZXOb")).getText());
        steps.click(selectorsOrderPage.getcalendarfieldorderForm()).click(selectorsOrderPage.setdataCalendarfield("1-е ноября 2023")).click(selectorsOrderPage.getrentperiodfield()).click(selectorsOrderPage.setrentperioselectdropwdownfield(2)).click(selectorsOrderPage.getCheckboxColor2()).inputText(selectorsOrderPage.getCommentFieldorderForm(), "Новый комментарий").click(selectorsOrderPage.getbuttonOrderorderForm()).click(selectorsOrderPage.getbuttonYesorderForm());
        Assert.assertEquals("Заказ оформлен", this.webDriver.findElement(By.cssSelector("div .Order_ModalHeader__3FDaJ")).getText());
    }

    @After
    public void teardown() {
        this.webDriver.quit();
    }
}