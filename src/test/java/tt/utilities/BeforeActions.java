package tt.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	@Before
public void beforeaction(Scenario scen){
		System.out.println(">>initializing Chrome Driver");
		SetupDrivers.setupDriver();
		System.out.println(scen.getName());
	}
}
