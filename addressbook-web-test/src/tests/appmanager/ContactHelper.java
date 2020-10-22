package tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import tests.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void submitContactForm() {
    click(By.name("submit"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());
  }

  public void initContactCreation() { click(By.linkText("add new")); }
}
