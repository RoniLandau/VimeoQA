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

//WebUI.openBrowser('')

//navigate to chosen video
WebUI.navigateToUrl('https://vimeo.com/' + GlobalVariable.video_id2)

//focus on the window
WebUI.focus(findTestObject('pageTitleObject/pageTitleCapture/div_Menu                                   _11ec99'))

//get text of the likes and views
String likes = WebUI.getText(findTestObject('Object Repository/objectLikesViews/Page_YONA on Vimeo/span_3,530'))
String views = WebUI.getText(findTestObject('Object Repository/objectLikesViews/Page_YONA on Vimeo/span_202K'))

//save as Test case variable
likes_number = likes;

//save as global variable
GlobalVariable.views_num = views;

//print them
println(likes_number);
println(GlobalVariable.views_num);

WebUI.closeBrowser()

