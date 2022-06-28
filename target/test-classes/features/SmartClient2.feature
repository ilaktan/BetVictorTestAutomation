# author:ilhami.aktan@siliconmarkets.ai
# 28/22 BetVictor-01
# User is testing Select from dropdown row which will meet all criteria

@regression
@smoke
@wip
@test
Feature:Select from dropdown row which will meet all criteria

  Scenario:1-User on the webpage
    Given User open browser
    When User navigate to "http://www.smartclient.com/smartgwt/showcase/#featured_dropdown_grid_category" URL
    Then User click the accept button

  Scenario Outline:1-Select from dropdown row which will meet all criteria
    And User click the item
    And User select item contains "<ItemContains>" units contains "<UnitsContains>" unit cost greater then "<UnitCost>"
    Examples:
      | ItemContains | UnitsContains | UnitCost |
      |Exercise|Ea|1.1|

  Scenario:3-User is closing browser
    Then User close browser
