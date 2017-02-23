
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author peraa0837
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //create a city
        City kw = new City();
        
        //create a robot
        Robot jet = new Robot(kw, 4, 0, Direction.EAST);
        
        //create the walls
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 3, 3, Direction.NORTH);
        new Wall(kw, 3, 3, Direction.WEST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 3, 6, Direction.NORTH);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 4, 7, Direction.NORTH);
        new Wall(kw, 4, 7, Direction.EAST);
        
        //create the things
        new Thing(kw, 4, 1);
        new Thing(kw, 3, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 1, 4);
        
        //the code to make the robot climb the stairs and pick up the things 
        //and put them back on the other side
        jet.move();
        jet.pickThing();
        jet.turnLeft();
        jet.move();
        jet.turnLeft();
        jet.turnLeft();
        jet.turnLeft();
        jet.move();
        jet.pickThing();
        jet.turnLeft();
        jet.move();
        jet.turnLeft();
        jet.turnLeft();
        jet.turnLeft();
        jet.move();
        jet.pickThing();
        jet.turnLeft();
        jet.move();
        jet.turnLeft();
        jet.turnLeft();
        jet.turnLeft();
        jet.move();
        jet.pickThing();
        jet.move();
        jet.putThing();
        jet.move();
        jet.turnLeft();
        jet.turnLeft();
        jet.turnLeft();
        jet.move();
        jet.putThing();
        jet.turnLeft();
        jet.move();
        jet.turnLeft();
        jet.turnLeft();
        jet.turnLeft();
        jet.move();
        jet.putThing();
        jet.turnLeft();
        jet.move();
        jet.turnLeft();
        jet.turnLeft();
        jet.turnLeft();
        jet.move();
        jet.putThing();
        jet.turnLeft();
        jet.move();
        
    }
}
