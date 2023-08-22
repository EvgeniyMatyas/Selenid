package pages;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class LoginPage extends BasePage{

    public LoginPage open(){
        Selenide.open("/login");
        return this;
    }

    public LoginPage inputEmailAndPasswordAndSubmit(String email,String password){
        $(By.name("email")).setValue("evgeniymatyas@mail.ru");
        $(By.xpath("//*[@placeholder = 'Password']")).setValue("77721185948934James").submit();
        return this;
    }



    public static final By PASSWORD_INPUT = By.xpath("//*[@placeholder = 'Password']");
    @Override
    public boolean isPageOpen() {

 //       $$(By.xpath("//div[@id='item']")).shouldHave(CollectionCondition.size(10))
        return isExist(PASSWORD_INPUT);
    }
}
