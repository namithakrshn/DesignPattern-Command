package com.namitha.command;

import java.util.ArrayList;
import java.util.List;

public class Demo {

	public static void main(String[] args) {

		Light bedroomlight = new Light();
		Light kitchenlight = new Light();
		Light bathroomlight = new Light();
		List<Light> lights = new ArrayList<Light>();
		lights.add(bedroomlight);
		lights.add(kitchenlight);
		lights.add(bathroomlight);
				
		Switch lightswitch = new Switch();
		
		//Command onCommand = new OnCommand(bedroomlight);
		//Command offCommand = new OffCommand(light);
		Command toggleCommand = new ToggleCommand(bedroomlight);
		Command toggleCommand2 = new ToggleCommand(kitchenlight);
		Command allLightsCommand = new AllLightsCommand(lights);
		
		
		//System.out.println("Switching on the light.....");
		lightswitch.storeAndExecute(toggleCommand);
		lightswitch.storeAndExecute(toggleCommand);
		lightswitch.storeAndExecute(toggleCommand2);
		System.out.println();
		
		/*System.out.println("Switching off the light...");
		lightswitch.storeAndExecute(offCommand);*/
		
		lightswitch.storeAndExecute(allLightsCommand);
		lightswitch.storeAndExecute(allLightsCommand);
		
		

	}

}
