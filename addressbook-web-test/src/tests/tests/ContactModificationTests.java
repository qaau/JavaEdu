package tests.tests;

import org.testng.annotations.Test;
import tests.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Name1", "Surname1", "Main Str.23", null), false);
    app.getContactHelper().updateContactForm();
    app.getNavigationHelper().returnToHomePage();
  }

}

