Feature: Test Billing Functionality of Demo WebPage

Scenario Outline:  User to enter billing details 
Given User is on Home Page by logging in by using the <Email> and <Password>
When User loggedin navigate to Billing Page
And Now Enter respective  <Company>
And Select the <Country> and <State>
And Enter the <City> name
And User Enter the <Address> details
And Now enter the <PostalCode>
And Enter <PhoneNumber> in the field
And At last enter the <FaxNumber>
And User clicks-on continue button
And User enters to shipping step
And User Select a shipping address from your address book or enter a new address
And Clickon the continue button
And Go to shipping method
And click on the type of shipping method and tick the continue button
And select the <TypeofPayment> of payment method and press the continue button
And press the  confirm order button
Then User is able to see placed order details


Examples:
         |Email|Password|Company|Country|State|City|Address|PostalCode|PhoneNumber|FaxNumber|TypeofPayment|
         |johnfletcher@gmail.com|mypass1234$|Capgemini|Austria|Other (Non US)|Lower Austria|flat 23,Austria,lower bridges|6754321|987654321|119086534|PO|
#         |johnfletcher@gmail.com|mypass1234$|Capgemini|Austria|Other (Non US)|Lower Austria|flat 23,Austria,lower bridges|6754321|987654321|119086534|PO|
         
