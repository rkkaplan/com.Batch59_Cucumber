package stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.GuruPage;
import utilities.Driver;

import java.util.List;

public class GuruStepDefinitions {
    GuruPage guruPage = new GuruPage();
    @Given("{string}, sutunundaki tum degerleri yazdirir")
    public void sutunundaki_tum_degerleri_yazdirir(String istenenSutun) {

        List<WebElement> tabloBaslikListesi = guruPage.baslikListesi;
        // listemiz WebElementlerden olusuyor Dolayisiyla bu webelementlerden hangisi
        // istenen sutun basligini tasiyor bilemeyiz
        int istenenBaslikindexi = -3;
        for (int i = 0; i <tabloBaslikListesi.size() ; i++) {
            if (tabloBaslikListesi.get(i).getText().equals(istenenSutun)){
                istenenBaslikindexi = i+1;
                break;
            }

        }
        //loop bittiginde basligin bulunup bulunmadigini kontrol etmek ve bulundu ise yoluma devam etmek istiyorum
        if (istenenBaslikindexi!=-3){ //baslik bulundu demektir
            List<WebElement> istenenSutundakiElementler =
                    Driver.getDriver().findElements(By.xpath("//tbody//tr//td["+istenenBaslikindexi +"]"));
            for (WebElement e:istenenSutundakiElementler
                 ) {
                System.out.println(e.getText());
            }


        }else{ //baslik bulunamadi demektir
            System.out.println("istenen baslik bulunamadi");
        }



    }




}
