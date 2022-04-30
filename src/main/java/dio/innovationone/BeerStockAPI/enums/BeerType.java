package dio.innovationone.BeerStockAPI.enums;

public enum BeerType {

    LAGER("Lager"),
    MALZBIER("Malzbier"),
    WITBIER("Witbier"),
    WEISS("Weiss"),
    ALE("Ale"),
    IPA("IPA"),
    STOUT("Stout");

    private final String descrition;

    BeerType(String descrition) {
        this.descrition = descrition;
    }

    public String getDescrition() {
        return descrition;
    }
}
