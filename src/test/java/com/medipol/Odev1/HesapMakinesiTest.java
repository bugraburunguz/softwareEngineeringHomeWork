package com.medipol.Odev1;

import Odev1.HesapMakinesi;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;


public class HesapMakinesiTest {
    @Test
    public void addition() {

        final HesapMakinesi calculation = new HesapMakinesi();

        int response = calculation.toplama(1,2);
        assertTrue(response == 3);

    }


    @Test
    public void addition2() {

        final HesapMakinesi calculation = new HesapMakinesi();

        int response = calculation.addition(3, 5);
        assertTrue(response == 8);

    }

    @Test
    public void subtractionTest() {

        final HesapMakinesi calculation = new HesapMakinesi();

        int response = calculation.subtraction(5, 3);
        assertTrue(response == 2);

    }
    @Test
    public void multiplicationTest() {

        final HesapMakinesi calculation = new HesapMakinesi();

        int response = calculation.to_multiply(5, 3);
        assertTrue(response == 15);

    }
   @Test
    public void divisionTest() {

        final HesapMakinesi calculation = new HesapMakinesi();

        double response = calculation.division(10, 2);
        assertTrue(response == 5);

    }
   @Test
    public void percentTest() {

        final HesapMakinesi calculation = new HesapMakinesi();

        double response = calculation.percent(100, 10 , 100);
        assertTrue(response == 10);

    }

    @Test
    public void AİçerenKelimelerGeriDonmeli(){

        final ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("Buğra");
        inputs.add("Burak");
        inputs.add("Yeliz");
        inputs.add("Ayşe");
        inputs.add("Mert");
        inputs.add("Gamze");

        int count = new HesapMakinesi().aIcerenKelimelerinSayisi(inputs);

        assertTrue(count == 4);
    }

    @Test
    public void shouldReturnCountOfWordsWhichContainsA2(){

        final ArrayList<String> inputs = new ArrayList<String>();
        inputs.add("armut");
        inputs.add("furkan");
        inputs.add("ananas");
        inputs.add("medipol");

        int count = new HesapMakinesi().aIcerenKelimelerinSayisi(inputs);

        assertTrue(count == 3);
    }
}


