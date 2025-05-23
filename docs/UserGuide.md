# User Guide

## Introduction

Bobotype is a minimalist, interactive CLI tool that enhances typing speed and accuracy through personalized exercises, 
real-time feedback, and progress tracking, helping users build muscle memory and confidence efficiently.

## Quick Start

1. Ensure that you have Java 17 or above installed.
1. Download the latest version of `Bobotype` from [here](https://github.com/AY2425S2-CS2113-F13-2/tp/releases/tag/v2.1).
2. Download the jar file to the folder you want to use as the home folder for your Bobotype.
3. Open a terminal and navigate to the folder where the jar file is located.
4. Run the command `java -jar [CS2113-F13-2][BoboType].jar` to start the application.

## Features

### Start a Typing Exercise: `start`
Starts a typing exercise with a random sentence.

Format: `start`

### Set Mode: `normal`, `timeLimit`, `zen`, `custom`
Set the mode to set the typing speed.

Format: `normal`, `timeLimit`, `zen`, `custom`

Example:

```
____________________________________________________________
 Select your mode: 
 Type: 'normal' or 'timeLimit' or 'zen' or `'custom'
____________________________________________________________
```

### Select Difficulty Level: `easy`, `intermediate`, `difficult`
Select the difficulty level of the typing exercise. If the user leaves it blank, then 
it is set as default difficulty level, which would be automatically adjusted depending on the user's progress. 

Format: `easy`, `intermediate`, `difficult`

Example: 
```
____________________________________________________________
 Default difficulty: easy
 (Type 'override' to choose your own difficulty, or leave blank to proceed)
____________________________________________________________
```

### Select Text Length: `short`, `medium`, `long`
Select the length of the typing exercise. 

Format: `short`, `medium`, `long`

Example:
```
____________________________________________________________
 Select your text length: 
 Type: 'short' or 'medium' or 'long'
____________________________________________________________
```

### Practice in Normal Mode: 
The normal mode starts with the count-down. On the next page, each sentence will be given for the user to type.

Example:

```
____________________________________________________________
 3
 2
 1
 Start!
____________________________________________________________

```
On the next page, each sentence will be given for the user to type along: 
```
The sun is shining, and birds are singing.
```
At the end of each practice, the result will be given: 
```
____________________________________________________________
 Hope you enjoyed the round! Here are your stats:
 Typing speed (WPM): 49 WPM
 Typing speed (CPM): 245 CPM
 Typing accuracy: 21.43%
 Typing Score (Effective WPM): 10.50 WPM
____________________________________________________________
```

### Practice in timeLimit Mode:
In the timeLimit mode, each sentence will be given for the user to type, and there will be time limit for each sentence based on the difficulty level and the length of the sentence. Based on the user input, the response will be given. 

[ Warning ] User input will be displayed on the console only after the user presses ENTER. In other words, before the user presses ENTER, the user is not able to see what they have typed so far.

Example of timeLimit mode instruction:

```
____________________________________________________________
 Welcome to timeLimit mode.
 *** In this mode, you can view your input ONLY after you finish your sentence ***
 *** i.e when ENTER is pressed!!! ***
____________________________________________________________
 Are you ready? The game will begin in...
____________________________________________________________
 3
 2
 1
____________________________________________________________
```
On the next page, the test sentence will be given:
```
The sun is shining, and birds are singing.
```
After the user inputs the sentence or the time is up.
On the next page, the result statement will be shown in either: 
```
 *** Great! ***
 *** Press enter to continue... Previous input (shown below, if any) will be cleared.***
```
```
 *** Wrong! Please be more careful next time! ***
 *** Press enter to continue... Previous input (shown below, if any) will be cleared.***
```
```
 *** Time's up! Try typing faster! ***
 *** Press enter to continue... Previous input (shown below, if any) will be cleared.***
```
At the end of the entire practice, the final result will be shown:
```
____________________________________________________________
 You finished the timeLimit Mode Practice! 
	 - Num of correct lines: 1 lines out of 3 lines
____________________________________________________________
 *** Please press enter to continue. ***
```


### Practice in Zen Mode: `zen`
Type as long as desired. Get the typing speed of the user's attempt. The command stop_practice is included in the word 
count of the test and calculation of typing speed.

Format: `zen`

Example:

```
 Welcome to Zen Mode, you can type out anything to your
 heart's content and find out your typing speed.
 Typing 'start' will start the typingTimer and
 typing the command 'stop_practice' will stop the practice.
```

User types:
- `start`
- `Some Sample Text`
- `stop_practice`

Returns:
```
____________________________________________________________
 You finished the Zen Mode Practice!
 You have typed: 20 words
 Typing speed (WPM): 33 WPM
 Typing speed (CPM): 505 CPM
____________________________________________________________
 Please type
         - 'exit' to exit or
         - 'start' to start the new practice.
____________________________________________________________
```

### Practice in Custom Mode: `custom`
Allows user to input their custom text to practice typing the text they want.

Format: `custom`

Example:
```
____________________________________________________________
 Please type your custom text. Press 'Enter' then type 'exit' to finish.
____________________________________________________________
```

User types
- `Some Sample Text`
- `Enter` then `exit`

Returns
```
____________________________________________________________
 Hope you enjoyed the round! Here are your stats:
 Typing speed (WPM): 35 WPM
 Typing speed (CPM): 190 CPM
____________________________________________________________
```

### Get High Score: `highscore`
Gets back the highest score of the user across all attempts of normal mode.
Highscore is calculated based on the WPM * typingAccuracy of the user.

Format: `highscore`

Example: 

`Your high score is: 49.0`

### Get High Score List: `highscore list`
Gets back the top 3 highest score of the user across all attempts.

Format: `highscore list`

Example:

```
____________________________________________________________
 Top 3 High Scores:
 1. 49.0
 2. 30.5
 3. 12.7
____________________________________________________________
```

### Add Target Speed: `target add speed`
Add a target speed (WPM) to hit. Users will be informed when they hit their target speed in normal mode.

Format: `target add speed SPEED`

Example:

`target add speed 88`

Expected output:
```
____________________________________________________________
 Target added!
 Target Speed (WPM): 88 | Not Achieved
____________________________________________________________
```

### Add Target Score: `target add score`
Add a target score (effective WPM) to hit. Users will be informed when they hit their target score in normal mode.

Format: `target add score SCORE`

Example:

`target add score 42`

Expected output:
```
____________________________________________________________
 Target added!
 Target Score (Effective WPM): 42 | Not Achieved
____________________________________________________________
```

### List Targets: `target list`
Print a list of all the targets inputted by the user and shows whether they have been achieved.

Example:

`target list`

Format: `target list`

Expected output:

```
____________________________________________________________
 Here is your list of targets!
 1. Target Speed (WPM): 88 | Not Achieved
 2. Target Score (Effective WPM): 42 | Not Achieved
____________________________________________________________
```

### Remove Target: `target remove`
Remove targets from the target list according to the target index.

Format: `target remove TARGET_INDEX`

Example:

`target remove 1`

Expected output:

```
____________________________________________________________
 Target removed!
 Target Speed (WPM): 88 | Not Achieved
____________________________________________________________
```

### View Milestone: `milestone`
Displays the user's current milestone, which reflects the default typing difficulty. This difficulty level is 
automatically adjusted based on the user's progress in achieving milestones dependent on their highscore.

Format: `milestone`

Example:
```
____________________________________________________________
 Current milestone: intermediate
____________________________________________________________
```

### View Progress Report: `progress`
Displays a report on the user's scores from the past 10 runs. Scores are represented using a bar graph 
where each '█' corresponds to 5 points. Scores are calculated based on normal mode runs only.

Format: `progress`

Example: 
```
____________________________________________________________
 Typing Progress (Past 5 sessions):
 Each '█' represents 5 points
 Session 5: ████████████████████                         (97 pts)
 Session 4: ███████████████████████                     (105 pts)
 Session 3: ███████████                                  (55 pts)
 Session 2: ██████████████████                           (85 pts)
 Session 1: █████████████████████████████               (130 pts)
____________________________________________________________

```

### Exit the application: `exit`
Exits the application.

Format: `exit`

Output:
```
____________________________________________________________
 Bye. Hope to see you again soon!
____________________________________________________________
```

### Saving the data
Bobotype data is saved in the hard disk automatically after any command that changes the data. 
There is no need to save manually.

### Editing the data file
Bobotype data is saved in various text files, namely in`data/BoboType.txt`, `data/milestones.txt`, `data/progress.txt`, and, `data/typingtargets.txt`. 
Advanced users are welcome to update data directly by editing these data files.


## FAQ

**Q**: How do I transfer my data to another computer? 

**A**: Install Bobotype on the other computer and replace `data` directory with your existing `data` directory.

## Command Summary

* Start a typing exercise `start`
* Set mode `normal`, `timeLimit`, `zen`, `custom`
* Set difficulty level `easy`, `intermediate`, `difficult`
* Set text length `short`, `medium`, `long`
* Get high score `highscore`
* Get high score list `highscore list`
* Add target speed `target add speed SPEED`
* Add target score `target add score SCORE`
* List targets `target list`
* Remove target `target remove TARGET_INDEX`
* Get milestone `milestone`
* Get progress report `progress`
* Exit application `exit`