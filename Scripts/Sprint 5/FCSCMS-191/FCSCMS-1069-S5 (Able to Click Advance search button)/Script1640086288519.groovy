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

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/button_Advanced Search'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/ClientNameNEW'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/StatusDropdownNew'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/AccountManagerNew'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/SalesRepNew'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/Address Line 1 New'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/Address Line 2 New'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/CityDropDownNew'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/StateDropDownNew'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/ZipCodeDropDownNew'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/CountryDropDownNew'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/input_Contact Name_Input_AS_ContactName'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/input_Contact Email_Input_AS_ContactEmail'))

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/AdvanceSearchNEW/input_Contact Phone_Input_AS_ContactPhone'))

