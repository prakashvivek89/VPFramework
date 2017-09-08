$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Vivek/Automation/VPFramework/src/test/resources/features/loginScenarios.feature");
formatter.feature({
  "line": 2,
  "name": "login functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.scenarioOutline({
  "line": 7,
  "name": "Login with a valid user",
  "description": "",
  "id": "login-functionality;login-with-a-valid-user",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 8,
  "name": "User logs in with valid \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Login text should be displayed",
  "keyword": "And "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "login-functionality;login-with-a-valid-user;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login-functionality;login-with-a-valid-user;;1"
    },
    {
      "cells": [
        "vivek",
        "Testing@11"
      ],
      "line": 14,
      "id": "login-functionality;login-with-a-valid-user;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8529880418,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on SSP adviser portal",
  "keyword": "Given "
});
formatter.match({
  "location": "NavigationSteps.user_is_on_SSP_adviser_portal()"
});
formatter.result({
  "duration": 1104267559,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Login with a valid user",
  "description": "",
  "id": "login-functionality;login-with-a-valid-user;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User logs in with valid \"vivek\" and \"Testing@11\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User should be able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Login text should be displayed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "vivek",
      "offset": 25
    },
    {
      "val": "Testing@11",
      "offset": 37
    }
  ],
  "location": "LoginPageSteps.use_logs_in_with_valid_credentials(String,String)"
});
formatter.result({
  "duration": 7796163983,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.user_should_be_able_to_login()"
});
formatter.result({
  "duration": 949886629,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.login_text_should_be_displayed()"
});
formatter.result({
  "duration": 1463536092,
  "status": "passed"
});
formatter.after({
  "duration": 91749,
  "status": "passed"
});
});