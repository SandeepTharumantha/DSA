import java.util.Collection;
import java.util.LinkedList;


class CollectionPractical1{
	public CollectionPractical1(){
		int size;
		Collection<Integer> c = new LinkedList<>();
		c.add(6);
		c.add(9);
		c.add(4);
		c.add(2);
		c.add(0);
		
		boolean isEmpty = c.isEmpty();
		System.out.println(isEmpty);
		
		System.out.println(c);
		
		size = c.size();
		System.out.println(size);
		
		boolean contains = c.contains(5);
		System.out.println(contains);
		
		c.remove(6);
		System.out.println(c);
	}
	public static void main(String[] args){
		new CollectionPractical1();
	}
}