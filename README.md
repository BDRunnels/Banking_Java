* Bank APP *
    - Backend Dev and need to create an app to handle new customer bank account requests.

    App should:
        Read a .csv file of names, SSN, accounts and initial deposit
        Use a proper data structure to hold all these accounts.
        Both savings and checking accounts share the properties:
            deposit()
            withdraw()
            transfer()
            showInfo()

            11 digit account # --> 1 or 2 depending on savings or checking, last 2 of SSN, unique 5 digit number, and random 3 digit.
        
        Savings accounts are given a Safety Deposit Box, identified by a 3 digit number and accessed with a 4 digit code.
        Checking accounts are assigned a Debit Card with a 12 digit number and 4 digit pin.
        Both accounts will use an interface thtat determines base interest rate.
            Savings use .25 points less than base
            Checking will use 15% of the base rate.
        ShowInfo should reveal relevant account info as well as information specific to the Checking or Savings account.

    OBJECTIVES:
        Learn to develop a robust app architecture
        When to use abstract classes & methods
        Use an interface API to receive info from a dev's app
        Explore constructors deeper and use super()
        Explore access modifiers and when to use public, private, protected
        Read data from a file and store in an appropriate data structure
        Generate random numbers and work with String API