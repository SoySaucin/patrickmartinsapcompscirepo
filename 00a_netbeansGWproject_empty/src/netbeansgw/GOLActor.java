/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package netbeansgw;
import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.util.Iterator;
/**
 * Description:
 * DateCreated:
 *
 * @author martinp4325
 */
public class GOLActor extends Actor {
   ActorWorld gridworld;
    public GOLActor(ActorWorld world){
        super();
        gridworld = world;
    }
    
    @Override
    public void act(){
        for (Iterator<Location> iter = this.getGrid().getEmptyAdjacentLocations(this.getLocation()).iterator(); iter.hasNext();){
            Location loc = iter.next();
            if (this.getGrid().getNeighbors(loc).size()==3){
                GOLActor NewGOL =new GOLActor(gridworld);
                gridworld.add(loc,NewGOL);
            }
        }
        if(this.getGrid().getNeighbors(this.getLocation()).size()<2){
            this.removeSelfFromGrid();
            return;
        }
        if(this.getGrid().getNeighbors(this.getLocation()).size()>3){
            this.removeSelfFromGrid();
            return;
        }
    }
    
}
