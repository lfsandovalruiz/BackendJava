public class ComicMain {
    public static void main(String[] args) {
        ReadComic();
    }

    public static void ReadComic(){
        Screen screen = new Screen();
        Champions champ = new Champions();

        Runnable pages = new Runnable() {
            @Override
            public void run() {
                try {
                    champ.ShowCover(screen);
                    Thread.sleep(5000);
                    champ.ShowPage01(screen);
                    Thread.sleep(5000);
                    champ.ShowPage02(screen);
                    Thread.sleep(5000);
                    champ.ShowPage03(screen);
                    Thread.sleep(5000);
                    champ.ShowPage04(screen);
                    Thread.sleep(5000);
                    champ.ShowPage05(screen);
                    Thread.sleep(5000);
                    champ.ShowPage06(screen);
                    Thread.sleep(5000);
                    champ.ShowPage07(screen);
                    Thread.sleep(5000);
                    champ.ShowPage08(screen);
                    Thread.sleep(5000);
                    champ.ShowPage09(screen);
                    Thread.sleep(5000);
                    champ.ShowPage10(screen);
                    Thread.sleep(5000);
                    champ.ShowPage11(screen);
                    Thread.sleep(5000);
                    champ.ShowPage12(screen);
                    Thread.sleep(5000);
                    champ.ShowPage13(screen);
                    Thread.sleep(5000);
                    champ.ShowPage14(screen);
                    Thread.sleep(5000);
                    champ.ShowPage15(screen);
                    Thread.sleep(5000);
                    champ.ShowPage16(screen);
                    Thread.sleep(5000);
                    champ.ShowPage17(screen);
                    Thread.sleep(5000);
                    champ.ShowPage18(screen);
                    Thread.sleep(5000);
                    champ.ShowPage19(screen);
                    Thread.sleep(5000);
                    champ.ShowPage20(screen);
                    Thread.sleep(5000);
                }catch (InterruptedException ie){
                    ie.printStackTrace();
                }
            }
        };

        Thread championsComic = new Thread(pages);
        championsComic.start();

    }
}
