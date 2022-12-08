public class Square extends Figure{
    public int side; // Размер стороны квадрата
    // Конструктор
    public Square(int x, int y, int side) {
// Обращение к родительскому конструктору
        super(x, y);
        this.side=side;
    }
}