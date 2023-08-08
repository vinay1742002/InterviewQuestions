package sample1;
import java.util.*;
public class sample1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		int width=sc.nextInt();
		
		textToLines(text.split(" "),width);
		
		int index=sc.nextInt();
		String word=sc.next();
		
		addWord(text,width,index,word);
		
		
	}
	
	public static void textToLines(String[] text, int width) {
		List<List<String>> wordArr=new ArrayList<>();
		for(int i=0;i<text.length;) {
			int a=getWordWidth(text[i]);
			int currWidth=0;
			List<String> s=new ArrayList<String>();
			while(i<text.length && (currWidth+a)<width) {
				s.add(text[i++]);
				currWidth+=a;
				if(i<text.length) {
					a=getWordWidth(text[i]);
				}
			}
			wordArr.add(s);			
		}
		for(List<String> i:wordArr) {
			System.out.println(i);
		}	
	}
	public static void addWord(String text, int width, int index,String word) {
		String []p;
		List<String> s=new ArrayList<String>();
		String []t=text.split(" ");
		for(int i=0;i<t.length;i++)
		s.add(t[i]);
		s.add(index,word);

		p=s.toArray(new String[s.size()]);

		textToLines(p,width);
	}
	public static int getWordWidth(String s) {
		 return s.length();
	}

}
