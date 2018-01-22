
/**
 * คลาสของรูปสามเหลี่ยม
 */
public class Triangle
{
    // class variable
    public static final int INVALID_DIMENSION = -1;

    // instance variables - for the three sides
    private int a;
    private int b;
    private int c;

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(int sideA, int sideB, int sideC)
    {
        // initialise instance variables
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    } // end constructor

    /**
     * set methods
     */
    public void setSideA(int sideA)
    {
        if (sideA > 0)
        {
            a = sideA;
        }    else
        {
            a = INVALID_DIMENSION;
        }
    }

    public void setSideB(int sideB)
    {
        if (sideB > 0)
        {
            b = sideB;
        }    else
        {
            b = INVALID_DIMENSION;
        }

    }

    public void setSideC(int sideC)
    {
        if (sideC > 0)
        {
            c = sideC;
        }    else
        {
            c = INVALID_DIMENSION;
        }
    }

    // get methods
    public int getSideA()
    {
        return a;
    }

    public int getSideB()
    {
        return b;
    }

    public int getSideC()
    {
        return c;
    }

    // compute area and return result
    public double getArea()
    {

        double result = INVALID_DIMENSION;

        if (isSideValid()) {
            double s;

            s = (a + b + c) / 2.0;

            result = Math.sqrt(s * (s - a)*(s - b)*(s - c));
        }
        return result;
    }

    // compute perimeter and return result
    public int getPerimeter()
    {
        int result = INVALID_DIMENSION;

        if (isSideValid()) {
            result = a + b + c;
        }
        return result;
    }

    private boolean isSideValid()
    {
        boolean flag = false;
        if (a != INVALID_DIMENSION && b != INVALID_DIMENSION && c != INVALID_DIMENSION)
        {flag = true;}
        return flag;
    }

} // end Triangle
