package ctl.graphwalker.pmt.modelImpl;

import org.apache.commons.lang3.RandomStringUtils;
import org.graphwalker.core.machine.ExecutionContext;
import org.graphwalker.java.annotation.AfterElement;
import org.graphwalker.java.annotation.AfterExecution;
import org.graphwalker.java.annotation.BeforeElement;
import org.graphwalker.java.annotation.BeforeExecution;
import org.graphwalker.java.annotation.GraphWalker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import ctl.graphwalker.pmt.Login;
import ctl.graphwalker.pmt.helper.Helper;



@GraphWalker(value = "random(edge_coverage(100))", start = "e_Init")
 
public class LoginImpl extends ExecutionContext implements Login {
	
	WebDriver driver=null;

	public void v_Home() {
		// TODO Auto-generated method stub
		
	}

	public void e_ToggleRememberMe() {
		// TODO Auto-generated method stub
		
	}

	public void e_ValidPremiumCredentials() {
		// TODO Auto-generated method stub
		
		driver.findElement(By.name("cuid")).sendKeys("AB72075");
		driver.findElement(By.name("password")).sendKeys("Ctli@075");
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr[5]/td[4]/table/tbody/tr[2]/td/form/table/tbody/tr[3]/td[1]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[3]/a/img")).click();
		
	}

	public void v_applicationDown() {
		// TODO Auto-generated method stub
		
	}

	public void e_Logout() {
		// TODO Auto-generated method stub
		
	}

	public void v_LoginPrompted() {
		
		 //Helper.getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.name("cuid"))).clear();
	    //    Helper.getWaiter().until(ExpectedConditions.presenceOfElementLocated(By.id("cuid")))
	      //      .sendKeys("");
	    //    Helper.getWaiter().until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[type=\"submit\"]"))).click();
		driver.switchTo().alert().accept();
	}

	public void e_StartClient() {
		
		String baseurl="http://"+"AB72075"+":"+"Ctli@075"+"@"+"10.140.0.99:2010/T2-T3Code/jsp/logon.jsp";
		driver.get(baseurl);		
	}

	public void e_Close() {
		// TODO Auto-generated method stub
		
	}

	public void e_Init() {
		driver=Helper.getInstance();
		
	}

	public void e_Exit() {
		// TODO Auto-generated method stub
		
	}

	public void e_InvalidCredentials() {
		// TODO Auto-generated method stub
		
	}

	@BeforeExecution
    public void setup() {
        System.out.println("PetClinic: Any setup steps happens here. " +
                           "The annotation @BeforeExecution makes sure that before any elements in the " +
                           "model is called, this method is called first");
        Helper.setup();
    }

    @AfterExecution
    public void cleanup() {
        System.out.println("PetClinic: Any cleanup  steps happens here. " +
                           "The annotation @AfterExecution makes sure that after the test is done, " +
                           "this method is called last.");
//        Helper.tearDown();
    }

    @BeforeElement
    public void printBeforeElement() {
        System.out.println("Before element " + getCurrentElement().getName());
    }

    @AfterElement
    public void printAfterElement() {
        System.out.println("After element " + getCurrentElement().getName());
    }
}
