package _01_Simple_Array_Algorithms;

import java.util.ArrayList;
import java.util.Random;

public class MoreArrayFun {
    //1. Create a main method to test the other methods you write.
public static void main(String[] args) {
	String[] arr = {"df", "wfasf","jigrjib","uhbshsbfsv","uigahbh","ihgehbf","ge","vb"};
	ArrayList<String> list = new ArrayList<String>();	
	list.add("df");
	list.add("wegag");
	list.add("asvdz");
	list.add("tky");
	list.add("jlk");
	list.add("bn");
	list.add("kt");
	
	
	j(list);
	
}


    //2. Write a method that takes an array of Strings and prints all the Strings in the array.
public static void e(String[] array) {
	for(int i = 0; i<array.length; i++) {
		System.out.println(array[i]);
	}
}


    //3. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in reverse order.
public static void s(String[] array) {
	for(int i = array.length - 1; i>=0; i--) {
		System.out.println(array[i]);
	}
}

//Array: 2, 3, 4, 5
//Length: 4
//
    //4. Write a method that takes an array of Strings and prints every other String in the array.
//1, 2, 3, 4, 5, 6
//11 % 3 = 2

	public static void g(String[] array) {
	for(int i = 0; i<array.length;i++) {
		if(i % 2== 0) {
		System.out.println(array[i]);
		
	}
	}
	}

    //5. Write a method that takes an array of Strings and prints all the Strings in the array
    //   in a completely random order. Almost every run of the program should result in a different order.
	public static void j(ArrayList<String> f ){
		int size = f.size();
	for(int i = 0; i<size;i++ ) {
		Random ran = new Random();
		int num = ran.nextInt(f.size());
		System.out.println(f.get(num));
		f.remove(num);
	}
	}

}
