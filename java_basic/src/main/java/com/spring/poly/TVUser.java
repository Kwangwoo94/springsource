package com.spring.poly;

public class TVUser {
	public static void main(String[] args) {
//		SamsungTV samsung = new SamsungTV();
//		samsung.turnOn();
//		samsung.turnOff();
		
		//������ ���̰� , ���յ� ���߱�
		
		// �θ� = new �ڽ�(extends, implements) => ������
		TV samsung = new SamsungTV();
		samsung.turnOn();
		samsung.turnOff();
	}

}
