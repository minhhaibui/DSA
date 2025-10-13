package Practice_astract;

public class ItStudent  extends Student {
   private String objName;
   private double scoreJava;
   private double scoreHtml;
    public ItStudent(String objName, double scoreJava,double scoreHtml , String  name, int age, String address,String  classroom) {
        super(name, age, address, classroom);
        this.objName = objName;
        this.scoreJava = scoreJava;
        this.scoreHtml = scoreHtml;
    }

    public String getObjName() {
        return objName;
    }

    public double getScoreJava() {
        return scoreJava;
    }

    public double getScoreHtml() {
        return scoreHtml;
    }

    public void setScoreJava(double scoreJava) {
        this.scoreJava = scoreJava;
    }

    public void setObjName(String objName) {
        this.objName = objName;
    }

    public void setScoreHtml(double scoreHtml) {
        this.scoreHtml = scoreHtml;
    }

    @Override
    public void study() {
        System.out.println(super.getName() + " is learn " + objName + " now");
    }

    @Override
    public double getScore() {
        return (this.scoreJava * 2 + this.scoreHtml) /3;
    }
}
