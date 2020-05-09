Feature: verifying search module of a Car Guruji site



@selenium
Scenario: verify produt search

Given I am on Carguruji site
Then I coud vrify the page tile as "<pageTitle>"
When I logged in the site with user name as "<emailAddress>" password as "<passwordAddress>"