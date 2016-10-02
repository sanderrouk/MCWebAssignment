# MCWebAssignment
This test assignment was assigned to me by Mooncascade in order to test my capabilities regarding web application development.

### Languages used: 
* Java 8
* Javascript ECMAScript 6 but nothing specific to 6 was used.
* HTML 5
* CSS

### Frameworks used:
* Spring
* Twitter Bootstrap 3
* AngularJS 1.4.0

### Additional info:
The project uses Gradle as the build tool so it easily builds using the gradle wrapper. The database engine it uses is H2 because it is a local db and ties well with Spring.

### What this project demonstrates:
My ability to create a RESTful api and a backend framework with Java and Spring boot. My ability to create a frontend using a js framework such as AngularJS to work with that RESTful api. 

### Task description:
The finish coridor has  digital timers: 
1. At the entrance of the finish coridor
2. On the finish line

The digital timers send the following realtime data to the server:
1. The chip identifier attached to the runner(Unique ID)
2. The identifier of the digital timer.
3. The exact time of the runner passing the digital timer to the detail of a fraction of a second

Prior to the event the database is populated with the following data:
1. The athletes chip identifier(Unique ID)
2. The starting number of the athlete
3. The fullname of the athlete(Firstname Lastname)

### Task:
Implement the following:

1. Server/Service which is capable of receiving realtime data. There is no real test client develop a dummy one yourself.
2. Web user interface where data is shown in a table which gets realtime updates.
  1 When an athlete enters the finish coridor their name gets added to the table with their starting number and name.
  2. When an athlete crosses the finish line their finish time gets added to their line.
  3. Construct the UI in a way so that recently finished or arrived athletes get added to the table so that the viewing user does not have to do any extra work.
  4. Demonstrate the functionality of the system using a dummy client.
  5. Design the UI in a way that the user would not have to do any extra work in order to understand whats going on.

### Non-mandatory extra tasks:
3. Make sure that the finishing athletes are displayed in the correct order. (If athlete A enters the corridor after B but crosses the finish line before B updates are made correspondingly)
4. Make the UI only query the backend if the browser window is currently active.
5. If the browser window is awaken and retargeted as the main window then make sure that the user understands and sees what has happened while they were not observing the UI.
