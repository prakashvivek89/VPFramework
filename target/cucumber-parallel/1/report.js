$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Vivek/Automation/VPFramework/src/test/resources/features/ClientScenarios.feature");
formatter.feature({
  "line": 2,
  "name": "Client functionality",
  "description": "",
  "id": "client-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@client"
    }
  ]
});
formatter.before({
  "duration": 8522945972,
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
formatter.step({
  "line": 6,
  "name": "Use logs in with valid credentials",
  "rows": [
    {
      "cells": [
        "sutapa",
        "Testing@11"
      ],
      "line": 7
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "NavigationSteps.user_is_on_SSP_adviser_portal()"
});
formatter.result({
  "duration": 1142480797,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.use_logs_in_with_valid_credentials_background(DataTable)"
});
formatter.result({
  "duration": 7882481734,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Client Creation - Personal Client",
  "description": "",
  "id": "client-functionality;client-creation---personal-client",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User is on \"Personal Client\" creation page",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Personal Client",
      "offset": 12
    }
  ],
  "location": "ClientSteps.user_is_on_personal_client_creation_page(String)"
});
formatter.result({
  "duration": 6371781719,
  "status": "passed"
});
formatter.after({
  "duration": 96561,
  "status": "passed"
});
});