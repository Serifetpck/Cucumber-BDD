package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utulities.Driver;

public class AmazonPage {
    // pagefactory'nin mantığı: pages sayfasında yer alan pagefactory ile
    // Diver classındaki driver ile  bu classtaki driver aynı denilmiş oluyor
    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy (id="twotabsearchtextbox")
    public WebElement aramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement aramaSonucElementi;
}
