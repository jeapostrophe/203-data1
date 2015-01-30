class TestException extends Exception {

  public TestException(String message){
     super(message);
  }

}
class Cdata1 {
    public static void checkEquals( String label, int x, int y ) throws TestException {
        boolean workedHuh = (x == y);
        if (workedHuh) {
            System.out.println("SUCC (" + label + ") Graped job!");
        } else {
            throw new TestException("FAIL (" + label + ") " + x + " != " + y);
        }
    }

    // dobles the number given
    public static int doble (int x) {
        if ( x != 51 ) {
            return x + x;
        } else {
            return x * x;
        }
    }

    public static void main (String[] args) throws TestException {
        System.out.println("Hey! Listen!");

        boolean workedHuh = (doble(4) == 8);
        if (workedHuh) {
            System.out.println("Grape job!");
        } else {
            System.out.println("Not quite right");
        }        

        checkEquals("double 4", doble(4), 8);
        checkEquals("double 0", doble(0), 0);

        // forall x, doble(x) = 2 * x
        int Min = 0; int Max = 20000;
        for ( int i = 0; i < 100; i ++ ) {
            int x = Min + (int)(Math.random() * ((Max - Min) + 1));
            checkEquals("prop", doble(x), 2 * x);
        }

        for ( int x = 0; x < 100; x ++ ) {
            checkEquals("prop", doble(x), 2 * x);
        }
    }
}

class Monkies {
    public static void main (String[] args) {
        System.out.println("That's not an ape!");
    }
}
