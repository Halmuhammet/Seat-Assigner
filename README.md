# Seat-Assigner
## Description
In this project, I wanted to read an Excel file in Java just for fun. I ended up writing a program that assigns students random seat numbers. The program needs an Excel file to read the students names located at the first 2 columns (for first and last name). It then processes the input and writes the students' names and their seating numbers to a .txt output file.

## API and Dependency Management
To manage the API libraries and dependencies needed for this project, I used Maven.

pom.xml file is needed for Maven to know which dependencies to download.
  - artifactId refers to the name of the project or artifact, specifically the name of the generated artifact (e.g., the JAR or WAR file).
  - groupId refers to the group or organization that the project belongs to. It’s often structured like a domain name (e.g., com.example). This specifies which version of your project is being used (e.g., 1.0.0, 2.1.3, etc.).
  - make sure to provide modelVersion so that Maven knows how to interpret the pom.xml file.
  - lastly, include each <dependency> under <dependencies> tag. 
## Example Output
|           Name              | Seat Number |
─────────────────────────────────────────────
Alice Johnson                 | 	18		|
Bob Smith                     | 	41		|
Charlie Brown                 | 	66		|
Diana Ross                    | 	34		|
Edward Turner                 | 	1		|
Fiona Green                   | 	37		|
George Harris                 | 	98		|
Helen Walker                  | 	89		|
Ian Adams                     | 	77		|
Julia Scott                   | 	64		|
Kevin Moore                   | 	40		|
Linda Taylor                  | 	38		|
Michael Wilson                | 	47		|
Nancy Lee                     | 	92		|
Oliver Thomas                 | 	93		|
Patricia Clark                | 	95		|
Quentin Harris                | 	59		|
Rachel Martinez               | 	83		|
Samuel Perez                  | 	19		|
Teresa Young                  | 	49		|
Ursula King                   | 	79		|
Victor Wright                 | 	32		|
Wendy Scott                   | 	24		|
Xavier Carter                 | 	45		|
Yvonne Hill                   | 	70		|
Zachary Campbell              | 	76		|
Amelia Walker                 | 	25		|
Brian Lewis                   | 	14		|
Catherine Parker              | 	71		|
David Evans                   | 	86		|
Emma Harris                   | 	65		|
Fred Foster                   | 	96		|
Grace Nelson                  | 	33		|
Henry Cooper                  | 	23		|
Isabella Reed                 | 	17		|
Jack Adams                    | 	39		|
Karen Murphy                  | 	84		|
Liam Mitchell                 | 	9		|
Monica Davis                  | 	81		|
Nathan King                   | 	11		|
Olivia Carter                 | 	75		|
Paul Brown                    | 	35		|
Quinn Lewis                   | 	29		|
Rachel Clark                  | 	50		|
Sarah Wilson                  | 	67		|
Thomas Young                  | 	28		|
Ursula Turner                 | 	69		|
Vince Roberts                 | 	20		|
Wendy Parker                  | 	13		|
Xavier Scott                  | 	12		|
Yara Harris                   | 	97		|
Zachary Morris                | 	72		|
Amy Hill                      | 	63		|
Brandon Evans                 | 	22		|
Charles Walker                | 	42		|
Deborah Perez                 | 	68		|
Emily Thomas                  | 	73		|
Frank Harris                  | 	60		|
Grace Young                   | 	61		|
Hannah Lewis                  | 	52		|
Ian Nelson                    | 	43		|
Julia Adams                   | 	3		|
Kevin Moore                   | 	58		|
Linda Scott                   | 	26		|
Michael Lee                   | 	51		|
Natalie King                  | 	44		|
Oliver Clark                  | 	15		|
Paul Young                    | 	54		|
Quinn Mitchell                | 	46		|
Rachel Walker                 | 	30		|
Samuel Turner                 | 	55		|
Theresa Wilson                | 	2		|
Ursula Martinez               | 	80		|
Victor Harris                 | 	53		|
Wendy King                    | 	36		|
Xavier Foster                 | 	87		|
Yvonne Thomas                 | 	48		|
Zachary Roberts               | 	21		|
Alice Turner                  | 	31		|
Brian Harris                  | 	88		|
Charlie Mitchell              | 	27		|
Diana Clark                   | 	4		|
Edward Foster                 | 	8		|
Fiona Roberts                 | 	74		|
George Turner                 | 	62		|
Helen Reed                    | 	6		|
Ian Harris                    | 	78		|
Julia King                    | 	10		|
Kevin Walker                  | 	82		|
Linda Roberts                 | 	56		|
Michael Turner                | 	16		|
Nancy Harris                  | 	94		|
Oliver Brown                  | 	90		|
Patricia Wilson               | 	57		|
Quentin Lee                   | 	85		|
Rachel Foster                 | 	5		|
Samuel Martinez               | 	91		|
