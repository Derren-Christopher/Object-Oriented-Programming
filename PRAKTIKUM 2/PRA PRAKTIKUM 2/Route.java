public class Route {
    private String startPoint;
    private String destination;
    private int distance; 
    private int averageSpeed;

    public Route(String startPoint, String destination, int distance, int averageSpeed) {
        this.startPoint = startPoint;
        this. destination = destination;
        this.distance = distance;
        this.averageSpeed = averageSpeed;
	/**
	 * TODO: Buatlah konstruktor untuk kelas route ini
	 * */
    }

    public void showRoute() {
	    System.out.println("Rute: " + this.startPoint + " >> " + this.destination + " (" + this.distance + " km)");
        double time = estimateTravelTime();
        System.out.printf("Estimasi waktu tempuh: %.1f jam\n", time);
/**
	     * TODO: Menampilkan informasi rute dengan format,
	     * 		"{startPoint} >> {destination} ({distance} km)
	     * 		Estimasi waktu tempuh: {time} jam"
	     * 		Waktu tempuh ditulis sampai 1 angka di belakang koma.
	     * */
    }

    public double estimateTravelTime() {
	    if (this.averageSpeed > 0){
            return (double) this.distance/this.averageSpeed;
        } else {
            return -1;
        }/**
	     * TODO: Fungsi ini memprediksi berapa lama rute ditempuh dengan 
	     * kecepatan rata rata
	     * */
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }

    public int getAverageSpeed() {
        return averageSpeed;
    }
}

