package test;

import junit.framework.TestCase;
import main.Integers;
import org.junit.Test;
import org.junit.Assert.*;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by C0952235 on 02/10/2016.
 */
public class IntegersCheckYourWork {

    @Test
    public void simpleNumbersTest(){
        Integers numbers = new Integers();
        try {
            numbers.simpleNumbers();
            System.out.print("Well Done!");
        } catch (AssertionError e){
            System.out.print("Hmm, lets try that one again\n\n");
            fail();
        }
    }

    @Test
    public void numbersCanFloatTest(){
        Integers numbers = new Integers();
        try {
            numbers.numbersCanFloat();
            System.out.print("Well Done!");
        } catch (AssertionError e){
            System.out.print("Hmm, lets try that one again\n\n");
            fail();
        }
    }

    @Test
    public void numberOperatorsTest(){
        Integers numbers = new Integers();
        try {
            numbers.numberOperators();
            System.out.print("Well Done!");
        } catch (AssertionError e){
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void differentNumberOperatorsTest(){
        Integers numbers = new Integers();
        try {
            numbers.differentNumberOperators();
            System.out.print("Well Done!");
        } catch (AssertionError e){
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void fractionsTest(){
        Integers numbers = new Integers();
        try {
            numbers.fractions();
            System.out.print("Well Done!");
        } catch (AssertionError e){
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void remaindersTest(){
        Integers numbers = new Integers();
        try {
            numbers.remainders();
            System.out.print("Well Done!");
        } catch (AssertionError e){
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }

    @Test
    public void numberToStringTest(){
        Integers numbers = new Integers();
        try {
            assertEquals("The number of floors in the building is 7",numbers.numberToString());
            System.out.print("Well Done!");
        } catch (AssertionError e){
            System.out.print("Hmm, are you sure that's right?\n\n");
            e.printStackTrace();
            fail();
        }
    }

    @Test
    public void stringToNumberTest(){
        Integers numbers = new Integers();
        try {
            assertEquals("4",numbers.stringToNumber());
            System.out.print("Well Done!");
        } catch (NumberFormatException e){
            System.out.print("Hmm, are you sure that's right?\n\n");
            fail();
        }
    }
}
