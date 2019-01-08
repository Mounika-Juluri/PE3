public class ExceptionFlow {
    public static void main(String[]args){
        try{
            if(true){
                throw new MyException("try");
            }
        }
        catch (MyException ex)
        {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("Finally");
        }


    }


}
