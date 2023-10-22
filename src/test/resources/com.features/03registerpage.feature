Feature: user registers with username and password
Scenario: The user is presented with error message for empty fields below Username textbox
Given The user opens Register Page
When The user clicks Register button with all fields empty
Then It should display an error "Please fill out this field." below Username textbox

Scenario: The user is presented with error message for empty fields below Password textbox
Given The user opens Register Page
When When The user clicks Register button after entering username with other fields empty
      | username     |
      | Numpy@sdet84_1 |
Then It should display an error "Please fill out this field." below Password textbox

Scenario: The user is presented with error message for invalid username
Given The user opens Register Page
When  The user enters a username with characters other than Letters, digits and special characters
      | username | password     | password confirmation |
      | &**&**&  | testpassword | testpassword          |
Then It should display an error message "Please enter a valid username"

Scenario: The user is presented with error message for password mismatch
Given The user opens Register Page
When  The user clicks Register button after entering valid username and different passwords in password and password confirmation fields
      | username     | password     | password confirmation |
      | aaa@gmail.com | testpassword | testpassword1   | 
Then It should display an error message "password_mismatch:The two password fields didn’t match."
Scenario: The user is succesfully able to register 
Given The user opens Register Page
When  The user enters a valid username and password and password confirmation
      | username     | password  | password confirmation |
      | pluton@gmail.com | Nnsdet@115 | Nnsdet@115       |
Then The user should be redirected to Homepage and pagetitle is "NumpyNinja"