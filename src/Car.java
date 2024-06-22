public class Car implements Comparable<Car>{
    private String carModel;
    private int productionYear;
    public Car (String carModel, int productionYear){
        this.carModel = carModel;
        this.productionYear = productionYear;
    }
    @Override
    public int compareTo(Car car){
        return Integer.compare(this.productionYear, car.productionYear);
    }
    public String getCarModel(){
        return carModel;
    }
    public int getProductionYear(){
        return productionYear;
    }
}
