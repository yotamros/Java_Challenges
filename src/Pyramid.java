/*
 * The goal of this program is to construct a Pyramid, centered on the screen.
 */
import acm.graphics.*;
import acm.program.GraphicsProgram;

public class Pyramid extends GraphicsProgram {

    private static final int SCREEN_WIDTH = 600;
    private static final int SCREEN_HEIGHT = 300;
    private static final int PADDING_BOTTOM = 20;
    private static final int BRICK_WIDTH = 30;
    private static final int BRICK_HEIGHT = 12;
    private static final int BRICKS_IN_BASE = 14;
    
    /*
     * Construct the pyramid by building one level at a time, starting from the
     * base.
     */
    private void buildPyramid() {
        for (int i = BRICKS_IN_BASE; i >= 0; i--) {
            buildPyramidLevel(i, BRICKS_IN_BASE - i);
        }
    }
    
    /*
     * Construct one level of the pyramid. 
     * @param int numOfBricksInLevel: the number of bricks in this level.
     * @param int level: the level of the pyramid to be constructed.
     */
    private void buildPyramidLevel(int numOfBricksInLevel, int level) {
        int SizeOfBricksAddedtoLevel = 0;
        for (int i = 0; i < numOfBricksInLevel; i++) {
            add(makeBrick(), calculateLeftPosition(level)
                    + SizeOfBricksAddedtoLevel, levelHeight(level));
            SizeOfBricksAddedtoLevel += BRICK_WIDTH;
        }
    }
    
    /*
     * Calculates the y coordinate position of the level.
     * @param int level: the current level.
     * @return int: the y coordinate position of the level.
     */
    private int levelHeight(int level) {
        return SCREEN_HEIGHT - PADDING_BOTTOM-(level*BRICK_HEIGHT);
    }
    
    /*
     * Calculates the x coordinate left position of the level.
     * @param level: the current level.
     * @return int: the x coordinate left position of the level
     */
    private int calculateLeftPosition(int level) {
        int levelLength = (BRICKS_IN_BASE - level) * BRICK_WIDTH;
        int LevelStartingPosition = (SCREEN_WIDTH - levelLength) / 2;
        return LevelStartingPosition;
    }
    
    /*
     * Construct a new brick.
     * @return GRect: a new brick.
     */
    private GRect makeBrick() {
        GRect brick = new GRect(BRICK_WIDTH, BRICK_HEIGHT);
        return brick;
    }
    
    public void run() {
        setSize(SCREEN_WIDTH, SCREEN_HEIGHT);
        buildPyramid();
    }
}
