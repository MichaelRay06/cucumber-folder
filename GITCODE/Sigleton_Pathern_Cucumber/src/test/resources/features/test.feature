Feature: verifying search module of a Car Guruji site




Scenario: verify produt search

Given I am on Carguruji site
When I logged in the site with user name as "<emailAddress>" password as "<passwordAddress>"
Then I verify my  account title text as "<myAccountTitleText>"
And I search for desired product as  "<searchProduct>"
Then I click to make product search
And I clicked on the selected product of the searched result
Then I verifyed the serched product as "<vrifyProduct>"
