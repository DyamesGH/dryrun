
public class SmartPhone {
	
	private String brand;
	private String model;
	private double screenSize;
	private int storageSize;
	
	
	
	private void turnOnDevice() {
		System.out.println("Device is turned on");
	}
	private void turnOffDevice() {
		System.out.println("Device is turned off");
	}
	
	
	
	public static void main(String[] args) {
		
		
		
		SmartPhone objSmartPhone1 = new SmartPhone();
		SmartPhone objSmartPhone2 = new SmartPhone();
		
		
		objSmartPhone1.brand = "Samsung";
		objSmartPhone1.model = "Galaxy S22";
		objSmartPhone1.screenSize = 6.1;
		objSmartPhone1.storageSize = 128;
		
		objSmartPhone2.brand = "Xiaomi";
		objSmartPhone2.model = "Redmi 10";
		objSmartPhone2.screenSize = 6.5;
		objSmartPhone2.storageSize = 64;
		
		
		System.out.println("Brand : " +objSmartPhone1.brand);
		System.out.println("Model : " +objSmartPhone1.model);
		System.out.println("ScreenSize : " +objSmartPhone1.screenSize+" inches");
		System.out.println("StorageSize : " +objSmartPhone1.storageSize+" gb");
		objSmartPhone1.turnOnDevice();
		objSmartPhone1.turnOffDevice();
		System.out.println("\n");	
		System.out.println("Brand : " +objSmartPhone2.brand);
		System.out.println("Model : " +objSmartPhone2.model);
		System.out.println("ScreenSize : " +objSmartPhone2.screenSize+" inches");
		System.out.println("StorageSize : " +objSmartPhone2.storageSize+" gb");
		objSmartPhone1.turnOnDevice();
		objSmartPhone1.turnOffDevice();
	}
	
	
}
