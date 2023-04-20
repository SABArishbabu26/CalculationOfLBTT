package test;

import main.LbttTaxCalculator;
import main.PropertyDetails;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LbttTaxCalculatorTest {

    LbttTaxCalculator lbttTaxCalculator = new LbttTaxCalculator();

    @Test
    public void getTaxValueTest(){
        List<PropertyDetails> propertyDetailsList = new ArrayList<>();
        PropertyDetails propertyDetails = new PropertyDetails();
        propertyDetails.setPurchasePrice(175000.0);
        propertyDetails.setEffectiveDate(LocalDate.now());
        propertyDetails.setFirstHome("N");
        propertyDetails.setAdditionalDwelling("N");
        propertyDetailsList.add(propertyDetails);

        PropertyDetails propertyDetails1 = new PropertyDetails();
        propertyDetails1.setPurchasePrice(1000000.99);
        propertyDetails1.setEffectiveDate(LocalDate.of(2023,4,4));
        propertyDetails1.setFirstHome("N");
        propertyDetails1.setAdditionalDwelling("Y");
        propertyDetailsList.add(propertyDetails1);

        List<PropertyDetails> result = lbttTaxCalculator.getTaxValue(propertyDetailsList);
        for(PropertyDetails list:result){
            if(list.getPurchasePrice()==175000.0){
                assertEquals(list.getLbtt(),600.0,0.0);
            }else{
                assertEquals(list.getLbtt(),138350.0,0.1);
            }
        }
    }
}
