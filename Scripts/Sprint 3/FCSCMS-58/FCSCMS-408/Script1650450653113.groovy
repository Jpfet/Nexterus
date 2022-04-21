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

WebUI.delay(2)

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-407,462/User Account Management'))

WebUI.delay(2)

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/Advanced Search button'))

WebUI.delay(2)

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/User Login Name'), 'anonymous')

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/button_Search'))

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/search result - anon user'))

WebUI.delay(3)

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/button_Clear'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/button_Search'))

WebUI.delay(3)

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/User access status dropdown'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408/Unlocked'))

