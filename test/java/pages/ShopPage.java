package pages;

import io.techleadacademy.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ShopPage extends TestBase {


    public ShopPage(){
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//a[@class='site-nav__link site-nav__link--underline site-nav__link--has-dropdown'])[2]")
    public WebElement shop_Btn;

    @FindBy(xpath = "//div[@class='quick-product__btn js-modal-open-quick-modal-3973433589846 small--hide']")
    public WebElement product_Btn;

    @FindBy(xpath = "//ul[@data-rte-list='default']/li")
    public static List<WebElement> List_Btn;

    @FindBy(xpath = "//button[@class='btn btn--full add-to-cart btn--secondary']")
    public WebElement addToCard_Btn;

    @FindBy(xpath = "//button[@class='js-qty__adjust js-qty__adjust--minus']")
    public WebElement plus_Btn;

    @FindBy(xpath = "(//button[@class='drawer__close-button js-drawer-close'])[2]")
    public WebElement close_Btn;

    @FindBy(xpath = "(//button[@class='modal__close js-modal-close text-link'])[1]")
    public WebElement closeMenu_Btn;
}
