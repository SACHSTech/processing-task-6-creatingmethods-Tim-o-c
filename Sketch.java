import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * A code that prints a screen covered in spiders with various sizes
   * @author: T. Chhor
   * 
   */

  public void settings() {
	// put your size call here
    size(400, 400);
  }

  public void setup() {
    background(210, 255, 173);
  }

  public void draw() {
    
    // Initializing variables
    float floatXCoord;
    float floatYCoord;
    float floatSize = 20;
    int intSpiderColour = 0;

    // The for loop that prints the spider in various locations
    for (floatXCoord = 40; floatXCoord < 400; floatXCoord += 40) {
      for (floatYCoord = 40; floatYCoord < 400; floatYCoord += 40) {
        intSpiderColour += 3;
        floatSize += 1;

        // If the mouse is pressed, then the colour will print differently
        if (mousePressed) {
          drawSpider(floatXCoord, floatYCoord, floatSize, changingColour(floatXCoord, floatYCoord));
        }
        else {
          drawSpider(floatXCoord, floatYCoord, floatSize, intSpiderColour);
        }
          fill(250, 20, 90);
      }
    }

    // Drawing the dot
    for (floatXCoord = 40; floatXCoord < 400; floatXCoord += 40) {
      for (floatYCoord = 40; floatYCoord < 400; floatYCoord += 40) {
        drawDot(floatXCoord + 5, floatYCoord + 15);
      }
    }
  }

  /**
   * Draws a spider based on inputs on location, size and colour
   * 
   * @param floatSpiderX The X value of where the Spider will be printed
   * @param floatSpiderY The Y value of where the Spider will be printed
   * @param floatSpiderSize The size of the Spider
   * @param intSpiderColour The colour of the Spider
   */
  private void drawSpider(float floatSpiderX, float floatSpiderY, float floatSpiderSize, int intSpiderColour) {
    
    // Head 
    fill(intSpiderColour);
    ellipse(floatSpiderX,floatSpiderY, floatSpiderSize, (float) (floatSpiderSize / 1.5));

    // Eyes
    fill(255, 255, 255);
    ellipse(floatSpiderX - floatSpiderSize / 5, floatSpiderY - floatSpiderY / 30, floatSpiderSize / 10, floatSpiderSize / 10);
    ellipse(floatSpiderX + floatSpiderSize / 5, floatSpiderY - floatSpiderY / 30, floatSpiderSize / 10, floatSpiderSize / 10);
    ellipse(floatSpiderX - floatSpiderSize / 10, floatSpiderY - floatSpiderY / 30, floatSpiderSize / 10, floatSpiderSize / 10);
    ellipse(floatSpiderX + floatSpiderSize / 10, floatSpiderY - floatSpiderY / 30, floatSpiderSize / 10, floatSpiderSize / 10);

    // Legs
    fill(intSpiderColour);
    line(floatSpiderX + floatSpiderSize / 2, floatSpiderY, floatSpiderX + floatSpiderSize, floatSpiderY + floatSpiderSize);
    line(floatSpiderX - floatSpiderSize / 2, floatSpiderY, floatSpiderX - floatSpiderSize, floatSpiderY + floatSpiderSize);
    line(floatSpiderX + floatSpiderSize / 4, floatSpiderY + floatSpiderSize / 4, floatSpiderX + floatSpiderSize / 2, floatSpiderY + floatSpiderSize);
    line(floatSpiderX - floatSpiderSize / 4, floatSpiderY + floatSpiderSize / 4, floatSpiderX - floatSpiderSize / 2, floatSpiderY + floatSpiderSize);

  }

  /**
   * Draws a series of dots based on location inputs
   * 
   * @param floatDotX The X coordinate of the dot
   * @param floatDotY The Y coordinate of the dot
   */
  private void drawDot(float floatDotX, float floatDotY){
    ellipse(floatDotX, floatDotY, 5, 5);
    ellipse(floatDotX + 3, floatDotY, 5, 5);
    ellipse(floatDotX + 3/2, floatDotY + 3/2, 5, 5);
    ellipse(floatDotX, floatDotY + 3, 5, 5);
    ellipse(floatDotX - 3/2, floatDotY + 3/2, 5, 5);
    ellipse(floatDotX - 3, floatDotY, 5, 5);
    ellipse(floatDotX - 3/2, floatDotY - 3/2, 5, 5);
    ellipse(floatDotX, floatDotY - 3, 5, 5);
    ellipse(floatDotX + 3/2, floatDotY - 3/2, 5, 5);
  }
  
  /**  
   * Given the X and Y coordinate, returns a value that is the addition of the two of them divided by 2 
   * 
   * @param floatFirstQuality The X Coordinate
   * @param floatSecondQuality The Y Coordinate
   * @return The new value
   */
  private int changingColour(float floatFirstQuality, float floatSecondQuality){
      int newColourValue = (int)(floatFirstQuality / 2) + (int)(floatSecondQuality / 2); 
      return newColourValue;
  }

}