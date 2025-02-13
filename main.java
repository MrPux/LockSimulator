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
        lock1.setValueNum(1, 3);
        lock1.setValueNum(2,4);
        lock1.setValueNum(3,7);
        lock1.open();

        //test a .open() method to open the lock
        lock2.setValueNum(1,3);
        lock2.setValueNum(2,4);
        lock2.setValueNum(3,6);
        
        //Test which out my two locks I created is closer to being solved.
        System.out.println(ComboLock.isCloser(lock1, lock2));

        //Test if an open & closed methods have an equal combination 

        //Test if an open & open methods have equals combination

        //Test to reset a combination for a lock
    }

}