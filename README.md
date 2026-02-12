# TwentyOneGame

Twenty-One (Blackjack) Game
A simple Blackjack card game built with Java and JavaFX. This was a project I created to practice Object-Oriented Programming (OOP) and GUI development.
About the Project
I wanted to build a playable version of Blackjack that follows standard casino rules. The goal was to separate the game logic (the rules, the deck, the scoring) from the user interface so the code would be clean and easy to manage.
It features a graphical window where you can "Hit" or "Stand." The dealer plays automatically based on standard rules (hits until they reach 17).
How it Works
•	The Deck: I created a Deck class that generates 52 unique Card objects (Suits and Ranks) and shuffles them using a randomizing algorithm.
•	Scoring Logic: The trickiest part of Blackjack is the Ace (which can be 1 or 11). I wrote a method that calculates the hand's total and automatically adjusts the Ace's value to give the best score without busting.
•	The UI: Used JavaFX to handle the buttons and display the card images.
•	OOP Structure: The project is split into logical classes:
o	Card.java: Defines what a card is.
o	Hand.java: Manages the cards a player holds.
o	TwentyOneGame.java: The main game loop and UI.
How to Run It
1.	Clone this repo.
2.	Open the folder in IntelliJ or Eclipse.
3.	Run TwentyOneGame.java. (Make sure to have all the other java files including the images in the same folder)
4.	Make sure you have the JavaFX library added to your project settings if your IDE doesn't include it by default.
<img width="468" height="532" alt="image" src="https://github.com/user-attachments/assets/c0635f90-32da-422d-9c15-e361c1ef7a43" />
