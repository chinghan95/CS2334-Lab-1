public class Course {
	
	private static final int MAX_SECTION_SIZE = 50;
	
	private String[] code;
	private String name;
	private int numStudents;
	private int numSections;
		
	public Course(String info)
	{
		String[] arrOfInfo = info.split(",");
		
		this.code = arrOfInfo[0].split(" ");
		this.name = arrOfInfo[1];
		this.numStudents = Integer.valueOf(arrOfInfo[2]);
		this.numSections = calcNumSections(this.numStudents);
	}
	
	private static int calcNumSections(int numStudents)
	{
		return (int)Math.ceil(numStudents / (double)MAX_SECTION_SIZE);
	}
	
	public String[] getCode()
	{
		return code.clone();
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getNumStudents()
	{
		return numStudents;
	}
	
	public int getNumSections()
	{
		return numSections;
	}
	
	public String toString()
	{	
		return "CODE: " + code[0] + " " + code[1] + ", NAME: " + name + ", STUDENTS: " + numStudents + ", SECTIONS: " + numSections;
	}
	
}
