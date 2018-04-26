package student;

import turtle.Turtle;

/**
 * Project: CSCI142 Lab 01
 * Name: Campbell
 * Date: Apr 2018
 *
 * Desc: Make an H-Tree
 */
public class HTree
{
//constants
	private static int MAX_SEGMENT_LENGTH = 256;

//fields

//constructors

//getters and setters

//other methods

	/**
	 * initialize the turtle
	 *
	 * @param p_length - The length of one segment of the HTree.
	 * @param p_depth  - The depth of recursion
	 */
	static void init(int p_length, int p_depth)
	{
		Turtle.Turtle.speed(Turtle.SPEED_FASTEST);
		Turtle.Turtle.penDown();
		Turtle.Turtle.setWorldCoordinates(0-2*p_length,0-2*p_length,
				2*p_length,2*p_length);
		Turtle.Turtle.title("Campbell H-Tree -size == " + p_depth);
		Turtle.Turtle.penColor("Red");
		Turtle.Turtle.fillColor("Red");
	}

	/**
	 * Recursively draw the H-Tree.
	 *
	 * 
	 * @param p_length     the length of the current h-tree segments
	 * @param p_depth      the current depth of recursion
	 *
	 * @precondition depth is greater than or equal to 0, turtle is at center of current h-tree, down, facing east
	 *
	 * @postcondition turtle is at center of current h-tree, down, facing east
	 */
	static void drawHTree​ (int p_length, int p_depth)
	{
		if (p_depth > 0)
		{
        	//start in center of H, move to upper right
			Turtle.Turtle.forward(p_length / 2);
			Turtle.Turtle.left(90);
			Turtle.Turtle.forward(p_length / 2);
			Turtle.Turtle.right(90);

        //recurse
			drawHTree​(p_length / 2, p_depth - 1);


        //move to lower right of H
			Turtle.Turtle.right(90);
			Turtle.Turtle.forward(p_length);
			Turtle.Turtle.left(90);

        //recurse
			drawHTree​(p_length / 2, p_depth - 1);

        //move to upper left of H
			Turtle.Turtle.left(90);
			Turtle.Turtle.forward(p_length / 2);
			Turtle.Turtle.left(90);
			Turtle.Turtle.forward(p_length);
			Turtle.Turtle.right(90);
			Turtle.Turtle.forward(p_length / 2);
			Turtle.Turtle.right(90);

        //recurse
			drawHTree​(p_length / 2, p_depth - 1);

        //move to lower left of H
			Turtle.Turtle.right(90);
			Turtle.Turtle.forward(p_length);
			Turtle.Turtle.left(90);

        //recurse
			drawHTree​(p_length / 2, p_depth - 1);

        //return to center of H
			Turtle.Turtle.left(90);
			Turtle.Turtle.forward(p_length / 2);
			Turtle.Turtle.right(90);
			Turtle.Turtle.forward(p_length / 2);
		}

	}

//overrides

//main

	/**
	 * read the arguments and draw the H-Tree
	 * @param args - args[0] is depth
	 */
	public static void main (String[] args)
	{
		int depth = 1;
		try
		{
			depth = Integer.parseInt(args [0]);
		}
		catch (Exception e)
		{
			System.out.println("Usage: java hTree #");
			System.exit(1);
		}

		init(MAX_SEGMENT_LENGTH,depth);
		drawHTree​(MAX_SEGMENT_LENGTH,depth);
		System.out.println("Feel free to close the window when done");

		
	
	}

}//EoC HTree
//EoF
