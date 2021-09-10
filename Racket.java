package haseeb2;
public abstract class Racket {
     
    public abstract String getEquipment();
    public abstract String getFootWork();
     
    @Override
    public String toString(){
        return "Equipment= "+this.getEquipment()+", FootWork="+this.getFootWork();
    }
}
