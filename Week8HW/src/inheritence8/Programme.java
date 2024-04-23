package inheritence8;

public class Programme extends Employee {

    @Override
    public void calculate() {
        //super.calculate();

        System.out.println("Employee salary £ 45000");
    }

    public static void main(String[] args) {
        Programme p = new Programme();
        p.calculate();
    }
}
