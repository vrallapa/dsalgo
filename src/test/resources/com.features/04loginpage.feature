Feature: User Logins in with credentials

Scenario: The user goes to registration page when register is clicked
 Given The user is in the Sign in page
 When The user clicks on register link on signin page 
 Then The user redirected to Registration page from signin page and title is "Registration"

Scenario Outline: The user is able to signin with registered credential
Given The user is in the Sign in page
When The user enters a valid "<username>" and "<password>"
Then click login button to verify and pagetitle is "NumpyNinja"
And logout of the page
 Examples: 
      | username   | password  |
      | pluton@gmail.com | Nnsdet@115 |
      

      
Scenario Outline: User on login page and login with invalid inputs
Given The user is in the Sign in page
When  The user enter invalid "<username>" and "<password>"
Then click login button to verify and pagetitle is "Login"
Examples: 
      | username | password |
      | user     |  abcdefg |
      |  user1   | passowrd |
      | user3    | password3|

Scenario Outline: User on login page and login with invalid and valid inputs from Excel
Given The user is in the Sign in page
When The user enter sheet "<Sheetname>" and <RowNumber>
Then click login button to verify title of the page "NumpyNinja" 

 Examples: 
      | Sheetname | RowNumber |
      | Sheet1    |         0 |
      | Sheet1    |         1 |
      | Sheet1    |         2 |
      | Sheet1    |         3 |
      
Scenario: Verifying signout link
Given The user is in the Home page with valid  log in "pluto@gmail.com" and "Nnsdet@115"
When The user clicks Sign out

