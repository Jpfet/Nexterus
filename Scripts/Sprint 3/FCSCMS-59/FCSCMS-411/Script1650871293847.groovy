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

WebUI.click(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/User Account Management'))

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Email'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Action'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Address'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_City'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Country'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Created On'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Deactivate'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Edit icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Extension'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Last Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Last Updated By'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Last Updated On'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Locked icon'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Mobile'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Password Change Date'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Phone'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Privilege Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Requires Password Change'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Reset Password'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_State'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_User Access Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_User Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_User Login Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_User Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_User Status'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Sprint 3/FCSCMS-59/FCSCMS-411/Table Header_Zip Code'), FailureHandling.STOP_ON_FAILURE)

