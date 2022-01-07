.Abstract methods do not have the body they only have declaration but no definition. 
.The definition is defined by implementing classes.





package Mypackage;

public interface Building {
	void heightDisplay();
	 
    
    static void widthDisplay()
    {
        System.out.println("width is 1");
    }
}
 
class GFG implements Building {
    // implementing tha abstract method
    
    public void heightDisplay()
    {
        System.out.println("height is 5");
    }
    public static void main(String[] args)
    {
 
        GFG gfg = new GFG();
        gfg.heightDisplay();
        // accessing the static method
        // by using of interface name
        Building.widthDisplay();
    }
}


