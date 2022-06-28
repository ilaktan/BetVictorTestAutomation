# author:ilhami.aktan@siliconmarkets.ai
# 28/22 BetVictor-01
# User is testing Fill fields functionality.

@regression
@smoke
@wip
@test
Feature:User is testing Fill fields functionality.

  Scenario:1-User on the webpage
    Given User open browser
    When User on the Exercise website homepage
    Then User click the accept button

  Scenario:2-User is testing Fill fields functionality.

    Given User set animal letter "a"
    When User open the browser Amount Slider on the "60"
    Then User move max life span slider from between "0" to "-70" with this value "60" to "40"
    And User click the sort by
    And User sort order by "Life Span"
    And User click the Ascending box
    When User click the "Filter"
    Then User calculate the "Lifespan: "

  Scenario:3-User is closing browser
    Then User close browser

