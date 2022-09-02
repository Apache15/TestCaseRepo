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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-automation-do-not-use.dev-connectboosterportal.com/platform/')

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Enter Email_mat-input-0'), 'blake.engrav@bngholdingsinc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), 'p4y+y39Ir5NKue+owstwyA==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Logout_mat-focus-indicator headerLef_5ac3dc'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Settings'))

WebUI.click(findTestObject('Object Repository/Page_General Settings/button_Integrations'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Settings/button_SageIntacct_mat-focus-indicator mat-_f315e5'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Settings/span_Settings'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Settings/button_Test Connection_1'))

WebUI.click(findTestObject('Object Repository/Page_Integrations Settings/div_Test Connection Success Close'))

WebUI.closeBrowser()

