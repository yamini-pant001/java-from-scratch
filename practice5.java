public class practice5 {
    public static void main(String[] args) {
       // 75 or above → "Distinction"
        //40 to 74 → "Pass"
        //below 40 → "Fail"

        int marks=85;

        
        if(marks>=75){
            System.out.println("Distinction");

        }
        else if(marks>=40){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
    
}
