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

WebUI.navigateToUrl('https://vimeo.com/527079690')

//WebUI.click(findTestObject('Object Repository/try fix bug/Page_YONA on Vimeo/Page_SEAWOLF on Vimeo/div_Eli Cohen15 seconds agonice video'))
//
//WebUI.click(findTestObject('Object Repository/try fix bug/Page_YONA on Vimeo/Page_SEAWOLF on Vimeo/div_Eli Cohen15 seconds agonice video'))
//
//WebUI.click(findTestObject('Object Repository/try fix bug/Page_YONA on Vimeo/Page_SEAWOLF on Vimeo/div_Eli Cohen15 seconds agonice video'))
//
//WebUI.click(findTestObject('Object Repository/try fix bug/Page_YONA on Vimeo/Page_SEAWOLF on Vimeo/p_nice video'))
//
//WebUI.click(findTestObject('Object Repository/try fix bug/Page_YONA on Vimeo/Page_SEAWOLF on Vimeo/img_Reply_sc-ccSCjj hVgMzj'))
//
//WebUI.click(findTestObject('Object Repository/try fix bug/Page_YONA on Vimeo/Page_SEAWOLF on Vimeo/a_Eli Cohen'))

//String comment = WebUI.getText(findTestObject('dynamicComment', [('comment_id') : GlobalVariable.comment_id]))
String comment = WebUI.getText(findTestObject('Object Repository/try fix bug/Page_YONA on Vimeo/Page_SEAWOLF on Vimeo/a_Eli Cohen'))

//String section_comments1 = WebUI.getText(findTestObject('Object Repository/recorded objects2.1/Page_FOX on Vimeo/section_5 CommentsGabriel H FermanelliPRO5 _fb57c4'))
//String section_comments2 = WebUI.getText(findTestObject('catching1/Page_Explore on Vimeo/section_2 Comments 6 years agoReplyEli Cohen2 hours agonice videoReplyAdd a new comment'))

println(comment)
/* comment_text = (comment.split('\n')[1]) */

//println(comment_text)

WebUI.closeBrowser()

