Feature: Retail Account Page Password Update

@updatePasswordTest 
Scenario: Verify User can Update password 
Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDoneTestOne1!'
And User click on login button
And User should be logged in into Account
When User click on Account option 
And User enter below information 
|previousPassword| newPassword|confirmPassword|
|AllDoneTestOne1!|AllDonePass2!|AllDonePass2! |
And User click on Change Password button 
Then A message should be displayed 'Password Updated Successfully'

@updatePasswordTest 
Scenario: Verify User can Update password 
Given User is on retail website
When User click on Sign in option
And User enter email 'alldone4@gmail.com' and password 'AllDonePass2!'
And User click on login button
And User should be logged in into Account
When User click on Account option 
And User enter below information 
|previousPassword| newPassword|confirmPassword|
|AllDonePass2!|AllDoneTestOne1!|AllDoneTestOne1!|
And User click on Change Password button 
Then A message should be displayed 'Password Updated Successfully'