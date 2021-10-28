package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUser {

    private WebDriver driver;
    private String address;
    private String email;
    private String password;

    @Given("we open {word} site")
    public void openLoginSite(String address) {

        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/drivers/chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(address);
    }
    @When("provide {word} and {word} into inputs")
    public void putUserDetailsToInputs (String email, String password) {
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("submit-login")).submit();

    }
    @Then("we successfully login")
    public void login() {

        String userName = driver.findElement(By.xpath("//*[@id=\"_desktop_user_info\"]/div/a[2]/span")).getText();
        System.out.println(userName);
        Assert.assertFalse(userName.isEmpty());

    }

//    @Given("we are on login site")
//    public void weAreOnLoginSite() {
//        driver.get("https://mystore-testlab.coderslab.pl/index.php?controller=my-account");
//    }
//
//    @When("from login site we click add first address")
//    public void goToNewAddressForm() {
//        driver.findElement(By.xpath("//*[@id=\"address-link\"]/span/i")).click();
//    }
//
//
//    @And("we fill in {word} {word} {word} {word} {word} {word}")
//    public void weFillInAliasAddressCityZipcodeCountryPhone() {
//
//    }
//
//    @Then("{word} {word} {word} {word} {word} {word} are correct")
//    public void aliasAddressCityZipcodeCountryPhoneAreCorrect() {
//    }
}
