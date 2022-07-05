package ie.tom;

import java.util.logging.Logger;

public class Helloworld{


	public Helloworld(){
		Logger.getLogger("ie.tom").entering(Helloworld.class.getName(), "constructor");
		Logger.getLogger("ie.tom").exiting(Helloworld.class.getName(), "constructor");
	}
}