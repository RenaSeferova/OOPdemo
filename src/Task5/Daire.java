package Task5;

public class Daire {
    double radius;

    public Daire(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Daire{" +
                "radius=" + radius +
                '}';
    }

     double hesablaArea(){
        return Math.PI * radius * radius;

         }

    }
