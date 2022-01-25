public class JavaCore3 {
    public static void main(String[] args) {
        String changer[] = {"1", "2", "5", "7", "9", "11"};
        Fruits.Swaper.swap(changer,2, 3);

        Fruits.Box box1 = new Fruits.Box();
        Fruits.Box box2 = new Fruits.Box();
        box1.add(new Fruits.Apple());
        box1.add(new Fruits.Orange());
        box2.add(new Fruits.Apple());

        System.out.println(box1.compare(box2));
    }
}
