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
	public int getId() {
		return age;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.age = id;
	}

	/**
	 * @return the mileage
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param mileage
	 *            the mileage to set
	 */
	public void setMileage(int mileage) {
		this.mileage = mileage;
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
	 * @return the model
	 */
	public String getModel() {
		return model;
	}

	/**
	 * @param model
	 *            the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year
	 *            the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Musicians [id=").append(age).append(", mileage=")
				.append(mileage).append(", make=").append(name)
				.append(", model=").append(model).append(", year=")
				.append(year).append(", color=").append(color).append("]");
		return builder.toString();
	}

}