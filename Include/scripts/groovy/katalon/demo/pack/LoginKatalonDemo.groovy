package katalon.demo.pack
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class LoginKatalonDemo {
	@Given("User is on katalon demo home page")
	def on_katalon_demo_home_page() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')
	}

	@And("User clicks on make appointment button")
	def clicks_on_make_appointment_button() {
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/a_Make Appointment'))
	}

	@When("User enters (.*) and (.*)")
	def enters_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Username_username'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_CURA Healthcare Service/input_Password_password'), password)
	}

	@And("User clicks on login button")
	def clicks_on_login_button() {
		WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/button_Login'))
	}

	@Then("User verifies login is successful")
	def verifies_login_successful() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/h2_Make Appointment'))
		println "VALID CREDENTAILS. LOGIN SUCCESSFUL."
	}

	@Then("User verifies login is unsuccessful")
	def verifies_login_unsuccessful() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_CURA Healthcare Service/p_Login failed Please ensure the username and password are valid'))
		println "INVALID CREDENTIALS. LOGIN UNSUCCESSFUL."
	}
	
	@Then("User closes the browser")
	def closes_browser() {
		WebUI.closeBrowser()
	}
}