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

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-407,462/User Account Management'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Advanced Search button'))

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/User Login Name field'), 'anonymous')

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/User Name field'), 'Anon User')

WebUI.selectOptionByLabel(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Privelege Group Dropdown'), 'Values Reader', 
    false)

WebUI.selectOptionByLabel(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/User Group Dropdown'), 'Admin User Group', 
    false)

WebUI.selectOptionByLabel(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/User Status Dropdown'), 'Active', false)

WebUI.selectOptionByLabel(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/User access status dropdown'), 'Unlocked', 
    false)

WebUI.selectOptionByLabel(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Require Password Change Dropdown'), 'No', false)

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Email field'), 'anon@anonymous.org')

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/City Field'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/City_Alabaster'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Zip Code field'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Zip Code_35007'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/button_Search'))

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/search result - anon user'))

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/search result- anonymous'))

WebUI.delay(2)

WebUI.verifyElementNotVisible(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Search result_Inactive'))

WebUI.verifyElementNotVisible(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-408, 409/Search result_System Administrator'))

WebUI.delay(2)

