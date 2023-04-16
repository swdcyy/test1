package com.ta.utdid2.a.a.a;
import java.lang.String;
import java.lang.StringBuffer;
import com.ta.utdid2.a.a.f;
import java.lang.Integer;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import com.ta.utdid2.a.a.b;

public class a	// class@000cbb
{

    public static String a(String p0){
       byte[] uobyteArray;
       String str = null;
       try{
          uobyteArray = a.a(a.a(), p0.getBytes());
       }catch(java.lang.Exception e0){
          uobyteArray = e0;
       }
       if (uobyteArray != null) {
          return a.a(uobyteArray);
       }
       return e0;
    }
    public static String a(byte[] p0){
       if (p0 == null) {
          return "";
       }
       StringBuffer str = new StringBuffer((p0.length * 2));
       for (int i = 0; i < p0.length; i = i + 1) {
          a.a(str, p0[i]);
       }
       return str;
    }
    public static void a(StringBuffer p0,byte p1){
       p0+("0123456789ABCDEF").charAt(((p1 >> 4) & 0x0f))+("0123456789ABCDEF").charAt((p1 & 0x0f));
    }
    public static byte[] a(){
       return f.a(new byte[16]{'!','S',0xce,0xa7,0xac,0x8e,'P','c',0x0a,'?',0x16,0xbf,0xf5,0x1e,'e',0x8a});
    }
    public static byte[] a(String p0){
       int i = p0.length() / 2;
       byte[] uobyteArray = new byte[i];
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          int i2 = i1 * 2;
          int i3 = i2 + 2;
          String str = p0.substring(i2, i3);
          uobyteArray[i1] = Integer.valueOf(str, 16).byteValue();
       }
       return uobyteArray;
    }
    public static byte[] a(byte[] p0,byte[] p1){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(1, new SecretKeySpec(p0, "AES"), new IvParameterSpec(a.b()));
       return instance.doFinal(p1);
    }
    public static String b(String p0){
       try{
          return new String(a.b(a.a(), a.a(p0)));
       }catch(java.lang.Exception e0){
          return null;
       }
    }
    public static byte[] b(){
       try{
          byte[] uobyteArray = b.decode(("IUQSvE6r1TfFPdPEjfklLw==").getBytes("UTF-8"), 2);
          if (uobyteArray != null) {
             return f.a(uobyteArray);
          }
          uobyteArray = new byte[16];
          return uobyteArray;
       }catch(java.lang.Exception e0){
       }
    }
    public static byte[] b(byte[] p0,byte[] p1){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(2, new SecretKeySpec(p0, "AES"), new IvParameterSpec(a.b()));
       return instance.doFinal(p1);
    }
}
