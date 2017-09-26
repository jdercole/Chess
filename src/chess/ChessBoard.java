
package chess;

/**
 *
 * @author Jenna
 */
public class ChessBoard {
    private Pawn[] pawn;
    private Rook[] rook;
    private Bishop[] bishop;
    private Queen queen;
    private King king;
    private Knight[] knight;
    
    public ChessBoard() {
        this.pawn = new Pawn[8];
        this.queen = new Queen();
        this.king = new King();
        this.bishop = new Bishop[2];
        this.rook = new Rook[2];
        this.knight = new Knight[2];
    }

    public final Pawn[] getPawn() {
        return pawn;
    }

    public final void setPawn(Pawn[] pawn) {
        this.pawn = pawn;
    }

    public final Rook[] getRook() {
        return rook;
    }

    public final void setRook(Rook[] rook) {
        this.rook = rook;
    }

    public final Bishop[] getBishop() {
        return bishop;
    }

    public final void setBishop(Bishop[] bishop) {
        this.bishop = bishop;
    }

    public final Queen getQueen() {
        return queen;
    }

    public final void setQueen(Queen queen) {
        this.queen = queen;
    }

    public final King getKing() {
        return king;
    }

    public final void setKing(King king) {
        this.king = king;
    }

    public final Knight[] getKnight() {
        return knight;
    }

    public final void setKnight(Knight[] knight) {
        this.knight = knight;
    }
    
    
    
}
