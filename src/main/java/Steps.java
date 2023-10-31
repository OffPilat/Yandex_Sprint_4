import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

    public class Steps {
        private WebDriver webDriver;

        public Steps(WebDriver webDriver) {
            this.webDriver = webDriver;
        }

        public Steps open(String Url) {
            this.webDriver.get(Url);
            return this;
        }

        public Steps find(By element) {
            this.webDriver.findElement(element);
            ((JavascriptExecutor)this.webDriver).executeScript("arguments[0].scrollIntoView();", new Object[]{element});
            return this;
        }

        public Steps click(By element) {
            this.webDriver.findElement(element).click();
            return this;
        }

        public Steps inputText(By element, String text) {
            this.webDriver.findElement(element).sendKeys(new CharSequence[]{text});
            return this;
        }
    }

