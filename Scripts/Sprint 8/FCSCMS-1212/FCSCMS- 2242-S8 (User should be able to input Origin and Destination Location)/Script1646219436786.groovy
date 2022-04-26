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

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/OriginAddressName'), 'AT Test Address')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/OriginAddressLine1'), 'AT Line 1')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/OriginAddressLine2'), 'AT Line 2')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/ZipCode'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/div_35007'))

WebUI.delay(2)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/OriginContactName'), 'Automation Test Contact')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/ContactPhone_Origin'), '1111555555')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/ContactEmail_Origin'), 'automationtest@gmail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/OriginLocation/Mobile_Origin'), '1111555555')

WebUI.delay(3)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/DestinationLocation/Contacts Name'), 'Automation Test Contact')

WebUI.delay(2)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/DestinationLocation/ContactPhone_Destination'), '2222555555')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/DestinationLocation/Contact Email'), 'automationtest2@gmail.com')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 7/FCSCMS-954/DestinationLocation/Mobile_Destination'), '2222555555')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 7/FCSCMS-954/DestinationLocation/button_Continue'))

WebUI.delay(2)

