Feature: Wikipedia Search Functionality

 Background:
  Given  User is on Wikipedia home page
 @B2G3-228 @B2G3-159
 Scenario:  Wikipedia Search Functionality Title Verification
  Then User types "Steve Jobs" in the wiki search box
  Then User clicks wiki search button
  Then User sees Steve Jobs is in the wiki title
 @B2G3-231 @B2G3-159
 Scenario:  Wikipedia Search Functionality Header Verification
  Then User types "Steve Jobs" in the wiki search box
  Then User clicks wiki search button
  Then User sees "Steve Jobs" is in the wiki header

 @B2G3-230  @B2G3-159
 Scenario:  Wikipedia Search Functionality image Header Verification
  Then User types "Steve Jobs" in the wiki search box
  Then User clicks wiki search button
  Then User sees "Steve Jobs" is in the image header








