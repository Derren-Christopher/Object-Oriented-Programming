import java.util.ArrayList;

public class TransportSystem {
    private String name;
    private ArrayList<Vehicle> vehicles;

    public TransportSystem(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
  	/**
	 * TODO: Buatlah konstruktor untuk sistem transportasi
	 * */ 
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
       	/**
	 * TODO: Fungsinya untuk menambahkan objek kendaraan ke list kendaraan 
	 * */ 
    }

    public Vehicle findVehicleByDriver(String driverName) {
        for (Vehicle v : vehicles) {
            if (v.getDriver().getName().equals(driverName)) {
                return v;
            }
        }
        return null;
	/**
	 * TODO: Fungsi untuk mencari kendaraan berdasarkan nama dari driver, 
	 * kembalikan nulljika tidak ditemukan
	 * */
    }

    public int totalPassengerCapacity() {
        int total = 0;
        for (Vehicle v : vehicles) {
            total += v.getCapacity();
        }
        return total;/**
	 * TODO: Menghitung seluruh kapasitas yang tersedia
	 * */	
    }

    public void showAllVehicles() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles in the system");
            return;
        }
        System.out.println("=== Transport System: " + name + " ===");
        for (Vehicle v : vehicles) {
            v.showInfo();
            System.out.println("-------------------");
        }/**
	 * TODO: Menampilkan seluruh info kendaraan dengan format
	 * 	"=== Transport System: {name} ===
	 * 	{info vehicles}
	 *	-------------------
	 *	{info vehicles}
	 *	-------------------
	 *	...
	 *	"
	 *	Baris terakhir disertai garis juga yah.
	 *	jika kendaraan kosong, keluarkan "No vehicles in the system
	 * */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }
}
