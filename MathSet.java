package MathSet;
public class MathSet
{
	private MySet<Integer> one;
	private MySet<Integer> two;

	public MathSet()
	{
		one = new MySet<Integer>();
		two = new MySet<Integer>();
	}

	public MathSet(String o, String t)
	{
		one = new MySet<Integer>();
		two = new MySet<Integer>();
		String[] o1 = o.split(" ");
		String[] t1 = t.split(" ");
		for(int i = 0; i < o1.length; i++) {
			one.add(Integer.parseInt(o1[i]));
		}
		for(int i = 0; i < t1.length; i++) {
			two.add(Integer.parseInt(t1[i]));
		}
		
	}

	public MySet<Integer> union()
	{
		MySet<Integer> union = new MySet<Integer>();
		union.addAll(one);
		union.addAll(two);
		return union;
	}

	public MySet<Integer> intersection()
	{
		MySet<Integer> union = new MySet<Integer>();
		union.addAll(one);
		union.retainAll(two);
		return union;
	}

	public MySet<Integer> differenceAMinusB()
	{
		MySet<Integer> union = new MySet<Integer>();
		union.addAll(one);
		union.removeAll(two);
		return union;
	}

	public MySet<Integer> differenceBMinusA()
	{
		MySet<Integer> union = new MySet<Integer>();
		union.addAll(two);
		union.removeAll(one);
		return union;
	}
	
	public MySet<Integer> symmetricDifference()
	{		
		MySet<Integer> s = new MySet<Integer>();
		s.addAll(one);
		s.addAll(two);
		
		MySet<Integer> remove = new MySet<Integer>();
		remove.addAll(one);
		remove.retainAll(two);
		
		s.removeAll(remove);
		
		return s;
	}	
	
	public String toString()
	{
		return "Set one " + one + "\n" +	"Set two " + two +  "\n";
	}
}