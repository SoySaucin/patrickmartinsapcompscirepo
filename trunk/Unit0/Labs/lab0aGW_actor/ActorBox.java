//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import info.gridworld.actor.Actor;
import info.gridworld.grid.Location;
import info.gridworld.actor.ActorWorld;

public class ActorBox
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		
		
		//add actors to make a box
		
		//left side
		world.add(new Location(0, 0), new Actor());

		
		
		//right side
		world.add(new Location(9, 9), new Actor());

		

		//top row

		
		
		//bot row

	
		
		
		world.show(); 
	}
}