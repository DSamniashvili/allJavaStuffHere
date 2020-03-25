public class Triangle {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;

        Triangle[] ta = new Triangle[4];
        while(x<4){
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2; // 2, 6
            ta[x].length = (x + 4); // 4, 6
            ta[x].setArea(); // 343

            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x+1;
        }
        int y = x;
//        x = 27;
        Triangle t5 = ta[2];
        // t5 height is 6; length is 8; area is 18
        ta[2].area = 343;

        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea(){
        area = (height * length) / 2;
    }
}
