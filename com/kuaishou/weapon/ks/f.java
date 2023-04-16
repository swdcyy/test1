package com.kuaishou.weapon.ks.f;
import java.lang.Object;
import java.lang.String;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.lang.StringBuilder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import javax.crypto.CipherInputStream;
import java.io.InputStream;

public final class f	// class@00120b
{

    public void f(){
       super();
    }
    public static byte[] a(String p0,String p1,byte[] p2){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(1, new SecretKeySpec(p0.getBytes(), "AES"), new IvParameterSpec(p1.getBytes()));
       return instance.doFinal(p2);
    }
    public static byte[] b(String p0,String p1,byte[] p2){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(2, new SecretKeySpec(p1.getBytes(), "AES"), new IvParameterSpec(p0.getBytes()));
       return instance.doFinal(p2);
    }
    public static int c(String p0,String p1,byte[] p2){
       int i1;
       int i2;
       String str = new String(p2);
       int i = 16;
       if (str.length() < i) {
          i1 = str.length();
          String str1 = str;
          i2 = 0;
          int i3 = i1 - 16;
          while (i2 < i3) {
             str1 = str1+"0";
             i2 = i2 + 1;
          }
          str = str1;
       }else if(str.length() > i){
          str = str.substring(0, i);
       }
       FileInputStream uFileInputSt = new FileInputStream(p0);
       FileOutputStream uFileOutputS = new FileOutputStream(p1);
       SecretKeySpec secretKeySpe = new SecretKeySpec(str.getBytes(), "AES");
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       byte[] uobyteArray = new byte[i];
       for (int i4 = 0; i4 < i; i4 = i4 + 1) {
          uobyteArray[i4] = 0;
       }
       instance.init(2, secretKeySpe, new IvParameterSpec(uobyteArray));
       CipherInputStream uCipherInput = new CipherInputStream(uFileInputSt, instance);
       i1 = new byte[1024];
       i2 = uCipherInput.read(i1);
       while (i2 != -1) {
          uFileOutputS.write(i1, 0, i2);
       }
       try{
          uCipherInput.close();
          uFileOutputS.close();
          try{
             uFileInputSt.close();
             try{
                uCipherInput.close();
                return 0;
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
       }
    }
}
