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
import org.openqa.selenium.WebElement as WebElement

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vimeo.com/')

WebUI.click(findTestObject('Object Repository/recorded objects2.1/Page_Vimeo  The worlds only all-in-one vide_2822c6/a_Log in'))

WebUI.setText(findTestObject('Object Repository/recorded objects2.1/Page_Vimeo  The worlds only all-in-one vide_2822c6/input_Log in to Vimeo_email'), 
    'ronyland@post.bgu.ac.il')

WebUI.setEncryptedText(findTestObject('Object Repository/recorded objects2.1/Page_Vimeo  The worlds only all-in-one vide_2822c6/input_Log in to Vimeo_password'), 
    '3JtwHyzuAJdJUxaSbWvCLQ==')

WebUI.click(findTestObject('Object Repository/recorded objects2.1/Page_Vimeo  The worlds only all-in-one vide_2822c6/input_A security code has been sent to your_7a5454'))

WebUI.delay(5)

WebUI.navigateToUrl('https://vimeo.com/' + GlobalVariable.video_id)

//WebUI.delay(5)
WebUI.focus(findTestObject('pageTitleObject/pageTitleCapture/div_Menu                                   _11ec99'))

//WebUI.scrollToPosition(9999999, 9999999)
//WebUI.delay(10)
//String comment = WebUI.getText(findTestObject('dynamicComment'))
String comment = WebUI.getText(findTestObject('dynamicComment', [('comment_id') : GlobalVariable.comment_id]))

//String section_comments1 = WebUI.getText(findTestObject('Object Repository/recorded objects2.1/Page_FOX on Vimeo/section_5 CommentsGabriel H FermanelliPRO5 _fb57c4'))

//println(comment)

comment_text = (comment.split('\n')[1])

//
println(comment_text)

WebUI.verifyMatch(comment_text, GlobalVariable.comment_text, false)

