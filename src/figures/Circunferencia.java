package figures;

package utilidades
public class Circunferencia {
    public static final String COLOR = "rojo";
    public static final double PI= 3.1416;
    private double ràdio;
    public Circunferencia(double radio)
    {
        this.ràdio = radio;
    }


    public void imprimir()
    {
        String d = "Diámetro: " + 2 * ràdio;
        System.out.println(d);
        System.out.println("Color: " + COLOR);
        double area = CalcularArea();
        System.out.println(area);
    }

    private double CalcularArea() {
        double area = 2 * PI * ràdio * ràdio;
        return area;
    }

    public boolean esIgual (boolean considerarDecimal, Circunferencia otro)
    {
        double radio1 = this.ràdio;
        double radio2 = otro.ràdio;
        if (considerarDecimal)
        {
            if (radio1 == radio2)
                return true;
            else
                return false;

        }
        else
        {
            if (Math.abs(radio1-radio2)<1)
                return true;
            else
                return false;
        }
    }
}
