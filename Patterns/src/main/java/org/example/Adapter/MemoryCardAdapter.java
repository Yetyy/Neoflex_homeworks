package org.example.Adapter;

// Адаптер для карты памяти, реализующий интерфейс USBDevice
class MemoryCardAdapter implements USBDevice {
    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        memoryCard.readMemoryCardData();
    }
}