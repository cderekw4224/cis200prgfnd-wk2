# cis200prgfnd-wk2
Part 1: From scratch, create a program to…
- Declare an array to hold 10 test scores
- Read in 10 Exam scores from the user. Only allow valid scores (0-100, inclusive) to be stored in the
array. If an invalid score is entered, display an error message and re-read that value as many times as
needed to validate.
- Once user input is complete, display the high score, the low score, and the class average (to decimal
places), each on a separate line.
Reminder: Do NOT include ‘bad data’ (ex: a negative exam score, over 100, etc.) as part of your data.
(Here is some test data to try: 87, 98, 87, 56, 78, 67, 99, 92, 93, 87 … Avg is 84.40)
Once you get Part 1 working properly, demo for a UTA or the instructor before continuing on to Part 2

Part 2: Once you get Part 1 working properly and it has been approved, complete the following
Assume the program will be used by a course with multiple sections. Modify the program written in Part 1
so that it now does the following:
-Increase the size of your array to hold up to 50 students
-Ask the user for the Section Letter (e.g. A, B, C, etc.)
-Comment out the previous loop used to read in input and replace with a loop that reads in input until the
user enters a 999 to end input. Include the same data validation (0-100 and now, 999)
Reminder: Do NOT include the sentinel value (999) as part of your data.
- Once user input is complete, display the section letter, the number of scores entered, along with the
high score, low score, and class average (to 2 decimal places), each on a separate line for that section.
- Ask the user if they want to enter scores for another section. If they do, repeat the above. Continue this
until the user has entered in the info for all given sections of a course.

Extra Credit Challenge (+10% / 2 pts)
 Once all sections have been entered and the user has chosen to quit, display the highest overall
score and the overall class average of all sections combined.
Hint: Declare one variable that holds the high score and total of all scores for a section (e.g. highSection /
totalSection) and another to hold the high score and total for the entire class (e.g. highClass / totalClass).
