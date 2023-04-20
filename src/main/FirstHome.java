package main;

import java.time.LocalDate;

public class FirstHome implements LbttCalculator{
    double lbtt = 0;

    @Override
    public double priceCalculation(PropertyDetails propertyDetails) {

        if(propertyDetails.getEffectiveDate().isAfter(LocalDate.of(2020,7,15)) && propertyDetails.getEffectiveDate().isBefore(LocalDate.of(2021, 3, 31))){
            if(propertyDetails.getPurchasePrice() <= 250000){
                lbtt=0;
            }else if(propertyDetails.getPurchasePrice() > 250000 && propertyDetails.getPurchasePrice() <= 325000){
                lbtt= ((propertyDetails.getPurchasePrice() - 250000) * 0.05); //£250,001 to £325,000 - 5%
            }else if(propertyDetails.getPurchasePrice() > 325000 && propertyDetails.getPurchasePrice() <= 750000){
                lbtt=((325000 - 250000) * 0.05) + ((propertyDetails.getPurchasePrice() - 325000) * 0.1); //£325,001 to £750,000 - 10%
            }else if (propertyDetails.getPurchasePrice() > 750000) {
                lbtt =((325000 - 250000) * 0.05) + ((750000 - 325000) * 0.1) + ((propertyDetails.getPurchasePrice() - 750000) * 0.12); //Over £750,000 - 12%
            }
        }

        else if(propertyDetails.getEffectiveDate().isBefore(LocalDate.of(2020, 7, 15)) || propertyDetails.getEffectiveDate().isAfter(LocalDate.of(2021,3,31))){
            if(propertyDetails.getPurchasePrice() <= 175000){ //Up to £145,000 - 0% && A relief for first-time buyers is available, which increases the residential nil rate band of LBTT to £175,000.
                lbtt=0;
            }else if(propertyDetails.getPurchasePrice() > 175000 && propertyDetails.getPurchasePrice() <= 250000){
                lbtt=((propertyDetails.getPurchasePrice() - 145000) * 0.02)-600; //£175,001 to £250,000 - 2%
            }else if(propertyDetails.getPurchasePrice() > 250000 && propertyDetails.getPurchasePrice() <= 325000){
                lbtt=((250000 - 145000) * 0.02) + ((propertyDetails.getPurchasePrice() - 250000) * 0.05)-600; //£250,001 to £325,000 - 5%
            }else if(propertyDetails.getPurchasePrice() > 325000 && propertyDetails.getPurchasePrice() <= 750000){
                lbtt=((250000 - 145000) * 0.02) + ((325000 - 250000) * 0.05) + ((propertyDetails.getPurchasePrice() - 325000) * 0.1)-600; //£325,001 to £750,000 - 10%
            }else if (propertyDetails.getPurchasePrice() > 750000) {
                lbtt = ((250000 - 145000) * 0.02) + ((325000 - 250000) * 0.05) + ((750000 - 325000) * 0.1) + ((propertyDetails.getPurchasePrice() - 750000) * 0.12)-600; //Over £750,000 - 12%
            }
        }
        return lbtt;
    }
}
