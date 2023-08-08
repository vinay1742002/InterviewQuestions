package sample;
import java.util.*;
public class sample {

	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        int x=sc.nextInt(),y=sc.nextInt();
	        int a=sc.nextInt(),b=sc.nextInt();
	        int [][]m =new int[8][8];
	        System.out.println(traverse(x,y,a,b,m));
	    }
	    public static boolean traverse(int x,int y,int a,int b,int [][]m){
	        if(x==a && y==b){
	        	return true;
	        }
	        if(x>=0 && x<8 && y>=0 && y<8 && m[x][y]==0) {
	        	m[x][y]=1;
	        	return traverse(x-2,y+1,a,b,m) ||traverse(x-2,y-1,a,b,m) ||traverse(x+2,y+1,a,b,m)||traverse(x+2,y-1,a,b,m)||traverse(x-1,y+2,a,b,m)
	        	        ||traverse(x+1,y+2,a,b,m) ||traverse(x-1,y-2,a,b,m)||traverse(x+1,y-2,a,b,m);	        	
	        }else {
	        	return false;
	        }
	    }

}
