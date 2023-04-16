package c.t.m.g.fa;
import java.lang.String;
import java.lang.IllegalArgumentException;
import android.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import c.t.m.g.ff;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

public class fa	// class@000c87
{
    public static final byte[] a;

    static {
       byte[] uobyteArray = new byte[0];
       fa.a = uobyteArray;
    }
    public static String a(String p0,String p1){
       return fa.a(p0, p1, 1);
    }
    public static String a(String p0,String p1,int p2){
       byte[] bytes;
       if (p2 != 1 && p2 != 2) {
          throw new IllegalArgumentException("wrong mode.");
       }
       if (p0 != null && p0.length()) {
          if (p2 == 1) {
             bytes = p0.getBytes();
          }else if(p2 == 2){
             bytes = Base64.decode(p0.getBytes(), 2);
          }else {
             p0 = null;
          }
          if (bytes != null && bytes.length) {
             bytes = fa.a(bytes, p1, p2);
             if (p2 == 1) {
                return Base64.encodeToString(bytes, 2);
             }else if(p2 == 2){
                return new String(bytes);
             }else {
                return null;
             }
          }
       }
    label_0048 :
       return "";
    }
    public static Cipher a(String p0,int p1){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(p1, new SecretKeySpec(p0.getBytes("UTF-8"), "AES"), new IvParameterSpec(ff.o));
       return instance;
    }
    public static byte[] a(byte[] p0,String p1){
       return fa.a(p0, p1, 1);
    }
    public static byte[] a(byte[] p0,String p1,int p2){
       if (p2 != 1 && p2 != 2) {
          throw new IllegalArgumentException("wrong mode.");
       }
       if (p0 == null || !p0.length) {
          return fa.a;
       }
       Cipher uCipher = fa.a(p1, p2);
       if (uCipher == null) {
          return fa.a;
       }
       return uCipher.doFinal(p0);
    }
    public static String b(String p0,String p1){
       return fa.a(p0, p1, 2);
    }
    public static byte[] b(byte[] p0,String p1){
       return fa.a(p0, p1, 2);
    }
}
