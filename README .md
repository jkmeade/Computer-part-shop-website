


## D287 – JAVA FRAMEWORKS CHANGES
Prompt B -  Create a README file that includes notes describing where in the code to find the changes you made for each of parts C to J. Each note should include the prompt, file name, line number, and change.
1. Added "About" page to website (mainscreen.html line 21) and about page controller.

Prompt C - Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
2. Added html customization in mainscreen.html file lines 20 and 23 and in AboutPage.html lines 10 -15.
Prompt E -  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
3. Added parts and products in BootStrapData file lines 42-96.

Prompt F - Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

4. Added "Buy Now" button that decrements the inventory fo the product by one and displays different messages depending on if the purchase was successful. Found in confirmationbuynowfailure.html & confirmationbuynowsuccess.html. Logic found in AddProductController file lines 130 - 142.

Prompt G - Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
5. Added additional fields to the part entity for maximum and minimum inventory (Lines 37 & 39 in Part file).
    Modified sample inventory to include maximum and minimum fields (BootStrapData file lines 47 & 48, 57 & 58, 67 & 68, 77 & 78, 87 & 88).
    Added additional text inputs to InhousePartForm and OutsourcedPartForm so the user can set maximum and minimum values (InhousePartForm.html line 24 & 26, OutsourcedPartForm lines 25 & 27).
    Renamed the file persistent storage is saved to (application.properties file line 6).
    Modified the code to enforce the inventory is between or at the minimum and maximum values (NoMoreThanMaxValidator file).

Prompt H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
6. Added logic for displaying error message for low inventory when adding and updating parts if the inventory is less than the minimum number of parts (NoMoreThanMaxValidator lines 20 - 26 ).
    Added logic for displaying error message for low inventory when adding or updating products lowers the part inventory below the minimum (NoMoreThanMaxValidator lines 20 - 26 ).
    Added logic for displaying error messages when adding and updating parts if the inventory is greater than the maximum (NoMoreThanMaxValidator lines 27 - 31).

Prompt I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
7. Added two unit tests for checking that the inventory is less than the defined max and greater than the defined minimum (Lines 160 - 181).

J.  Remove the class files for any unused validators in order to clean your code.
8. Removed class files for NoLessThanMinValidator. 