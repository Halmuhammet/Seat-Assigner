package org.example;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileInputStream;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;

/**
 * In this project, I wanted to read an Excel file in Java just for fun.
 * I ended up writing a program that assigns students random seat numbers.
 * The program needs an Excel file to read the students names located at the first 2 columns.
 * It then writes the students' names and their seating numbers to a .txt output file.
 */

public class ExcelFileReader {
    public static void main(String[] args) {
        int numberOfSeats = 98;
        // Provide the Excel file path
        String excelFilePath = "C:\\Users\\muhsm\\IdeaProjects\\excel_reader\\src\\main\\java\\org\\example\\Exam4_stats .xlsx";
        // Provide the output file path
        String outputFilePath = "C:\\Users\\muhsm\\IdeaProjects\\excel_reader\\src\\main\\java\\org\\example\\Seating Numbers.txt";
        // Call the seat assigner function
        assignSeats(excelFilePath, outputFilePath, numberOfSeats);
    }

/**
 * This function assigns random seat numbers to students
 * @param excelFilePath: path to the Excel file that contains student names (first 2 columns).
 * @param outputFilePath: path to the output file where the seating assignments will be written.
 * @param numberOfSeats: number of available seats which must be greater than or equal to the number of students.
 * */
    public static void assignSeats(String excelFilePath, String outputFilePath, int numberOfSeats){
        // Create a random object to get random seating number
        Random random = new Random();

        try(
                // Locate the Excel file
                FileInputStream fis = new FileInputStream(excelFilePath);
                // Instantiate the output stream writer
                FileWriter fileWriter = new FileWriter(outputFilePath);
                //Create a workbook object to work with either .xls or .xlsx files
                Workbook workbook = WorkbookFactory.create(fis);
        ){

            //Create a sheet object to work with specific sheet of an Excel file
            Sheet sheet = workbook.getSheetAt(0);
            // subtract the first row to get the total number of students since that is for the column header
            int numberOfStudents = sheet.getPhysicalNumberOfRows() - 1;

            // If the available seats are less than the number of students, ask the user to enter valid number of seats
            while(numberOfSeats < numberOfStudents){
                numberOfSeats = Integer.parseInt(JOptionPane.showInputDialog("Number of seats must be greater than or equal to the number of students, please enter valid seat number."));
            }

            ArrayList<Integer> seatNumbers = new ArrayList<>(numberOfSeats);
            // create an array of int ranging from 1 up to available number of seats, inclusive
            for(int i = 1; i <= numberOfSeats; i++){
                seatNumbers.add(i);
            }

            // Format the column header
            String formattedTitle = String.format("|%15s%13s | %s |\n","Name", "", "Seat Number");
            fileWriter.write(formattedTitle);

            // Draw a demarcating line under the column headers
            StringBuilder continuousBoxLine = new StringBuilder();
            for (int i = 0; i < 45; i++) {
                continuousBoxLine.append("\u2500");
            }
            continuousBoxLine.append("\n");
            fileWriter.write(continuousBoxLine.toString());

            // Iterate through each row
            for(int i = 1; i < numberOfStudents; i++){
                Row row = sheet.getRow(i);
                // initialize a string builder for the name
                StringBuilder name = new StringBuilder();

                // Iterate through each row cell
                for(int j = 0; j < 2; j++){  // names are located in the first two columns
                    Cell cell = row.getCell(j);
                    if(cell == null){
                        name.append("UNKNOWN");
                    }else{
                        // Check the cell type and display the output accordingly
                        switch(cell.getCellType()){
                            case STRING:
                                name.append(cell.getStringCellValue()).append(" ");
                                break;
                            default: // skip if the type is not string (or name)
                                break;
                        }
                    }
                }
                //get a random seating number as long as the seat is not occupied (or not equal to -1).
                int ramdomSeatingNum;
                do{
                    ramdomSeatingNum = random.nextInt(numberOfSeats) + 1;
                }
                while(seatNumbers.get(ramdomSeatingNum - 1) == -1);

                // Once the seat is occupied, set its value to -1 to indicate that it is occupied
                seatNumbers.set(ramdomSeatingNum - 1, -1);

                // Format the name and its seating number demarcated by "|"
                String formattedString = String.format("%-29s | \t%d\t\t|" , name, ramdomSeatingNum);
                // Display the name and seating number
                fileWriter.write(formattedString);

                // Only add a newline when the row number is not equal to the last row index in the sheet
                if(i != numberOfStudents - 1){
                    // add a newline
                    fileWriter.write("\n");
                }
            }
            JOptionPane.showMessageDialog(null,"The seat assignment is complete, please check the output file.");
            //Catch any exceptions
        }catch(EncryptedDocumentException | IOException e){
            System.out.println(e.getMessage());
        }
    }
}