$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/FeatureFile/a.feature");
formatter.feature({
  "line": 2,
  "name": "Registered User and Guest User can buy product.",
  "description": "",
  "id": "registered-user-and-guest-user-can-buy-product.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@NopCommerce"
    }
  ]
});
formatter.before({
  "duration": 12664304000,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Registered User can buy any product",
  "description": "",
  "id": "registered-user-and-guest-user-can-buy-product.;registered-user-can-buy-any-product",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@test1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User should be able to complete registration successfully",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User selects the product",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User fill in the payment details",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should see the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userShouldBeAbleToCompleteRegistrationSuccessfully()"
});
formatter.result({
  "duration": 18168788200,
  "error_message": "org.openqa.selenium.NoSuchElementException: Cannot locate an element using xpath\u003d//div[@class\u003d\"result\"]\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JT1KMEB\u0027, ip: \u0027192.168.1.64\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_212\u0027\nDriver info: driver.version: RemoteWebDriver\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:327)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat Sept2020.UtilsPage.extractText(UtilsPage.java:88)\r\n\tat Sept2020.RegisterPage.verifyUserIsRegistered(RegisterPage.java:34)\r\n\tat Sept2020.MyStepdefs.userShouldBeAbleToCompleteRegistrationSuccessfully(MyStepdefs.java:24)\r\n\tat ✽.Given User should be able to complete registration successfully(src/test/Resources/FeatureFile/a.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepdefs.userSelectsTheProduct()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userFillInThePaymentDetails()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepdefs.userShouldSeeTheConfirmationMessage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 41843300,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d85.0.4183.83)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-JT1KMEB\u0027, ip: \u0027192.168.1.64\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_212\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 85.0.4183.83, chrome: {chromedriverVersion: 85.0.4183.87 (cd6713ebf92fa..., userDataDir: C:\\Users\\Bhavya\\AppData\\Loc...}, goog:chromeOptions: {debuggerAddress: localhost:52354}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: ff90b4ea39fe1cb7fabd6a00a522f4ee\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getScreenshotAs(RemoteWebDriver.java:295)\r\n\tat Sept2020.UtilsPage.takeSnapShot(UtilsPage.java:178)\r\n\tat Sept2020.Hooks.closeBrowser(Hooks.java:31)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.junit.runner.JUnitCore.run(JUnitCore.java:160)\r\n\tat com.intellij.junit4.JUnit4IdeaTestRunner.startRunnerWithArgs(JUnit4IdeaTestRunner.java:68)\r\n\tat com.intellij.rt.execution.junit.IdeaTestRunner$Repeater.startRunnerWithArgs(IdeaTestRunner.java:47)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.prepareStreamsAndStart(JUnitStarter.java:242)\r\n\tat com.intellij.rt.execution.junit.JUnitStarter.main(JUnitStarter.java:70)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 8548476000,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Guest User should Be able to buy product.",
  "description": "",
  "id": "registered-user-and-guest-user-can-buy-product.;guest-user-should-be-able-to-buy-product.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@test2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User selects the product",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "click continue as guest.",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User fill in the payment details with name",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User should see the confirmation message",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.userSelectsTheProduct()"
});
formatter.result({
  "duration": 12052038800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.clickContinueAsGuest()"
});
formatter.result({
  "duration": 3434889200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userFillInThePaymentDetailsWithName()"
});
formatter.result({
  "duration": 8805913100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.userShouldSeeTheConfirmationMessage()"
});
formatter.result({
  "duration": 100376000,
  "status": "passed"
});
formatter.after({
  "duration": 770381300,
  "status": "passed"
});
});