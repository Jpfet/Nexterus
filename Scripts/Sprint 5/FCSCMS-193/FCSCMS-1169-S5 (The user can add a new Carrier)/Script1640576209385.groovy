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

WebUI.verifyElementVisible(findTestObject('Admin/Sprint 5/Clients/Carriers/CarriersDashboard'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/button_Add New Association'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/CarrierSCAC'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/div_ALLV(SCAC)'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/SiteCode'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/div_TestSite(SiteCode)'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/ContractEffectiveDate'), '01/20/2022')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/ContractExpirationDate'), '01/05/2024')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/Audit(Manual)'))

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/Pricing'), 'Nexterus', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/ClientBOL'), 'Yes', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/Broker'), 'Yes', false)

WebUI.delay(1)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/Currency'), 'USD', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/Default Rule'), 'Automatio Sample for Carriers')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/button_Save'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Carriers/AddNewAssociation/button_Yes(Association)'))

WebUI.delay(3)

