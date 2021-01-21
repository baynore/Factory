
public class Client {

    public static void main(String[] args) {
    
        Chess chess = new Chess(new ChessPieceFactory());
        chess.play();
        
        Checker checker = new Checker(new CheckerPieceFactory());
        checker.play();

    }

}
