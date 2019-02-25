/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author carmine.pernagut
 */
public class StringCalculatorTest {

    private StringCalculator sc;

    @Before
    public void setup() {
    }

    @Test
    public void testAdd0para() {
        // Arrange
        StringCalculator sc = new StringCalculator();
        int expected = 0;
        // Act
        // Assert
        assertThat(sc.Add(), is(expected));
    }

    @Test
    public void testAdd2para() {
        // Arrange
        StringCalculator sc = new StringCalculator();
        int expected = 5;
        // Act
        int actual = sc.Add("3,2");
        // Assert
        assertThat(actual, is(expected));
    }

    @Test
    public  void testNpara(){
        StringCalculator sc = new StringCalculator();
        int expected = 18;
        int actual = sc.Add("1,1,1,1,1,1,1,1,1,1,2,2,2,2");
        assertThat(actual,is(expected));
    }

    @Test
    public  void testNparaBigger10(){
        StringCalculator sc = new StringCalculator();
        int expected = 147;
        int actual = sc.Add("20,14,17,6+90");
        assertThat(actual,is(expected));
    }

    @Test
    public  void testWithNL(){
        StringCalculator sc = new StringCalculator();
        int expected = 7;
        int actual = sc.Add("2,2\n3");
        assertThat(actual,is(expected));
    }

    @Test
    public void testMultiDelemiter(){
        StringCalculator sc = new StringCalculator();
        int expected = 90;
        int actual = sc.Add("10,20,30//;\n5;5;20");
        assertThat(actual,is(expected));
    }

    @Test
    public void testNegNumber(){
        StringCalculator sc = new StringCalculator();
        int expected = 48;
        int actual = sc.Add("68-20");
    }
}
