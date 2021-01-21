
public class Chess {
    
    private GamePieceFactory gpf;

    public Chess(GamePieceFactory gpf) {
    
        this.gpf = gpf;
    
    }

    public void play() {

        Piece BR = gpf.createPiece("Black", "Rook");
        Piece BB = gpf.createPiece("Black", "Bishop");
        Piece Bk = gpf.createPiece("Black", "knight");
        Piece BQ = gpf.createPiece("Black", "Queen");
        Piece BK = gpf.createPiece("Black", "King");
        Piece BP = gpf.createPiece("Black", "Pawn");

        System.out.println(BR);
        System.out.println(BB);
        System.out.println(Bk);
        System.out.println(BQ);
        System.out.println(BK);
        System.out.println(BP);

        Piece WR = gpf.createPiece("White", "Rook"); 
        Piece WB = gpf.createPiece("White", "Bishop");
        Piece Wk = gpf.createPiece("White", "knight");
        Piece WQ = gpf.createPiece("White", "Queen");
        Piece WK = gpf.createPiece("White", "King");
        Piece WP = gpf.createPiece("White", "Pawn");

        System.out.println(WR);
        System.out.println(WB);
        System.out.println(Wk);
        System.out.println(WQ);
        System.out.println(WK);
        System.out.println(WP);

    }

}
