package Activities;

class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class activity8 {
    public static void main(String[] arg){
        try {

            activity8.exceptionTest("Will print to console");

            activity8.exceptionTest(null); // Exception is thrown here
            activity8.exceptionTest("Won't execute");
        } catch(CustomException ce) {
            System.out.println("Inside catch block: " + ce.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}