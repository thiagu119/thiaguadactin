$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/LoginPageAdactinApp.feature");
formatter.feature({
  "name": "Verify Adactin Hotel App Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "As a User i Want to Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction Home Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Sathish123",
        "Test123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a User i Want to Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_Adaction_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters \"Sathish123\" and \"Test123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_Enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.click_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "As a User i Want to search the hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction Search Hotel Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enters \"\u003clocation\u003e\" and \"\u003chotel\u003e\" and \"\u003croomtype\u003e\" and \"\u003croomnos\u003e\"  and \"\u003cAdultsperRoom\u003e\" and \"\u003cChildrenperRoom\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the Submit button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "location",
        "hotel",
        "roomtype",
        "roomnos",
        "NumberofRooms",
        "AdultsperRoom",
        "ChildrenperRoom"
      ]
    },
    {
      "cells": [
        "Sydney",
        "Hotel Sunshine",
        "Double",
        "2 - Two",
        "3 - Three",
        "2 - Two",
        "3 - Three"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a User i Want to search the hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction Search Hotel Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_Adaction_Search_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters \"Sydney\" and \"Hotel Sunshine\" and \"Double\" and \"2 - Two\"  and \"2 - Two\" and \"3 - Three\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_Enters_and_and_and_and_and(String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.click_the_Submit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a User i Want to search the hotel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction Select Hotel Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_Adaction_Select_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click the radio button",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_Click_the_radio_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Continue button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.click_the_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "As a User i Want to Book the Hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction Book Hotel Page",
  "keyword": "Given "
});
formatter.step({
  "name": "User Enters \"\u003cfirstname\u003e\" and \"\u003clastname\u003e\" and \"\u003caddress\u003e\" and \"\u003cccnum\u003e\" and \"\u003ccctype\u003e\" and \"\u003cccexpmonth\u003e\" and \"\u003ccc_exp_year\u003e\" and \"\u003ccvv\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Click the Submit button1",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "address",
        "ccnum",
        "cctype",
        "ccexpmonth",
        "cc_exp_year",
        "cvv"
      ]
    },
    {
      "cells": [
        "Thiagarajan",
        "Saminathan",
        "no 44 TamilSangam Road Madurai",
        "1234567891234567",
        "American Express",
        "September",
        "2022",
        "123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a User i Want to Book the Hotel",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction Book Hotel Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_Adaction_Book_Hotel_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Enters \"Thiagarajan\" and \"Saminathan\" and \"no 44 TamilSangam Road Madurai\" and \"1234567891234567\" and \"American Express\" and \"September\" and \"2022\" and \"123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_Enters_and_and_and_and_and_and_and(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Submit button1",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.click_the_Submit_button_Book()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "As a User i Want to confirm my booking",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User is on Adaction confirmation Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_Adaction_confirmation_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User gets his order no",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.user_gets_his_order_no()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the finalconfirmation button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.click_the_finalconfirmation_button()"
});
formatter.result({
  "status": "passed"
});
});