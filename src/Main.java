public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10,10);
        Square square = new Square(15,15,10);
        circle.radius=15;
        circle.draw("круг"); // Вызов методов draw
        square.draw("квадрат"); // Вызов методов draw

        // Выведем на консоль значения полей наших объектов
        System.out.println("Значения класса Circle: " +
                circle.radius + " " + circle.x + " " + circle.y);
        System.out.println("Значения класса Square: " +
                square.side + " " + square.x + " " + square.y);
    }
}