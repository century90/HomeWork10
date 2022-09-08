package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseRadioStation () {
        Radio radio = new Radio();

        Assertions.assertEquals( 0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
    }

    @Test
    public void shouldIncreaseRadioStationForQuantity () {
        Radio radio = new Radio(10);

        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void shouldIncreaseNextRadioStationMore() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(8);

        radio.increaseNextRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseNextRadioStationEquals9() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(9);

        radio.increaseNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextRadioStationEquals0() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(0);

        radio.increaseNextRadioStation();

        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextRadioStationMore9() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(10);

        radio.increaseNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextRadioStationLess0() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(-1);

        radio.increaseNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevRadioStationLess() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(1);

        radio.increasePrevRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevRadioStationLess0() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(-1);

        radio.increasePrevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevRadioStationEquals0() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(0);

        radio.increasePrevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStationEquals9() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(9);

        radio.increasePrevRadioStation();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }



    @Test
    public void shouldIncreaseRadioStationOnNumber() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStationOnNumber(8);

        radio.increaseRadioStationOnNumber();

        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStationOnNumberMore9() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStationOnNumber(10);

        radio.increaseRadioStationOnNumber();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseRadioStationOnNumberEquals9() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStationOnNumber(9);

        radio.increaseRadioStationOnNumber();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    //тест на громкость


    @Test
    public void shouldIncreaseNextVolume() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(99);

        radio.increaseVolumeMore ();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextVolumeMore100() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(101);

        radio.increaseVolumeMore ();

        int expected =100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextVolumeEquals100() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(100);

        radio.increaseVolumeMore ();

        int expected =100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextVolumeEquals0() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(0);

        radio.increaseVolumeMore ();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextVolumeLess0() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(-1);

        radio.increaseVolumeMore ();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }



    @Test
    public void shouldIncreasePrevVolume() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(99);

        radio.increaseVolumeLess ();

        int expected = 98;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevVolumeLess0() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(-1);

        radio.increaseVolumeLess ();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevVolumeEquals0() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(0);

        radio.increaseVolumeLess ();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevVolumeEquals100() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(100);

        radio.increaseVolumeLess ();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevVolumeMore100() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(101);

        radio.increaseVolumeLess ();

        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }







}
