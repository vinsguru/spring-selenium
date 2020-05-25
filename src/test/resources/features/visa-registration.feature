Feature: User visa registration feature

  @visa
  Scenario Outline: I should be able to submit visa form
    Given I am on VISA registration form
    When I select my from country "<fromCountry>" and to country "<toCountry>"
    And I enter my dob as "<dateOfBirth>"
    And I enter my name as "<firstName>" and "<lastName>"
    And I enter my contact details as "<email>" and "<phone>"
    And I enter the comment "<comments>"
    And I submit the form
    Then I should see get the confirmation number

    Examples:
      | fromCountry      | toCountry                   | dateOfBirth | firstName | lastName  | email              | phone          | comments |
      | Isle of Man      | Mali                        | 2011-05-31  | Kraig     | Wiza      | Kraig@nobody.com   | 1-000-884-1373 | comment1 |
      | Lithuania        | Mexico                      | 2001-01-01  | Houston   | Kertzmann | Houston@nobody.com | 284.864.6580   |          |
      | Somalia          | Greece                      | 2004-07-02  | Ruthie    | Stamm     | Ruthie@nobody.com  | 1-209-813-9712 | comment2 |
      | Christmas Island | French Southern Territories | 2019-04-05  | Shonna    | Nolan     | Shonna@nobody.com  | (162) 387-0305 |          |
