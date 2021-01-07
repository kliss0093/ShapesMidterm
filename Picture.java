
/**
 * Draw a pretty picture composed of shape objects on a canvas
 * 
 * @author: (Your name)
 * @version: (Date)
 * 
 */
import java.io.File;
import java.io.IOException;

public class Picture {
    public static void main(String[] args) {
        // Get a reference to the canvas for this drawing
        Canvas pic = Canvas.getCanvas();

        // Set the title and background for the picture
        pic.setTitle("My Picture");
        pic.setBackgroundColor("white");

        // Draw my picture
        Rect background = new Rect();
        background.makeVisible();
        background.changeColor("blue");
        background.changeSize(4000);
        background.moveHorizontal(-700);
        background.moveVertical(-500);
        
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
        
        Rect d = new Rect();
        d.makeVisible();
        d.changeColor("red");
        d.moveHorizontal(75);
        d.moveVertical(120);
        d.changeSize(90);
        
        Rect f = new Rect();
        f.makeVisible();
        f.changeColor("cyan");
        f.moveHorizontal(80);
        f.moveVertical(145);
        f.changeSize(40, 20);
        
        Rect g = new Rect();
        g.makeVisible();
        g.changeColor("cyan");
        g.moveHorizontal(140);
        g.moveVertical(145);
        g.changeSize(40, 20);
        
        Rect h = new Rect();
        h.makeVisible();
        h.changeColor("black");
        h.moveHorizontal(105);
        h.moveVertical(155);
        h.changeSize(55, 30);
        
        Triangle i = new Triangle();
        i.makeVisible();
        i.changeColor("brown");
        i.moveHorizontal(220);
        i.moveVertical(45);
        i.changeSize(60,100);
        
        Circle j = new Circle();
        j.makeVisible();
        j.changeColor("yellow");
        j.moveHorizontal(400);
        j.moveVertical(-70);
        j.changeSize(150);
        
        Arc k = new Arc();
        k.makeVisible();
        k.changeColor("white");
        k.changeArcBeginning(0);
        k.changeArcEnd(180);
        k.changeSize(200);
        
        Arc l = new Arc();
        l.makeVisible();
        l.changeColor("white");
        l.changeArcBeginning(0);
        l.changeArcEnd(180);
        l.changeSize(200);
        l.moveHorizontal(150);
        
        
        Arc m = new Arc();
        m.makeVisible();
        m.changeColor("white");
        m.changeArcBeginning(0);
        m.changeArcEnd(180);
        m.changeSize(200);
        m.moveHorizontal(70);
        m.moveVertical(-60);

        // Get the filename to save to from the command line arguments, defaulting to
        // MyPicture.png if no argument is given
        String filename;
        if (args.length > 0 && args[0] != null && !args[0].isEmpty()) {
            filename = args[0];
        }
        else {
            filename = "MyPicture.png";
        }

        // Save the picture to a file
        try {
            pic.saveToFile(new File(filename));
            System.out.println("Picture saved to " + filename);
        } catch (IOException e) {
            System.err.println(e);
            System.err.println("Could not save file.");
        }
    }
}