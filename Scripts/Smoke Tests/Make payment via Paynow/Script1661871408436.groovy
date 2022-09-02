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

WebUI.navigateToUrl('https://test-automation-do-not-use.dev-connectboosterportal.com/platform/paynow/invoice')

WebUI.setText(findTestObject('Object Repository/Page_Invoice/input_Pay Invoice_mat-input-0'), 'test@automation.com')

WebUI.setText(findTestObject('Object Repository/Page_Invoice/input_Enter correct user address email_mat-input-1'), 'INV-002647')

WebUI.setText(findTestObject('Object Repository/Page_Invoice/input__mat-input-2'), '1')

WebUI.click(findTestObject('Object Repository/Page_Invoice/button_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_Payment Method_mat-input-10'), 'Test Card')

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_Name on Card_mat-input-11'), '4111 1102 0800 9428')

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_Card Number_mat-input-12'), '123')

WebUI.click(findTestObject('Object Repository/Page_Billing/span_CVV_mat-select-placeholder mat-select-_65cec5'))

WebUI.click(findTestObject('Object Repository/Page_Billing/span_1 - Jan'))

WebUI.click(findTestObject('Object Repository/Page_Billing/div_Expiration Year'))

WebUI.click(findTestObject('Object Repository/Page_Billing/span_2037'))

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_Billing Address_mat-input-3'), 'test@automation.com')

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_Email Address_mat-input-4'), 'Address')

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_Address Line 2 (optional)_mat-input-6'), 'Fargo')

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_City_mat-input-7'), 'ND')

WebUI.setText(findTestObject('Object Repository/Page_Billing/input_State_mat-input-8'), '58102')

WebUI.click(findTestObject('Object Repository/Page_Billing/app-billing_Payment Information Payment Met_5cd83b'))

WebUI.click(findTestObject('Object Repository/Page_Billing/button_CONTINUE'))

WebUI.click(findTestObject('Object Repository/Page_Confirm/button_PAY 1.00'))

WebUI.click(findTestObject('Object Repository/Page_Complete/mat-card-content_Thank you for your payment_a350fe'))

WebUI.closeBrowser()

