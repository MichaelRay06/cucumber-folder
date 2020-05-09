Feature: verifying search module of a Car Guruji site using scrnario outline 
 

@FirstChromeRunner 
Scenario: verify produt search using FireFox Driver
Given  I am on Carguruji site on"chrome" 
Then  I coud vrify the page tile 
When  I logged in the site with user name and password 
Then  I verify my account title text as "ACCOUNT" 
And  I search for desired product as "blouse" 
Then  I click to make product search 
Then  I verifyed the serched product 


@SecondChromeRunner 
Scenario: test 
Given  I am on Carguruji site on"chrome" 
Then  I coud vrify the page tile 
When  I logged in the site with user name and password 
Then  I click on whish list link 
And  I named my whish item 
And  I clicked on save button 
Then  I verified my saved list item 
Then  I deleted the saved list item 
