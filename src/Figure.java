public class Figure {
    int x,y; // Начальные координаты фигуры
    // Конструктор
    Figure(int x, int y){
        this.x=x;
        this.y=y;
    }
    // Метод рисовать
    public void draw(String s){
        System.out.println("Была нарисована фигура: " + s);
    }
}