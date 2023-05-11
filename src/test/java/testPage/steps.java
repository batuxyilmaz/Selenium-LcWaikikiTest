package testPage;

import base.basePage;
import org.openqa.selenium.WebDriver;

import static locaterPage.stepPage.*;


public class steps extends basePage {

    public steps(WebDriver driver) {
        super(driver);
    }

    public steps moveToCategory(){
    clickElement(MOVE);
    assertName(driver.getCurrentUrl(),"https://www.lcwaikiki.com/tr-TR/TR/lp/32-33-cocuk");
    return this;
}
public steps clickProduct(){
    clickElement(PRODUCT);
    assertName(driver.getCurrentUrl(),"https://www.lcwaikiki.com/tr-TR/TR/etiket/kisa-hazirlik-erkek-cocuk");
    return this;

}

public steps chooseProduct(){

    clickElement(CHOOSEPRODUCT);
    return this;
}
public steps chooseSize(){
    clickElement(CHOOSESIZE);
    assertControl(CHOOSESIZE,"5-6 Yaş");
    return this;

}
public steps addToBasket(){

    clickElement(ADDTOBASKET);
    assertControl(ADDTOBASKET,"SEPETE EKLE");
    return this;
}
public steps myBasket(){
    clickElement(MYBASKET);
    return this;
}

public steps mainPage(){
    clickElement(MAINPAGE);
    return this;
}

}

