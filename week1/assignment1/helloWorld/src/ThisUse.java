class Super {
    int num = 20;

    public void display() {
        System.out.println("super class method");
    }
}

public class ThisUse extends Super {
    int num;

    public ThisUse(int num) {
        this.num = num;
    }

    public void display() {
        System.out.println("display method");
    }

    public void show() {
        this.display(); // calls current class's display()
        display();      // same as above
        System.out.println(this.num); // current class num = 10
        System.out.println(num);      // same
    }

    public static void main(String[] args) {
        ThisUse o = new ThisUse(10);
        o.show();
    }
}
