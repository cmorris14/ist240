class student
{
	String firstName, lastName;
        int age;
	
	student(String informedFirstName, String informedLastName, int informedAge)
	{
		firstName = informedFirstName;
		lastName = informedLastName;
                age = informedAge;
	}
	
	String getName()
	{
		return firstName + " " + lastName + ", Age: " + age;
	}	
}