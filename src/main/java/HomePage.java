import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonFunctions{

    By aboutUsTab=By.xpath("//a[contains(text(),'Hakkımızda')]");

    By aboutUsTitle=By.xpath("//span[normalize-space()='HAKKIMIZDA']");
    By homePageTab=By.xpath("//a[contains(text(),'Anasayfa')]");

    By productsNdSolutionsTab=By.xpath("//a[normalize-space()='Ürünler & Çözümler']");

    By procutsNdSolutionsTitle=By.xpath("//img[@src='https://newmind.ai/wp-content/uploads/2020/04/1_NM-iClient.jpg']");

    By teamTab=By.xpath("//a[normalize-space()='Ekip']");

    By teamMemberİmg=By.xpath("//img[@src='https://www.mecellem.com/assets/website-profile-photos/2f724483-7a53-4ae8-bf95-fcb69c14ca67.jpg']");

    By careerTab=By.xpath("//a[normalize-space()='Kariyer']");

    By careerTabTitle=By.xpath("//h4[contains(text(),'KARİYER FIRSATLARI')]");

    By contactTab=By.xpath("//a[contains(text(),'İletişim')]");

    By newMindLogo=By.xpath("//div[@class='site-title']");

    By switchToEnglishLogo=By.xpath("//img[@title='English']");

    By switchToTurkishlogo=By.xpath("//img[@title='Türkçe']");

    By aboutUsEnglishTitle=By.xpath("//span[contains(text(),'WHO WE ARE')]");








    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void clickOnHomePage(){
        clickOnElement(homePageTab);
    }

    public void clickOnTeamTab(){
        clickOnElement(teamTab);
    }
    public void clickOnCarrerTab(){
        clickOnElement(careerTab);
    }
    public void clickOnConTactTab(){
        clickOnElement(contactTab);
    }
    public void clickOnAboutUs(){
        clickOnElement(aboutUsTab);
    }

    public void clickOnProductsNdSolutions(){
        clickOnElement(productsNdSolutionsTab);
    }

    public boolean isOnHomePage(){
       return isElementDisplayed(newMindLogo);
    }

    public boolean isOnTeamPage(){
        return isElementDisplayed(teamMemberİmg);
    }

    public boolean isOnCareerPage(){
        return isElementDisplayed(careerTabTitle);
    }

    public boolean isOnAboutUs(){
        return isElementDisplayed(aboutUsTitle);
    }

    public boolean isOnProductsNdSolutions(){
        return isElementDisplayed(procutsNdSolutionsTitle);
    }

    public boolean isOnAboutUsEnglish(){
        return isElementDisplayed(aboutUsEnglishTitle);
    }

    public void switchToEnglish(){
        clickOnElement(switchToEnglishLogo);
    }

    public void switchToTurkish(){
        clickOnElement(switchToTurkishlogo);
    }
}
