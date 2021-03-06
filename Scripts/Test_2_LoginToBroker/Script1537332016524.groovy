import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://20.20.20.48/benefits/login')

WebUI.setText(findTestObject('Object Repository/Page_TeemWurk/input_Please Wait_Username'), 'sysadmin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_TeemWurk/input_Please Wait_Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Page_TeemWurk/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_TeemWurk/i_of_fa fa-angle-double-right'))

WebUI.click(findTestObject('Object Repository/Page_TeemWurk/a_Login'))

WebUI.click(findTestObject('Object Repository/Page_TeemWurk/i_'))

WebUI.closeBrowser()

