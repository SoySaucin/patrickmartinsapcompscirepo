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

public class MoveLeftActorRunner
{
	public static void main(String[] args)
	{
                ActorWorld world = new ActorWorld();
                MoveLeftActor dude = new MoveLeftActor();
                world.add(new Location(5,5), dude);
                world.show();
	}
}