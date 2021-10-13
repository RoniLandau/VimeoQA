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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vimeo.com/')

WebUI.click(findTestObject('recorded objects1/Page_Vimeo  The worlds only all-in-one vide_2822c6/svg'))

WebUI.setText(findTestObject('recorded objects1/Page_Search on Vimeo/input_Custom_q'), GlobalVariable.video_id)

WebUI.click(findTestObject('recorded objects1/Page_Search on Vimeo/input_Custom_btn btn_lg glowButton'))

String section_comments = WebUI.getText(findTestObject('catching1/Page_Explore on Vimeo/section_2 Comments 6 years agoReplyEli Cohen2 hours agonice videoReplyAdd a new comment'))
println(section_comments)

WebUI.closeBrowser()

