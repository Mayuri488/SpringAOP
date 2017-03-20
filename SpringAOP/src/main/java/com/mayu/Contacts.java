package com.mayu;
public final class Contacts {

    private final String name;
    private final String mobile;
    
    public Contacts(String name, String mobile) {
    	System.out.println("constructor");
        this.name = name;
        this.mobile = mobile;
    }

	public String getName() {
		return name;
	}



	public String getMobile() {
		return mobile;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", mobile=" + mobile + "]";
	}
  
 
}