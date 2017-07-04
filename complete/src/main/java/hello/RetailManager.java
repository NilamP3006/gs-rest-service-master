package hello;

public class RetailManager {

    private final long id;
    private final String shopName;    
    private final String shopNumber;
	private final String shopPostcode;

    public RetailManager(long id, String shopName,  String shopNumber, String shopPostcode) {
        this.id = id;
        this.shopName = shopName;
        this.shopNumber = shopNumber;
        this.shopPostcode = shopPostcode;
        
    }

    public long getId() {
        return id;
    }

    public String getshopName() {
        return shopName;
    }
    public String getShopNumber() {
		return shopNumber;
	}

	public String getShopPostcode() {
		return shopPostcode;
	}
}
