Feature: Search and place order for Vegetables

@SmokeTest
Scenario Outline: Select items and place an order
Given User is on Greencart Landing page
And User searches <Name> Vegetable
And User sets <Kilogram> Kg
And User clicks increase to add one Kg
And User clicks increase to add one Kg
And User clicks decrease to remove one Kg
And User clicks ADD TO CART
And User clicks shopping cart
And User clicks PROCEED TO CHECKOUT
And User enters promotion code <PromotionCode>
And User clicks Place Order
And User selects country <Country>
And User ticks Terms and Conditions
And User clicks Proceed button
Then User was navigated to final confirmation page with text "your order has been placed successfully"
And User was navigated to Greencart Landing page

Examples:
|Name	  |Kilogram |PromotionCode |Country   |
|Cucumber |5        |123456        |Australia |



