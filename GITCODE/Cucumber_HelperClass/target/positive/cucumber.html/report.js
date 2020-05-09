$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("vrifySearch.feature");
formatter.feature({
  "line": 1,
  "name": "verifying search module of a Car Guruji site",
  "description": "",
  "id": "verifying-search-module-of-a-car-guruji-site",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "verify produt search",
  "description": "",
  "id": "verifying-search-module-of-a-car-guruji-site;verify-produt-search",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@selenium"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I am on Carguruji site",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I coud vrify the page tile as \"\u003cpageTitle\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I logged in the site with user name as \"\u003cemailAddress\u003e\" password as \"\u003cpasswordAddress\u003e\"",
  "keyword": "When "
});
formatter.match({
  "location": "SearchStepDefTest.i_am_on_Carguruji_site()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cpageTitle\u003e",
      "offset": 31
    }
  ],
  "location": "SearchStepDefTest.i_coud_vrify_the_page_tile_as(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cemailAddress\u003e",
      "offset": 40
    },
    {
      "val": "\u003cpasswordAddress\u003e",
      "offset": 69
    }
  ],
  "location": "SearchStepDefTest.i_logged_in_the_site_with_user_name_as_password_as(String,String)"
});
formatter.result({
  "status": "skipped"
});
});