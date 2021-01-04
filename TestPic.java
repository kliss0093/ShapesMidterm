import java.io.File;
import java.io.IOException;

public class TestPic
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.setTitle("Shapes Constructor Test Picture");
        
        // Draw my picture
        Rect r = new Rect();
        r.makeVisible();
        r.changeColor("brown");
        r.moveHorizontal(75);
        r.moveVertical(120);
        r.changeSize(90);
        
        Circle a = new Circle();
        a.makeVisible();
        a.changeColor("green");
        a.moveVertical(250);
        a.moveHorizontal(-150);
        a.changeSize(1500);
        
        Circle b = new Circle();
        b.makeVisible();
        b.changeColor("green");
        b.moveVertical(170);
        b.moveHorizontal(-700);
        b.changeSize(900);
        
        Circle c = new Circle();
        c.makeVisible();
        c.changeColor("green");
        c.moveVertical(220);
        c.moveHorizontal(-100);
        c.changeSize(600);

        // Save the picture to a file
        String filename = "testpic.png";
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}