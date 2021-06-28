public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a = new ArrayList<>();
		a.add("swathi");
		a.add("bob");
		a.add("poojith");
		a.add("rushnita");
		for(String s:a) {
		System.out.println(s);
		}
	a.remove(0);
		for(String s:a) {
			System.out.println(s);
			}
		System.out.println(a.get(1));
		
		//** new arraylist
		
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(1);
		b.add(10);
		b.add(11);
		b.add(12);
		b.add(123);
		
		 System.out.println(b);
		
			
		}
		
	}


