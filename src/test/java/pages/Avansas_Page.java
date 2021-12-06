package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;


public class Avansas_Page {

    public Avansas_Page() {


        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(name = "q")
    public WebElement avansasAra;

    @FindBy(xpath = "//*[contains(text(),'ARA')]")
    public WebElement araButton;

//    @FindBy(xpath = "//*[contains(text(),'Ofis Kırtasiye')]")
//    public WebElement ofisKirtasiye;
//
//    @FindBy(xpath = "//a[@href=' /kursun-kalemler-c-5']")
//    public WebElement kursunKalemler;

    @FindBy(xpath = "//img[@data-name=\"Kurşun Kalemler\"]")
    public WebElement kursunKalemler;

    @FindBy(xpath ="//span[@id = \"select2-sort-container\"]")
    public WebElement akilliSiralama;


    @FindBy(css = "li[id $= 'isim-a-z']")
    public WebElement ismeGoreSiralama;











}