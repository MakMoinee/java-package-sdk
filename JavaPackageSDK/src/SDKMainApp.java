import service.StringImpl;

public class SDKMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringImpl stringUtil = new StringImpl();

		System.out.println(stringUtil.getData("hell"));
		System.out.println(stringUtil.isStringMatchLength("this", 4));

	}

}
