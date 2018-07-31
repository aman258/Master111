#My first feature file
Feature: Login functionality
Scenario: Login valid user
     Given I am on the login page
     When I give Tomsmith and SuperSecretPassword!
     Then I should be login
