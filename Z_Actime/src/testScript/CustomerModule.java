package testScript;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import generic.BaseClass;
import generic.File_Lib;
import pom.HomePage;
import pom.TaskListPage;

@Listeners(generic.Listener.class)
public class CustomerModule extends BaseClass
{
	@Test
	public void testCreateCustomer() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		Reporter.log("Create customer");
		File_Lib f=new File_Lib();
		String custName = f.getExcelData("CreateCustomer", 1, 2);
		String custDespt = f.getExcelData("CreateCustomer", 1, 3);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNewBtn().click();
		t.getNewCustomerOption().click();
		t.getCustNameTbx().sendKeys(custName);
		t.getCustDespTbx().sendKeys(custDespt);
		t.getSelectCustDropDown().click();
		t.getOurCompanyOption().click();
		t.getCreateCustomerBtn().click();
		Thread.sleep(4000);
		String actualCustomer =t.getCustName().getText();
		Assert.assertEquals(actualCustomer, custName);
	}
}
