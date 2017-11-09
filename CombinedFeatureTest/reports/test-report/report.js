$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("WriteAFile.feature");
formatter.feature({
  "line": 1,
  "name": "Write a file",
  "description": "",
  "id": "write-a-file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "write-a-file;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@fileWrite"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "send \"\u003cnum1\u003e\" and \"\u003cnum2\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "find \"\u003csum\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "write the values and result in a csv file",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "write-a-file;;",
  "rows": [
    {
      "cells": [
        "num1",
        "num2",
        "sum"
      ],
      "line": 10,
      "id": "write-a-file;;;1"
    },
    {
      "cells": [
        "2",
        "2",
        "4"
      ],
      "line": 11,
      "id": "write-a-file;;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "write-a-file;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@fileWrite"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "send \"2\" and \"2\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "find \"4\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "write the values and result in a csv file",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    },
    {
      "val": "2",
      "offset": 14
    }
  ],
  "location": "FileWrite.send_and(String,String)"
});
formatter.result({
  "duration": 110575006,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 6
    }
  ],
  "location": "FileWrite.find(String)"
});
formatter.result({
  "duration": 54397,
  "status": "passed"
});
formatter.match({
  "location": "FileWrite.write_the_values_and_result_in_a_csv_file()"
});
formatter.result({
  "duration": 1068447,
  "status": "passed"
});
});