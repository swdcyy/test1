package com.vivo.push.util.f;
import java.lang.String;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

public final class f	// class@0010b4
{

    public static String a(byte[] p0){
       int len = p0.length;
       char[] uocharArray = new char[len];
       for (int i = 0; i < len; i = i + 1) {
          int i1 = p0[i] ^ 0x10;
          uocharArray[i] = (char)i1;
       }
       return new String(uocharArray);
    }
    public static byte[] a(String p0,String p1,byte[] p2){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(2, new SecretKeySpec(p1.getBytes("utf-8"), "AES"), new IvParameterSpec(p0.getBytes("utf-8")));
       return instance.doFinal(p2);
    }
}
