# DBAdmin

## Background

This project was [an ungraded obligatory assignment](https://github.com/Iannen/DbAdmin/blob/main/DAT107%20obl3%20v%C3%A5ren%202023.pdf) at Western Norway University of Applied Sciences (HVL) for the course 'DAT107 Database Systems'

It was written as a collaborative effort of group 26 in the spring of 2023.  
(For bookkeeping purposes, Previous repo -> https://github.com/h671420/DAT107_Oblig3 -> private)

## The Republish
- Some comments were removed from various source files
- The project now deals with norwegian special characters
- Database connection details were moved to Github Secrets, and the build process now expects them to be supplied as environment variables

## The app

The application presents the user with various menus related to managing the employees, department and projects of a fictional and unnamed organization.
No distinction is made between different sorts of users, and there is not authentication. Perhaps one can take the view that the application would only be accessible to an already authenticated admin user?

The rules are:
- Each employee must belong to exactly 1 departement. If no departments exists, a hidden department 'init' is used
- Each employee can be associated with 0-n projects.
- Each project can have 0-n participants
- Each department must have at least one employee, to serve as department manager


## Run Instructions

**Prerequisites:** Java 17 installed

1. Download dbadmin.jar from following page: 
   [DBAdmin v1.0](https://github.com/Iannen/DbAdmin/releases/tag/latest)  
   (feel free to DL source code or clone repo if you want to take a look)

3. Open a terminal/command prompt at the location where the jar was downloaded.

4. Run the application:

```bash
java -jar dbadmin.jar
```