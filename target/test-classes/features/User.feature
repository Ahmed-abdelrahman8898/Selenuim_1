Feature: MyFirst
	this is my stuff ever
	Scenario Outline: User Regis
	Given User in home
	When I click
	And I enter the firstname "<firstname>","<lastname>"
	Then You are good to go

Examples:
    | firstname | lastname |
    |    ahmed |   sehs |
    |    mo |   so |
	