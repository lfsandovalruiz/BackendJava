package practicamona;

public class OctoVerse {
    public static void main(String[] args) {
        Octocat boxer = new Boxertocat();
        showOcto(boxer);

        Octocat Gore = new Goretocat();
        showOcto(Gore);

        Octocat kimono = new Kimonotocat();
        showOcto(kimono);

        Octocat mega = new Megacat();
        showOcto(mega);

        Octocat sentry = new Sentrytocat();
        showOcto(sentry);

        Octocat storm = new Stormtroopocat();
        showOcto(storm);

    }

    public static void showOcto(Octocat octo) {
        octo.attack();
    }
}
