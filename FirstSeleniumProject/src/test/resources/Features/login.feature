Feature: Login page automation

@smoke
Scenario Outline: Check login is working with valid credentails

Given User is on lgin page
When User enters "<username>" and "<password>"
And click on login button
Then user is navigated to Home page
And close the browser

Examples: 

| username				| password			|
| standard_user		| secret_sauce	|