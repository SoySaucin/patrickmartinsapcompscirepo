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

public class SpinningActor extends Actor
{
	public SpinningActor()
	{
	}
	
	public void act()
	{
            this.setDirection(this.getDirection()+1);
	}
	
	public Color getColor()
	{
		return null;
	}
}