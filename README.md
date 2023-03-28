This Java program uses Swing components to construct a simple calculator. It produces a window with buttons for entering numbers, operators, and calculations as well as a label to show the input and output.

The program sets the components' locations and fonts, initialises the window, and adds listeners to the buttons. The actionPerformed method is invoked when a button is clicked, and it determines which button was pressed and executes the proper action.

When an operator is clicked, the program checks the value of a boolean flag called isOperatorClicked and sets it to true. When a number is clicked after an operator, the isOperatorClicked flag is reset to false and the input label is changed to that number.
To determine which operator was clicked and carry out the required calculation, the application employs a switch statement. Invalid input and specific circumstances like dividing by zero are also handled.

Essentially, this is a basic calculator solution that can handle elementary arithmetic operations. Further features like memory, scientific operations, and keyboard input could be added to enhance it.

Screenshots display the simple operation 9-3=6

![Screenshot (2323)](https://user-images.githubusercontent.com/104863304/228094590-5dd8c8ca-edee-4ed1-846c-b235100b8792.png)
![Screenshot (2324)](https://user-images.githubusercontent.com/104863304/228094630-fc43edcc-c8cb-467b-92c1-d63a50169590.png)
![Screenshot (2325)](https://user-images.githubusercontent.com/104863304/228094673-bfadb8e0-57a4-435b-ad37-1fd2c022a04e.png)
![Screenshot (2326)](https://user-images.githubusercontent.com/104863304/228094702-bb1e93a1-7aae-4c1a-bf93-d807aa697c5f.png)
