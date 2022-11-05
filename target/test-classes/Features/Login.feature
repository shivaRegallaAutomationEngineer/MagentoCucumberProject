Feature: Login Functionality 
Background:
Given User navigates to the application
@testCase01
Scenario: Verify the login functionality for valid Cerdentails

When User enters the valid username and valid password
And User clicks on the login button
Then User Succesfully login into the application 

@testCase02
Scenario Outline: Verify the login functionality for invalid Cerdentails

When User enters the valid "<username>" and valid "<password>"
And User clicks on the login button
Then User should be able to see the "<errorMessage>"

Examples:

|username        |    password     |   errorMessage  |
|shiva@gmail.com| InvalidPasword	 |Invalid login or password.|
|shiva1@gmail.com|	shiva@1234	|Invalid login or password.|
|shiva1@gmail.com|	InvalidPasword	|Invalid login or password.|


