Feature: Google Search

@Runm
Scenario: login in sellsmart project
            Given user is on home page  
            When I click on "//a/span[2]" link
            When I enter "ShopLoginForm_Login" "ashish.srivastava@eperiumindia.com" 
            And I enter "ShopLoginForm_Password" "intershop1"
            And I click on "//button[@name='login']" button
            Then I verify "" text is present