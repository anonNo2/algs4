package com.anon.test;

import com.anon.test.utils.RSAUtil;

import java.security.interfaces.RSAPublicKey;


public class Main {
	public static void main(String[] args) throws Exception {
		RSAPublicKey pubKey = RSAUtil.getRSAPublicKey(Config.modulus, Config.exponent);
		String result =RSAUtil.encryptStringByJs(pubKey, "123456");
		System.out.println(result);
		System.out.println(Config.result);
		System.out.println(result.equals(Config.result));
		
	}
}
