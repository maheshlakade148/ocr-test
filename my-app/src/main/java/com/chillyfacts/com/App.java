package com.chillyfacts.com;
import java.io.File; 
  
import net.sourceforge.tess4j.Tesseract; 
import net.sourceforge.tess4j.TesseractException; 

public class App {
   public static void main(String[] args) {
	 Tesseract tesseract = new Tesseract( ) ;  
        try {  
            // this includes the path of tessdata inside the extracted folder  
            tesseract.setDatapath( "D:/all_ecommerce/java/Tess4J-3.4.8-src/Tess4J/tessdata" ) ;  
            // specifying the image that has to be read  
            String text = tesseract.doOCR( new File( "image.jpg" ) ) ;    
            // printing the text corresponding to the image interpreted  
            
			System.out.print( text ) ; 
        }  
        catch ( TesseractException e ) {  
            e.printStackTrace( ) ;  
        }     
   }
}