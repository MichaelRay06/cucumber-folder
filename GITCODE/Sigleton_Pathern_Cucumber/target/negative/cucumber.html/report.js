$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/test.feature");
formatter.feature({
  "name": "verifying search module of a Car Guruji site",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify produt search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I am on Carguruji site",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I logged in the site with user name as \"\u003cemailAddress\u003e\" password as \"\u003cpasswordAddress\u003e\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I verify my  account title text as \"\u003cmyAccountTitleText\u003e\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I search for desired product as  \"\u003csearchProduct\u003e\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I click to make product search",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I clicked on the selected product of the searched result",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I verifyed the serched product as \"\u003cvrifyProduct\u003e\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});