package com.spring.basic;

public class TVUser {

	public static void main(String[] args) {
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.turnOff();
		
		SamsungTV samsung = new SamsungTV();
		samsung.powerOn();
		samsung.volumeUp();
		samsung.volumeUp();
		samsung.powerOff();
	}

}
