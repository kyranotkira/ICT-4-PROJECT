package gui;
import java.security.MessageDigest;
public class User {
static private String passwordEnc = "f5aefd5e83ec24922b9fdd8bef6eed96af5869843972e6b91fbab2a2ffb9bb86";
	
	
	public static boolean login(String password) throws Exception{
		MessageDigest ms = MessageDigest.getInstance("SHA-256");
		ms.update(password.getBytes());
		StringBuffer hexString = new StringBuffer();
	    byte[] b = ms.digest();
	      for (int i = 0;i<b.length;i++) {
	         hexString.append(Integer.toHexString(0xFF & b[i]));
	      }
		if(hexString.toString().equals(passwordEnc)) {
			return true;
		}
		return false;
	}
}
