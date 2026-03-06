package test_cases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class User_Register {
	WebDriver driver;
	@FindBy(partialLinkText = "Signup")
	private WebElement signup;

	@FindBy(xpath = "//h2[text()='New User Signup!']")
	private WebElement new_user_signup;

	@FindBy(name = "name")
	private WebElement name;

	@FindBy(css = "input[data-qa='signup-email']")
	private WebElement email;

	@FindBy(xpath = "//button[text()='Signup']")
	private WebElement clicksignup;

	@FindBy(xpath = "//b[text()='Enter Account Information']")
	private WebElement Accinformation;

	@FindBy(id = "id_gender2")
	private WebElement gender;

	@FindBy(id = "password")
	private WebElement pswd;

	@FindBy(id = "days")
	private WebElement days;

	@FindBy(id = "months")
	private WebElement months;

	@FindBy(id = "years")
	private WebElement years;

	@FindBy(id = "newsletter")
	private WebElement newsletter;

	@FindBy(id = "optin")
	private WebElement spcloffers;

	@FindBy(id = "first_name")
	private WebElement first_name;

	@FindBy(id = "last_name")
	private WebElement last_name;

	@FindBy(id = "address1")
	private WebElement address;

	@FindBy(id = "country")
	private WebElement country;

	@FindBy(id = "state")
	private WebElement state;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "zipcode")
	private WebElement zipcode;

	@FindBy(id = "mobile_number")
	private WebElement mobile_number;

	@FindBy(css ="button[data-qa='create-account']")
	private WebElement creAccnt;
	
	@FindBy(xpath ="//b[text()='Account Created!']")
	private WebElement Acc_created;
	
	@FindBy (linkText="Continue")
	private WebElement con;
	
	@FindBy (partialLinkText="Logged")
	private WebElement log;
	
	@FindBy (partialLinkText="Delete")
	private WebElement Del;
	
	@FindBy (xpath="//b[text()='Account Deleted!']")
	private WebElement Deleted;
	
	public User_Register(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getSignup() {
		return signup;
	}

	public WebElement getNew_user_signup() {
		return new_user_signup;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getClicksignup() {
		return clicksignup;
	}

	public WebElement getAccinformation() {
		return Accinformation;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPswd() {
		return pswd;
	}

	public WebElement getDays() {
		return days;
	}

	public WebElement getMonths() {
		return months;
	}

	public WebElement getYears() {
		return years;
	}

	public WebElement getNewsletter() {
		return newsletter;
	}

	public WebElement getSpcloffers() {
		return spcloffers;
	}

	public WebElement getFirst_name() {
		return first_name;
	}

	public WebElement getLast_name() {
		return last_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getMobile_number() {
		return mobile_number;
	}

	public WebElement getCreAccnt() {
		return creAccnt;
	}

	public WebElement getAcc_created() {
		return Acc_created;
	}

	public WebElement getCon() {
		return con;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getDel() {
		return Del;
	}

	public WebElement getDeleted() {
		return Deleted;
	}

	
}

