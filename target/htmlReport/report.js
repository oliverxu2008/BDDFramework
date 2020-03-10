$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("sample.feature");
formatter.feature({
  "line": 1,
  "name": "Search and place order for Vegetables",
  "description": "",
  "id": "search-and-place-order-for-vegetables",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Select items and place an order",
  "description": "",
  "id": "search-and-place-order-for-vegetables;select-items-and-place-an-order",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User searches \u003cName\u003e Vegetable",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User sets \u003cKilogram\u003e Kg",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks increase to add one Kg",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks increase to add one Kg",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks decrease to remove one Kg",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks ADD TO CART",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks PROCEED TO CHECKOUT",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters promotion code \u003cPromotionCode\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks Place Order",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User selects country \u003cCountry\u003e",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User ticks Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks Proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User was navigated to final confirmation page with text \"your order has been placed successfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User was navigated to Greencart Landing page",
  "keyword": "And "
});
formatter.examples({
  "line": 22,
  "name": "",
  "description": "",
  "id": "search-and-place-order-for-vegetables;select-items-and-place-an-order;",
  "rows": [
    {
      "cells": [
        "Name",
        "Kilogram",
        "PromotionCode",
        "Country"
      ],
      "line": 23,
      "id": "search-and-place-order-for-vegetables;select-items-and-place-an-order;;1"
    },
    {
      "cells": [
        "Cucumber",
        "5",
        "123456",
        "Australia"
      ],
      "line": 24,
      "id": "search-and-place-order-for-vegetables;select-items-and-place-an-order;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 24,
  "name": "Select items and place an order",
  "description": "",
  "id": "search-and-place-order-for-vegetables;select-items-and-place-an-order;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Greencart Landing page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User searches Cucumber Vegetable",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User sets 5 Kg",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicks increase to add one Kg",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User clicks increase to add one Kg",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User clicks decrease to remove one Kg",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User clicks ADD TO CART",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User clicks shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User clicks PROCEED TO CHECKOUT",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters promotion code 123456",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User clicks Place Order",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User selects country Australia",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User ticks Terms and Conditions",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks Proceed button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User was navigated to final confirmation page with text \"your order has been placed successfully\"",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User was navigated to Greencart Landing page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.user_is_on_Greencart_Landing_page()"
});
formatter.result({
  "duration": 13091130800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cucumber",
      "offset": 14
    }
  ],
  "location": "stepDefinitions.user_searches_vegetable(String)"
});
formatter.result({
  "duration": 46304300,
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MEL-003924\u0027, ip: \u0027192.168.99.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\oxu\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:1423}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 921d63b1f71ca3228cfb9b89362c160b\n*** Element info: {Using\u003dxpath, value\u003d//input[@class\u003d\u0027search-keyword\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pageObjects.HomePage.getSearchBox(HomePage.java:20)\r\n\tat stepDefinitions.stepDefinitions.user_searches_vegetable(stepDefinitions.java:103)\r\n\tat ✽.And User searches Cucumber Vegetable(sample.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 10
    }
  ],
  "location": "stepDefinitions.user_sets_kg(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_increase_to_add_one_kg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_increase_to_add_one_kg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_decrease_to_remove_one_kg()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_add_to_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_shopping_cart()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_proceed_to_checkout()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 27
    }
  ],
  "location": "stepDefinitions.user_enters_promotion_code(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_place_order()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Australia",
      "offset": 21
    }
  ],
  "location": "stepDefinitions.user_selects_country(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_ticks_terms_and_conditions()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepDefinitions.user_clicks_proceed_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({
  "location": "stepDefinitions.user_was_navigated_to_greencart_landing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 4009951400,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d79.0.3945.130)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027MEL-003924\u0027, ip: \u0027192.168.99.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\oxu\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:1423}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 921d63b1f71ca3228cfb9b89362c160b\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.close(RemoteWebDriver.java:442)\r\n\tat stepDefinitions.Hooks.Aftervaldiation(Hooks.java:22)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:102)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ExamplesRunner.run(ExamplesRunner.java:59)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:128)\r\n\tat org.junit.runners.Suite.runChild(Suite.java:27)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.ScenarioOutlineRunner.run(ScenarioOutlineRunner.java:53)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\r\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:95)\r\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:38)\r\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:290)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288)\r\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:58)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:363)\r\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:100)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:89)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:41)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:541)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:763)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:463)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:209)\r\n",
  "status": "failed"
});
});