package org.code;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class MyStepDefination
{
    WebDriver driver;
    @Given("I have the site")
    public void givenmethod()
    {
        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
        driver=new EdgeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @When("I provide correct credential (\\w+) and (\\w+)")
    public void whenmethodcorrect(String x, String y)
    {
        driver.findElement(By.id("txtUsername")).sendKeys(x);
        driver.findElement(By.id("txtPassword")).sendKeys(y);
        driver.findElement(By.id("btnLogin")).click();
    }

    @When("I provide correct credential in different style")
    public void whenmethodcorrectSecond(DataTable table)
    {
        List<String> data =table.asList(String.class);

        driver.findElement(By.id("txtUsername")).sendKeys(data.get(0));//Admin
        driver.findElement(By.id("txtPassword")).sendKeys(data.get(1));//Admin123
        driver.findElement(By.id("btnLogin")).click();
    }

    @When("I provide incorrect credential (\\w+) and (.*)")
    public void whenmethodincorrect(String x, String y)
    {
        driver.findElement(By.id("txtUsername")).sendKeys(x);
        driver.findElement(By.id("txtPassword")).sendKeys(y);
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("I should be in dashboard page")
    public void thencode()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
        driver.quit();
    }
    @Then("^I should be in login page$")
    public void i_should_be_in_login_page(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
        driver.quit();
    }


    @When("^I provide correct password$")
    public void i_provide_correct_password(){
    }

    @Then("^user should get an error message$")
    public void user_should_get_an_error_message(){

    }

    @When("^I provide correct username$")
    public void i_provide_correct_username() {

    }
}
