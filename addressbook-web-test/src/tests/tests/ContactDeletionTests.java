package tests.tests;

import org.testng.annotations.Test;
import tests.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    if (! app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData("Name", "Surname", "Main Str.21", "test"));
    }
    app.getContactHelper().bulkContactSelect();
    app.getContactHelper().deleteSelected();
    app.getContactHelper().alertApprove();
    app.getNavigationHelper().returnToHomePage();
  }

}