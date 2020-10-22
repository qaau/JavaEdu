package tests.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import tests.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData("Name", "Surname", "Main Str.21"));
    app.getContactHelper().submitContactForm();
    app.getNavigationHelper().returnToHomePage();
  }

}
