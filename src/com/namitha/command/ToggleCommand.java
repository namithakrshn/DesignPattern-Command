package com.namitha.command;

public class ToggleCommand implements Command {

	private Light light;
	private boolean isOn=false;
	
	public ToggleCommand(Light light){
		this.light=light;
	}
	
	
	@Override
	public void execute() {
		this.light.toggle();
	}
}
