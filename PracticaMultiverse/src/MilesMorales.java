public class MilesMorales extends SpiderMan implements MilesMoralesCallBacks{
    MilesMorales(){
        super("Miles Morales","Black and red", "Black");
    }

    @Override
    public void spiderCamuflaje(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("mm_camuflaje.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void spiderRegeneracion(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("mm_regeneracion.jpg");
        s.setBounds(200, 100, 1100, 900);
    }

    @Override
    public void pidaduraVeneno(Screen s) {
        s.setVisible(true);
        s.cls();
        s.repaint();
        s.out(printState(), "Helvetica", 28, Colors.BlueHorizon);
        s.showImage("mm_descarga.jpg");
        s.setBounds(200, 100, 1100, 900);
    }
}
