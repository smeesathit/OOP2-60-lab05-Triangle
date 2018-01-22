
/**
 * โปรแกรมหาพื้นที่และความยาวเส้นรอบรูปสามเหลี่ยม
 */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TriangleProgram
{
    // instance variables
    private Triangle triangle;
    int  choice;
    int  sideA, sideB, sideC;

    public static void main(String[] args)
    {
        TriangleProgram program = new TriangleProgram();

        program.start();
    } // end main

    /**
     * Constructor for objects of class TriangleProgram
     */
    public TriangleProgram()
    {

    } // end constructor

    public void start()
    {
        // put your code here
        getInput();
        displayOutput();
    }

    public void getInput()
    {
        //int  sideA, sideB, sideC;

        String  inputStr;

        inputStr           = JOptionPane.showInputDialog(null,
            "โปรแกรมนี้คำนวณหาพื้นที่ หรือความยาวเส้นรอบรูปสามเหลี่ยม\n"
            + "กด 1 เพื่อคำนวณพื้นที\n"
            + "กด 2 เพื่อคำนวณความยาวเส้นรอบรูป\n\n");

        choice            = Integer.parseInt(inputStr);

        inputStr  = JOptionPane.showInputDialog(null,
            "ป้อนด้าน a:");
        sideA = Integer.parseInt(inputStr);

        inputStr  = JOptionPane.showInputDialog(null,
            "ป้อนด้าน b:");
        sideB = Integer.parseInt(inputStr);

        inputStr  = JOptionPane.showInputDialog(null,
            "ป้อนด้าน c:");
        sideC = Integer.parseInt(inputStr);

        //create a new triangle with the input values
        triangle = new Triangle(sideA, sideB, sideC);

        // echo input
        /* String message;

        message = "side a = " + sideA + " side b = " + sideB + " side c = " + sideC;
        System.out.println(message);*/

    } // end getInput

    public void displayOutput()
    {
        String sideStr;
        String message;

        sideStr = "ความยาวด้านของรูปสามเหลี่ยม" + "\n" 
        + "ด้าน a = " + sideA + ", " 
        + "ด้าน b = " + sideB + ", " 
        + "ด้าน c = " + sideC + "\n\n";

        DecimalFormat df = new DecimalFormat("0.00");
        switch (choice)
        {
            case 1:

            if (triangle.getArea() == Triangle.INVALID_DIMENSION){
                message = sideStr + "ความยาวด้านไม่ถูกต้อง";
            } else {
                message = sideStr + "พื้นที่ = " + df.format(triangle.getArea());
            }
            break;

            case 2:
            if (triangle.getPerimeter() == Triangle.INVALID_DIMENSION){
                message = sideStr + "ความยาวด้านไม่ถูกต้อง";
            } else {
                message = sideStr + "พื้นที่ = " + df.format(triangle.getPerimeter());
            }
            break;
            default:
            message = "ตัวเลือกไม่ถูกต้อง";
        }
        JOptionPane.showMessageDialog(null, message);
        //    JOptionPane.showMessageDialog(null, "perimeter = " + triangle.getPerimeter());
    } // end displayOutput

} // end TriangleProgram
