package com.Main.programming;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class DataDrivenTesting {
    public static void main(String[] args) {
        String excelFilePath = "test_data.xlsx"; // Replace with your Excel file path

        try (FileInputStream fis = new FileInputStream(new File(excelFilePath));
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0); // Assuming data is in the first sheet

            Iterator<Row> iterator = sheet.iterator();

            // Skip the header row if present
            if (iterator.hasNext()) {
                iterator.next();
            }

            while (iterator.hasNext()) {
                Row currentRow = iterator.next();

                // Assuming your Excel sheet has columns in the following order: Test Case, Input Data, Expected Result
                String testCase = currentRow.getCell(0).getStringCellValue();
                String inputData = currentRow.getCell(1).getStringCellValue();
                String expected = currentRow.getCell(2).getStringCellValue();

                // Perform the test using the data
                boolean testResult = performTest(inputData); // Replace with your test logic

                // Check if the actual result matches the expected result
                if (testResult) {
                    System.out.println("Test Case: " + testCase + " - PASSED");
                } else {
                    System.out.println("Test Case: " + testCase + " - FAILED");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Your test logic goes here, replace with your actual test implementation
    public static boolean performTest(String inputData) {
        // Implement your test logic here
        return true; // Modify this logic based on your actual test
    }
}
