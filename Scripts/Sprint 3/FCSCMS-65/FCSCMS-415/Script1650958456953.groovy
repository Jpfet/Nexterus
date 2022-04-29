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

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Add New User'))

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_User Login Name'), 'fet5')

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_User Name'), 'fet5')

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Email'), 'fet5@mailinator.com')

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Address Line 1'), 'Tinago')

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User__Address Line 2'), 'M.Castro')

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Privilege Group'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Privelege Group_Values Reader'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_User Group'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_User Group_Admin User Group'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_City'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_City_Alabaster'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Zip Code'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_ZIP Code_35007'))

WebUI.selectOptionByLabel(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Phone Number_Area code'), '+1', false)

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Phone Number field'), '2027953213')

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Phone Number _Extension'), '00')

WebUI.selectOptionByLabel(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Mobile Number_Area Code'), '+1', false)

WebUI.setText(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Mobile Number field'), '2027953213')

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create User_Save'))

WebUI.click(findTestObject('Sprint 3/FCSCMS-58/FCSCMS-410/Create_User_Confirmation_Yes'))

WebUI.verifyTextPresent('fet5@mailinator.com', false)

