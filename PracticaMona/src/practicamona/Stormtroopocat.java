package practicamona;

public class Stormtroopocat extends Octocat{
    private String name = "Stormtroopocat";
    private String clothing = "Clone armor";
    private String job = "Clone in the service of Darth Vader";

    Stormtroopocat(){}

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
        System.out.println("Laser beam");
    }
}
