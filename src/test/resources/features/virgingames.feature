Feature: Virgin Games GET data
  As a User,
  I would like to verify the GET data of Virgin Games

  Scenario Outline: User checking GET data of Virgin Games Bingo Jackpot
    Given   User is on Homepage
    When    User get data of Bingo's Jackpot currency
    Then    User must get back valid status code 200
    Then    User check that the currency is GBP
    Then    User Verify the "<potsId>"  and "<name>"
    Examples:
      | potsId | name       |
      | 193    | Enterprise |
      | 194    | Adventure  |
      | 5323   | CloudVGN   |