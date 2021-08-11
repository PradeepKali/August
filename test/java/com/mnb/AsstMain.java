package com.mnb;

import java.util.List;


import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({Asst.class,Asst1.class})
public class AsstMain {
	
	public static void main(String[] args) {
		org.junit.runner.Result r = JUnitCore.runClasses(Asst.class,Asst1.class);
		
		System.out.println(r.getIgnoreCount());
	    System.out.println(r.getRunCount());
	    System.out.println(r.getRunTime());
	    System.out.println(r.wasSuccessful());
	    System.out.println(r.getFailureCount());
	    
	    List<Failure> f = r.getFailures();
	    for (Failure x : f) {
			System.out.println(x);
		}
	}
	}


