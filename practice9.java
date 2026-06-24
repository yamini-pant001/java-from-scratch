import java.util.Scanner;

public class practice9{
    public static void main(String[] args) {
        //taking input

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you name : ");
        String name =sc.next();

        System.out.println("Hii "+name+" Please enter you Age aslo");
        int age=sc.nextInt();

        if(age>=18){
            System.out.println(name+" you are "+age+" year old . so you are eligible for vote");
        }
        else{
            System.out.println(name+" you are "+age+" year old. so you are not eligible for vote");
        }
    }
}