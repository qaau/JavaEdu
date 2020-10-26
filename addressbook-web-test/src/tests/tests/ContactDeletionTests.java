package tests.tests;

import org.testng.annotations.Test;
import tests.model.ContactData;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
    app.getContactHelper().bulkContactSelect();
    app.getContactHelper().deleteSelected();
    app.getContactHelper().alertApprove();
    app.getNavigationHelper().returnToHomePage();
  }

}