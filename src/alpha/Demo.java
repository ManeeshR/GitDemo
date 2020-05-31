package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {
	
	private static Logger log = LogManager.getLogger(Demo.class.getName());		

	public static void main(String[] args) {
	
		log.debug("i am debugg");
		log.info("hello info");
		//if(1>2)
			log.error("here we hav some errors");
		log.fatal("Fatal Fatal");
		log.debug("i am debugg");
		log.info("hello info");
		
		
		
	}
}
