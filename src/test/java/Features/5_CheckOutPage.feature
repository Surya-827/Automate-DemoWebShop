Feature: Test Checkout functionality of an item

Scenario Outline:
Given User is on Home page by logging with <Email> and <Password>
When user clicks on shoppingCart button
And Select and enter <Country> and <State> and <Code>
And Click Estimate Shipping Button
And Click on Checkout button
Then User should see Billing Page
Examples:
        |Email|Password|Country|State|Code|
        |johnfletcher@gmail.com|mypass1234$|India|Other (Non US)|535591|
        