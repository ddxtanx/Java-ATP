import java.util.ArrayList;

public class Triangle {
    private Side[] sides;
    private ArrayList<Angle> angles = new ArrayList();
    private double angleSum = 0;
    public Triangle(Angle angle){
        this.addAngle(angle);
    }
    public Triangle(Angle alpha, Angle beta){
        double measureSum = alpha.getMeasure() + beta.getMeasure();
        if(measureSum > 0 && measureSum < 180){

        }
    }
    private void addAngle(Angle angle){
        if(angle.getMeasure()>0 && angle.getMeasure() < 180 && angles.size() < 3 && angleSum + angle.getMeasure() <= 180) {
            angles.add(angle);
            angleSum += angle.getMeasure();
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}
