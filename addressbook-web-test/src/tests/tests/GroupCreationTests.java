package tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.model.GroupData;

public class GroupCreationTests extends TestBase {

  @Test
  public void testAddNewGroup() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("test", null, null));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before + 1);
  }

}