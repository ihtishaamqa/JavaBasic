package JavaBeginner;

public class NestedIfElseStatement {
    public static void main(String[] args) {
        int apple =20;
        if (apple==20){
            if (apple<30)
                System.out.println("Apple less than 30");
            if (apple<25)
                System.out.println("Apple less than 25");
            else
                System.out.println("Apple greater than 30");
        }
    }
}
