package com.revature.util;

public class FormatUtil {

	public String htmlString(String s) {
		s += "<html style= \"font-family: fantasy; "
    			+ "color: white;"
    			+ "background-color: darkslategrey;"
    			+ "text-align: center; \" > ";
		System.out.println("1"+s);
		return s;
	}
	
	/*
	 * htmlString(String s) takes the parameter of a string and appends the
	 * html stylesheet to it.  This string will style the whole page so you 
	 * want it to be at the beginning of the string.
	 */
	
	public String h1ForGetAll(String s) {
		s += "<h1><u><strong>ALL PRESCRIPTIONS</strong></u></h1>";
		System.out.println("2"+s);
		return s;
	}
	
	public String h1ForGetOne(String s) {
		s += "<h1><u><strong>DOSAGE AND INSTRUCTIONS</strong></u></h1>";
		System.out.println("3"+s);
		return s;
	}
	
	public String h1ForGetAdd(String s) {
		s += "<h1><u><strong>ALL PRESCRIPTIONS</strong></u></h1>";
		System.out.println("4"+s);
		return s;
	}

	/*
	 * All three of these
	 * append an h1 Title to the string
	 */
	
}
