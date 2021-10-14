# VimeoQA

Hello,
Please read carefully.

Description:

This project includes 3 Test Cases on Vimeo website.
The Cases: (explaining the main tests)
1. UserActions - Connect Vimeo Api, Login as "Eli Cohen" and comment on a specific video. Verify the status code of the call.
2. commentVerify - Using WebUI(simulate UI actions) ,Enter Vimeo website, login to "Eli Cohen" ,navigate to the specific video and verify the text of the comment.
3. LikesViews - Using WebUI , navigate to another video, store the number of likes and views. Verify that the text of the numbers is exist on the page.

Notice:
On every test case there are several test steps, almost on every step there is a simple validation that I didn't mention here but it well documented inside the script.

How to run the tests?

Must install:
Katalon Studio: https://www.katalon.com/download/
Git: https://git-scm.com/download/win

Run the Tests:

Open Katalon Studio.

Inside Katalon Studio:
1. Clone the project from git: on the left you will see "clone git project" press on it and enter on the url "https://github.com/RoniLandau/VimeoQA.git" - no need to authenticate.
2. You may need to update chrome web broswer - press "tools"-> "update web browsers" -> "chrome"
3. Search "VimeoQA" in "TextExplorer" (from the left), it will find you Test Suite with this name, open it.
4. Press the green "Play" button on the upper toolbar (of the right-side of the window). Next to the button there is a small arrow you can choose to run on different browsers.
5. You can see at the bottom the test results. You can see a report on the "reports" folder (on the left-side).


Extras:
1. Changing the specific video you're commenting on:
	Open "profiles"-> "default" , change the global variable "video_id" to the your specific video id (you can find it easily at the end of the url of the specific video)
2. Changing the specific video you're checking the likes and views:
	The same as before but change the global variable "video_id2".
3. The current comment is "Awesome! Thank you."	, if you want to change it: "Object Repository"-> UserAPI -> vimeoComment , enter "HTTP body" tab and change there the text.
