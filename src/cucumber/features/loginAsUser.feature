Feature: Login user

  Scenario: Login user

    Given we open https://mystore-testlab.coderslab.pl/index.php?controller=authentication&back=my-account site
    When provide lucas@op.pl and 12345 into inputs
    Then we successfully login

#    Scenario Outline: Add new address
#      Given we are on login site
#      When from login site we click add first address
#      And we fill in <alias> <address> <city> <zipcode> <country> <phone>
#      Then <alias> <address> <city> <zipcode> <country> <phone> are correct
#
#      Examples:
#      |alias|address          |city |zipcode|country|phone    |
#      |Lymek|Marszalkowska 32|Warsaw|06-123 |Poland |888444666|