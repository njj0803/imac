package org.nijj.imac.tools;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class PasswordTool {

	private String convert(byte[] bytes) {
		String result = "";
		for (int i = 0; i < bytes.length; i++) {
			int temp = bytes[i] & 0xff;
			String tempHex = Integer.toHexString(temp);
			if (tempHex.length() < 2) {
				result += "0" + tempHex;
			} else {
				result += tempHex;
			}
		}
		return result;
	}

	public String EncodeSHA(String pswd) {
		MessageDigest sha = null;
		try {
			sha = MessageDigest.getInstance("SHA");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] shas = sha.digest(pswd.getBytes());
		return convert(shas);
	}
}
