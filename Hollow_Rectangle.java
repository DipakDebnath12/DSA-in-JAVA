import java.util.Scanner;
public class Hollow_Rectangle{

/*     void gap(int n){
        for(int i=1;i<=n+1;i++){
            if(i==2&&i=n+1){
            System.out.print(" ");
            }else{
            System.out.print("*");
            }
        }
    }*/
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1;j++){
                if(i>=2){
                    if(i==n){
                        System.out.print("*");
                    }else{ 
                        if(j>=2){
                            if(j==n+1){
                                System.out.print("*");
                            }else{
                                System.out.print(" ");
                            }
                        }else{
                            System.out.print("*");
                        }
                    }
            }else{
                System.out.print("*");
            }
        }
        System.out.println();
            
        }    
    }
}