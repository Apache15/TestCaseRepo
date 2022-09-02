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

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Logout_mat-focus-indicator headerLef_5ac3dc'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Customers/a_Sun Microsystems - EBC'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/div_Open Invoices'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/button_Open Invoices_mat-focus-indicator ma_e209a1'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/td_INV-002647'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/button_Pay'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/div_Select Payment Method'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/span_VISA 100 (9428)'))

WebUI.setText(findTestObject('Object Repository/Page_Open Invoices/input_Balance 249,999.00_mat-input-9'), '2')

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/button_Confirm'))

WebUI.verifyElementPresent(findTestObject('Page_Open Invoices/div_Payment Successful'), 10)

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/button_Close'))

WebUI.closeBrowser()

