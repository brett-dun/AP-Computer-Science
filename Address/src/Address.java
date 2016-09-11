public class Address {
	private String street, state, country;
	private int zip;


public Address() {
	street = "123 SomeStreet";
	state = "SomeState";
	country = "United States";
	zip = 10101;
}

public Address(String Street, String State, int Zip, String Country) {
	street = Street;
	state = State;
	zip = Zip;
	country = Country;
}

public String getStreet() {
	return street;
}

public String getState() {
	return state;
}

public String getCountry() {
	return country;
}

public int getZip() {
	return zip;
}


public void setStreet(String Street) {
	street = Street;
}

public void setState(String State) {
	state = State;
}

public void setCountry(String Country) {
	country = Country;
}

public void setZip(int Zip) {
	zip = Zip;
}

}