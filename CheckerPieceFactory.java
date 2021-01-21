
public class CheckerPieceFactory extends GamePieceFactory {

    public CheckerPieceFactory() {
    
        
    
    }

    public Piece createPiece(String color, String type) {
        
        Piece cp = null;
        
        if (type.equals("")) {    
            
            if (color.equals("Red") || color.equals("Black"))
                cp = new CheckerPiece(color);
            else
                System.out.println("Invalid color");
        
        } else
            System.out.println("Type needs to be '' for a checker piece");
        
        return cp;
         
    }

}
