package tests.tests;

import org.testng.annotations.Test;
import tests.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testAddNewGroup() {
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("test", null, null));
  }

}