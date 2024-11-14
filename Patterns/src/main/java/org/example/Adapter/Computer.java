package org.example.Adapter;

// Класс, представляющий компьютер, который может читать данные с USB-устройств
class Computer {
    public void readFromUSB(USBDevice usbDevice) {
        usbDevice.readData();
    }
}