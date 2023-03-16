package frogger;

/**
 * Refactor Exercise 4: Frogger
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Frogger {

    private final Road road;
    private int position;

    public Frogger(Road road, int position) {
        this.road = road;
        this.position = position;
    }

    /**
     * Moves Frogger.
     *
     * @param forward true is move forward, else false.
     * @return true if move successful, else false.
     */
    public boolean move(boolean forward) {
        int nextPosition = this.position + (forward ? 1 : -1);
        if (!road.isValid(nextPosition) || road.isOccupied(nextPosition)) {
            return false;
        }
        this.position = nextPosition;
        return true;
    }
}
