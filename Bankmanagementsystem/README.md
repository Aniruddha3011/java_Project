# Bank Management System

The Bank Management System is a Java-based application with a user-friendly graphical interface designed to simulate basic banking operations. Built using Java Swing for the UI and integrated with MySQL for data storage, the application supports a variety of banking features, such as account creation, deposits, withdrawals, and balance inquiries. Below is a breakdown of the key components:


---

1. Login Page

      Purpose: Allows users to securely log in to their accounts using their card number and PIN.
      
      Features:
      
      Input fields for Card Number and PIN.
      
      Buttons: Sign In, Clear (to reset inputs), and Sign Up (to create a new account).
      
      Validates login credentials using data stored in a MySQL database.
      
      Redirects authenticated users to the Transaction Page.




---

2. Transaction Page

      Purpose: Enables users to perform various banking transactions after successful login.
      
      Features:
      
      Deposit: Navigates to the deposit page to add funds to the account.
      
      Withdraw: Allows users to withdraw funds.
      
      Fast Cash: Provides predefined withdrawal options for quick transactions.
      
      Balance Inquiry: Displays the current account balance.
      
      Mini-Statement: Shows the recent transaction history.
      
      PIN Change: Enables users to update their account PIN.
      
      Exit: Closes the application.




---

3. Sign-Up Process

      The application provides a multi-page sign-up process to gather detailed information about new users:
      
      Page 1: Personal Details
      
      Purpose: Collects basic personal information.
      
      Fields:
      
      Name, Father's Name, Date of Birth (with a date picker), Gender, Email Address.
      
      Marital Status, Address, City, State, and Pincode.


      Validation: Ensures required fields are not left blank before proceeding to the next step.

   


Page 2: Additional Details

  Purpose: Captures more detailed information about the user.
  
  Fields:
  
  Religion, Category (e.g., General, OBC), Income, Educational Qualification.
  
  Occupation, PAN Number, and Aadhaar Number.
  
  
  Validation: Checks for essential information before moving forward.

  


Page 3: Account Setup

  Purpose: Finalizes account creation by assigning an account number and allowing users to set a PIN.
  
  Fields:
  
  Account Type (e.g., Savings, Current), Facility Preferences (e.g., ATM Card, Internet Banking).
  
  PIN setup for secure transactions.
  
  
  Database Integration: Stores user information into the database.



---

4. Database Integration

      The system connects to a MySQL database for data storage and retrieval. Key database tables include:
      
      Login: Stores card numbers, PINs, and authentication details.
      
      Signup: Holds user registration information across all three pages.
      
      Transactions: Records transaction history for balance tracking and mini-statements.



---

# Highlights

Java Swing Framework: Provides a robust and interactive user interface.

Secure Login: Validates credentials against stored data to ensure account safety.

Modular Design: Each feature is implemented as a separate class, making the application maintainable.

Scalability: The system can be easily extended with additional features like loan applications or account closures.

