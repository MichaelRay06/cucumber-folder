Feature: verifying search module of a Car Guruji site using multiple browser 



@MutipleRunner 
Scenario Outline: verify produt search using senario outline 

	Given I navigate to Carguruji site on "<browserName>" 
	Then I verified the page tile as "<pageTitle>" 
	When I logged in the site "<email>" password as "<password>" 
	Then I verify my  account text title "<myAccount>" 
	And I search for the wanted product  "<productName>"  
	Then I could verifyed the serched product "<vrifyProduct>" 
	
	Examples: 
	
		|browserName    |pageTitle                      |email                     |password           |myAccount                |productName |vrifyProduct|
		|chrome         |Contact us - CarGuruji Shop    |bfatogun@yahoo.com        |sonsofgod          |ACCOUNT                  |blouse      |BLOUSE|
		|chrome         |Contact us - CarGuruji Shop    |bfatogun@yahoo.com        |sonsofgod          |ACCOUNT                  |blouse      |BLOUSE|
