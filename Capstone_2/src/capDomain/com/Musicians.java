package capDomain.com;

public class Musicians {

	String name;
	int age;
	String location;
	String instrument;
	int experience;

	public Musicians(String name, int age, String location, String instrument,
			int experience) {
		super();
		this.name = name;
		this.age = age;
		this.location = location;
		this.instrument = instrument;
		this.experience = experience;
	}

	public Musicians(int int1, String string, String string2, String string3,
			int int2, int int3) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the id
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setAge(int id) {
		this.age = id;
	}

	/**
	 * @return experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @return the make
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param make
	 *            the make to set
	 */
	public void setMake(String make) {
		this.name = make;
	}

	

	/**
	 * @return the year
	 */
	public int getYear() {
		return experience;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.experience = year;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Musicians [id=").append(age).append(", name=")
				.append(name).append(", make=").append(name).append(", model=")
				.append(", year=").append(experience)
				.append(", color=").append("]");
		return builder.toString();
	}

	public String getInstrument() {
		// TODO Auto-generated method stub
		return null;
	}

}