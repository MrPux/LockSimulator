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
    @Override
    public String toString()
    {
        if(isOpen)
        {
            return "Lock with combination " + currentCombination + " is open.";
        }
        else 
        {
            return "lock with combination" + currentCombination + "is closed.";
        }
    }

    //I will have a reset combination for lock 
    public void resetCorrectCombination(String newCombination)
    {
        try{  
            if(!isOpen)
            {
                throw new IllegalArgumentException("Hey buddy, you cannot reset the combination while the lock is closed, try opening it first.");
            }

            if(isOpen)
            {
                this.correctCombination = newCombination;
                this.currentCombination = newCombination;
            }
        }catch(IllegalArgumentException i)
        {
            System.err.println(i.getMessage());
            return;
        }

    }
    //Lets have a set combination method called setValueNum
    public void setValueNum(int position, int newValue)
    {
        try{
            if(!(position < 3 && position > 0 && newValue < 10 && newValue > 0))
            {
                throw new IllegalArgumentException("Hey buddy, invalid position or valu.");
            }
            char[] temp = currentCombination.toCharArray();
            temp[position - 1] = (char) ('0' + newValue);

            this.currentCombination = new String(temp);
        }catch(IllegalArgumentException i)
        {
            System.err.println(i.getMessage());
            return;
        }
    }
    //Lets also have our close method that will shut this class lock
    public void close()
    {
        if(isOpen)
        {
            this.isOpen = false;
        }
        if(!isOpen)
        {
            System.out.println("he lock remains closed, do something else.");
        }
    }

    //Lets also have a way to open this class lock, with an open method
    public void open()
    {
        if(currentCombination == correctCombination)
        {
            this.isOpen = true;
            System.out.println("The lock is now open!");
        }
        if(!isOpen)
        {
            System.out.println("Failed to open the lock.");
        }
    }
    //Lets have a method that returns a boolean if the class lock is open

    //Lets have our method that compares tow locks have the same combination attributes

    //Lets have a method that gives us the difference between the two locks current and correct combination

    //Lets have a method that checks which lock is closser to getting open, that will required our previus method to check the difference between two locks

}