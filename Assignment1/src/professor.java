class professor
{
	String firstName, lastName, degree;
        int age;
	
	professor(String informedFirstName, String informedLastName, int informedAge, String informedDegree)
	{
		firstName = informedFirstName;
		lastName = informedLastName;
                age = informedAge;
                degree = informedDegree;
	}
	
	String getName()
	{
		return firstName + " " + lastName + ", Age: " + age + ", Degree: " + degree;
	}	
}