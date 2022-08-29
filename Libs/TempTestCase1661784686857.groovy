import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner
import com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner
import com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.windows.keyword.contribution.WindowsDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.testng.keyword.internal.TestNGDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\BLAKE~1.ENG\\AppData\\Local\\Temp\\Katalon\\20220829_095126\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runWSVerificationScript(new TestCaseBinding('',[:]), 'import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI\nimport com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile\nimport com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW\nimport com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS\nimport com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows\nimport static com.kms.katalon.core.testobject.ObjectRepository.findTestObject\nimport static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject\nimport static com.kms.katalon.core.testdata.TestDataFactory.findTestData\nimport static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase\nimport static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint\nimport com.kms.katalon.core.model.FailureHandling as FailureHandling\nimport com.kms.katalon.core.testcase.TestCase as TestCase\nimport com.kms.katalon.core.testdata.TestData as TestData\nimport com.kms.katalon.core.testobject.TestObject as TestObject\nimport com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint\nimport internal.GlobalVariable as GlobalVariable\nimport org.openqa.selenium.Keys as Keys\n\nWebUI.openBrowser(\'\')\n\nWebUI.navigateToUrl(\'https://testsage-walker.dev-connectboosterportal.com/platform/login\')\n\nWebUI.setText(findTestObject(\'Page_Sign In/input_Enter Email_mat-input-0\'), \'blake.engrav@bngholdingsinc.com\')\n\nWebUI.setEncryptedText(findTestObject(\'Page_Sign In/input_Please enter valid email_mat-input-1\'), \'p4y+y39Ir5M+OEhtE99IdA==\')\n\nWebUI.click(findTestObject(\'Page_Sign In/span_Sign In\'))\n\nWebUI.click(findTestObject(\'Page_Overview/button_Logout_mat-focus-indicator headerLef_5ac3dc\'))\n\nWebUI.click(findTestObject(\'Page_Overview/button_Customers\'))\n\nWebUI.click(findTestObject(\'Page_Customers/a_company that REALLY loves invoices\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/td_INV-002544\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/button_Pay\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/span_Wallet_mat-select-placeholder mat-sele_4fa54e\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/span_Visa hunned (9428)\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/div_Visa hunned (9428)\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/span_test (1111)\'))\n\nWebUI.setText(findTestObject(\'Page_Customers Details/input_Balance 100.00_mat-input-9\'), \'1\')\n\nWebUI.click(findTestObject(\'Page_Customers Details/button_Next\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/button_Confirm\'))\n\nWebUI.click(findTestObject(\'Page_Customers Details/div_Error Issuer Declined\'))\n\nWebUI.closeBrowser()\n\n', FailureHandling.STOP_ON_FAILURE, true)

