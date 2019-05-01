# Friendsr
## By Levy van der Linde 
## Minor Programmeren

Once someone opens this app, an overview of people will show up. 
It’s a social friends app that allows you to view people’s profiles and some information about them. 
Every person had it’s on little message which is special to that person. 
Like Martijn, who said he’s always cold, good to know…. ;)

The code contains an Arraylist called “friendList” so it’s possible to add or remove users to the app. 

The user can click on each one to see a bigger photo and get some more information about this person. 
This was programmed with the 'GridItemClickListener' in the MainActivity. Intent makes it possible to change activity, in this case
from the Main to Profile_Avtivity. 'Putextra' also returns a person (the person that was clicked) to use their information in the Profile_Activity.
There is also an option to rate a person. The rating goes from 0 to 5 and is totally up to you. All the user has to do is click on a star of his/hers rating. 

1. Open the app
You'll see a picture of everyone with their name.

<img width="170" alt="Schermafbeelding 2019-05-01 om 16 20 11" src="https://user-images.githubusercontent.com/47352487/57022923-f4097000-6c30-11e9-90fd-da87217806cc.png">

2. Click on Renske
The picture will show again, only bigger. Also next to her name, her bio will show.

<img width="170" alt="Schermafbeelding 2019-05-01 om 16 20 20" src="https://user-images.githubusercontent.com/47352487/57023009-3632b180-6c31-11e9-89c4-13cc40e008f5.png">

3. Rating Renske
We'll give Renske 5 stars out of 5, ofcourse ;)  
When leaving her and return, the rating will stay safed. 

