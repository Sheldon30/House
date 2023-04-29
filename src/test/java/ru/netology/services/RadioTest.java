package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio service = new Radio();
        service.setStationNumber(5);
        int expected = 5;
        int actual = service.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetStation() {
        Radio service = new Radio();
        service.setStationNumber(15);
        int expected = 0;
        int actual = service.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetMinStation() {
        Radio service = new Radio();
        service.setStationNumber(-1);
        int expected = 0;
        int actual = service.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStation() {
        Radio service = new Radio();
        service.setStationNumber(5);
        service.nextStation();
        int expected = 6;
        int actual = service.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationMoreMax() {
        Radio service = new Radio();
        service.setStationNumber(9);
        service.nextStation();
        int expected = 0;
        int actual = service.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStation() {
        Radio service = new Radio();
        service.setStationNumber(7);
        service.prevStation();
        int expected = 6;
        int actual = service.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationLessMin() {
        Radio service = new Radio();
        service.setStationNumber(0);
        service.prevStation();
        int expected = 9;
        int actual = service.getStationNumber();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetSound() {
        Radio service = new Radio();
        service.setCurrentVolume(15);
        int expected = 15;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldNotSetSound() {
        Radio service = new Radio();
        service.setCurrentVolume(-1);
        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetSoundMax() {
        Radio service = new Radio();
        service.setCurrentVolume(100);
        service.increaseVolume();
        int expected = 100;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotIncreaseSoundMax() {
        Radio service = new Radio();
        service.setCurrentVolume(101);
        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio service = new Radio();
        service.setCurrentVolume(50);
        service.increaseVolume();
        int expected = 51;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldDecreaseVolume(){
        Radio service = new Radio();
        service.setCurrentVolume(50);
        service.decreaseVolume();
        int expected = 49;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetDecreaseVolume(){
        Radio service = new Radio();
        service.setCurrentVolume(50);
        service.decreaseVolume();
        int expected = 49;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetMinVolume() {
        Radio service = new Radio();
        service.setCurrentVolume(0);
        service.decreaseVolume();
        int expected = 0;
        int actual = service.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
