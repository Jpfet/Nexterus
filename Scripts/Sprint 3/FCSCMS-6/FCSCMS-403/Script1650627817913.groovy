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

WebUI.click(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/a_Privilege Group Management'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Activate button(fet automation)'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Activate_Yes button'))

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Status_Active'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Status_Active'), 'Active', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Deactivate button(fet automation)'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Deactivate_Yes button'))

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Status_Inactive'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Sprint 3/FCSCMS-6/FCSCMS-403/Status_Inactive'), 'Inactive', FailureHandling.CONTINUE_ON_FAILURE)

