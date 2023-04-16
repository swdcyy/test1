package n6.d;
import java.lang.String;
import n6.a;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import n6.c;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;

public class d	// class@0026c8
{
    public static String a = "DESede/CBC/PKCS5Padding";

    public static String a(String p0,String p1,String p2){
       try{
          p1 = new String(d.b(p0, a.c(p1), p2));
       }catch(java.lang.Exception e0){
          p1 = null;
       }
       return p1;
    }
    public static byte[] b(String p0,byte[] p1,String p2){
       byte[] uobyteArray;
       try{
          Cipher instance = Cipher.getInstance(d.a);
          instance.init(2, new SecretKeySpec(p0.getBytes(), "DESede"), new IvParameterSpec(c.a(instance, p2)));
          uobyteArray = instance.doFinal(p1);
       }catch(java.lang.Exception e0){
          uobyteArray = null;
       }
       return uobyteArray;
    }
    public static String c(String p0,String p1,String p2){
       try{
          p0 = a.a(d.d(p0, p1.getBytes(), p2));
       }catch(java.lang.Exception e0){
          p0 = null;
       }
       return p0;
    }
    public static byte[] d(String p0,byte[] p1,String p2){
       byte[] uobyteArray;
       try{
          Cipher instance = Cipher.getInstance(d.a);
          instance.init(1, new SecretKeySpec(p0.getBytes(), "DESede"), new IvParameterSpec(c.a(instance, p2)));
          uobyteArray = instance.doFinal(p1);
       }catch(java.lang.Exception e0){
          uobyteArray = null;
       }
       return uobyteArray;
    }
}
