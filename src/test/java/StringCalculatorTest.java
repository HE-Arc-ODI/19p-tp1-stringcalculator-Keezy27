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
    public  void testNparameters(){
        StringCalculator sc = new StringCalculator();
        int expected = 18;
        int actual = sc.Add("1,1,1,1,1,1,1,1,1,1,2,2,2,2");
        assertThat(actual,is(expected));
    }

    @Test
    public  void secondTestNparameters(){
        StringCalculator sc = new StringCalculator();
        int expected = 18;
        int actual = sc.Add("2,2,2,0,2,2,2,4,1,1");
        assertThat(actual,is(expected));
    }

    @Test
    public  void testWithCRandLN(){
        StringCalculator sc = new StringCalculator();
        int expected = 7;
        int actual = sc.Add("2,2\n3");
        assertThat(actual,is(expected));
    }
}
