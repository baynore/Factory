
public class Checker {

    private GamePieceFactory gpf;

    public Checker(GamePieceFactory gpf) {
    
        this.gpf = gpf;
    
    }

    public void play() {

        CheckerPiece r = new CheckerPiece("Red");
        CheckerPiece b = new CheckerPiece("Black");

        System.out.println(r);
        System.out.println(b);

    }


}
