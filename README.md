# UNO

## Overview
This project is a digital version of the popular card game UNO, implemented in Java. The game allows users to log in, create new accounts, and play against multiple bot opponents. The game provides a main menu with options to view game rules, create a new game, and log out. In-game, users can see their hand, the card on the ground, and the number of cards each bot has left. The game ends when any player, human or bot, has one card left.

## Features
### User Authentication
* Login page for existing users.
* Sign-up page for new users with validation for existing usernames and password matching.
### Main Menu
* Help button to view game rules.
* Create a new game button to start a new game with a selected number of bot opponents.
* Log out button to return to the login page.
### Game Page
* Visualization of the card on the ground and the user's hand.
* Display the number of cards left for each bot.
* Buttons to draw a card and say "UNO".
* Game ends when a bot wins, displaying a message indicating which bot won.

## Usage
### Login Page
#### Existing Users:

* Enter your username and password, then click "Login".
* If the credentials are correct, you will be directed to the main menu.
* If the credentials are incorrect, an error message will be displayed. If username is wrong, message will be "User does not exist!", if password is incorrect, message will be "Password is incorrect!".
#### New Users:

* Click on the "Sign Up" button.
* Enter a new username and password (twice for confirmation).
* If the username already exists, an error message will be displayed.
* If the passwords do not match, an error message will be displayed.
* If all validations pass, your account will be created, and you can log in.
###Main Menu
####Help:

* Click the "Help" button to view the rules of UNO.
##### Create a New Game:

* Click the "Create a New Game" button.
* Choose the number of bot opponents (1-10).
* Click "Create Game" to begin playing.
#### Log Out:

* Click the "Log Out" button to return to the login page.
### Game Page
#### Gameplay:
* The card on the ground and your hand are displayed.
* The number of cards left for each bot is shown.
* Use the "Draw" button to draw a card.
* Click "UNO" if you have one card left; if not, a warning message will appear.
* If a bot has one card left, the game will finish and display which bot won.

##  Rules of UNO
* We need to know what each card does, and which attributes they hold for writing code of UNO cards.
* Each player starts with 7 cards.
* Players take turns matching a card from their hand to the card on the ground by either color or number.
* Special cards include:
Skip
Reverse
Draw Two
Wild
Wild Draw Four
* The first player to get rid of all their cards wins the game.
* If you have one card left, you must say "UNO". If another player catches you not saying "UNO", you must draw two cards as a penalty.
* The game continues until one player wins by having one card left or no more cards are left to draw.
