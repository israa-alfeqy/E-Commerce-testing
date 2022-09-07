package pages;
import stepDifinations.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class WishPage {
    public WishPage() {

        PageFactory.initElements(Hooks.driver, this);
    }

    @FindBy (xpath = "//div[@data-productid=\"18\"]//button[@class=\"button-2 add-to-wishlist-button\"]")
    public WebElement wishlistBtn;

    @FindBy (className = "content")
    public WebElement success;

    @FindBy (css = "div[class=\"bar-notification success\"]")
    public WebElement msgBackground;

    @FindBy (className = "wishlist-label")
    public WebElement wishlistTab;

    @FindBy (className = "qty-input")
    public WebElement quantity;



}

