package exception;

public class exec1 {
    static void checkAge(int age)throws RuntimeException{
        if(age<10)
        {
            throw new RuntimeException("Age cannot be less than 18:");
        }
        else{
            System.out.println("Valid age");
        }
    }
    public static void main(String[] args){
        try{
            checkAge(19);
        }
        catch(RuntimeException e){
        System.out.println(e.getMessage());
         }
    }
}
