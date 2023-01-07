package tutorial;

public class aRRAY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//방법 1
		String[] basicArray = new String[3];
		// basicArray는 String 타입의 원소를 가지는 배열([])이라는 뜻이다.
		basicArray[0] = "aka1";
		basicArray[1] = "aka2";
		basicArray[2] = "aka3";
		System.out.println(basicArray[0]);
		
		//방법2
		String[] classGroup = {"ABA", "lobta", "ava"};
		System.out.println(classGroup[0]);
		for (int i =0; i < classGroup.length; i++) {
			String cs = classGroup[i];
			System.out.println(cs);
		}
		String[] members = {"jack", "stauber", "dana"};
		for (String e : members) {
			System.out.println(e + "has been arrived");
		}

	}

}
