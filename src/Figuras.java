public class Figuras {
    int a;
    int b;

     int trocarFigura (int a, int b) {
        if ((a % b) == 0) {
            return b;
        }
            return trocarFigura(b, a % b);
    }
}
