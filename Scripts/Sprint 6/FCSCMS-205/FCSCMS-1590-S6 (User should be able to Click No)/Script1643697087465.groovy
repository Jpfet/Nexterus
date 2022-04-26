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

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-205/button_Add New Association'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/div_Carrier SCAC'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/SCAC Code/div_ALLV'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/div_SiteCode'))

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/SiteCode/div_TestSite'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/input_Contract Effective Date'), '02/05/2022')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/input_Contract Expiration Date'), '03/10/2024')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/button_Save'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 6/FCSCMS-205/AddNewAssociation/button_No(Save)'))

WebUI.delay(2)

