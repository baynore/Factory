
abstract public class Piece {

    protected String color;
    protected String type;

    public String getColor() {
    
        return color;
    
    }

    public String getType() {
    
        return type;
    
    }

    public String toString() {
        
        String s = "";
        return s + color.charAt(0) + type.charAt(0); 
    
    }

}
