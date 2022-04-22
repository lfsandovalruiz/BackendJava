package practicamona;

public class Octocat {

    private String name = "Octocat";
    private int numTentacles = 5;
    private String skinColor = "Black";

    Octocat(){}

    public String getName() {
        return this.name;
    }

    public int getNumTentacles() {
        return this.numTentacles;
    }

    public String getSkinColor(){
        return this.skinColor;
    }

    public String printState(){
        return "Name: " + name + "\n" +
                "Number of tentacles: " + numTentacles + "\n" +
                "Skin color: " + skinColor;
    }

    public void attack(){
        System.out.println("Tentacle attack");
    }
}
