package stepdefinitinions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.Avansas_Page;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.swing.*;
import java.util.List;

public class Avansas_Stepdefinitions {

    Avansas_Page page = new Avansas_Page();


    @Given("kullanici {string} adresini ziyaret edip Avansas ana sayfasinin acilip acilmadigini kontrol eder")
    public void kullanici_adresini_ziyaret_edip_avansas_ana_sayfasinin_acilip_acilmadigini_kontrol_eder(String string) {
        String url = ConfigurationReader.getProperty("avansas_url");
        Driver.getDriver().get(url);
    }

    @Given("Avansas.com da arama alanina {string} yazilarak ara butonu tiklanir.")
    public void avansasComDaAramaAlaninaYazilarakAraButonuTiklanir(String arg0) {

        BrowserUtils.waitFor(2);
        page.avansasAra.sendKeys("kalem");
        page.araButton.click();
    }


    @And("Kategori listesinde kursun kalemler listesi secilir.")
    public void kategoriListesindeKursunKalemlerListesiSecilir() {

        BrowserUtils.waitFor(5);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        page.kursunKalemler.click();
    }

    @And("Siralama fonksiyonundan ada gore sirala secilir.")
    public void siralamaFonksiyonundanAdaGoreSiralaSecilir() {

        BrowserUtils.waitFor(2);
        page.akilliSiralama.click();
        BrowserUtils.waitFor(2);
        page.ismeGoreSiralama.click();
    }

    @And("Gelen urun listesinden adinda {string} iceren kac urun oldugu tespit edilir.urun adedi  {int} dan fazla ise test basarilidir.Urun adedi {int} ise test basarisizdir.")
    public void gelenUrunListesindenAdindaIcerenKacUrunOlduguTespitEdilirUrunAdediDanFazlaIseTestBasarilidirUrunAdediIseTestBasarisizdir(String urununAdi, int arg1, int arg2) {


        int count = 0;
        List<WebElement> urunList = Driver.getDriver().findElements(By.cssSelector("div[class='product-list']"));
        for (WebElement w: urunList) {
            if(w.getAttribute("data-product-name").contains(urununAdi)){
                count++;
            }

        }

        System.out.println(count);

        if (count==0) {
            System.out.println("Test basarisizdir");
        }
        else
            System.out.println("Test basarilidir");


    }



}
