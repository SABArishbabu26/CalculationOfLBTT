package main;

import java.util.ArrayList;
import java.util.List;

public class LbttTaxCalculator {
    public List<PropertyDetails> getTaxValue(List<PropertyDetails> propertyDetails){
        List<PropertyDetails> result = new ArrayList<>();
        for(PropertyDetails prop: propertyDetails){
            LbttCalculator lbttCalculator = getTaxService(prop.getFirstHome());
            double lbtt = lbttCalculator.priceCalculation(prop);
            System.out.println("lbtt returned for purchase price " + prop.getPurchasePrice() + " is " + lbtt);
            prop.setLbtt(lbtt);
            result.add(prop);
        }
        return result;
    }

    private LbttCalculator getTaxService(String firstHome) {
        if(firstHome.equalsIgnoreCase("Y")){
            FirstHome firstHomeObj = new FirstHome();
            return firstHomeObj;
        }else {
            SecondHomeAds secondHomeAdsObj = new SecondHomeAds();
            return secondHomeAdsObj;
        }
    }
}
