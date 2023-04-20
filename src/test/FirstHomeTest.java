package test;

import main.FirstHome;
import main.PropertyDetails;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;


public class FirstHomeTest {
    FirstHome firstHome = new FirstHome();

    @Test
    public void priceCalculationTest() {
        PropertyDetails propertyDetails = new PropertyDetails();
        propertyDetails.setPurchasePrice(200000.0);
        propertyDetails.setEffectiveDate(LocalDate.of(2020,8,30));
        propertyDetails.setFirstHome("Y");
        double result = firstHome.priceCalculation(propertyDetails);
        assertEquals(0.0,result,0.0);
    }
    @Test
    public void priceCalculationTest1() {
        PropertyDetails propertyDetails1 = new PropertyDetails();
        propertyDetails1.setPurchasePrice(300000.0);
        propertyDetails1.setEffectiveDate(LocalDate.of(2020,8,30));
        propertyDetails1.setFirstHome("Y");
        double result1 = firstHome.priceCalculation(propertyDetails1);
        assertEquals(2500.0,result1,0.0);
    }
    @Test
    public void priceCalculationTest2() {
        PropertyDetails propertyDetails2 = new PropertyDetails();
        propertyDetails2.setPurchasePrice(700000.0);
        propertyDetails2.setEffectiveDate(LocalDate.of(2020,8,30));
        propertyDetails2.setFirstHome("Y");
        double result2 = firstHome.priceCalculation(propertyDetails2);
        assertEquals(41250.0,result2,0.0);
    }
    @Test
    public void priceCalculationTest3() {
        PropertyDetails propertyDetails3 = new PropertyDetails();
        propertyDetails3.setPurchasePrice(800000.0);
        propertyDetails3.setEffectiveDate(LocalDate.of(2020,8,30));
        propertyDetails3.setFirstHome("Y");
        double result3 = firstHome.priceCalculation(propertyDetails3);
        assertEquals(52250.0,result3,0.0);
    }
    @Test
    public void priceCalculationTest4() {
        PropertyDetails propertyDetails4 = new PropertyDetails();
        propertyDetails4.setPurchasePrice(170000.0);
        propertyDetails4.setEffectiveDate(LocalDate.of(2021,4,30));
        propertyDetails4.setFirstHome("Y");
        double result4 = firstHome.priceCalculation(propertyDetails4);
        assertEquals(0.0,result4,0.0);
    }
    @Test
    public void priceCalculationTest5() {
        PropertyDetails propertyDetails5 = new PropertyDetails();
        propertyDetails5.setPurchasePrice(200000.0);
        propertyDetails5.setEffectiveDate(LocalDate.of(2021,4,30));
        propertyDetails5.setFirstHome("Y");
        double result5 = firstHome.priceCalculation(propertyDetails5);
        assertEquals(500.0,result5,0.0);
    }
    @Test
    public void priceCalculationTest6() {
        PropertyDetails propertyDetails6 = new PropertyDetails();
        propertyDetails6.setPurchasePrice(300000.0);
        propertyDetails6.setEffectiveDate(LocalDate.of(2019,4,30));
        propertyDetails6.setFirstHome("Y");
        double result6 = firstHome.priceCalculation(propertyDetails6);
        assertEquals(4000.0,result6,0.0);
    }
    @Test
    public void priceCalculationTest7() {
        PropertyDetails propertyDetails7 = new PropertyDetails();
        propertyDetails7.setPurchasePrice(600000.0);
        propertyDetails7.setEffectiveDate(LocalDate.of(2019,4,30));
        propertyDetails7.setFirstHome("Y");
        double result7 = firstHome.priceCalculation(propertyDetails7);
        assertEquals(32750.0,result7,0.0);
    }
    @Test
    public void priceCalculationTest8() {
        PropertyDetails propertyDetails8 = new PropertyDetails();
        propertyDetails8.setPurchasePrice(800000.0);
        propertyDetails8.setEffectiveDate(LocalDate.of(2021,4,30));
        propertyDetails8.setFirstHome("Y");
        double result8 = firstHome.priceCalculation(propertyDetails8);
        assertEquals(53750.0,result8,0.0);
    }
    @Test
    public void priceCalculationTest9() {
        PropertyDetails propertyDetails9 = new PropertyDetails();
        propertyDetails9.setPurchasePrice(140000.0);
        propertyDetails9.setEffectiveDate(LocalDate.of(2020,7,10));
        propertyDetails9.setFirstHome("Y");
        double result9 = firstHome.priceCalculation(propertyDetails9);
        assertEquals(0.0,result9,0.0);
    }
    @Test
    public void priceCalculationTest10() {
        PropertyDetails propertyDetails10 = new PropertyDetails();
        propertyDetails10.setPurchasePrice(140000.0);
        propertyDetails10.setEffectiveDate(LocalDate.of(2020,7,10));
        propertyDetails10.setFirstHome("Y");
        double result10 = firstHome.priceCalculation(propertyDetails10);
        assertEquals(0.0,result10,0.0);
    }
}