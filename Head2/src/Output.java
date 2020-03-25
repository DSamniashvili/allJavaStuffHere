public class Output {
    public static void main(String[] args) {
        Output o = new Output();
        o.go();
    }

    void go() {
        int y = 7;
        for (int x = 1; x < 8; x++) {
            y++;
            if (x > 4) {
                System.out.println(++y + " ");
                System.out.println("y = " + y);
            }
            if (y > 14) {
                System.out.println(" x = " + x);
                break;
            }
        }
    }
}

class MultiFor {
    public static void main(String[] args) {
        for (int x = 0; x < 4; x++) {
            for (int y = 4; y > 2; y--) {
                System.out.println(x + " " + y);
                if (x == 1) {
                    x++;
                }
            }

        }
    }
}
