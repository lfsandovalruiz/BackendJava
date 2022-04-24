public class PeterPorker extends SpiderMan implements PeterPorkerCallBacks{
    PeterPorker(){
        super("Peter Porker", "Red and blue", "Pink");
    }

    @Override
    public void spiderDog(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("pp_spiderDog.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void spiderMartillo(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("pp_spiderMartillo.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void spiderWeb(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("pp_spiderWeb.jpg");
        s.setBounds(200, 100, 1100, 900);
    }
}
