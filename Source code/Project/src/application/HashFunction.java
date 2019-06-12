package application;

public class HashFunction {
	public int hashCode(String str) {
		int hcode = str.hashCode();
		return hcode % 5;
	}

}// tra ve hash code cua string mod 5