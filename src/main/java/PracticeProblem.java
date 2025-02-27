import java.util.*;

public class PracticeProblem {

	public static void main(String args[]) {

	}
public static void swap(ArrayList<String> arrL, int num, int num2){
	String replace = arrL.get(num);
	arrL.set(num, arrL.get(num2));
	arrL.set(num2, replace);
}

public static ArrayList<Double> createArrayList(double[] dbArr){
	ArrayList<Double> arrL= new ArrayList<Double>(); 
	for(int i = 0; i < dbArr.length; i++){
	arrL.add(dbArr[i]);
	}
	return arrL;
}

public static HashMap<String, Integer> combineParallelArrays(String[] names, int[] ages){
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	for(int i = 0; i < ages.length; i++){
	map.put(names[i], ages[i]);
	}
	return map;
}

public static void increaseAge(HashMap<String, Integer> map, String name){
map.put(name, map.get(name) + 1);
}
}
