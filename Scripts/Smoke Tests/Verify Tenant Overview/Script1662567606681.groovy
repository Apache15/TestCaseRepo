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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tenantURL)

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Enter Email_mat-input-0'), GlobalVariable.tenantUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), GlobalVariable.tenantPassword)

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Overview/mat-card_AR by Company Total Balance 249,99_299051'))

WebUI.click(findTestObject('Object Repository/Page_Overview/mat-card_Highest Balances'))

WebUI.click(findTestObject('Object Repository/Page_Overview/mat-card_Synchronization Status Sync  Start_f25f45'))

WebUI.click(findTestObject('Object Repository/Page_Overview/mat-card_Payments Calendar  September 2022 _0807cb'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Logout_mat-focus-indicator headerLef_5ac3dc'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Change Password'))

WebUI.click(findTestObject('Object Repository/Page_Reset Password/button_Logout_mat-focus-indicator headerLef_8384a0'))

WebUI.click(findTestObject('Object Repository/Page_Reset Password/button_Subscriptions'))

WebUI.click(findTestObject('Object Repository/Page_Subscriptions/button_Logout_mat-focus-indicator headerLef_8384a0'))

WebUI.click(findTestObject('Object Repository/Page_Subscriptions/button_Settings'))

WebUI.click(findTestObject('Object Repository/Page_General Settings/button_Logout_mat-focus-indicator headerLef_8384a0'))

WebUI.click(findTestObject('Object Repository/Page_General Settings/button_Reports'))

WebUI.click(findTestObject('Object Repository/Page_Report - Email History/button_Logout_mat-focus-indicator headerLef_8384a0'))

WebUI.click(findTestObject('Object Repository/Page_Report - Email History/button_Overview'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Logout_mat-focus-indicator headerLef_8384a0'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Customers/a_Sun Microsystems - EBC'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/button_MORE'))

double invoiceAmmount = Double.parseDouble(WebUI.getText(findTestObject('Object Repository/Page_Customers Details/div_249,993.54')).substring(
	1).split(',').join())

double paymentAmmount = 1.00 + (Math.random()).trunc(2)

WebUI.click(findTestObject('Object Repository/Page_Customers Details/button_Pay'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/div_Select Payment Method'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_VISA 100 (9428)'))

WebUI.setText(findTestObject('Object Repository/Page_Customers Details/input_Balance 249,993.54_mat-input-34'), paymentAmmount.toString().substring(0,3))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/div_Invoices INV-002674  Due 09-28-2024  Ba_72771b'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/div_Payment Successful'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/button_Close'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/button_MORE'))

double postPaymentAmmount = Double.parseDouble(WebUI.getText(findTestObject('Object Repository/Page_Customers Details/div_249,992.54')).substring(
	1).split(',').join())

double expectedAmmount = invoiceAmmount - paymentAmmount

if (expectedAmmount == postPaymentAmmount) {
} else if (expectedAmmount != postPaymentAmmount) {
KeywordUtil.markFailed('payments didn\'t line up')
}

WebUI.closeBrowser()

