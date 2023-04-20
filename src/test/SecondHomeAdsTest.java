package test;

import main.PropertyDetails;
import main.SecondHomeAds;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;


public class SecondHomeAdsTest {

    SecondHomeAds secondHomeAds = new SecondHomeAds();;

    @Test
    public void priceCalculationTest() {
        PropertyDetails propertyDetails = new PropertyDetails();
        propertyDetails.setPurchasePrice(145000.0);
        propertyDetails.setEffectiveDate(LocalDate.of(2019,7,30));
        propertyDetails.setAdditionalDwelling("Y");
        double result = secondHomeAds.priceCalculation(propertyDetails);
        assertEquals(5800.0,result,0.0);
    }
    @Test
    public void priceCalculationTest1() {
        PropertyDetails propertyDetails1 = new PropertyDetails();
        propertyDetails1.setPurchasePrice(200000.0);
        propertyDetails1.setEffectiveDate(LocalDate.of(2019,7,30));
        propertyDetails1.setAdditionalDwelling("Y");
        double result1 = secondHomeAds.priceCalculation(propertyDetails1);
        assertEquals(9100.0,result1,0.0);
    }
    @Test
    public void priceCalculationTest2(){
        PropertyDetails propertyDetails2 = new PropertyDetails();
        propertyDetails2.setPurchasePrice(300000);
        propertyDetails2.setEffectiveDate(LocalDate.of(2021,4,30));
        propertyDetails2.setAdditionalDwelling("Y");
        double result2 = secondHomeAds.priceCalculation(propertyDetails2);
        assertEquals(16600.0,result2,0.0);
    }
    @Test
    public void priceCalculationTest3(){
        PropertyDetails propertyDetails3 = new PropertyDetails();
        propertyDetails3.setPurchasePrice(700000);
        propertyDetails3.setEffectiveDate(LocalDate.of(2021,4,30));
        propertyDetails3.setAdditionalDwelling("Y");
        double result3 = secondHomeAds.priceCalculation(propertyDetails3);
        assertEquals(71350.0,result3,0.0);
    }
    @Test
    public void priceCalculationTest4(){
        PropertyDetails propertyDetails4 = new PropertyDetails();
        propertyDetails4.setPurchasePrice(900000);
        propertyDetails4.setEffectiveDate(LocalDate.of(2021,4,30));
        propertyDetails4.setAdditionalDwelling("y");
        double result4 = secondHomeAds.priceCalculation(propertyDetails4);
        assertEquals(102350.0,result4,0.0);
    }
    @Test
    public void priceCalculationTest5(){
        PropertyDetails propertyDetails5 = new PropertyDetails();
        propertyDetails5.setPurchasePrice(200000);
        propertyDetails5.setEffectiveDate(LocalDate.of(2021,1,30));
        propertyDetails5.setAdditionalDwelling("y");
        double result5 = secondHomeAds.priceCalculation(propertyDetails5);
        assertEquals(8000.0,result5,0.0);
    }
    @Test
    public void priceCalculationTest6(){
        PropertyDetails propertyDetails6 = new PropertyDetails();
        propertyDetails6.setPurchasePrice(300000);
        propertyDetails6.setEffectiveDate(LocalDate.of(2021,1,30));
        propertyDetails6.setAdditionalDwelling("y");
        double result6 = secondHomeAds.priceCalculation(propertyDetails6);
        assertEquals(14500.0,result6,0.0);
    }
    @Test
    public void priceCalculationTest7(){
        PropertyDetails propertyDetails7 = new PropertyDetails();
        propertyDetails7.setPurchasePrice(700000);
        propertyDetails7.setEffectiveDate(LocalDate.of(2021,1,30));
        propertyDetails7.setAdditionalDwelling("y");
        double result7 = secondHomeAds.priceCalculation(propertyDetails7);
        assertEquals(69250.0,result7,0.0);
    }
    @Test
    public void priceCalculationTest8(){
        PropertyDetails propertyDetails8 = new PropertyDetails();
        propertyDetails8.setPurchasePrice(900000);
        propertyDetails8.setEffectiveDate(LocalDate.of(2021,1,30));
        propertyDetails8.setAdditionalDwelling("y");
        double result8 = secondHomeAds.priceCalculation(propertyDetails8);
        assertEquals(100250.0,result8,0.0);
    }
    @Test
    public void adsCalculationTest(){
        PropertyDetails propertyDetails7 = new PropertyDetails();
        propertyDetails7.setPurchasePrice(39999);
        propertyDetails7.setEffectiveDate(LocalDate.of(2022,12,30));
        propertyDetails7.setAdditionalDwelling("y");
        double result6 = secondHomeAds.priceCalculation(propertyDetails7);
        assertEquals(0.0,result6,0.0);
    }
    @Test
    public void adsCalculationTest1(){
        PropertyDetails propertyDetails8 = new PropertyDetails();
        propertyDetails8.setPurchasePrice(125000);
        propertyDetails8.setEffectiveDate(LocalDate.of(2022,12,30));
        propertyDetails8.setAdditionalDwelling("y");
        double result7 = secondHomeAds.priceCalculation(propertyDetails8);
        assertEquals(7500.0,result7,0.0);
    }
    @Test
    public void adsCalculationTest2(){
        PropertyDetails propertyDetails9 = new PropertyDetails();
        propertyDetails9.setPurchasePrice(39999);
        propertyDetails9.setEffectiveDate(LocalDate.of(2021,12,30));
        propertyDetails9.setAdditionalDwelling("y");
        double result9 = secondHomeAds.priceCalculation(propertyDetails9);
        assertEquals(0.0,result9,0.0);
    }
    @Test
    public void adsCalculationTest3(){
        PropertyDetails propertyDetails10 = new PropertyDetails();
        propertyDetails10.setPurchasePrice(125000);
        propertyDetails10.setEffectiveDate(LocalDate.of(2021,12,30));
        propertyDetails10.setAdditionalDwelling("y");
        double result10 = secondHomeAds.priceCalculation(propertyDetails10);
        assertEquals(5000.0,result10,0.0);
    }
    @Test
    public void adsCalculationTest4(){
        PropertyDetails propertyDetails11 = new PropertyDetails();
        propertyDetails11.setPurchasePrice(39999);
        propertyDetails11.setEffectiveDate(LocalDate.of(2018,12,30));
        propertyDetails11.setAdditionalDwelling("y");
        double result11 = secondHomeAds.priceCalculation(propertyDetails11);
        assertEquals(0.0,result11,0.0);
    }
    @Test
    public void adsCalculationTest5(){
        PropertyDetails propertyDetails12 = new PropertyDetails();
        propertyDetails12.setPurchasePrice(125000);
        propertyDetails12.setEffectiveDate(LocalDate.of(2018,12,30));
        propertyDetails12.setAdditionalDwelling("y");
        double result12 = secondHomeAds.priceCalculation(propertyDetails12);
        assertEquals(3750.0,result12,0.0);
    }
}