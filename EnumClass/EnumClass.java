package EnumClass;

public enum EnumClass {
    
    STANDARD("Standar Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    //sama seperti class biasa, class enum pun bisa menambahkan field, method dan cunstroctor
    //khusus constructor, kita tidak bisa membuat sebagai public constructor
    
    private String description;

    EnumClass(String decription) {
        this.description = decription;
    }

    public String getDescription(){
        return description;
    }
}
