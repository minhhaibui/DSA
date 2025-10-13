package Practice_astract;

public class MachinalStudent extends Student {
   private String objectName;
   private double scoreCNC;
   private double scorePLC;

    public MachinalStudent(String name, int age, String address, String classroom, String objectName, double scoreCNC, double scorePLC) {
        super(name, age, address, classroom);
        this.objectName = objectName;
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }


    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }

    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    public String getObjectName() {
        return objectName;
    }

    public double getScoreCNC() {
        return scoreCNC;
    }

    public double getScorePLC() {
        return scorePLC;
    }

    @Override
    public void study() {
        System.out.println(super.getName() + "is learn " + objectName);
    }

    @Override
    public double getScore() {
        return (scoreCNC + scorePLC)/2;
    }

}
