package edu.ucalgary.ensf409;

/**
 * Abstract Class to set ID, furniture type, properties of each furniture, price and manufacturer ID
 * for each category of furniture
 */
public abstract class InventoryEntity {
	private String id;
	private String type;
	private boolean[] properties;
	private int price;
	private String manuID;

	/**
	 * Constructor to call setter method for each argument
	 * @param id
	 * @param type
	 * @param properties
	 * @param price
	 * @param manuID
	 */
	public InventoryEntity(String id, String type, boolean[] properties, int price, String manuID) {
		setId(id);
		setType(type);
		setProperties(properties);
		setPrice(price);
		setManuId(manuID);
	}

	//Getter methods 
	public String getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public boolean[] getProperties() {
		return properties;
	}

	public int getPrice() {
		return price;
	}

	public String getManuId() {
		return manuID;
	}
	
	//Setter methods
	public void setId(String id) {
		this.id = id;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setProperties(boolean[] properties) {
		this.properties = properties;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setManuId(String manuID) {
		this.manuID = manuID;
	}
}


class Desk extends InventoryEntity {
	public Desk(String id, String type, boolean[] properties, int price, String manuID) {
		super(id, type, properties, price, manuID);
	}	
}

class Chair extends InventoryEntity {
	public Chair(String id, String type, boolean[] properties, int price, String manuID) {
		super(id, type, properties, price, manuID);
	}	
}

class Filing extends InventoryEntity {
	public Filing(String id, String type, boolean[] properties, int price, String manuID) {
		super(id, type, properties, price, manuID);
	}	
}

class Lamp extends InventoryEntity {
	public Lamp(String id, String type, boolean[] properties, int price, String manuID) {
		super(id, type, properties, price, manuID);
	}	
}
