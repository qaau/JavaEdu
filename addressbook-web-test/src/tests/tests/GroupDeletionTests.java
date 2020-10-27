package tests.tests;

import org.testng.annotations.Test;
import tests.appmanager.NavigationHelper;
import tests.model.GroupData;

import javax.swing.*;

public class GroupDeletionTests extends TestBase {

    @Test
    public void testGroupDeletion() {
      app.getNavigationHelper().gotoGroupPage();
      if (! app.getGroupHelper().isThereAGroup()) {
        app.getGroupHelper().createGroup(new GroupData("test1", null, null));
      }
      app.getGroupHelper().selectGroup();
      app.getGroupHelper().deleteSeletedGroups();
      app.getGroupHelper().returnToGroupPage();
    }

}
