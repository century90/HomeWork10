package ru.netology.radio;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation () {
        return currentRadioStation;
    }

    public void setCurrentRadioStation (int newRadioStation) {
        currentRadioStation = newRadioStation;
    }

    public void setCurrentRadioStationOnNumber (int numberRadioStation) {
        currentRadioStation = numberRadioStation;

    }

    public void increaseRadioStationOnNumber () {
        if (currentRadioStation <= 9) {
            currentRadioStation = currentRadioStation;

        }
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }
    }

    public void increaseNextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= 9 && currentRadioStation < 10) {
            currentRadioStation = 9;
        }
        if (currentRadioStation >= 10) {
            currentRadioStation = 0;
        }
    }

    public void increasePrevRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
        }
    }


    public int getCurrentVolume () {
        return currentVolume;
    }
    public void setCurrentVolume (int newCurrentVolume) {
        currentVolume = newCurrentVolume;
    }

    public void increaseVolumeMore () {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

    public void increaseVolumeLess () {
        if (currentVolume < 10 && currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        if (currentVolume <= 0) {
            currentVolume = 0;
        }
        if (currentVolume >= 10) {
            currentVolume = 10;
        }
    }

}
