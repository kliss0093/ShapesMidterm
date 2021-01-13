import java.io.File;
import java.io.IOException;

public class TestPic
{
    public static void main(String[] args)
    {
        // Get a reference to the canvas for this drawing and set its title.
        Canvas pic = Canvas.getCanvas();
        pic.setTitle("Shapes Constructor Test Picture");
        
        // Sets up random variable and int variable for later use
        int ranNumber = (int)(Math.random()*3);
        int number = 1;

        // Set the title and background for the picture
        pic.setTitle("My Picture K.L.");
        pic.setBackgroundColor("white");

        // Draw my background
        Rect background = new Rect();
        background.makeVisible();
        background.changeColor("blue");
        background.changeSize(4000);
        background.moveHorizontal(-700);
        background.moveVertical(-500);
        
        // Creates first hill in picture
        Circle a = new Circle();
        a.makeVisible();
        a.changeColor("green");
        a.moveVertical(250);
        a.moveHorizontal(-150);
        a.changeSize(1500);
        
        // Creates second hill in picture
        Circle b = new Circle();
        b.makeVisible();
        b.changeColor("green");
        b.moveVertical(170);
        b.moveHorizontal(-700);
        b.changeSize(900);
        
        // Creates third hill in picture
        Circle c = new Circle();
        c.makeVisible();
        c.changeColor("green");
        c.moveVertical(220);
        c.moveHorizontal(-100);
        c.changeSize(600);
        
        // Creates body of the house
        Rect d = new Rect();
        d.makeVisible();
        d.moveHorizontal(75);
        d.moveVertical(120);
        d.changeSize(90);
        if(ranNumber == 1)
        {
            d.changeColor("red");
        }
        else if(ranNumber == 2)
        {
            d.changeColor("yellow");
        }
        else
        {
            d.changeColor("magenta");
        }
        // Creates first window of the house
        Rect f = new Rect();
        f.makeVisible();
        f.changeColor("cyan");
        f.moveHorizontal(80);
        f.moveVertical(145);
        f.changeSize(40, 20);
        
        // Creates second window on the house
        Rect g = new Rect();
        g.makeVisible();
        g.changeColor("cyan");
        g.moveHorizontal(140);
        g.moveVertical(145);
        g.changeSize(40, 20);
        
        // Creates door of the house
        Rect h = new Rect();
        h.makeVisible();
        h.changeColor("black");
        h.moveHorizontal(105);
        h.moveVertical(155);
        h.changeSize(55, 30);
        
        // Creates roof of the house
        Triangle i = new Triangle();
        i.makeVisible();
        i.changeColor("brown");
        i.moveHorizontal(220);
        i.moveVertical(45);
        i.changeSize(60,100);
        
        // Creates the sun in the top right hand corner
        Circle j = new Circle();
        j.makeVisible();
        j.changeColor("yellow");
        j.moveHorizontal(400);
        j.moveVertical(-70);
        j.changeSize(150);
        
        // Creates first part of the cloud
        Arc k = new Arc();
        k.makeVisible();
        k.changeColor("white");
        k.changeArcBeginning(0);
        k.changeArcEnd(180);
        k.changeSize(200);
        
        // Creates second part of the cloud
        Arc l = new Arc(250, 70, 200, 0, 180, "white", true);
        
        // Creates third part of the cloud
        Arc m = new Arc();
        m.makeVisible();
        m.changeColor("white");
        m.changeArcBeginning(0);
        m.changeArcEnd(180);
        m.changeSize(200);
        m.moveHorizontal(70);
        m.moveVertical(-60);
        
        

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