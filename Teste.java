public class Teste{
    public static void main(String[] args){
        Object a;
        Object b;

        a = new Integer(3);

        System.out.println(a);
        System.out.println(a.getClass().getName());

        a = new Float(3.5);

        System.out.println(a);
        System.out.println(a.getClass().getName());

        a = "String a";
        b = "String b";

        System.out.println(a);
        System.out.println(a + "; "+ b);
        System.out.println(a.getClass().getName());
    }
}