package gud.a;
import java.lang.String;
import java.security.MessageDigest;
import java.lang.IllegalArgumentException;
import java.lang.Throwable;
import fud.d;
import fud.e;

public class a	// class@00170e
{

    public static MessageDigest a(String p0){
       try{
          return MessageDigest.getInstance(p0);
       }catch(java.security.NoSuchAlgorithmException e1){
          throw new IllegalArgumentException(e1);
       }
    }
    public static String b(byte[] p0){
       return d.d(a.a("MD5").digest(p0));
    }
    public static String c(byte[] p0){
       return d.d(a.a("SHA-1").digest(p0));
    }
    public static byte[] d(byte[] p0){
       return a.a("SHA-256").digest(p0);
    }
    public static String e(String p0){
       return d.d(a.d(e.a(p0)));
    }
    public static String f(String p0){
       return d.d(a.a("SHA-512").digest(e.a(p0)));
    }
}
