Feature: Test the Update Functionality of added product on Demo Web Page

Scenario Outline: Test for Verifying ShoppingCart Removing Update
Given User on Demo Web Shop Home Page with login <Email> and <Password>
When User clicks on shopping cart
And User selects <ProductName> in Cart
And User checks the respective checkbox of that <ProductName>
And User clicks on Update shopping cart for removing Product
Then Checked item should be removed from Cart

Examples:
         |Email|Password|ProductName|
         |johnfletcher@gmail.com|mypass1234$|Health Book|
         
         

Scenario Outline: Test for Verifying ShoppingCart AddQuantity Update
Given User on Demo Web Shop Home Page with login <Email> and <Password>
When User clicks on shopping cart
And User selects <ProductName> in Cart
And User enters <Quantity> value of <ProductName> in itemquantity box
And User clicks on Update shopping cart button for AddQuantity update
Then User entered <ProductName> item quantity <Quantity> is updated

Examples:
         |Email|Password|ProductName|Quantity|
         |johnfletcher@gmail.com|mypass1234$|14.1-inch Laptop|4|
#         |johnfletcher@gmail.com|mypass1234$|Black & White Diamond Heart|2|