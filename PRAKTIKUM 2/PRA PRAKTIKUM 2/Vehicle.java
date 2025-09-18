public class Vehicle {
    private String plateNumber;
    private String type;
    private int capacity;   
    private int currentLoad; 
    private Driver driver;
    private Route route;

    public Vehicle(String plateNumber, String type, int capacity, Driver driver, Route route) {
       this.plateNumber = plateNumber;
       this.type = type;
       this.capacity = capacity;
       this.driver = driver;
       this.route = route;
       this.currentLoad = 0; /**
	 * TODO: Buatlah konstruktor untuk kelas vehicle dengan currentLoad adalah 0
	 * */
    }

    public void showInfo() {
        System.out.println("Kendaraan: " + this.type + " (" + this.plateNumber + ")");
        this.driver.introduce();
        this.route.showRoute();
        System.out.println("Penumpang: " + this.currentLoad + "/" + this.capacity);
	/**
	 * TODO: Tampilkan info dari vehicle
	 * 		"Kendaraan: Avanza (B 1212 FUV)
	 * 		Supir: Lina - Lisensi: ALD1122 - Rating: 3.0
	 * 		Rute: Jakarta >> Tangerang (30 km)
	 * 		Estimasi waktu tempuh: 0.6 jam
	 * 		Penumpang: 0/7"
	 * */
    }

    public void changeDriver(Driver newDriver) {
    	this.driver = newDriver;/**
	 * TODO: Melakukan perubahan driver di kendaraan
	 * */  
    }

    public void assignRoute(Route newRoute) {
      	this.route = newRoute;/**
	 * TODO: Menerapkan rute baru pada  kendaraan
	 * */  
    }

    public void boardPassenger(int count) {
      	if (count <= (this.capacity - this.currentLoad)){
            this.currentLoad += count;
        } else {
            System.out.println("Gagal: kapasitas kendaraan tidak cukup!");
        }/**
	 * TODO: Buatlah fungsi yang mesimulasikan penumpang yang naik ke kendaraan, 
	 * 	fungsi ini akan mengubah attribut current load.
	 * 	Pesan gagal "Gagal: kapasitas kendaraan tidak cukup!"
	 * */  
    }

    public void alightPassenger(int count) {
      	if (count > this.currentLoad){
            System.out.println("Gagal: jumlah penumpang turun melebihi yang ada!");
        } else {
            this.currentLoad = this.currentLoad - count;
        }/**
	 * TODO: Buatlah fungsi yang mesimulasikan penumpang yang turun dari kendaraan, 
	 * 	fungsi ini akan mengubah attribut current load.
	 * 	Pesan gagal "Gagal: jumlah penumpang turun melebihi yang ada!"
	 * */  
    }

    public Driver getDriver(){
	return this.driver;
    }

    public int getCapacity(){
    	return this.capacity;
    }
    public void setDriver(Driver driver){
    	this.driver = driver;
    }
}
