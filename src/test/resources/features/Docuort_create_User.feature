Feature: Create User
@B2G3-252 @B2G3-159


Scenario: Create  and validate new  user
    Given user is already logged in as "advisor"
    Then Create  new  Client
      | First name    | Pablo              |
      | Last Name     | Escobar            |
      | Email address | EscobarB@Email.ru |
      | Phone Number  | 2345675654         |
      | Password      | Password69         |
    Then logout
    Then login as new client "Escobar"


