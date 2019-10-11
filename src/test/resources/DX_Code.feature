Feature: Automation framework DX Asssessment Test 

Scenario: DX Automation Assessment Test 
Given Firefox browser opened successfully with the website
When click on first link of the page 
Then click on second link of the page
And select OK on the pop up window
And verify the text on the page using assert
And close the browser
