## Library Management System ##

## Description ##

Our system will allow users to add, update, remove and search for books. 
Data structure used: Doubly linked list
We want to sort the books into different categories and print them according to the sorting filter desired by the user.

System 

Asks user for preferred operation to do: 
    1 - Insert new book
    2 - Update existing book
    3 - Delete existing book
    4 - Search for book
        1 - Search all books 
            1 - Sort according to alphabetical order
        2 - Search book according to the ISBN
        3 - Search book according to title
            1 - Sort books according to it's editions (Latest edition first)
        4 - Search books according to publisher
            1 - Sort books according to alphabetical order
            2 - Sort books according to publisher, published year
            3 - Sort books according to the published year
        5 - Search books according to year released
        6 - Search books according to genre
            1 - Sort books according to alphabetical order
        7 - Search books according to language
            1 - Sort books according to author


According to the above description we need to sort use the following algorithms

Search algorithms: to search books according to the different categories. 
Sorting algorithms: sort the results of the search according to the users preferance.
        

1 - What operation would you like to perform?
    1 - Add a new book to the library (1)
        A function that will create a new node and insert new book by accepting user inputs  
        Before inserting, the books title will be checked and inserted according to where it is in the alphabetical order
    2 - Update existing book (2)
        A function that will accept the ISBN of the book to be updated (ISBN because it is a **unique identifier** of the book)
    3 - Delete existing book (3)
        A function that will accept the ISBN of the book and delete the book
    4 - Search for books (4)
        1 - Print all the books existing in the library (1)
            A funtion that will accept a parameter of LinkedList and iterate through all of the books in the LinkedList and print their details
        2 - Search a specific book according to ISBN (2)
            A function that will accept a parameter of LinkedList and ISBN and print only that specific book
        3 - Search for a book with a certain title (3)
            A function that will accept LinkedList and the title of the book, and any book matching the title will be printed (It will be sorted from latest edition to earliest edition)
        4 - Search for books written by a certain author (4)
            A function that will accept parameters of LinkedList and author, and any books written by the given author will be printed
        5 - Search for a books published by a certain publisher (5)
            A function that will accept parameters of LinkedList and publisher, and any books released by the given publisher will be printed
Note: in any terminal if you were to click 0, you will go back to the main menu
