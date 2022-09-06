package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldIncreaseRadioStationMore() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(5);

        radio.increaseNextRadioStation();

        int expected = 6;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldIncreaseRadioStationNextEquals9() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(9);

        radio.increaseNextRadioStation();

        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }



    @Test
    public void shouldIncreaseRadioStationLess() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(5);

        radio.increasePrevRadioStation();

        int expected = 4;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStationLess0() {
        Radio radio = new Radio ();
        radio.setCurrentRadioStation(-1);

        radio.increasePrevRadioStation();

        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseRadioStationEquals0() {
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

    @Test
    public void shouldIncreaseNextVolume() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(9);

        radio.increaseVolumeMore ();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextVolumeMore10() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(11);

        radio.increaseVolumeMore ();

        int expected =10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseNextVolumeEquals10() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(10);

        radio.increaseVolumeMore ();

        int expected =10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevVolume() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(9);

        radio.increaseVolumeLess ();

        int expected = 8;
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
    public void shouldIncreasePrevVolumeEquals10() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(10);

        radio.increaseVolumeLess ();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreasePrevVolumeMore10() {
        Radio radio = new Radio ();
        radio.setCurrentVolume(11);

        radio.increaseVolumeLess ();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

}
