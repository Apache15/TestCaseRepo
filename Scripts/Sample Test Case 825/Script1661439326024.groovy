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

WebUI.navigateToUrl('https://testsage-walker.dev-connectboosterportal.com/platform/login')

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Enter Email_mat-input-0'), 'blake.engrav@bngholdingsinc.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), 'p4y+y39Ir5M+OEhtE99IdA==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Sign In/input_Please enter valid email_mat-input-1'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Overview/path'))

WebUI.click(findTestObject('Object Repository/Page_Overview/button_Customers'))

WebUI.click(findTestObject('Object Repository/Page_Customers/a_company that REALLY loves invoices'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_MORE'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_Pay'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_Wallet_mat-select-placeholder mat-sele_4fa54e'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_Visa hunned (9428)'))

WebUI.setText(findTestObject('Object Repository/Page_Customers Details/input_Balance 91.00_mat-input-9'), '3')

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_Next'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_Confirm'))

WebUI.click(findTestObject('Object Repository/Page_Customers Details/span_Close'))

WebUI.closeBrowser()

