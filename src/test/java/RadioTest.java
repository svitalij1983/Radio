import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RadioTest {

    @Test
    public void testRadio() {
        Radio radio = new Radio();

        radio.setCurrentStation(7);

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testRadioNegative() {
        Radio radio = new Radio();

        radio.setCurrentStation(-7);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testRadioPositive() {
        Radio radio = new Radio();

        radio.setCurrentStation(17);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testRadioLeftBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testRadioLeftBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testRadioLeftBoundary3() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testRadioRightBoundary1() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testRadioRightBoundary2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testRadioRightBoundary3() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testRadioNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);

        radio.NextStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testRadioNextStationLeftBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.NextStation();

        Assertions.assertEquals(1, radio.getCurrentStation());
    }

    @Test
    public void testRadioNextStationLeftBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.NextStation();

        Assertions.assertEquals(2, radio.getCurrentStation());
    }

    @Test
    public void testRadioNextStationRightBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.NextStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testRadioNextStationRightBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.NextStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testRadioPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testRadioPrevStationLeftBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);

        radio.prevStation();

        Assertions.assertEquals(0, radio.getCurrentStation());
    }

    @Test
    public void testRadioPrevStationLeftBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);

        radio.prevStation();

        Assertions.assertEquals(9, radio.getCurrentStation());
    }

    @Test
    public void testRadioPrevStationRightBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);

        radio.prevStation();

        Assertions.assertEquals(8, radio.getCurrentStation());
    }

    @Test
    public void testRadioPrevStationRightBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);

        radio.prevStation();

        Assertions.assertEquals(7, radio.getCurrentStation());
    }

    @Test
    public void testRadio1() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(15);
        Assertions.assertEquals(15, radio.getCurrentStation());

    }

    @Test
    public void testRadioVolumeInValid() {

        Radio radio = new Radio();

        radio.setCurrentVolume(50);
        Assertions.assertEquals(50, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeInValidNegative() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-50);
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeInValidPositive() {

        Radio radio = new Radio();

        radio.setCurrentVolume(150);
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeLeftBoundary1() {

        Radio radio = new Radio();

        radio.setCurrentVolume(-1);
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeLeftBoundary2() {

        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeLeftBoundary3() {

        Radio radio = new Radio();

        radio.setCurrentVolume(1);
        Assertions.assertEquals(1, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeSingleDigit1() {

        Radio radio = new Radio();

        radio.setCurrentVolume(8);
        Assertions.assertEquals(8, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeSingleDigit2() {

        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        Assertions.assertEquals(9, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeTwoDigit1() {

        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        Assertions.assertEquals(10, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeTwoDigit2() {

        Radio radio = new Radio();

        radio.setCurrentVolume(11);
        Assertions.assertEquals(11, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeRightBoundary1() {

        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        Assertions.assertEquals(99, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeRightBoundary2() {

        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        Assertions.assertEquals(100, radio.getCurrentVolume());

    }

    @Test
    public void testRadioVolumeRightBoundary3() {

        Radio radio = new Radio();

        radio.setCurrentVolume(101);
        Assertions.assertEquals(0, radio.getCurrentVolume());

    }

    @Test
    public void testRadioNextVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.NextVolume();

        Assertions.assertEquals(51, radio.getCurrentVolume());
    }

    @Test
    public void testRadioNextVolumeLeftBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.NextVolume();

        Assertions.assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    public void testRadioNextVolumeLeftBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.NextVolume();

        Assertions.assertEquals(2, radio.getCurrentVolume());
    }


    @Test
    public void testRadioNextVolumeRightBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);

        radio.NextVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }

    @Test
    public void testRadioNextVolumeRightBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.NextVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testRadioNextVolumeRightBoundary3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.NextVolume();

        Assertions.assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    public void testRadioPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.prevVolume();

        Assertions.assertEquals(49, radio.getCurrentVolume());
    }

    @Test
    public void testRadioPrevVolumeLeftBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.prevVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testRadioPrevVolumeLeftBoundary2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.prevVolume();

        Assertions.assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    public void testRadioPrevVolumeRightBoundary1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.prevVolume();

        Assertions.assertEquals(99, radio.getCurrentVolume());
    }


}

