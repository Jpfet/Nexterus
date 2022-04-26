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

WebUI.click(findTestObject('Admin/Sprint 7/FCSCMS-731(NEW)/EditProduct/Edit_Button'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Admin/Sprint 7/FCSCMS-731(NEW)/EditProduct/Product Description'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Admin/Sprint 7/FCSCMS-730(NEW)/AddNewProduct/ProductCode'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Admin/Sprint 7/FCSCMS-730(NEW)/AddNewProduct/ProductClass'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Admin/Sprint 7/FCSCMS-730(NEW)/AddNewProduct/Input_NMFC'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Admin/Sprint 7/FCSCMS-730(NEW)/AddNewProduct/input_UN  NA Number'))

WebUI.delay(1)

WebUI.clearText(findTestObject('Admin/Sprint 7/FCSCMS-730(NEW)/AddNewProduct/HazmatDescription'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 7/FCSCMS-731(NEW)/Modal Buttons/button_Save'))

