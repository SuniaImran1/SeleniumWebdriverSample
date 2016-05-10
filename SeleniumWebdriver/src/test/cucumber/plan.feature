Feature: gmail

  Scenario: login and logout
    Given I login to the gmail"http://gmail.com"
    When I enter the email address as "sunia.imran@gmail.com" and "Magento123"
    #And i click on inbox
    And I logout

  @gmail
  Scenario: login to gmail and check the starred  emails
    Given I login to the gmail"http://gmail.com"
    When I enter the email address as "sunia.imran@gmail.com" and "Magento123"
    And i click on inbox
    And i check the total numbers of email in the inbox
    And i click on starred emails
    And I click on star
    #And I should have one email in stared
   And I click on stared emails
   # When i click on star
  And I should have the message present as "No starred messages"
    #And I logout
