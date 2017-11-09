$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateReport.feature");
formatter.feature({
  "line": 1,
  "name": "Create report",
  "description": "",
  "id": "create-report",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "create-report;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@createreport"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to google",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"\u003cnum1\u003e\" and \"\u003cnum2\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "check the \"\u003cresult\u003e\" and define the \"\u003cstate\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "write to csv file",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "create-report;;",
  "rows": [
    {
      "cells": [
        "num1",
        "num2",
        "result",
        "state"
      ],
      "line": 11,
      "id": "create-report;;;1"
    },
    {
      "cells": [
        "1",
        "2",
        "3",
        "true"
      ],
      "line": 12,
      "id": "create-report;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "create-report;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@createreport"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user navigates to google",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters \"1\" and \"2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "check the \"3\" and define the \"true\"",
  "matchedColumns": [
    2,
    3
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "write to csv file",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateReportSteps.user_navigates_to_google()"
});
formatter.result({
  "duration": 2787215895,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    },
    {
      "val": "2",
      "offset": 21
    }
  ],
  "location": "CreateReportSteps.user_enters_and(String,String)"
});
formatter.result({
  "duration": 1106214491,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 11
    },
    {
      "val": "true",
      "offset": 30
    }
  ],
  "location": "CreateReportSteps.check_and_define(String,String)"
});
formatter.result({
  "duration": 159528036,
  "status": "passed"
});
formatter.match({
  "location": "CreateReportSteps.write_to_csv_file()"
});
formatter.result({
  "duration": 20014,
  "status": "passed"
});
});