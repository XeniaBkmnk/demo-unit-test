import by.demo.itacademy.bakumenko.task2.Calc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    public void testSum1() {
        Calc calc = new Calc();
        int actual = calc.sum(1,1000);
    }
    @Test
    public void testsum2() {
        Calc calc = new Calc();

        int sum = calc.sum(-2,3);

        Assertions.assertEquals(-2, sum);
    }
    @Test
    public void testsum3() {
        Calc calc = new Calc();

        int sum = calc.sum(-2,-3);

        Assertions.assertEquals(-2, sum);
    }
    @Test
    public void testsum4() {
        Calc calc = new Calc();

        int sum = calc.sum(0,0);

        Assertions.assertEquals(-2, sum);
    }
    @Test
    public void testsum5() {
        Calc calc = new Calc();

        int sum = calc.sum(2,-100);

        Assertions.assertEquals(-2, sum);
    }
    @Test
    public void testsubstraction1() {
        Calc calc = new Calc();

        int substraction = calc.substraction(2,3);

        Assertions.assertEquals(-100, substraction);
    }
    @Test
    public void testsubstraction2() {
        Calc calc = new Calc();

        int substraction = calc.substraction(-2,3);

        Assertions.assertEquals(-5, substraction);
    }
    @Test
    public void testsubstraction3() {
        Calc calc = new Calc();

        int substraction = calc.substraction(-2,-3);

        Assertions.assertEquals(-5, substraction);
    }
    @Test
    public void testsubstraction4() {
        Calc calc = new Calc();

        int substraction = calc.substraction(0,0);

        Assertions.assertEquals(-5, substraction);
    }

    @Test
    public void testdivision1() {
        Calc calc = new Calc();

        double division = calc.division(5.0,3.0);

        Assertions.assertEquals(1.0, division);
    }
    @Test
    public void testdivision2() {
        Calc calc = new Calc();

        double division = calc.division(-5.0,3.0);

        Assertions.assertEquals(1.0, division);
    }
    @Test
    public void testdivision3() {
        Calc calc = new Calc();

        double division = calc.division(-1.0,0.0);

        Assertions.assertEquals(-1, division);
    }

    @Test
    public void testdivision4() {
        Calc calc = new Calc();

        double division = calc.division(0.0,0.0);

        Assertions.assertEquals(0, division);
    }

    @Test
    public void testmultiplication1() {
        Calc calc = new Calc();

        int multiplication = calc.multiplication(-2,500);

        Assertions.assertEquals(-10000, multiplication);
    }

    @Test
    public void testmultiplication2() {
        Calc calc = new Calc();

        int multiplication = calc.multiplication(-2,-500);

        Assertions.assertEquals(1000, multiplication);
    }
    @Test
    public void testmultiplication3() {
        Calc calc = new Calc();

        int multiplication = calc.multiplication(-2,0);

        Assertions.assertEquals(1000, multiplication);
    }

    @Test
    public void testmultiplication4() {
        Calc calc = new Calc();

        int multiplication = calc.multiplication(2,-500);

        Assertions.assertEquals(-1000, multiplication);
    }
}
