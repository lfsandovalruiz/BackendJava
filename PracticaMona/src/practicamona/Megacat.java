package practicamona;

public class Megacat extends Octocat{
    private String name = "Megacat";
    private String clothing = "Force Armor";
    private String job = "Full time Megaman";

    Megacat(){}

    public String getName(){
        return name;
    }

    public String getClothing(){
        return clothing;
    }

    public String getJob(){
        return job;
    }

    public void attack(){
        System.out.println("X-Buster");
    }
}
