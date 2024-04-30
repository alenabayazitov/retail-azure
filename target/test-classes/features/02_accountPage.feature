Feature: Retail Account Page 

Background:
Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
And User click on login button
And User should be logged in into Account

@updateProfileTest @account
Scenario: Verify User can update Profile Information 
When User click on Account option 
And User update Name 'Danny' and Phone '9163265599'
And User click on Update button 
Then User profile information should be updated 

@addpaymentTest @account
Scenario: Verify User can add a payment method 
When User click on Account option 
And User click on Add a payment method link 
And User fill Debit or credit card information 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|1234567891234567| All Done  |1      |2027          |123         |
And User click on Add your card button 
Then A message should be displayed 'Payment Method added sucessfully'

@editCardTest @account
Scenario: Verify User can edit Debit or Credit card 
When User click on Account option 
And User click on Edit option of card section
And User edit information with below data 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|1111222233334444| Ally Done|6        |2030          |456         |
And User click on Update Your Card button 
Then A message should be displayed 'Payment Method updated Successfully'

@removeCardTest @account
Scenario: Verify User can remove Debit or Credit card 
When User click on Account option 
And User click on remove option of card section
Then Payment details should be removed

@addAddressTest @account
Scenario: Verify User can add an Address 
When User click on Account option 
And User click on Add address option 
And User fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt      |city     | state |zipCode|
|Belgium| All Done| 9163265599| 6218 Bremen Dr.| 4 | Antelope | Brussels | 16895   |
And User click Add Your Address button 
Then A message should be displayed 'Address Added Successfully'

@editAddressTest @account
Scenario: Verify User can edit an Address added on account
When User click on Account option 
And User click on edit address option 
And User fill new address form with below new information 
|country|fullName|phoneNumber|streetAddress|apt      |city     | state |zipCode|
|United States	| Aller Done| 9163265590 | 3429 Serious Dr.| 0 | Folsom | California | 95864   |
And User click update Your Address button 
Then A message should be displayed 'Address Updated Successfully'

@removeAddressTest @account
Scenario: Verify User can remove Address from Account 
When User click on Account option 
And User click on remove option of Address section
Then Address details should be removed
