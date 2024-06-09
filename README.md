# Magical Arena

## Overview

This is a simple simulation of a magical arena where two players fight until one of them dies.

## How to Run

1. Compile the code:

    src/main/java/com/magicalarena/*.java

2. Run the game:

    com.magicalarena.Arena
  

## How to Test

1. Compile the tests:

    junit-5.7.0.jar:hamcrest-core-1.3.jar src/test/java/com/magicalarena/*.java


2. Run the tests:

    junit-5.7.0.jar:hamcrest-core-1.3.jar:out org.junit.runner.JUnitCore com.magicalarena.ArenaTest

## Project Structure

- src/main/java/com/magicalarena
  - Player.java
  - Dice.java
  - Arena.java
- src/test/java/com/magicalarena
  - ArenaTest.java
