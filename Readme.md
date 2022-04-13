# Read me Assignment 3

UML Diagram for my implementation for Assignment 3
![Screen Shot 2022-04-04 at 11 15 23 PM](https://user-images.githubusercontent.com/101818122/161672005-d9509dd2-918f-47a4-9bba-52c6c71be8ba.png)



# Design Pattern 
For this assignment I used the Factory patten to implement the Email Generation system while also using the Singleton 
pattern to ensure only one Email Generation system is created. The factory pattern was perfect for this use case because 
it creates related classes without the hindrance of inheritance between classes. The singleton implementation of the 
email generation system itself is the textbook definition for only allowing one instance of an object. 

#Assumptions 
In my implementation I assumed that the system would be added upon later to allow for the actual sending and receiving of 
messages by email and focused on the email generation as well as the email check feature and the encryption. 

#Reusability 
In order to ensure that my code was reusable. I created the DeliverMessage interface and Message class which can be 
manipulated to be used in a plethora of message based schemas such as SMS or other communication standards. 

#Simplicity and Readability 
To ensure my code was simple and readable, I used short and direct function names which adequately describe the nature 
of the method. In addition, I added significant comments to help define and explain methods and variables. 

#Flexibility 
THe DeliverMessage interface can be reused and extended in numerous applications and circumstances. Additionally, by 
using the factory pattern, so multiple other classes can be created based off of the DeliverMessage interface. 
