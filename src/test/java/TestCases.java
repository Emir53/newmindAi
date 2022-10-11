import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class TestCases extends BaseTest{

    Career career;
    CommonFunctions commonFunctions;
    HomePage homePage;


    @BeforeEach
    public void background(){
        homePage = new HomePage(driver);
    }
    @Order(1)
    @Test
    public void test001(){
        Assertions.assertTrue(homePage.isOnHomePage());
        homePage.clickOnAboutUs();
        Assertions.assertTrue(homePage.isOnAboutUs());
    }
    @Order(2)
    @Test
    public void test002(){
        Assertions.assertTrue(homePage.isOnHomePage());
        homePage.clickOnProductsNdSolutions();
        Assertions.assertTrue(homePage.isOnProductsNdSolutions());
    }
    @Order(3)
    @Test
    public void test003(){
        Assertions.assertTrue(homePage.isOnHomePage());
        homePage.clickOnTeamTab();
        Assertions.assertTrue(homePage.isOnTeamPage());


    }
    @Order(4)
    @Test
    public void test004(){
        Assertions.assertTrue(homePage.isOnHomePage());
        homePage.clickOnCarrerTab();
        Assertions.assertTrue(homePage.isOnCareerPage());
    }
    @Order(5)
    @Test
    public void test005(){
        Assertions.assertTrue(homePage.isOnHomePage());
        homePage.switchToEnglish();
        Assertions.assertTrue(homePage.isOnAboutUsEnglish());
    }


    @Order(6)
    @Test
    public void test006(){
        test005();
        driver.navigate().back();
        Assertions.assertTrue(homePage.isOnHomePage());
    }

    @Order(7)
    @Test
    public void test007(){
        test001();
        homePage.clickOnProductsNdSolutions();
        Assertions.assertTrue(homePage.isOnHomePage());

    }

    @Order(8)
    @Test
    public void test008(){
        test006();
        homePage.switchToEnglish();
        Assertions.assertTrue(homePage.isOnAboutUsEnglish());
    }

   @Order(9)
   @Test
   public void test009(){
        test003();
        homePage.clickOnConTactTab();
        Assertions.assertTrue(homePage.isOnAboutUsEnglish());
   }


   @Order(10)
   @Test
   public void test010(){

        test009();
        driver.navigate().back();
        Assertions.assertTrue(homePage.isOnTeamPage());
   }

   @Order(11)
   @Test
   public void test011(){
        test010();
        homePage.clicOnGoToTopButton();
        Assertions.assertTrue(homePage.isOnAboutUs());


    }







}
