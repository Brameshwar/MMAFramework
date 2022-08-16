import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class banti package com.navi.core;

        import lombok.extern.slf4j.Slf4j;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.ui.ExpectedCondition;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;

        import java.lang.reflect.Constructor;
        import java.lang.reflect.InvocationTargetException;

@Slf4j
public class BaseWebPage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseWebPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,10);
    }

    public BaseWebPage(BaseWebPage page){
        this.driver = page.driver;
        this.wait = new WebDriverWait(driver,10);
    }


    public boolean checkIfElementExists(WebElement element){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(element));
            if(element.isDisplayed())
                return true;
            else
                return false;
        }
        catch (Exception e){
            log.error("Given element is not displayed",e.getLocalizedMessage());
            return false;
        }

    }

    public boolean clickOnElement(WebElement element){
        try {
            if(checkIfElementExists(element)) {
                element.click();
                return true;
            }
            else
                return false;

        }catch (Exception e){
            log.error("Failed to click on the given element",e.getLocalizedMessage());
            return false;
        }

    }





    public <T extends BaseWebPage> T getPage(Class<T> cls) {

        T pageInstance = null;
        Constructor<T>[] constructorsArray = (Constructor<T>[]) cls.getConstructors();
        for(Constructor c:constructorsArray){

            Class<?>[] params = c.getParameterTypes();

            if(params.length==1 ){
                try {
                    pageInstance = (T) c.newInstance(this);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }

        }

        return pageInstance;

    }
}

}
