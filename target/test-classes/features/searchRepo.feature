Feature: Search repositories on GitHub

  #1
  @test1
  Scenario: Search textbox is present
    Given I am on GitHub homepage
    Then searchBox should be visible on GitHub homepage

  #2
  @test1
  Scenario: Search textbox should have placeholder
    Given I am on GitHub homepage
    When I click on search textbox
    And place holder should be "Search GitHub"

  #3
  @test1
  Scenario: Check search textbox to work with Enter key
    Given I am on GitHub homepage
    When I click on search textbox
    And I enter "repositories" and hit Enter key
    Then I should see results page

  #4
  @test1
  Scenario: Search results should be relevant to search keyword
    Given I am on GitHub homepage
    When I click on search textbox
    And I enter "repositories" and hit Enter key
    Then i should see results for "repositories"

  #5
  @test1
  Scenario: Search results number of records for page
    Given I am on GitHub homepage
    When I click on search textbox
    And I enter "repositories" and hit Enter key
    Then i should see 10 results per page
 
 
  #6  
  @test1
  Scenario: Sort the Search results
    Given I am on GitHub homepage
    When I click on search textbox
    And I enter "repositories" and hit Enter key
    When i sort results by "Most stars"
    Then the resultspage should display "Most stars" result
