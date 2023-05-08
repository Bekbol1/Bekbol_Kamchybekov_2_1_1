public class Production {
    private String nameProd;
    private String countryOfProd;

    public Production(String nameProd, String countryOfProd) {
        this.nameProd = nameProd;
        this.countryOfProd = countryOfProd;
    }
    public Production(){};
    public String getNameProd() {
        return nameProd;
    }

    public String getCountryOfProd() {
        return countryOfProd;
    }
}
