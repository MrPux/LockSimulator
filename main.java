// Class main
public class main {
    public static void main(String[] args){
        //An instance object of a comboLock without lock combination passing arguments
        ComboLock lock1 = new ComboLock();
        //I will also test an instance object of comboLock with passing arguments that would be the lock combinations
        ComboLock lock2 = new ComboLock("245");

        //test the to instanceObject.toString() method
        System.out.println(lock1.toString());
        System.out.println(lock2.toString()); 

        //test a .close() method to shut the lock
        lock1.close();

        //test a .setValueNum method to unlock the lock
        lock1.setValueNum(1, 2);
        lock1.setValueNum(2,4);
        lock1.setValueNum(3,7);
        lock1.open();

        //test a .open() method to open the lock
        lock2.setValueNum(1,2);
        lock2.setValueNum(2,4);
        lock2.setValueNum(3,6);
        System.out.println(lock2.isOpen() + "<--");
        //Test which out my two locks I created is closer to being solved.
        System.out.println(ComboLock.isCloser(lock1, lock2));

        //Test if an open & closed methods have an equal combination 
        ComboLock lock3 = new ComboLock("246");
        System.out.println(lock2.equals(lock3));
        
        lock3.setValueNum(1,2);
        lock3.setValueNum(2, 4);
        lock3.setValueNum(3, 6);
        lock3.close();
        System.out.println(lock2.equals(lock3));
    
        
    }

}