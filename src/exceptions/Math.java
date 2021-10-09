package exceptions;

public class Math {
    public static void main(String[] args) {
        int a  = 6;
        System.out.println("line 1");
        try {
            System.out.println("line 2: "+a/0);
    }catch (Exception e) {
            e.printStackTrace();
            System.out.println("you're code has issues");
    }
        System.out.println("line 3");
    }
}

