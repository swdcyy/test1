package h6.b;
import java.lang.String;
import java.lang.Object;
import java.security.SecureRandom;

public class b	// class@0020ff
{
    public static SecureRandom a;
    public static final char[] b;

    static {
       b.b = ("0123456789ABCDEF").toCharArray();
    }
    public void b(){
       super();
    }
    public static SecureRandom a(){
       if (b.a != null) {
          return b.a;
       }
       b uob = b.class;
       _monitor_enter(uob);
       if (b.a == null) {
          b.a = new SecureRandom();
       }
       _monitor_exit(uob);
       return b.a;
    }
    public static byte[] b(byte p0){
       byte[] uobyteArray = new byte[]{p0};
       return uobyteArray;
    }
    public static byte[] c(){
       byte[] uobyteArray = new byte[2];
       b.a().nextBytes(uobyteArray);
       return uobyteArray;
    }
}
