

import java.time.Duration;
import java.time.Instant;
/**
Linear Search Time Experiment Recorder.

@param 	args[0]	dataSubset to be tested , parsed in manually or from a bash loop

*/

class SearchitLinearExperiment {

public static void main (String [] args) {

        int dataSubset = Integer.parseInt(args[0]);
        Instant start = Instant.now();


        SearchitLinear.main(args) ;

        Instant end = Instant.now();
        Duration timeElapsed = Duration.between(start, end);
        System.out.println("Time taken: "+ timeElapsed.toMillis() +" milliseconds");
}}














