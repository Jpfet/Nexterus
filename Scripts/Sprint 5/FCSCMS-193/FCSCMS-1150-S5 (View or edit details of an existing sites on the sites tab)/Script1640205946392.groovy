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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://nexterus-tst.outsystemsenterprise.com/FusionCenter/Login')

WebUI.maximizeWindow()

WebUI.delay(3)

WebUI.setText(findTestObject('Login/Username_Field'), 'admin')

WebUI.delay(1)

WebUI.setText(findTestObject('Login/Password_Field'), 'admin')

WebUI.delay(1)

WebUI.click(findTestObject('Login/BTN_Login'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 5/a_Clients'))

WebUI.delay(1)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/SearchBar_Clients'), 'Smoke Test 3')

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/Site Edit Elements/SearchButton(Clients)'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/Site Edit Elements/EditClient'))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/div_Sites'))

WebUI.delay(1)

WebUI.click(findTestObject('Admin/Sprint 5/Clients/Sites/Site Edit Elements/EditSiteButton'))

WebUI.delay(2)

WebUI.clearText(findTestObject('Admin/Sprint 5/Clients/Sites/SiteCode'))

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/SiteCode'), 'TestSite')

WebUI.delay(1)

WebUI.clearText(findTestObject('Admin/Sprint 5/Clients/Sites/SiteName'))

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/SiteName'), 'SiteforAutomation')

WebUI.delay(1)

WebUI.clearText(findTestObject('Admin/Sprint 5/Clients/Sites/Description'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Admin/Sprint 5/Clients/Sites/Description'), 'Test site for automation')

WebUI.delay(1)

