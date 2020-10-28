package tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import tests.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void submitContactForm() {
    click(By.name("submit"));
  }
  public void updateContactForm() {
    click(By.name("update"));
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getName());
    type(By.name("lastname"), contactData.getLastname());
    type(By.name("address"), contactData.getAddress());

    if (creation) {
      new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));
    }
  }


  public void initContactCreation() { click(By.linkText("add new")); }

  public void initContactModification() { click(By.xpath("//*[@title='Edit']")); }

  public void bulkContactSelect() { click(By.cssSelector("input[name='selected[]'],[value='1']")); }

  public void deleteSelected() { click(By.cssSelector("input[value='Delete']")); }

  public void returnToHomePage() {click(By.linkText("home")); }

  public void alertApprove() { driver.switchTo().alert().accept();}

  public void createContact(ContactData data) {
    initContactCreation();
    fillContactForm(data, true);
    submitContactForm();
    returnToHomePage();
  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }
}
