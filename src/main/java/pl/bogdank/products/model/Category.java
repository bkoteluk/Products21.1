package pl.bogdank.products.model;

public enum Category {
    FOOD ("Artykuły spożywcze", "spozywcze"),
    HOUSEHOLD("Artykuły gospodarstwa domowego", "domowe"),
    OTHER("Pozostałe artykuły", "inne"),
    ALL("Wszystkie", "wszystkie");

    private String displayName;
    private String nickName;

    Category(String displayName, String nickName) {
        this.displayName = displayName;
        this.nickName = nickName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getNickName() {
        return nickName;
    }
}
