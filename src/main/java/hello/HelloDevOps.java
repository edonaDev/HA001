package hello;

import org.joda.time.LocalTime;

public class HelloDevOps  {
 public static void main(String[] args) {
	LocalTime kohaAktuale = new LocalTime();
	System.out.println("Koha aktuale eshte: " + kohaAktuale);
	
	
    Hello hi = new Hello();
	System.out.println(hi.sayHello());
	}
	}