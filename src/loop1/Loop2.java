
package loop1;


public class Loop2 {
    public static void main(String [] args){
    
      int trem=5;
        for(int row=1; row<=trem; row++){
        
            for(int col=1; col<=row; col++){
            
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
