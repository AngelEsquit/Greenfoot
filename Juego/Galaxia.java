import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CrabWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galaxia extends World
{

    /**
     * Constructor for objects of class CrabWorld.
     * 
     */
    public Galaxia()
    {    
        super(560, 560, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Globos worm = new Globos();
        addObject(worm,254,134);
        Globos worm2 = new Globos();
        addObject(worm2,345,101);
        Globos worm3 = new Globos();
        addObject(worm3,74,113);
        Globos worm4 = new Globos();
        addObject(worm4,235,86);
        Globos worm5 = new Globos();
        addObject(worm5,370,180);
        Globos worm6 = new Globos();
        addObject(worm6,122,186);
        worm.setLocation(235,200);
        worm4.setLocation(269,64);
        Nave crab = new Nave();
        addObject(crab,186,108);
        Nave crab2 = new Nave();
        addObject(crab2,76,23);
        crab2.setLocation(95,25);
        removeObject(crab2);
        Enemigo lobster = new Enemigo();
        addObject(lobster,301,146);
        Enemigo lobster2 = new Enemigo();
        addObject(lobster2,153,379);
        Enemigo lobster3 = new Enemigo();
        addObject(lobster3,354,490);
        Nave crab3 = new Nave();
        addObject(crab3,422,304);
        worm.setLocation(134,464);
        worm6.setLocation(468,460);
        worm5.setLocation(484,99);
        worm2.setLocation(411,186);
    }
}
