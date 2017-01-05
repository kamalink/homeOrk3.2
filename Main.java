package module3.homeOrk2;

class Main {
    public static void main(String[] args) {
        Arithmetic User1 = new Arithmetic();
        Adder User2 = new Adder();

        System.out.println(User1.add(10,12));
        System.out.println(User2.check(10,12));
    }
}
