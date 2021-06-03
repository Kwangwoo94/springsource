package com.spring.poly;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	
	public SamsungTV() {}
	
	public SamsungTV(Speaker speaker) {
		super();
		this.speaker = speaker;
		System.out.println("SamsungTV - 按眉 积己");
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}

	@Override
	public void turnOn() {
		System.out.println("SamsungTV - 颇况 On");
	}

	@Override
	public void turnOff() {
		System.out.println("SamsungTV - 颇况 Off");
	}

	@Override
	public void soundUp() {
		speaker.volumeUp();
	}

	@Override
	public void soundDown() {
		speaker.volumeDown();
	}

}
