package tests;

import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

  @Test
  public void testAddNewGroup() {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("test", "test", "test"));
    submitGroupCreation();
    returnToGroupPage();
  }


}