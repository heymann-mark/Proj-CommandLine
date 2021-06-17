package edu.umb.cs.cs680.hw11;

import java.util.*;

public class Test implements Command{

	public Test() {

	
		execute();
	}
	public void execute() {
	System.out.println("Test");
	System.out.println(">pwd");
		CommandCheck.getCommand("pwd");
		System.out.println("> cd home");
		CommandCheck.getCommand("cd home");
		System.out.println("> pwd");
		CommandCheck.getCommand("pwd");
		System.out.println("> ls");
		CommandCheck.getCommand("ls");
		System.out.println(">dir");
		CommandCheck.getCommand("dir");
		System.out.println(">dir pictures");
		CommandCheck.getCommand("dir pictures");
		System.out.println(">mkdir newStuff");
		CommandCheck.getCommand("mkdir newStuff");
		System.out.println(">dir");
		CommandCheck.getCommand("dir");
		System.out.println(">cp newStuff pictures");
		CommandCheck.getCommand("cp newStuff pictures");
		System.out.println(">rmdir newStuff");
		CommandCheck.getCommand("rmdir newStuff");
		System.out.println(">ls");
		CommandCheck.getCommand("ls");
		System.out.println(">dir pictures");
		CommandCheck.getCommand("dir pictures");
		System.out.println(">cd");
		CommandCheck.getCommand("cd");
		System.out.println(">ls");
		CommandCheck.getCommand("ls");
		System.out.println(">cd home");
		CommandCheck.getCommand("cd home");
		System.out.println(">chown Mark");
		CommandCheck.getCommand("chown Mark");
		System.out.println(">cd");
		CommandCheck.getCommand("cd");
		System.out.println(">dir");
		CommandCheck.getCommand("dir");
		System.out.println(">cd  pictures");
		CommandCheck.getCommand("cd pictures");
		System.out.println(">dir");
		CommandCheck.getCommand("dir");
		System.out.println(">mv images root");
		CommandCheck.getCommand("mv images root");
		System.out.println(">ls");
		CommandCheck.getCommand("ls");
		System.out.println(">cd");
		CommandCheck.getCommand("cd");
		System.out.println(">pwd");
		CommandCheck.getCommand("pwd");
		System.out.println(">ls");
		CommandCheck.getCommand("ls");
		System.out.println(">history");
		CommandCheck.getCommand("history");
		System.out.println(">redo");
		CommandCheck.getCommand("redo");
		
	
	}

	

}
