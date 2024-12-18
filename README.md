# Seat-Assigner
In this project, I wanted to read an Excel file in Java just for fun. I ended up writing a program that assigns students random seat numbers. The program needs an Excel file to read the students names located at the first 2 columns. It then writes the students' names and their seating numbers to a .txt output file.

To manage the API libraries and dependencies needed for this project, I used Maven.

pom.xml file is needed for Maven to know which dependencies to download.
  - artifactId refers to the name of the project or artifact, specifically the name of the generated artifact (e.g., the JAR or WAR file).
  - groupId refers to the group or organization that the project belongs to. It’s often structured like a domain name (e.g., com.example). This specifies which version of your project is being used (e.g., 1.0.0, 2.1.3, etc.).
  - make sure to provide modelVersion so that Maven knows how to interpret the pom.xml file.
  - lastly, include each <dependency> under <dependencies> tag. 

Example Output:
|           Name              | Seat Number |
────────────────────────────────────────────
Alice Johnson                 | 	43	 |
Bob Smith                     | 	95	 |
Charlie Brown                 | 	48	 |
Diana Ross                    | 	18	 |
Edward Turner                 | 	31	 |
Fiona Green                   | 	46	 |
George Harris                 | 	72	 |
Helen Walker                  | 	58	 |
Ian Adams                     | 	1	   |
Julia Scott                   | 	51	 |
Kevin Moore                   | 	83	 |
Linda Taylor                  | 	39	 |
Michael Wilson                | 	21	 |
Nancy Lee                     | 	79	 |
Oliver Thomas                 | 	85	 |
Patricia Clark                | 	26	 |
Quentin Harris                | 	66	 |
Rachel Martinez               | 	35	 |
Samuel Perez                  | 	30	 |
Teresa Young                  | 	68	 |
Ursula King                   | 	89	 |
Victor Wright                 | 	62	 |
Wendy Scott                   | 	38	 |
Xavier Carter                 | 	55	 |
Yvonne Hill                   | 	33	 |
Zachary Campbell              | 	50	 |
Amelia Walker                 | 	96	 |
Brian Lewis                   | 	15	 |
Catherine Parker              | 	57	 |
David Evans                   | 	70	 |
Emma Harris                   | 	17	 |
Fred Foster                   | 	2	   |
Grace Nelson                  | 	37	 |
Henry Cooper                  | 	78	 |
Isabella Reed                 | 	25	 |
Jack Adams                    | 	77	 |
Karen Murphy                  | 	49	 |
Liam Mitchell                 | 	76	 |
Monica Davis                  | 	60	 |
Nathan King                   | 	16	 |
Olivia Carter                 | 	92	 |
Paul Brown                    | 	47	 |
Quinn Lewis                   | 	29	 |
Rachel Clark                  | 	19	 |
Sarah Wilson                  | 	5	   |
Thomas Young                  | 	64	 |
Ursula Turner                 | 	14	 |
Vince Roberts                 | 	4	   |
Wendy Parker                  | 	81	 |
Xavier Scott                  | 	13	 |
Yara Harris                   | 	41	 |
Zachary Morris                | 	9	   |
Amy Hill                      | 	8	   |
Brandon Evans                 | 	34	 |
Charles Walker                | 	54	 |
Deborah Perez                 | 	53	 |
Emily Thomas                  | 	61	 |
Frank Harris                  | 	23	 |
Grace Young                   | 	27	 |
Hannah Lewis                  | 	84	 |
Ian Nelson                    | 	44	 |
Julia Adams                   | 	45	 |
Kevin Moore                   | 	42	 |
Linda Scott                   | 	56	 |
Michael Lee                   | 	36	 |
Natalie King                  | 	28	 |
Oliver Clark                  | 	65	 |
Paul Young                    | 	73	 |
Quinn Mitchell                | 	12	 |
Rachel Walker                 | 	90	 |
Samuel Turner                 | 	7	   |
Theresa Wilson                | 	67	 |
Ursula Martinez               | 	80	 |
Victor Harris                 | 	86	 |
Wendy King                    | 	11	 |
Xavier Foster                 | 	52	 |
Yvonne Thomas                 | 	69	 |
Zachary Roberts               | 	40	 |
Alice Turner                  | 	75	 |
Brian Harris                  | 	87	 |
Charlie Mitchell              | 	88	 |
Diana Clark                   | 	91	 |
Edward Foster                 | 	32	 |
Fiona Roberts                 | 	22	 |
George Turner                 | 	97	 |
Helen Reed                    | 	24	 |
Ian Harris                    | 	6	   |
Julia King                    | 	82	 |
Kevin Walker                  | 	3	   |
Linda Roberts                 | 	98	 |
Michael Turner                | 	10	 |
Nancy Harris                  | 	71	 |
Oliver Brown                  | 	63	 |
Patricia Wilson               | 	74	 |
Quentin Lee                   | 	59	 |
Rachel Foster                 | 	94	 |
Samuel Martinez               | 	20	 |
