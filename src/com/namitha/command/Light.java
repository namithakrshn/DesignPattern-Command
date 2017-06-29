package com.namitha.command;

//Receiver
public class Light {
	
	private boolean isOn=false;
	
	public void on(){
		System.out.println("Light is switched On.");
	}
	public void off(){
		System.out.println("Light is switched off.");
	}
	
	public boolean isOn(){
		return isOn;
	}
	
	public void toggle(){
		if(isOn){
			isOn=false;
			off();
		}else{
			isOn=true;
			on();
		}
	}

}
