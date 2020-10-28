package tests.tests;

import org.testng.annotations.Test;
import tests.model.ContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Name", "Surname", "Main Str.21", "test"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData("Name1", "Surname1", "Main Str.23", null), false);
    app.getContactHelper().updateContactForm();
    app.getNavigationHelper().returnToHomePage();
  }

}

