package testcases;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import test_cases.User_Register;

public class Register_user {
	public static void main(String[] args) throws IOException {
//1. LAUNCH THE BROWSER
		WebDriver driver = new ChromeDriver();
		// maximize the browser window
		driver.manage().window().maximize();
		// implicit wait for all the findelement & findelements
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// store the app url using properties file
		// create object for fileinputstream and pass the path of the properties file
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\PRIYADHARSHINI\\eclipse-workspace\\Automation_exercise.com\\src\\test\\resources\\cmndata.properties");
		// create object for properties class
		Properties prop = new Properties();
		// read the data from the file
		prop.load(fis);
		// fetch the data using key
		String url = prop.getProperty("url");
//2. NAVIGATE TO AN APPLICATION
		driver.get(url);
//3. VERIFY THAT HOME PAGE IS VISIBLE SUCCESSFULLY
		String Title = driver.getTitle();
		System.out.println(Title);
		String title = "Automation Exercise";
		if (Title.contains(title)) {
			System.out.println("page verified");
		}
//4. Click on 'Signup / Login' button
		User_Register reg = new User_Register(driver);
		reg.getSignup().click();
//5. Verify 'New User Signup!' is visible
		WebElement new_user_signup = reg.getNew_user_signup();
		if (new_user_signup.isDisplayed()) {
			System.out.println("New User Signup Verified");
		}
//6. Enter name and email address
		String name = "prrrr R";
		String email = "priiiiyiira@gmail.com";
		reg.getName().sendKeys(name);
		reg.getEmail().sendKeys(email);
//7. Click 'Signup' button
		WebElement create1 = reg.getClicksignup();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", create1);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(create1));
		create1.click();
//8.VERIFY THAT 'ENTER ACCOUNT INFORMATION ' IS VISIBLE
		WebElement Accinformation = reg.getAccinformation();
		if (Accinformation.isDisplayed()) {
			System.out.println("Enter Account Information is visible successfully");
		}
//9.FILL DETAILS: TITLE, NAME, EMAIL, PASSWORD, DATE OF BIRTH
		//SELECT GENDER
		reg.getGender().click();
		//ENTER PASSWORD
		String pswd = "89hju@ER";
		reg.getPswd().sendKeys(pswd);
		//SELECT DAY OF BIRTH
		WebElement dropdays = reg.getDays();
		Select sele = new Select(dropdays);
		sele.selectByVisibleText("27");
		//SELECT MONTH OF BIRTH
		WebElement dropmonth = reg.getMonths();
		Select sele2 = new Select(dropmonth);
		sele2.selectByVisibleText("August");
		//SELECT YEAR OF BIRTH
		WebElement dropyear = reg.getYears();
		Select sele3 = new Select(dropyear);
		sele3.selectByVisibleText("2004");
//10.SELECT CHECKBOX 'SIGNUP FOR NEWSLETTER!'
		reg.getNewsletter().click();
//11.SELECT CHECKBOX 'RECEIVE SPECIAL OFFERS FROM OUR PARTNERS!'
		reg.getSpcloffers().click();
//12.FILL DETAILS: FIRST NAME, LAST NAME, COMPANY, ADDRESS, ADDRESS2, COUNTRY, STATE, CITY, ZIPCODE, MOBILE NUMBER
		//ENTER FIRSTNAME
		String firstname = "Priya";
		reg.getFirst_name().sendKeys(firstname);
		//ENTER LASTNAME
		String lastname = "R";
		reg.getLast_name().sendKeys(lastname);
		//ENTER ADDRESS
		String address = "89/4 north";
		reg.getAddress().sendKeys(address);
		//SELECT COUNTRY
		WebElement dropcountry = reg.getCountry();
		Select sele4 = new Select(dropcountry);
		sele4.selectByVisibleText("India");
		//ENTER STATE
		String state = "tamilnadu";
		reg.getState().sendKeys(state);
		//ENTER CITY
		String city = "coimbatore";
		reg.getCity().sendKeys(city);
		//ENTER ZIP CODE
		String zipcode = "641019";
		reg.getZipcode().sendKeys(zipcode);
		//ENTER MOBILE_NUMBER
		String mobno = "1236547891";
		reg.getMobile_number().sendKeys(mobno);
//13.CLICK CREATE ACCOUNT BUTTON
		WebElement create = reg.getCreAccnt();
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].scrollIntoView(true);", create);
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
//14.VERIFY THAT 'ACCOUNT CREATED!' IS VISIBLE
		WebElement elee = reg.getAcc_created();
		if (elee.isDisplayed()) {
			System.out.println("Account Created! is visible successfully");
		}
//15.CLICK 'CONTINUE' BUTTON
		WebElement con = reg.getCon();
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js4.executeScript("arguments[0].scrollIntoView(true);", con);
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.elementToBeClickable(con));
		con.click();
//16.VERIFY THAT 'LOGGED IN AS USERNAME11' IS VISIBLE
		WebElement ele5 = reg.getLog();
		if (ele5.isDisplayed()) {

			System.out.println("Logged in as showed succesfuly");
		}
//17.CLICK 'DELETE ACCOUNT' BUTTON
		reg.getDel().click();
//18.VERIFY THAT 'ACCOUNT DELETED!' IS VISIBLE AND CLICK 'CONTINUE' BUTTON
		WebElement ele6 = reg.getDeleted();
		if (ele6.isDisplayed()) {
			System.out.println("Account Deleted Successfully");
		}

	}

}


