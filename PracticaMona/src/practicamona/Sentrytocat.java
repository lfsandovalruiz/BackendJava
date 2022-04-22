package practicamona;

public class Sentrytocat extends Octocat{
    private String name = "Sentrytocat";
    private String clothing = "Firefighter suit";
    private String job = "Firefighter";

    Sentrytocat(){}

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
        System.out.println("Waterjet");
    }
}
