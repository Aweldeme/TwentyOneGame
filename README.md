# Twenty-One (Blackjack) Game

A simple Blackjack card game built with Java and JavaFX. This project was created to practice Object-Oriented Programming (OOP) and GUI development.

## About the Project

I wanted to build a playable version of Blackjack that follows standard casino rules. The goal was to separate the game logic (the rules, the deck, the scoring) from the user interface so the code would be clean and easy to manage.

It features a graphical window where you can hit "Deal," see your cards flip, and choose to "Hit" or "Stand." The dealer plays automatically based on standard rules (hits until they reach 17).

## How it Works

* The Deck: I created a `Deck` class that generates 52 unique `Card` objects (Suits and Ranks) and shuffles them using a randomizing algorithm.
* Scoring Logic: The trickiest part of Blackjack is the Ace (which can be 1 or 11). I wrote a method that calculates the hand's total and automatically adjusts the Ace's value to give the best score without busting.
* The UI: Used JavaFX to handle the buttons and display the card images.
* OOP Structure: The project is split into logical classes:
    * `Card.java`: Defines what a card is.
    * `Hand.java`: Manages the cards a player holds.
    * `TwentyOneGame.java`: The main game loop and UI.

## How to Run It

1.  Clone this repo.
2.  Open the folder in IntelliJ or Eclipse. Make sure all the .java files and the images folder are in the same directory. The game looks for the card pictures relative to the code, so if you separate them, the images won't load.
3.  Run `TwentyOneGame.java`.
4.  Make sure you have the JavaFX library added to your project settings if your IDE doesn't include it by default.
