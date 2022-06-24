Feature: Login Functionality on Demo Web Page


Scenario Outline: Test User Login with Valid Credentials

Given User should be on Home page
When User clicks on Login button
And User should enter Registered <Email> and <Password>
And User should click on Log in button
Then User should be able to logged in successfully 
Examples:
         |Email|Password|
         |johnfletcher@gmail.com|mypas1234$|
         
         
Scenario Outline: Test User Login with InValid Credentials

Given User should be on Home page
When User clicks on Login button
And User should enter Unregistered <Email> and <Password>
And User should click on Log in button
Then User should not be able to logged in 
Examples:
         |Email|Password|
         |admin123@gmail.com|mypass123|
  
  