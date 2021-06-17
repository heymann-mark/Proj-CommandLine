package edu.umb.cs.cs680.hw11;
import java.util.Comparator;
public class sortMethod implements Comparator<FSElement>{
	
	public int compare(FSElement arg0, FSElement arg1) {
		return (arg0.getName().compareTo(arg1.getName()));
	}
}
