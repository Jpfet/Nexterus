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

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_ of Skids'), '5')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_ of Pieces'), '2')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/PiecesType'), 'Bag', false)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Weight'), '10')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Length'), '10')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Width'), '10')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Height'), '10')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Pounds'), '10')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_NMFC'), '1234')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Product Code'), '1122')

WebUI.delay(1)

WebUI.selectOptionByValue(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/select_Class'), 'AT Test Class', 
    false)

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Product Description'), 'Test Product Description')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Hazmat_Yes'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_UN'), '1233')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Hazmat Description'), 'Automation Test Hazmat')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Hazmat Phone'), '1144225522')

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/input_Contact Name'), 'Test Contact Name')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 8/FCSCMS-952/AddItems(tobeShipped)/button_Add'))

WebUI.delay(3)

