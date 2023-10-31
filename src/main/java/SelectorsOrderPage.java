import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectorsOrderPage {
        private final WebDriver webDriver;
        public static final String URL_ORDER_CLIENTPAGE = "https://qa-scooter.praktikum-services.ru/order";
        private By nameFieldorderForm = By.xpath(".//input[contains (@placeholder,'Имя')] ");
        private By surnameFieldorderForm = By.xpath(".//input[contains (@placeholder,'Фамилия')]");
        private By addressFieldorderForm = By.xpath(".//input[contains (@placeholder,'Адрес')]");
        private By metroFieldorderForm = By.xpath(".//input[contains (@placeholder,'метро')]");
        private By metrostationorderForm = By.xpath(".//div[text()='Черкизовская']");
        private By phoneFieldorderForm = By.xpath(".//input[contains (@placeholder,'Телефон')]");
        private By buttonNextorderForm = By.xpath(".//button[contains (text(), 'Далее')]");
        private By titleOrderScooterPageForm = By.cssSelector("div .Order_Header__BZXOb");
        private By calendarfieldorderForm = By.cssSelector(".react-datepicker__input-container");
        private By calendardataselectdorderForm = By.xpath(".//div[contains (@aria-label, '1-е ноября 2023')]");
        private By rentperiodfield = By.cssSelector(".Dropdown-root");
        private By rentperioselectdropwdownfield = By.xpath(".//div[@class='Dropdown-option'][1]");
        private By checkboxColor1 = By.cssSelector("#black");
        private By checkboxColor2 = By.cssSelector("#grey");
        private By CommentFieldorderForm = By.xpath(".//input[contains (@placeholder,'Комментарий')]");
        private By buttonOrderorderForm = By.xpath(".//div[contains (@class,'Order')]/button[contains (text(), 'Заказать')]");
        private By buttonYesorderForm = By.xpath(".//div[contains (@class,'Order')]/button[contains (text(), 'Да')]");

        public SelectorsOrderPage(WebDriver webDriver) {
            this.webDriver = webDriver;
        }

        public By getnameFieldorderForm() {
            return this.nameFieldorderForm;
        }

        public By getsurnameFieldorderForm() {
            return this.surnameFieldorderForm;
        }

        public By getaddressFieldorderForm() {
            return this.addressFieldorderForm;
        }

        public By getmetroFieldorderForm() {
            return this.metroFieldorderForm;
        }

        public By getmetrostationorderForm() {
            return this.metrostationorderForm;
        }

        public By getphoneFieldorderForm() {
            return this.phoneFieldorderForm;
        }

        public By getbuttonNextorderForm() {
            return this.buttonNextorderForm;
        }

        public By getcalendarfieldorderForm() {
            return this.calendarfieldorderForm;
        }

        public By getcalendardataselectdorderForm() {
            return this.calendardataselectdorderForm;
        }

        public By gettitleOrderScooterPageForm() {
            return this.titleOrderScooterPageForm;
        }

        public By getrentperiodfield() {
            return this.rentperiodfield;
        }

        public By getrentperioselectdropwdownfield() {
            return this.rentperioselectdropwdownfield;
        }

        public By getcheckboxColor1() {
            return this.checkboxColor1;
        }

        public By getCheckboxColor2() {
            return this.checkboxColor2;
        }

        public By getCommentFieldorderForm() {
            return this.CommentFieldorderForm;
        }

        public By getbuttonOrderorderForm() {
            return this.buttonOrderorderForm;
        }

        public By getbuttonYesorderForm() {
            return this.buttonYesorderForm;
        }

        public void clickaccordingItemButton(String accordingItemButton) {
            WebElement element = this.webDriver.findElement(By.xpath(accordingItemButton));
            ((JavascriptExecutor)this.webDriver).executeScript("arguments[0].scrollIntoView();", new Object[]{element});
            this.webDriver.findElement(By.xpath(accordingItemButton)).click();
        }

        public By setdataCalendarfield(String data) {
            return By.xpath(".//div[contains (@aria-label, '" + data + "')]");
        }

        public By setrentperioselectdropwdownfield(int number) {
            return By.xpath(".//div[@class='Dropdown-option'][" + number + "]");
        }
    }