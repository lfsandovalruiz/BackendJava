public class SpiderVerse {
    public static void main(String[] args) throws InterruptedException {
        ShowMultiverse();
    }

    public static void ShowMultiverse(){

        Screen screen = new Screen();
        MilesMorales mm = new MilesMorales();
        GwendolyneStacy gs = new GwendolyneStacy();
        PeterPorker pp = new PeterPorker();

        Runnable spiderAttacks = new Runnable()  {
            @Override
            public void run() {
                try {
                    // MilesMorales
                    mm.spiderCamuflaje(screen);
                    Thread.sleep(2000);
                    mm.spiderRegeneracion(screen);
                    Thread.sleep(2000);
                    mm.spiderRegeneracion(screen);
                    Thread.sleep(2000);
                    // GwendolyneStacy
                    gs.organicWeb(screen);
                    Thread.sleep(2000);
                    gs.spiderVaterista(screen);
                    Thread.sleep(2000);
                    gs.spiderVuelo(screen);
                    Thread.sleep(2000);
                    // PeterPorker
                    pp.spiderDog(screen);
                    Thread.sleep(2000);
                    pp.spiderMartillo(screen);
                    Thread.sleep(2000);
                    pp.spiderWeb(screen);
                    Thread.sleep(2000);

                } catch (InterruptedException ie){
                    ie.printStackTrace();
                }

            }
        };

        Thread attackVerse = new Thread(spiderAttacks);
        attackVerse.start();
    }
}
