package exercise3;

public class Teacher {
	 private  String name;
	    private int age;
	    private String email;
	    private String numberPhone;
	    Teacher(String name, int age, String email, String numberPhone){
	        this.name = name;
	        this.age = age;
	        this.email = email;
	        this.numberPhone = numberPhone;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getNumberPhone() {
	        return numberPhone;
	    }

	    public void setNumberPhone(String numberPhone) {
	        this.numberPhone = numberPhone;
	    }
	    
	    public void printInfo(){
	        System.out.println("Name: " + this.getName());
	        System.out.println("Age: " + this.getAge());
	        System.out.println("Number phone: " + this.getNumberPhone());
	        System.out.println("Email: "+this.getEmail());
	    }
	    public boolean retire(){
	        return (this.age > 55);
	    }
	    
}
