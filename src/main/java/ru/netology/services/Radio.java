package ru.netology.services;
public class Radio {
    private int stationNumber;
    private int currentVolume;

    public int getStationNumber() {

        return stationNumber;
    }

    public void setStationNumber(int stationNumber) {
        if (stationNumber < 0) {
            return;
        }
        if (stationNumber > 9) {
            return;
        }
        this.stationNumber = stationNumber;

    }

    public void nextStation() {
        if (stationNumber != 9) {
            stationNumber++;
        } else {
            stationNumber = 0;
        }

    }
    public void prevStation(){
        if (stationNumber != 0) {
            stationNumber--;
        } else {
            stationNumber = 9;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0){
            return;
        }
        if (currentVolume > 100){
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            currentVolume = 100;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
          currentVolume--;
        }else {
            currentVolume = 0;
        }
    }

}
