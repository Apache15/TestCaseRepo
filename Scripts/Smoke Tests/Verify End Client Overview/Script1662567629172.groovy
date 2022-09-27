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
import java.text.DecimalFormat as DecimalFormat

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.tenantURL)

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Enter Email_mat-input-0'), GlobalVariable.endClientUsername)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), GlobalVariable.endClientPassword)

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), Keys.chord(Keys.ENTER))

WebUI.verifyGreaterThan(Double.parseDouble(WebUI.getText(findTestObject('Object Repository/Page_Dashboard/div_249,979.00')).substring(
            1).split(',').join()), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Dashboard/canvas_Payment History_chartjs-render-monitor'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/span_Payments'))

WebUI.click(findTestObject('Object Repository/Page_Payments/div_Pending'))

WebUI.click(findTestObject('Object Repository/Page_Payments/div_Scheduled'))

WebUI.click(findTestObject('Object Repository/Page_Payments/span_AutoPay'))

WebUI.click(findTestObject('Object Repository/Page_Autopay/button_Service'))

WebUI.click(findTestObject('Page_Autopay/div_No Services for this company'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/button_Invoices'))

WebUI.click(findTestObject('Object Repository/Page_Invoices/button_Open Invoices'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/span_Due Date_mat-checkbox-inner-container _e437c9'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/button_Pay Selected'))

// get the invoice ammount and clean text to make it an integer
double invoiceAmmount = Double.parseDouble(WebUI.getText(findTestObject('Object Repository/Page_Open Invoices/span_249,979.00')).substring(
        1).split(',').join())
// random payment ammount to prevent duplicate payment error
double paymentAmmount = 1.00 + Math.random().trunc(2)

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/div_Select Payment Method'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/span_VISA 100 (9428)'))

WebUI.click(findTestObject('Page_Open Invoices/input_Balance 250,000.00_mat-input-16'))

WebUI.setText(findTestObject('Page_Open Invoices/input_Balance 250,000.00_mat-input-16'), paymentAmmount.toString())

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/button_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/div_Payment Successful'))

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/button_Close'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Page_Open Invoices/td_INV-002647'))

double postPaymentAmmount = Double.parseDouble(WebUI.getText(findTestObject('Object Repository/Page_Open Invoices/div_249,977.50')).substring(
        1).split(',').join())

double expectedAmmount = invoiceAmmount - paymentAmmount

if (expectedAmmount == postPaymentAmmount) {
} else if (expectedAmmount != postPaymentAmmount) {
    KeywordUtil.markFailed('payments didn\'t line up')
}

WebUI.closeBrowser()

