package cheng;

public class User
{
	 private String name;
	 private short  age;
	 
     public User(String name,short age) {
    	 this.name = name;
    	 this.age = age;
     }
     
     
	public String getName()
	{
		return name;
	}
	public short getAge()
	{
		return age;
	}
	
	public User getUser() {
		
		return this;
	}

}
