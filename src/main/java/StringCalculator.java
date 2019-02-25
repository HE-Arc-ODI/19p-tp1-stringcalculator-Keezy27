/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author carmine.pernagut
 */
public class StringCalculator {
    public StringCalculator() {

    }

    public int Add() {
        return 0;
    }

    public int Add(String numbers) {
        int result = 0;
        int tempValue;
        ArrayList<String> listNegative = new ArrayList<>();
        //extract number in string
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(numbers);
        while (m.find()) {
            tempValue  = Integer.valueOf(m.group());
            if(tempValue < 0) {
                listNegative.add(m.group());
            }
            result += tempValue;
        }

        if (listNegative.size() > 0) {

            throw new IllegalArgumentException("No negative allowed");
        }
        return result;
    }
}
