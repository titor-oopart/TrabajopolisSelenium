Feature: Login in an account

  @Logout @Acceptance @Login
  Scenario: login in Trabajopolis page
    Given the user goes to login page
    When the user puts his username and password
    Then the user is redirected to his account page
