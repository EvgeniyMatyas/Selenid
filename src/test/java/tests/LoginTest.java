package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.LoginPage;

import static com.codeborne.selenide.Condition.visible;
import  static com.codeborne.selenide.Selenide.*;


public class LoginTest extends BaseTest {

//    @Test
//    public void login(){
//        open("https://app.qase.io/login");
//        $(By.name("email")).setValue("evgeniymatyas@mail.ru");
//        $(By.xpath("//*[@placeholder = 'Password']")).setValue("77721185948934James").submit();
 //       $(By.id("createButton")).shouldBe(visible);

    @Test
    public void login(){
        loginPage.open();



    }


}
