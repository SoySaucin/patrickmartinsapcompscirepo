package netbeansgw;

//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.actor.ActorWorld;

public class GOLActorRunner
{
	public static void main(String[] args)
	{
                ActorWorld world = new ActorWorld();
                GOLActor dude = new GOLActor(world);
                GOLActor dude1 = new GOLActor(world);
                GOLActor dude2 = new GOLActor(world);
                GOLActor dude3 = new GOLActor(world);
                GOLActor dude4 = new GOLActor(world);
                GOLActor dude5 = new GOLActor(world);
                world.add(new Location(5,5), dude);
                world.add(new Location(6,6), dude1);
                world.add(new Location(7,6), dude2);
                world.add(new Location(7,5), dude3);
                world.add(new Location(7,4), dude5);
                world.show();
	}
}