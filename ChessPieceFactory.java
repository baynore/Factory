
public class ChessPieceFactory extends GamePieceFactory {
    
    public ChessPieceFactory() {
    
        
    
    }

    public Piece createPiece(String color, String type) {
    
        Piece piece = null;

        if (color.equals("Black") || color.equals("White")) {
        
            switch (type) {
                case "Pawn" :
                    piece = new Pawn(color);
                    break;
                
                case "Rook" :
                    piece = new Rook(color);
                    break;

                case "Bishop" :
                    piece = new Bishop(color);
                    break;

                case "knight" : 
                    piece = new Knight(color);
                    break;
            
                case "Queen" :
                    piece = new Queen(color);
                    break;
                
                case "King" :
                    piece = new King(color);
                    break;
                
                default :
                    System.out.println("Invalid type");
                    break;
            }
        }
        else
            System.out.println("Invalid color");  
    
        return piece;
     
    }
}
