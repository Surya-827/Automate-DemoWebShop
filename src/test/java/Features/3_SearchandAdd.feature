Feature: Test item Search and Add Functionality on Demo Web Page

Scenario Outline: Test to validate Add to Cart functionality
Given User should be on Home Page by logging-in using <Email> and <Password>
When User enters <ProductName> in search bar
And User clicks on search button
And User clicks on Add to Cart button
Then User added <ProductName> should be added to shoppingCart

Examples:
        |Email|Password|ProductName|
        |johnfletcher@gmail.com|mypass1234$|Health Book|
        |johnfletcher@gmail.com|mypass1234$|14.1-inch Laptop|
        |johnfletcher@gmail.com|mypass1234$|Black & White Diamond Heart|
  
#       |14.1-inch Laptop|


Scenario Outline: Test to validate Add to Cart functionality
Given User should be on Home Page by logging-in using <Email> and <Password>
When User enters <ProductName> in search bar
And User clicks on search button
Then User gets search results

Examples:
        |Email|Password|ProductName|
        |johnfletcher@gmail.com|mypass1234$|Books|
#       |johnfletcher@gmail.com|mypass1234$|Computers|

#https://onlinegdb.com/Uqok9233k

