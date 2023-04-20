package main;

import java.time.LocalDate;

public class SecondHomeAds implements LbttCalculator{
    double lbtt = 0;

    @Override
    public double priceCalculation(PropertyDetails propertyDetails) {
        double additionalDwelling=0.0;
        if (propertyDetails.getEffectiveDate().isBefore(LocalDate.of(2020, 7, 15)) || propertyDetails.getEffectiveDate().isAfter(LocalDate.of(2021, 3, 31))) {
            if (propertyDetails.getPurchasePrice() <= 145000) {
                lbtt = 0;
            } else if (propertyDetails.getPurchasePrice() > 145000 && propertyDetails.getPurchasePrice() <= 250000) {
                lbtt = (propertyDetails.getPurchasePrice() - 145000) * 0.02;
            } else if (propertyDetails.getPurchasePrice() > 250000 && propertyDetails.getPurchasePrice() <= 325000) {
                lbtt = ((250000 - 145000) * 0.02) + ((propertyDetails.getPurchasePrice() - 250000) * 0.05);
            } else if (propertyDetails.getPurchasePrice() > 325000 && propertyDetails.getPurchasePrice() <= 750000) {
                lbtt = ((250000 - 145000) * 0.02) + ((325000 - 250000) * 0.05) + ((propertyDetails.getPurchasePrice() - 325000) * 0.1);
            } else if (propertyDetails.getPurchasePrice() > 750000) {
                lbtt = ((250000 - 145000) * 0.02) + ((325000 - 250000) * 0.05) + ((750000 - 325000) * 0.1) + ((propertyDetails.getPurchasePrice() - 750000) * 0.12);
            }
        } else if (propertyDetails.getEffectiveDate().isAfter(LocalDate.of(2020, 7, 15)) && propertyDetails.getEffectiveDate().isBefore(LocalDate.of(2021, 3, 31))) {
            if (propertyDetails.getPurchasePrice() <= 250000) {
                lbtt = 0;
            } else if (propertyDetails.getPurchasePrice() > 250000 && propertyDetails.getPurchasePrice() <= 325000) {
                lbtt = ((propertyDetails.getPurchasePrice() - 250000) * 0.05);
            } else if (propertyDetails.getPurchasePrice() > 325000 && propertyDetails.getPurchasePrice() <= 750000) {
                lbtt = ((325000 - 250000) * 0.05) + ((propertyDetails.getPurchasePrice() - 325000) * 0.1);
            } else if (propertyDetails.getPurchasePrice() > 750000) {
                lbtt = ((325000 - 250000) * 0.05) + ((750000 - 325000) * 0.1) + ((propertyDetails.getPurchasePrice() - 750000) * 0.12);
            }
        }
        if (propertyDetails.getAdditionalDwelling().equalsIgnoreCase("y")) {
            additionalDwelling = adsCalculation(propertyDetails);
        }

        return additionalDwelling+lbtt;
    }

    public double adsCalculation(PropertyDetails propertyDetails){
        double ads = 0;
        if(propertyDetails.getEffectiveDate().isAfter(LocalDate.of(2022,12,16))){
            if(propertyDetails.getPurchasePrice()<40000){
                return 0.0;
            }else {
                ads = propertyDetails.getPurchasePrice()*0.06;
            }
        }else if(propertyDetails.getEffectiveDate().isAfter(LocalDate.of(2019,1,25)) && propertyDetails.getEffectiveDate().isBefore(LocalDate.of(2022,12,16))){
            if(propertyDetails.getPurchasePrice()<40000){
                return 0.0;
            }else {
                ads = propertyDetails.getPurchasePrice()*0.04;
            }
        }else if(propertyDetails.getEffectiveDate().isBefore(LocalDate.of(2019,1,25))){
            if(propertyDetails.getPurchasePrice()<40000){
                return 0.0;
            }else {
                ads = propertyDetails.getPurchasePrice()*0.03;
            }
        }
        return ads;
    }
}
