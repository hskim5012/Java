package com.codingdojo.phone;

public class iPhone extends Phone implements Ringable {
    public iPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return "Iphone ringtone";
    }
    @Override
    public String unlock() {
        return "facial recognition";
    }
}