package com.spring.poly;

public class TVUser {
	public static void main(String[] args) {
//		SamsungTV samsung = new SamsungTV();
//		samsung.turnOn();
//		samsung.turnOff();
		
		//응집도 높이고 , 결합도 낮추기
		
		// 부모 = new 자식(extends, implements) => 다형성
		TV tv = new SamsungTV(new SonySpeaker());
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}

}
