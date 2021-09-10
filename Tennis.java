package haseeb2;
public class Tennis extends Racket {
 
    private String equipment;
    private String footwork;
     
    public Tennis(String equipment , String footwork){
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