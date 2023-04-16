package ekd.a0;
import java.lang.String;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.io.File;
import java.security.MessageDigest;
import java.io.FileInputStream;
import java.lang.Exception;
import java.lang.IndexOutOfBoundsException;

public class a0	// class@001554
{
    public static final char[] a;

    static {
       a0.a = new char[16]{'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
    }
    public static byte[] a(byte[] p0,byte[] p1,String p2){
       try{
          Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
          instance.init(1, new SecretKeySpec(p1, "AES"), new IvParameterSpec(p2.getBytes("utf-8")));
          p0 = instance.doFinal(p0);
          return p0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String b(File p0){
       String str = null;
       try{
          MessageDigest instance = MessageDigest.getInstance("MD5");
          if (instance == null) {
             return str;
          }
          FileInputStream uFileInputSt = new FileInputStream(p0);
          int i = 8192;
          byte[] uobyteArray = new byte[i];
          int i1 = uFileInputSt.read(uobyteArray, 0, i);
          while (i1 > 0) {
             instance.update(uobyteArray, 0, i1);
          }
          uFileInputSt.close();
          byte[] uobyteArray1 = instance.digest();
          return a0.g(uobyteArray1, 0, uobyteArray1.length);
       }catch(java.lang.Exception e0){
          return e0;
       }
    }
    public static String c(String p0){
       if (p0 == null || !p0.length()) {
          return "";
       }
       MessageDigest instance = MessageDigest.getInstance("MD5");
       if (instance == null) {
          return null;
       }
       instance.update(p0.getBytes("UTF-8"));
       byte[] uobyteArray = instance.digest();
       if (uobyteArray == null || uobyteArray.length < 1) {
          return null;
       }
       return a0.g(uobyteArray, 0, uobyteArray.length);
    }
    public static String d(byte[] p0){
       try{
          if (p0 != null && p0.length) {
             MessageDigest instance = MessageDigest.getInstance("MD5");
             if (instance == null) {
                return null;
             }else {
                instance.update(p0);
                p0 = instance.digest();
                if (p0 != null && p0.length >= 1) {
                   return a0.g(p0, 0, p0.length);
                }
             }
          }
          return e0;
       }catch(java.lang.Exception e0){
       }
    }
    public static String e(String p0){
       try{
          MessageDigest instance = MessageDigest.getInstance("SHA-1");
          instance.update(p0.getBytes());
          byte[] uobyteArray = instance.digest();
          return a0.g(uobyteArray, 0, uobyteArray.length);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          return "";
       }
    }
    public static String f(byte[] p0){
       try{
          MessageDigest instance = MessageDigest.getInstance("SHA-256");
          instance.update(p0);
          p0 = instance.digest();
          return a0.g(p0, 0, p0.length);
       }catch(java.lang.Exception e2){
          e2.printStackTrace();
          return "";
       }
    }
    public static String g(byte[] p0,int p1,int p2){
       if (p1 < 0 || (p1 + p2) > p0.length) {
          throw new IndexOutOfBoundsException();
       }
       int i = p2 * 2;
       char[] uocharArray = new char[i];
       int i2 = 0;
       for (int i1 = 0; i1 < p2; i1 = i1 + 1) {
          int i3 = i1 + p1;
          i3 = p0[i3] & 0x00ff;
          int i4 = i2 + 1;
          char[] a = a0.a;
          int i5 = i3 >> 4;
          uocharArray[i2] = a[i5];
          i2 = i4 + 1;
          i3 = i3 & 0x0f;
          uocharArray[i4] = a[i3];
       }
       return new String(uocharArray, 0, i);
    }
}
