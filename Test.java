public class Test {

    public static void main(String[] args) {

        AL al = new AL("1", 5);
        AL al2 = new AL("2", 5);
        AL al3 = new AL("3", 4);

        AM am = new AM("4", 50);
        AM am2 = new AM("5", 50);
        AM am3 = new AM ("6", 40);

        AM am4 = new AM(){};

        //provo metodo superiore(CMP x)
        System.out.println(al.superiore(al3));
        System.out.println(al.superiore(al2));

        System.out.println(am.superiore(al3));  //lancio il metodo con oggetti di classi diverse

        System.out.println(am.superiore(am3));
        System.out.println(am.superiore(am2));


        //provo i metodi toString
        System.out.println("Provo il metodo toString");
        System.out.println(al.toString());
        System.out.println(am.toString());

        //provo i metodi equals
        System.out.println("Provo il metodo equals");

        System.out.println(al.equals(am));      //classi diverse

        System.out.println(al.equals(al));      //stesso oggetto

        System.out.println(al.equals(al2));     //oggetti diversi

        System.out.println(am.equals(am2));     //oggetti diversi





    }
}
