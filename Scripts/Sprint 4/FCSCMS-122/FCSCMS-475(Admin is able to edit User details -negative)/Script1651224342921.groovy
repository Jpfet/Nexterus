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

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit button_ANONYMOUS USER'))

WebUI.setText(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_User Name'), '')

WebUI.setText(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Email'), '')

WebUI.setText(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Address Line 1'), '')

WebUI.setText(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Address Line 2'), '')

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_City'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_City_Select'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_State'))

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Country'))

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_City'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Zip Code'), FailureHandling.STOP_ON_FAILURE)

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Phone Number_Area code'), '+1', false)

WebUI.setText(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Phone Number field'), '')

WebUI.setText(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Phone Number _Extension'), '')

WebUI.selectOptionByLabel(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Mobile Number_Area Code'), '+1', false)

WebUI.setText(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Mobile Number field'), '')

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_Status Checkbox'))

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_User status_Checkbox_Yes'))

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_User Access Status Checkbox'))

WebUI.click(findTestObject('Admin/Sprint 4/FCSCMS-122/Edit User_User Access status_Yes'))

