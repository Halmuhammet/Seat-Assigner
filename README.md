# Seat-Assigner
In this project, I wanted to read an Excel file in Java just for fun. I ended up writing a program that assigns students random seat numbers. The program needs an Excel file to read the students names located at the first 2 columns. It then writes the students' names and their seating numbers to a .txt output file.

To manage the API libraries and dependencies needed for this project, I used Maven.

pom.xml file is needed for Maven to know which dependencies to download.
  - artifactId refers to the name of the project or artifact, specifically the name of the generated artifact (e.g., the JAR or WAR file).
  - groupId refers to the group or organization that the project belongs to. It’s often structured like a domain name (e.g., com.example). This specifies which version of your project is being used (e.g., 1.0.0, 2.1.3, etc.).
  - make sure to provide modelVersion so that Maven knows how to interpret the pom.xml file.
  - lastly, include each <dependency> under <dependencies> tag. 
