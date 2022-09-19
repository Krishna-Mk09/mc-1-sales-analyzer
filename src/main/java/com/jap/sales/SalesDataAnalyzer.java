package com.jap.sales;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SalesDataAnalyzer {
    SalesDataAnalyzer salesDataAnalyzer = null;
    int countLines = 0;

    // This method reads a file and adds each line of the file into the corresponding SalesRecord object
    // The above code is reading a file and creating an array of SalesRecord objects.
    public SalesRecord[] readFile(String fileName) {
        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                countLines++;
            }
        } catch (IOException exception) {
            System.err.println(exception.getMessage());
        }
        System.out.println("count - " + countLines);
        SalesRecord[] salesRecord = new SalesRecord[countLines];
        try (FileReader fileReader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = bufferedReader.readLine();
            int index = 0;
            while ((line = bufferedReader.readLine()) != null) {
                // 2016 Survey Response Q9a The following adequately support my work-related needs: City Manager�s Office 31.4 40.6 9.5
                String[] dataInfo = line.split(",");
                int customerId = Integer.parseInt(dataInfo[1]);
                String date = dataInfo[0].trim();
                int productCategory = Integer.parseInt(dataInfo[2]);
                String paymentMethod = dataInfo[3].trim();
                double amount = Double.parseDouble(dataInfo[4].trim());
                double timeOnSite = Double.parseDouble(dataInfo[5].trim());
                int clicksInSite = Integer.parseInt(dataInfo[6]);
                SalesRecord newSalesRecord = new SalesRecord(date, customerId, productCategory, paymentMethod, amount, timeOnSite, clicksInSite);
                salesRecord[index] = newSalesRecord;
                index++;
            }
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
        return salesRecord;
    }
}




