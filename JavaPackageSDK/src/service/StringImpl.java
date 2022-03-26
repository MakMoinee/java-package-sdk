package service;

public class StringImpl implements StringIntf {

	@Override
	public String getData(String str) {
		// TODO Auto-generated method stub
		return str;
	}

	@Override
	public Boolean isStringMatchLength(String str, int length) {
		int len = str.length();
		return len == length;
	}

}
