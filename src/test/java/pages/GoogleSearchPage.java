package pages;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleSearchPage {

     private WebDriver driver;
    public GoogleSearchPage( WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver , this) ;
    }

     @FindBy(name = "q")
       private WebElement searchText;


    @FindBy(xpath = "(//div [contains(text() ,'Accept all')])[2]")
    private WebElement Cookies;


    public void searchFor(String key){
        searchText.sendKeys(key + Keys.ENTER);




    }

    public void CookiesButton(){
      Cookies.click();




    }




}







