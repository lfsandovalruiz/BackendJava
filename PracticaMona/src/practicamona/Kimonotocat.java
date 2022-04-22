package practicamona;

public class Kimonotocat extends Octocat{
    private String name = "Kimonotocat";
    private String clothing = "Kimono and sword";
    private String job = "Professional samurai";

    Kimonotocat(){}

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
        System.out.println("Hack and slash");
    }
}
