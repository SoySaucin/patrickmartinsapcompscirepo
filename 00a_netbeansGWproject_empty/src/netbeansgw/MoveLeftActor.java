package netbeansgw;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.awt.Color;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class MoveLeftActor extends Actor {

    @Override
    public void act() {
        Location Loc = getLocation();		//get this actor’s current location
        Grid<Actor> grid = getGrid();		//get this actor’s grid
        Location newLoc = Loc.getAdjacentLocation(Location.WEST);

        if (grid.isValid(newLoc)) {
            this.moveTo(newLoc);
        } else {
            this.moveTo(new Location(newLoc.getRow(), grid.getNumCols() - 1));
        }

    }
}