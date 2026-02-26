package nomor2;

public class TestAllShapes {
    public static void main(String[] args) {

        System.out.println("=== TEST SHAPE ===");
        Shape s1 = new Shape();
        System.out.println(s1);

        Shape s2 = new Shape("red", false);
        System.out.println(s2);

        System.out.println("\n=== TEST CIRCLE ===");
        Circle c1 = new Circle();
        System.out.println(c1);
        System.out.println("Area = " + c1.getArea());
        System.out.println("Perimeter = " + c1.getPerimeter());

        Circle c2 = new Circle(2.5, "blue", true);
        System.out.println(c2);
        System.out.println("Area = " + c2.getArea());
        System.out.println("Perimeter = " + c2.getPerimeter());

        System.out.println("\n=== TEST RECTANGLE ===");
        Rectangle r1 = new Rectangle();
        System.out.println(r1);
        System.out.println("Area = " + r1.getArea());
        System.out.println("Perimeter = " + r1.getPerimeter());

        Rectangle r2 = new Rectangle(2.0, 4.0, "yellow", false);
        System.out.println(r2);
        System.out.println("Area = " + r2.getArea());
        System.out.println("Perimeter = " + r2.getPerimeter());

        System.out.println("\n=== TEST SQUARE ===");
        Square sq1 = new Square();
        System.out.println(sq1);
        System.out.println("Area = " + sq1.getArea());
        System.out.println("Perimeter = " + sq1.getPerimeter());

        Square sq2 = new Square(5.0, "black", true);
        System.out.println(sq2);

        // uji setter (harus tetap persegi)
        sq2.setSide(7.0);
        System.out.println("After setSide(7.0): " + sq2);

        sq2.setWidth(10.0);
        System.out.println("After setWidth(10.0): " + sq2);

        sq2.setLength(3.0);
        System.out.println("After setLength(3.0): " + sq2);
    }
}