# Incubyte Test Assessment

This repository contains both manual and automated test cases developed as part of the technical assessment for Incubyte Systems. The assessment includes testing the Gmail compose function manually and automating the signup flow for a Magento website.

## Project Structure

- **Manual Testing (Gmail Compose Functionality)**:
    - Contains traditional and BDD-style test cases documented in an Excel file.
    - Test cases cover various scenarios, including both positive and negative cases.

- **Automation Testing (Magento Signup)**:
    - Automates the signup and login process on [Magento's demo site](https://magento.softwaretestingboard.com/).
    - Uses Selenium and follows Behavior-Driven Development (BDD) for test case structure and Page Object Model (POM) for code organization.

## Files

1. `Gmail_Compose_Test_Cases.xlsx` - Manual test cases for Gmail's compose function, with both traditional and BDD-style test cases.
2. `Refined_Gmail_Compose_Test_Cases.xlsx` - A refined version of Gmail compose test cases with enhanced accuracy.
3. `Magento_Signup_Automation` - Folder containing automated test scripts for Magento signup and login processes.

## Tools and Technologies

- **Manual Testing Tools**: Test cases documented in Excel.
- **Automation Tools**: 
    - Selenium for browser automation.
    - TestNG/Cucumber for BDD structure.
    - Java/Python as the scripting language (choose based on your setup).
    - Git for version control.

## Getting Started

1. Clone the repository:
    ```bash
    git clone https://github.com/username/Incubyte_Test_Assessment.git
    cd Incubyte_Test_Assessment
    ```

2. Open the `Gmail_Compose_Test_Cases.xlsx` or `Refined_Gmail_Compose_Test_Cases.xlsx` files to view manual test cases.

3. For automation:
    - Ensure Selenium WebDriver and the required libraries are installed.
    - Navigate to the `Magento_Signup_Automation` folder.
    - Run test scripts using your preferred IDE or command line.

## Folder Structure

```plaintext
Incubyte_Test_Assessment/
├── Gmail_Compose_Test_Cases.xlsx                # Original Gmail test cases in Excel
├── Refined_Gmail_Compose_Test_Cases.xlsx        # Refined Gmail test cases
├── Magento_Signup_Automation/                   # Automation scripts for Magento
│   ├── src/                                     # Source code for POM classes
│   ├── tests/                                   # Test scripts using BDD
│   └── resources/                               # Additional resources, configs
└── README.md                                    # Project overview and instructions

