package Task3;
public class Rectangle {
    int uzunluq;
    int eni;

    public  Rectangle(int uzunluq, int eni) {
        this.uzunluq = uzunluq;
        this.eni = eni;
    }
        public int HesablaArea() {
            return eni * uzunluq;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "uzunluq=" + uzunluq +
                    ", eni=" + eni +
                    '}';
        }
    }


