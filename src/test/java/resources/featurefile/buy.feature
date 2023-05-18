Feature: Search functionality

  @sanity @regression
  Scenario Outline: Search the buy car with model
    Given I am on homepage
    When I mouse hoover on buy+sell tab
    And I click 'Search Cars' link
    Then I navigate to 'new and used car search' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the result "<verifymakeresult>" in results
    Examples:
      | make            | model              | location              | price    | verifymakeresult                                                                |
      | Audi            | TT                 | NSW - Central Coast   | $60,000  | 2 Audi TT for Sale under $60,000 in Central Coast, NSW                          |
      | Kia             | Sportage           | NSW - Hunter          | $200,000 | 42 Kia Sportages for Sale under $200,000 in Hunter, NSW                         |
      | Honda           | Accord             | NSW - Sydney          | $40,000  | 8 Honda Accords for Sale under $40,000 in Sydney, NSW                           |
      | Land Rover      | Range Rover Evoque | NSW - Mid North Coast | $90,000  | 5 Land Rover Range Rover Evoques for Sale under $90,000 in Mid North Coast, NSW |
      | Nissan          | Qashqai            | NSW - Newcastle       | $80,000  | 31 Nissan Qashqais for Sale under $80,000 in Newcastle, NSW                     |
      | Mercedes - Benz | GLC - Class        | NSW - Sydney          | $200,000 | 59 Mercedes-Benz GLC-Class for Sale under $200,000 in Sydney, NSW               |

  @smoke @regression
  Scenario Outline: Search the used car with model
    Given I am on homepage
    When I mouse hoover on buy+sell tab
    And I click 'Used' link
    Then I navigate to 'Used Cars For Sale' page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the usedResult "<verifymakeresult>" in results
    Examples:
      | make       |   model         |     location         | price   |                 verifymakeresult                                    |
      | Audi       | Q3              | NSW - Hunter         | $80,000 | 5 Used Audi Q3s for Sale under $80,000 in Hunter, NSW               |
      | Ford       | Escape          | NSW - Newcastle      | $60,000 | 5 Used Ford Escapes for Sale under $60,000 in Newcastle, NSW        |
      | Honda      | Accord          | NSW - Sydney         | $50,000 | 8 Used Honda Accords for Sale under $50,000 in Sydney, NSW          |
      |  Kia       | Grand Carnival  | NSW - Sydney         | $70,000 | 10 Used Kia Grand Carnivals for Sale under $70,000 in Sydney, NSW   |
      | Mazda      | Bravo           | QLD - Brisbane       | $50,000 | 2 Used Mazda Bravos for Sale under $50,000 in Brisbane, QLD         |
      | Peugeot    | Boxer           | NSW - Sydney         | $70,000 | 2 Used Peugeot Boxers for Sale under $70,000 in Sydney, NSW         |

