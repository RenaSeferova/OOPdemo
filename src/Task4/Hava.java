package Task4;

public class Hava {
       public  double temperature ;

    @Override
    public String toString() {
        return "Hava{" +
                "temperature=" + temperature +
                '}';
    }

    public Hava(double temperature) {
        this.temperature = temperature;

    }
    public boolean isHot(){
        return temperature > 30;
}
}
