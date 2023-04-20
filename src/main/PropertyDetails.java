package main;

import java.time.LocalDate;

public class PropertyDetails {
    private double purchasePrice;
    private LocalDate effectiveDate;
    private String firstHome;
    private String additionalDwelling;

    public double getLbtt() {
        return lbtt;
    }

    public void setLbtt(double lbtt) {
        this.lbtt = lbtt;
    }

    private double lbtt;

    public double getPurchasePrice() {return purchasePrice;}

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(LocalDate effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getFirstHome() {
        return firstHome;
    }

    public void setFirstHome(String firstHome) {
        this.firstHome = firstHome;
    }

    public String getAdditionalDwelling() {
        return additionalDwelling;
    }

    public void setAdditionalDwelling(String additionalDwelling) {
        this.additionalDwelling = additionalDwelling;
    }
}
