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

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/button_Add New Contact'))

WebUI.delay(2)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Contact Type'), 'Invoicing')

WebUI.sendKeys(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Contact Type'), Keys.chord(Keys.ENTER))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Contacts Name'), 'AutomationTest2')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Address Name'), 'AutomationAddress')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Address Line'), 'ATLine1')

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Address Line 2'), 'ATLine2')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/CountryDropdown'))

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/div_United States(AddNewContact)'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/ZipCodeDropdown'))

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/div_35007(AddNewContact)'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/AddNewContact/TimeZone'), 'Central Standard Time', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Contact Email'), 'ATNexterous@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/AddNewContact/Mobile_number'), '1112223333')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/SitesCheckbox'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/button_Save(AddNewContact)'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/AddNewContact/button_Yes(AddNewContact)'))

