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

    public void testAdd2para() {
        // Arrange
        StringCalculator sc = new StringCalculator();
        int expected = 5;
        // Act
        int actual = sc.Add("3", "2");
        // Assert
        assertThat(actual, is(expected));
    }
    
    public void testAdd3para() {
        // Arrange
        StringCalculator sc = new StringCalculator();
        int expected = 15;
        // Act
        int actual = sc.Add("3", "2", "10");
        // Assert
        assertThat(actual, is(expected));
    }
}
