import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.cucumber.keyword.internal.CucumberGlueGenerator

class NewTestListener {
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		CucumberKW.GLUE = ['katalon.demo.pack']
	}
}