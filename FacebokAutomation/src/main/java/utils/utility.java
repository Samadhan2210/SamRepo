package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

  

public class utility {
	public static String  FetchTheDataFromExcelSheet(String Sheet , int row , int colum ) throws EncryptedDocumentException, IOException   {
		
		String path = "\"C:\\Users\\Admin\\Desktop\\New Microsoft Excel Worksheet.xlsx\"";
		
		FileInputStream file = new FileInputStream(path);
		return WorkbookFactory.create(file).getSheet(Sheet).getRow(row).getCell(colum).getStringCellValue();

		
	}
	
	public static void CaptureScreenshoot(WebDriver driver , String testID) 
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYYY-MM-DD  HH-MM-SS");
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		LocalDateTime now = LocalDateTime.now();
		File dest = new File ("D:\\sceenshot" + "jpg");
		try {
		FileHandler.copy(src, dest);
		}
		catch(Exception e) {
			
			}
		
	}

}
