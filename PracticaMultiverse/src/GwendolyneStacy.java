public class GwendolyneStacy extends SpiderMan implements GwendolyneStacyCallBacks{
    GwendolyneStacy(){
        super("Gwendolyne Stacy", "White, black and pink", "White");
    }

    @Override
    public void organicWeb(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("gs_organicWeb.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void spiderVaterista(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("gs_spiderVaterista.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void spiderVuelo(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("gs_spiderVuelo.jpg");
        s.setBounds(200, 100, 1100, 900);
    }
}
