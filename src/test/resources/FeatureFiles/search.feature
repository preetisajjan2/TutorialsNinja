Feature: Search functinality scenarios

	@Search @One
	Scenario: Verify whether the User is able to Search
	  Given I launch the application
	  Then I search phone name "phone"
	  Then I click on search button
	 # When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
     #Then I should see that the User is able to successfully login 
      
  @Display @Two
  Scenario: Verify whether the User is able to see the Display
  	Given I launch the application
  	Then I click on dispaly
  	Then I click on Mac
   