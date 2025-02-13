//Initialize class 
public class ComboLock{

    //Delcare private instance variables

    //Delcare: correctCombination
    private String correctCombination;
    //Delcare: currentCombination
    private String currentCombination;
    //Declare: isOpen
    private boolean isOpen;

    //Initialize constructor with no arguments
    public ComboLock()
    {
        this.correctCombination = "123";
        this.currentCombination = "123";
        this.isOpen = true;
    }

    //Initializ constructor with a passing string argument 
    public ComboLock(String combination){
        //Set the passing argument to be the combination for this class
        this.correctCombination = combination;
        this.currentCombination = combination;
        //default open the lock
        this.isOpen = true;
    }
    
    //Initialize the toString() method which will return the state of this class lock


    //I will have a reset combination for lock 

    //Lets have a set combination method called setValueNum

    //Lets also have our close method that will shut this class lock

    //Lets also have a way to open this class lock, with an open method

    //Lets have a method that returns a boolean if the class lock is open

    //Lets have our method that compares tow locks have the same combination attributes

    //Lets have a method that gives us the difference between the two locks current and correct combination

    //Lets have a method that checks which lock is closser to getting open, that will required our previus method to check the difference between two locks

}