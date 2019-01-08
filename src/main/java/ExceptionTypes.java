public class ExceptionTypes {
    public static void main(String args[])
    {

            try {
                String a = null; //null value
                System.out.println(a.charAt(0));
            } catch(NullPointerException e) {
                System.out.println("NullPointerException..");
            }
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
        try {
            int[ ] arr=new int[-10];
        }
        catch(NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException");
        }

    }
}
