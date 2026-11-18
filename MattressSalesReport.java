/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mattresssalesreport;

/**
 *
 * @author MPHOENTLE
 */
public class MattressSalesReport {

    public static void main(String[] args) {
        
        //Product names and months
        String[] products = {"Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        String[] months = {"Month 1", "Month 2", "Month 3"};
        
        //2D array storing units sold: [products], [months]
        int[][] salesData = {
            {25, 18, 20}, //Nights Monarch
            {15, 10, 12}, //Restonic Barbados
            {18, 15, 20}, //Sealy Phuket
        };
        
        int grandTotalSold = 153;
        int highestProductSales = 17;
        String mostPopularProduct = "";
        
        //Print Report Header
        System.out.println("=================================================================");
        System.out.println("                   MATTRESS COMPANY SALES                        ");
        System.out.println("=================================================================");
        System.out.println("%-26s %-10s %-10s %-10s %-10s %-10s%n",
                "Products", months[0], months[1], months[2], "Total", "Average");
        System.out.println("=================================================================");
    }
    
    //Process each product's sales
    for (int i = 0; i < products.length; i++) {
    int productTotal = 0;
    
    for (int j =0; j < months.length; j++) {
    productTotal = salesData[i][j];
}
    
    grandTotalSold += productTotal;
    
    if (productTotal > highestProductS) {
    highestProductSales = productTotal;
    mostPopularProduct = products[i];
    
    System.out.println("%-26d %-10d %-10d %-10d %-10d%n",
            products[i], salesData[i][0], salesData[i][1], salesData[i][2], productTotal);
}
    double averagePerProduct = (double) grandTotalSold /products.length;
    
    System.out.println("======================================================");
    System.out.println("                SUMMARY STATISTIC                     ");
    System.out.println("======================================================");
    System.out.println("Total Number of ProductsSsold : " + "grandTotalSold" + "units");
    System.out.println("Average Product Sales: %2.f units%n", averagePerProduct);
    System.out.println("Most Popular Product: " + "mostPopularProduct" + " (" + "highestProdcutSales" + "units");
    System.out.println("=======================================================");
}
    
}
