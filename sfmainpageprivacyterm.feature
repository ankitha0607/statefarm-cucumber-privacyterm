
Feature: Statefarm privacy term 
  I will open the statefarm,click on dropdown,select the an option,
  enter the zipcode in textbox, click on the get quote button,
  in the next page, click on the statefarm logo, change tab handling,
  in the new tab, click on the read more option on the privacy term pop-up

  Scenario: Statefarm privacy main page
    Given I am on statefarm website
    When I click on dropdown
    And select an option in dropdown
    And enter the zipcode in text box
    And click on get a quote button
    And I verify the next page is displayed
    And Click on the statefarm logo 
   And I verify I am on statefarm home page
   And I verify that the privacy term pop up is present
   Then I click on the read more option
   And I close the browser
 
    
  
    


