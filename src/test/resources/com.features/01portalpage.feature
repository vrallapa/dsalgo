Feature: portal page

Scenario:Launching portal page and getting started

Given user opens portal page
When user clicks getting started button
Then user should go to home page
And page title should be "NumpyNinja"
