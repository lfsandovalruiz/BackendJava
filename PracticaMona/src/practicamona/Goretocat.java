package practicamona;

public class Goretocat extends Octocat{
    private String name = "Goretocat";
    private String clothing = "Jersey and pants";
    private String job = "Futbol player";

    Goretocat(){}

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
        System.out.println("Tackle!!!");
    }
}
