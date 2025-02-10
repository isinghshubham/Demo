package FlipKart.FlipKart;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

public class ReadExcel {

    // Method to read data from Excel file
    public static Object[][] readExcelData(String excelFilePath, String sheetName) throws IOException, InvalidFormatException {
        FileInputStream inputStream = new FileInputStream(excelFilePath);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        // Get row and column counts
        int rows = sheet.getPhysicalNumberOfRows();   // Get actual number of rows
        int cols = sheet.getRow(0).getPhysicalNumberOfCells(); // Get number of columns

        // Create a 2D array to store data
        Object[][] data = new Object[rows - 1][cols];

        // Iterate over rows and columns to store data in the 2D array
        for (int i = 1; i < rows; i++) { // Start from 1 to skip header row
            Row row = sheet.getRow(i);
            for (int j = 0; j < cols; j++) {
                data[i - 1][j] = row.getCell(j).toString();  // Convert cell value to String
            }
        }

        workbook.close();
        inputStream.close();

        return data;
    }
}
