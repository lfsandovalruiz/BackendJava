package practicamona;

public class Boxertocat extends Octocat{
    private String name = "Boxertocar";
    private String clothing = "Boxing gloves and headband";
    private String job = "Boxer";

    Boxertocat(){}

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
        System.out.println("boxer punch");
    }

}
