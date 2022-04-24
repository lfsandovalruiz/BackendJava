public class SpiderMan {
    private String name = "Peter Parker";
    private String suitColor = "Read and blue";
    private String skinColor = "White";

    SpiderMan(String name, String suitColor, String skinColor){
        this.name = name;
        this.suitColor = suitColor;
        this.skinColor = skinColor;
    }

    public String getName() {
        return name;
    }

    public String getSuitColor() {
        return suitColor;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public String printState(){
        return "Name: " + name + "\n" +
                "Suit Color: " + suitColor + "\n" +
                "Skin Color: " + skinColor;
    }
}
