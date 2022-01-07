                                     *Abstraction in Java*
.Data Abstraction is the property by virtue of which only the essential details are displayed to the user.
.Data Abstraction may also be defined as the process of identifying only the required characteristics of an object ignoring the irrelevant details. 
.The properties and behaviours of an object differentiate it from other objects of similar type and also help in classifying/grouping the objects.
.Consider a real-life example of a man driving a car. 
  The man only knows that pressing the accelerators will increase the speed of a car or applying brakes will stop the car, but he does not know about how on pressing the accelerator the speed is actually increasing,
  he does not know about the inner mechanism of the car or the implementation of the accelerator, brakes, etc in the car. 
  This is what abstraction is. 
.In java, abstraction is achieved by interfaces and abstract classes. We can achieve 100% abstraction using interfaces.  


Java Abstraction Example:

abstract class Car{  
    abstract void accelerate();  
}  

class Suzuki extends Car{  
    void accelerate(){
        System.out.println("Suzuki::accelerate");
     
    }
}
class Main{
    public static void main(String args[]){  
        Car obj = new Suzuki();    
        obj.accelerate();           
    }   
	
}  


-------------------------------------------------------------------------------------------------------------------------------------------------



 Can interfaces have normal variables?
 
 yes,interfaces have normal variables
.Interface variables are static because Java interfaces cannot be instantiated in their own right.
.The value of the variable must be assigned in a static context in which no instance exists. 
.The final modifier ensures the value assigned to the interface variable is a true constant that cannot be re-assigned by program code.
---------------------------------------------------------------------------------------------------------------------------------------------------
