import java.time.Duration;
import java.time.Instant;


class SearchitExperiment {

public static void main (String [] args) {

	int dataSubset = Integer.parseInt(args[0]);
	Instant start = Instant.now();
	//Searchit binary = new Searchit () ;
	
	Searchit.main(args) ;

	Instant end = Instant.now();
	Duration timeElapsed = Duration.between(start, end);
	System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
}}
