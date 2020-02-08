package maven_project.mavenproject12;
 import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;
public class Test11 {
	@Test
	public void test() {
		int n=0;
		int w;
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("enter no.of sweets");
		n=s.nextInt();
		sweet[] origin=new sweet[n];
		for(int i=0;i<n;i++) {
			System.out.println("enter weight of sweet"+(i+1));
			w=s.nextInt();
			origin[i]=new sweet(w);
		}
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=origin[i].getWeight();
		}
		Arrays.sort(arr);
		System.out.println("Sweets in sorted order:");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i]==origin[j].getWeight()) {
			     	System.out.println("Sweet "+(j+1));
			}
			}
		}
	}
   
}
