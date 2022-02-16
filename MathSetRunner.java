package MathSet;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MathSetRunner
{
	public static void main(String args[]) throws IOException
	{
		String o = "1 2 3 4 5";
		String t = "4 5 6 7 8";
		MathSet a = new MathSet(o , t);
		System.out.println("union - " + a.union());
		System.out.println("intersection - " + a.intersection());
		System.out.println("DIFFERENCE A-B - " + a.differenceAMinusB());
		System.out.println("DIFFERENCE B-A - " + a.differenceBMinusA());
		System.out.println("symmetric difference - " + a.symmetricDifference());
		System.out.println();
		System.out.println();
		String o1 = "10 11 12 13 14 15 16 17";
		String t1 = "11 13 15 17 19 21 23";
		MathSet b = new MathSet(o1 , t1);
		System.out.println("union - " + b.union());
		System.out.println("intersection - " + b.intersection());
		System.out.println("DIFFERENCE A-B - " + b.differenceAMinusB());
		System.out.println("DIFFERENCE B-A - " + b.differenceBMinusA());
		System.out.println("symmetric difference - " + b.symmetricDifference());
		System.out.println();
		System.out.println();
		String o2 = "4 5 5 6 76 7 7 8 8 8 8 8";
		String t2 = "23 3 4 3 5 3 53 5 46 46 4 6 5 3 4";
		MathSet c = new MathSet(o2 , t2);
		System.out.println("union - " + c.union());
		System.out.println("intersection - " + c.intersection());
		System.out.println("DIFFERENCE A-B - " + c.differenceAMinusB());
		System.out.println("DIFFERENCE B-A - " + c.differenceBMinusA());
		System.out.println("symmetric difference - " + c.symmetricDifference());
	}
}