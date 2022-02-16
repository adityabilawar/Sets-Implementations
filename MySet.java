package MathSet;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

//ArrayList Implementation
public class MySet<E> {
	ArrayList<E> arr;

	public MySet() {
		arr = new ArrayList<E>();
	}

	public boolean add(E e) {
		if (!arr.contains(e)) {
			arr.add(e);
			return true;
		} else
			return false;
	}

	public boolean retainAll(MySet<E> c) {
		ArrayList<E> temp = new ArrayList<E>();
		for (int i = 0; i < c.arr.size(); i++) {
			if (contains((E)c.arr.get(i))) {
				temp.add((E)c.arr.get(i));
			}
		}
		arr = temp;
		return true;
	}

	public boolean addAll(MySet<E> c) {		
		for (int i = 0; i < c.arr.size(); i++) {
			if (!contains( c.arr.get(i))) {
				arr.add( c.arr.get(i));
			} 
		}
		return true;
	}

	private boolean containsAll(MySet<E> c) {
		return arr.equals(c.arr);
	}

	public boolean removeAll(MySet<E> c) {
		ArrayList<E> newArr = new ArrayList<E>();
		for(int i = 0; i < arr.size(); i++) {
			if(!c.contains(arr.get(i))) {
			 newArr.add(arr.get(i));
			}
		}
		arr = newArr;
		return true;
	}

	public boolean contains(E e) {
		return arr.contains(e);
	}
	public String toString() {
		String output = "";
		for(int i = 0; i < arr.size(); i++) {
			output+= arr.get(i).toString() + " ";
		}
		return output;
	}
}