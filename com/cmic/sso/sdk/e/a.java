package com.cmic.sso.sdk.e.a;
import java.lang.String;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import android.util.Base64;
import java.lang.Exception;
import java.security.SecureRandom;

public class a	// class@000f59
{

    public static String a(byte[] p0,String p1){
       try{
          Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
          byte[] uobyteArray = new byte[instance.getBlockSize()];
          instance.init(1, new SecretKeySpec(p0, "AES"), new IvParameterSpec(uobyteArray));
          return Base64.encodeToString(instance.doFinal(p1.getBytes("utf-8")), 0);
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return null;
       }
    }
    public static byte[] a(){
       byte[] uobyteArray = new byte[16];
       new SecureRandom().nextBytes(uobyteArray);
       return uobyteArray;
    }
    public static String b(byte[] p0,String p1){
       int i = 0;
       try{
          Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
          byte[] uobyteArray = new byte[instance.getBlockSize()];
          instance.init(2, new SecretKeySpec(p0, "AES"), new IvParameterSpec(uobyteArray));
          return new String(instance.doFinal(Base64.decode(p1, i)), "utf-8");
       }catch(java.lang.Exception e4){
          e4.printStackTrace();
          return null;
       }
    }
}
