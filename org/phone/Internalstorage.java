package org.phone;

import Dayone.question1;

public class Internalstorage extends question1 {
	public void processorname() {
		System.out.println("processor name is intel");	
	}
public void ramsize() {
	System.out.println("Ram size is 6GB");	
}
public static void main(String args[])
{
	Internalstorage i = new Internalstorage();
	ExternalStorage e = new ExternalStorage();
	question1 q = new question1();
	i.processorname();
	i.empaddress();
i.ramsize();
e.size();
}
}
