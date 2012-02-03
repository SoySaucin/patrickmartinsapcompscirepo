package netbeansgw;
// A+ Computer Science
// www.apluscompsci.com

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Critter;

public class ActorOne
{
   public static void main(String[] args)
   {
      ActorWorld world = new ActorWorld();
      Actor dude = new Actor();
      world.add(new Location(0,0), dude);
      
      Bug bob = new Bug();
      world.add(new Location(1,1), bob);
      
      Critter joe = new Critter();
      world.add(new Location(5,5), joe);
      Critter stan = new Critter();
      world.add(new Location(9,9), stan);
      
      world.show();       
      dude.act();
   }
}