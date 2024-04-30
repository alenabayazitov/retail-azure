Feature: Retail Home Page

@test1 @retailhome 
Scenario: Verify Shop By Department sidebar
Given User is on retail website
When User click on All section
Then Below options are present in Shop By Department sidebar
|Electronics|Computers|Smart Home|Sports|Automative|

@testdepartmentoutline @retailhome 
Scenario Outline: Verify department sidebar options   
Given User is on retail website
When User click on All section
And User on <department>
Then Below options are present in department
|<optionOne>|<optionTwo>|

Examples: 
|department|optionOne|optionTwo|
|'Electronics'|TV & Video|Video Games|
|'Computers' |Accessories|Networking|
|'Smart Home'|Smart Home Lightning|Plugs and Outlets|
|'Sports'    |Athletic Clothing|Exercise & Fitness|
|'Automative'|Automative Parts & Accessories|MotorCycle & Powersports|

@addtocarttest 
Scenario: Verify User can add an item to cart 

Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
And User click on login button
And User should be logged in into Account
And User change the category to 'Smart Home'
And User search for an item 'kasa outdoor smart plug'
And User click on Search icon
And User click on item 
And User select quantity '2'
And User click add to Cart button 
Then The cart icon quantity should change to '2'

@deletefromcarttest 
Scenario: Verify User can delete an item from cart 

Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
And User click on login button
And User should be logged in into Account
And User click on Cart option 
And User click delete option 
Then The cart icon quantity should change to '2'


@placeanordertest @retailhome 
Scenario: Verify User can place an order without Shipping address and payment Method on file

Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
And User click on login button
And User should be logged in into Account
And User change the category to 'Smart Home'
And User search for an item 'kasa outdoor smart plug'
And User click on Search icon
And User click on item 
And User select quantity '2'
And User click add to Cart button 
Then The cart icon quantity should change to '2'
And User click on Cart option 
And User click on Proceed to Checkout button
And User click Add a new address link for shipping address 
And User fill new address form with below information 
|country|fullName|phoneNumber|streetAddress|apt      |city     | state |zipCode|
|United States |Aller Done|9163265590 | 3429 Serious Dr. | 0 | Folsom | California | 95864 |
And User click Add Your Address button 
And User click Add a Credit card or Debit Card for Payment method
And User fill Debit or credit card information 
|cardNumber|nameOnCard|expirationMonth|expirationYear|securityCode|
|2222555588889999| Ally Done |6       |2030          |456         |
And User click on Add your card button 
And User click on Place Your Order
Then A Message should be displayed 'Order Placed, Thanks'

@placeorderwithoutaddressandcard @retailhome 
Scenario: Verify User can place an order with Shipping address and payment Method on file

Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
And User click on login button
And User should be logged in into Account
And User change the category to 'Electronics'
And User search for an item 'Apex Legends'
And User click on Search icon
And User click on item 
And User select quantity '5'
And User click add to Cart button 
Then The cart icon quantity should change to '5'
And User click on Cart option 
And User click on Proceed to Checkout button
And User click on Place Your Order
Then A Message should be displayed 'Order Placed, Thanks'

@placeorderwithoutaddressandcard @retailhome 
Scenario: Verify User can place an order with Shipping address and payment Method on file

Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
And User click on login button
And User should be logged in into Account
And User change the category to 'Electronics'
And User search for an item 'Apex Legends'
And User click on Search icon
And User click on item 
And User select quantity '5'
And User click add to Cart button 
Then The cart icon quantity should change to '5'
And User click on Cart option 
And User click on Proceed to Checkout button
And User click on Place Your Order
Then A Message should be displayed 'Order Placed, Thanks'
