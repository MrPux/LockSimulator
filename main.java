class main {
    public static void main(String[] args) {
    ComboLock firstTest = new ComboLock("123"); // Who uses such a combination for
    // their luggage anyways?
    System.out.println(firstTest);
    firstTest.setValueNum(1, 4); // Set a wrong combo
    firstTest.setValueNum(2, 5);
    firstTest.setValueNum(3, 1);
    System.out.println(firstTest);
    firstTest.close();
    System.out.println(firstTest);
    firstTest.open(); // Fails
    System.out.println(firstTest); // Same as before
    firstTest.setValueNum(1, 1); // Set a correct combo
    firstTest.setValueNum(2, 2);
    firstTest.setValueNum(3, 3);
    firstTest.open(); // Success!
    System.out.println(firstTest); // Now open
    firstTest.resetCorrectCode("321");
    firstTest.close();
    firstTest.open(); // Fails due to being 000
    System.out.println(firstTest);
    System.out.println(firstTest.isOpen());
    System.out.println(firstTest.currentAttempt());
    }
    /*
    Lock open with combination 123 showing
    Lock open with combination 451 showing
    Lock closed with combination 451 showing
    Failed to open the lock
    Lock closed with combination 451 showing
    The lock is open with combination 123
    Lock open with combination 123 showing
    Failed to open the lock
    Lock closed with combination 000 showing
    false
    000
    */
    }
    