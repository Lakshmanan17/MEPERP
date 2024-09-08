Feature: Erp login feature
tags="@Erplogin"
Background: 
Given User is on ERP login "https://www.meperp.com/meprefresh/auth"
@Credentials
Scenario Outline: Login validation using with valid and invalid credentials
When user enter usename as "<username>" and password as "<password>"
Then user able to see the message "<message>"

Examples:
  | username | password  | message            |
  | Admin    | admin12$$ | invalid credentials|
  | admin$$  | admin123  | invalid credentials|
  | abc123   | xyz$$     | invalid credentials|
  | admin    | admin@123 | valid credentials  |
   
