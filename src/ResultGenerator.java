


import java.util.Scanner;


    public class ResultGenerator {
        public static void main(String[] args) {
            double a, b=0;
            Scanner obj = new Scanner(System.in);
            System.out.println("Enter number of subjects");
            double sub_num = obj.nextInt();
            for(double i=1;i<=sub_num;i++){
                System.out.println("Enter marks for subject "+ i );
                a = obj.nextInt();
                b += a;
            }
            double percentage = ((b/(sub_num*100))*100);
            System.out.println("The percentage is: " + percentage);
            if(percentage<=100 & percentage>90){
                System.out.println(("A+"));
            }else if(percentage<=90 & percentage>80){
                System.out.println("A");
            }else{
                System.out.println(" Fail :(");
            }
        }
    }


