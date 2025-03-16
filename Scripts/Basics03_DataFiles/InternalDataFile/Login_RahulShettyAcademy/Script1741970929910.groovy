import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TestData userData = findTestData('Data Files/TestData01/LoginData')
String expectedWebSite = "RahulShettyAcademy"
String url, username, password

WebUI.openBrowser('')

for (def row=1; row<=userData.getRowNumbers(); row++) {
	if (userData.getValue('website', row) == expectedWebSite) {
		url = userData.getValue('url', row)
		username = userData.getValue('username', row)
		password = userData.getValue('password', row)
		break
	}
}

WebUI.navigateToUrl(url)
WebUI.setText(findTestObject('Object Repository/Page_LoginPage Practise  Rahul Shetty Academy/input_Username_username'), username)
WebUI.setEncryptedText(findTestObject('Object Repository/Page_LoginPage Practise  Rahul Shetty Academy/input_Password_password'), password)
WebUI.click(findTestObject('Object Repository/Page_LoginPage Practise  Rahul Shetty Academy/span_I Agree to the terms and conditions'))
WebUI.click(findTestObject('Object Repository/Page_LoginPage Practise  Rahul Shetty Academy/input_I Agree to the_signin'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_LoginPage Practise  Rahul Shetty Academy/h1_Shop Name'), 0)
WebUI.verifyElementText(findTestObject('Object Repository/Page_LoginPage Practise  Rahul Shetty Academy/h1_Shop Name'), 'Shop Name')
WebUI.closeBrowser()