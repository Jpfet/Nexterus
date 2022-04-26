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

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/button_Add New Site'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/SiteCode'), 'Test SiteCode AT')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/SiteName'), 'SiteAutomationTest')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/Description'), 'Test Automation for Site Category')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AccountManager'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/div_AutomationTest'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/Sites/select_SelectUSDEURCAD'), 'USD', false)

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/button_Add Address(Site)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/Address_Type'), 'Billing')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/AddressName'), 'Test Address AT')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/AddressLine1'), 'AD Line 1')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/AddressLine2'), 'AD Line 2')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/CityDropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/CountryDropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/div_United States(Country)'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/ZipCodeDropdown'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/div_35007(ZipCode)'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/TimeZone'), 'Central Standard Time', 
    false)

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/AddNewAddress/button_Yes(AddNewAddress)'))

WebUI.delay(3)

