package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class dsalgo_sd {
	public static WebDriver driver;
	String URL="https://dsportalapp.herokuapp.com/";
	By GetStrtBtn=By.xpath("//button[@class='btn']");
	By DrpDwnBtn=By.xpath("//a[@class='nav-link dropdown-toggle']");
	By GetStrdBtn=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']/div[1]//a");
	By ArrayBtnBfrSignin=By.xpath("//div[@class='dropdown-menu show']/a[1]");
	By Signin=By.xpath("//div[@class='collapse navbar-collapse justify-content-between']/div[2]/ul/a[3]");
	By SigninRegister=By.xpath("//div[@class='col-sm']/a");
	By Regwithval=By.xpath("//div[@class='col-sm']//input[5]");
	By UserName=By.xpath("//div[@class='col-sm']//input[2]");
	By Password=By.xpath("//div[@class='col-sm']//input[3]");
	By Passwordconfirmation=By.xpath("//div[@class='col-sm']//input[4]");
	By Signout=By.xpath("//div[@class='collapse navbar-collapse justify-content-between']//div[2]/ul/a[3]");
	By Login=By.xpath("//div[@class='col-sm']//input[4] ");
	By SigninUserName=By.xpath("//div[@class='col-sm']//input[2] ");
	By SigninPassword=By.xpath("//div[@class='col-sm']//input[3]");
	By PracticeQues=By.xpath("//a[text()='Practice Questions']");
	By Tryhere=By.xpath("//div[@class='col-sm']/a");
	
	//************DataStructures Variables********//
	By DatastructuresGetStrtd=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[1]//div[1]//div[1]//a");
	By TimeComplexity=By.className("list-group-item");	
	By DrpdownArray=By.xpath("//div[@class='nav-item dropdown show']//div/a[1]");
	By ArrayGetStrtd=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[2]//a");
	By TextEditorbox=By.xpath("//form[@id ='answer_form']/div/div/div/textarea");
	//By TextEditorbox=By.xpath("//div[@class='input']//div[6]/div"); 
	By RunBtn=By.xpath("//button[text()='Run']");
	//*********Stack Variables**********//
	By StackGetStrtdBtn=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[4]//a");
	By OperationsinStack=By.xpath("//a[contains(text(), 'Operations in ')]");
	By StackImplemantation=By.xpath("//div[@class='col-2']//div/li[2]/a");
	By StackApplications=By.xpath("//div[@class='row']//div[1]/div/li[3]/a");
	//By StackPracticeQues=By.xpath("//a[text()='Practice Questions']");
	//**********Tree Variables**************//
	By TreeGetstrtd=By.xpath("//div[@class='row row-cols-1 row-cols-md-3 g-4']//div[6]//a ");
	By OverviewofTreesBtn=By.xpath("//a[text()='Overview of Trees']");
	By TreeTerminologies=By.xpath("//div[@class='col-2']//li[2]/a");
	By TypesofTrees=By.xpath("//a[text()='Types of Trees']");
	By TreeTraversalsBtn=By.xpath("//div[@class='col-2']//div/li[4]/a");
	By TraversarlsIllustrationBtn=By.xpath("//div[@class='col-2']//div/li[5]/a");
	By BinaryTreesBtn=By.xpath("//div[@class='col-2']//div/li[6]/a");
	By TypesofBinaryTrees=By.xpath("//div[@class='col-2']//div/li[7]/a");
	By ImplementationinPython=By.xpath("//div[@class='col-2']//div/li[8]/a");
	By BinaryTreeTraversals=By.xpath("//div[@class='col-2']//div/li[9]/a");
	By ImplementationBinaryTrees=By.xpath("//div[@class='col-2']//div/li[10]/a");
	By ApplicationsofBinaryTrees=By.xpath("//div[@class='col-2']//div/li[11]/a");
	By BinarySearchTrees=By.xpath("//div[@class='col-2']//div/li[12]/a");
	By ImplementationofBST=By.xpath("//div[@class='col-2']//div/li[13]/a");
	
	
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		
	    
	}

	@Given("some other precondition")
	public void some_other_precondition() {
	    
	}

	@When("I complete action")
	public void i_complete_action() throws InterruptedException {
	   driver.findElement(GetStrtBtn).click();
	   driver.findElement(DrpDwnBtn).click();
	   driver.findElement(GetStrdBtn).click();
	   driver.findElement(DrpDwnBtn).click();
	   Thread.sleep(300);
	   driver.findElement(ArrayBtnBfrSignin).click();
	   Thread.sleep(300);
	   driver.findElement(Signin).click();
	   driver.findElement(SigninRegister).click();
	   driver.findElement(Regwithval).click();
	   driver.findElement(UserName).sendKeys("Mona");
	   driver.findElement(Regwithval).click();
	   driver.findElement(Password).sendKeys("puppy");
	   driver.findElement(Regwithval).click();
	   driver.findElement(UserName).clear();
	   driver.findElement(Password).clear();
	   driver.findElement(UserName).sendKeys("*#**#");
	   driver.findElement(Password).sendKeys("puppy");
	   driver.findElement(Passwordconfirmation).sendKeys("puppy1");
	   driver.findElement(Regwithval).click();
	   driver.findElement(UserName).sendKeys("Mona");
	   driver.findElement(Password).sendKeys("puppy");
	   driver.findElement(Passwordconfirmation).sendKeys("puppy");
	   driver.findElement(Regwithval).click();
	   driver.findElement(UserName).sendKeys("Mona");
	   driver.findElement(Password).sendKeys("123456789");
	   driver.findElement(Passwordconfirmation).sendKeys("123456789");
	   driver.findElement(Regwithval).click();
	   driver.findElement(UserName).sendKeys("Hash13");
	   driver.findElement(Password).sendKeys("@Country123");
	   driver.findElement(Passwordconfirmation).sendKeys("@Country123");
	   driver.findElement(Regwithval).click();
	   driver.findElement(Signout).click();
	   driver.findElement(Signin).click();
	   driver.findElement(Login).click();
	   driver.findElement(SigninUserName).sendKeys("ghhhh");
	   driver.findElement(SigninPassword).sendKeys("jkl");
	   driver.findElement(Login).click();
	   driver.findElement(SigninUserName).sendKeys("Hash13");
	   driver.findElement(SigninPassword).sendKeys("@Country123");
	   driver.findElement(Login).click();
	   Thread.sleep(1000);
	   //**************DataStructures*************//
	   driver.findElement(DatastructuresGetStrtd).click();
	   driver.findElement(TimeComplexity).click();
	   driver.findElement(Tryhere).click();	
	   //driver.navigate().back();
	   //Thread.sleep(500);
	   //driver.findElement(PracticeQues).click();
	   //Thread.sleep(500);
	   //driver.findElement(Tryhere).click();	   
	   //driver.navigate().back();
	   driver.findElement(TextEditorbox).sendKeys("print 'Hello'"); 
	   Thread.sleep(300);
	   driver.findElement(RunBtn).click();
	  
	   //************Stack****************//
	   driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	   Thread.sleep(300);
	   driver.findElement(StackGetStrtdBtn).click();
	   driver.findElement(OperationsinStack).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(StackImplemantation).click();
	   driver.findElement(Tryhere).click();
	   Thread.sleep(300);
	   driver.navigate().back();
	   driver.findElement(StackApplications).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   Thread.sleep(500);
	   driver.findElement(PracticeQues).click();
	   Thread.sleep(500);
	   //*********Tree***************//
	   driver.navigate().to("https://dsportalapp.herokuapp.com/home");
	   Thread.sleep(5000);
	   driver.findElement(TreeGetstrtd).click();
	   driver.findElement(OverviewofTreesBtn).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(TreeTerminologies).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(TypesofTrees).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(TreeTraversalsBtn).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(TraversarlsIllustrationBtn).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(BinaryTreesBtn).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(ImplementationBinaryTrees).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(ApplicationsofBinaryTrees).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(BinarySearchTrees).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   driver.findElement(ImplementationofBST).click();
	   driver.findElement(Tryhere).click();
	   driver.navigate().back();
	   Thread.sleep(500);
	   driver.findElement(PracticeQues).click();
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

	@When("some other action")
	public void some_other_action() {
	    
	}

	@When("yet another action")
	public void yet_another_action() {
	    
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    
	}

}
