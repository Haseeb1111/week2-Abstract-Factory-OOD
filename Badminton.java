 package haseeb2;
 public class Badminton extends Racket{
 
    private String equipment;
    private String footwork;
     
    public Badminton(String equipment, String footwork){
        this.equipment=equipment;
        this.footwork=footwork;
    }
    @Override
    public String getEquipment() {
        return this.equipment;
    }
 
    @Override
    public String getFootWork() {
        return this.footwork;
    }
 
 
}
