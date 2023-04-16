package ekd.a;
import java.util.Random;
import java.lang.String;
import java.lang.Throwable;
import com.yxcorp.utility.Log;
import java.lang.CharSequence;
import com.yxcorp.utility.TextUtils;
import ekd.k$a;
import ekd.k;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.lang.Object;
import java.lang.System;
import ekd.k$b;

public class a	// class@000d25
{
    public static final String a = "a";
    public static final Random b;

    static {
       a.b = new Random();
    }
    public static String a(String p0,String p1){
       byte[] bytes;
       String str = null;
       try{
          bytes = p0.getBytes("UTF-8");
       }catch(java.lang.Exception e7){
          Log.e(a.a, "encrypt getBytes error:", e7);
          bytes = str;
       }
       try{
          if (bytes != null) {
             if (TextUtils.x(p1)) {
                p1 = "ECELB8XPMbMPci-bWJbeXA";
             }
             Cipher instance = Cipher.getInstance("AES/GCM/NoPadding");
             int i = 12;
             byte[] uobyteArray = new byte[i];
             a.b.nextBytes(uobyteArray);
             instance.init(1, new SecretKeySpec(k.a().a(p1), "AES"), new GCMParameterSpec(128, uobyteArray));
             byte[] iV = instance.getIV();
             byte[] uobyteArray1 = instance.doFinal(bytes);
             bytes = new byte[((bytes.length + i) + 16)];
             System.arraycopy(iV, 0, bytes, 0, i);
             System.arraycopy(uobyteArray1, 0, bytes, i, uobyteArray1.length);
             k$b uob = k.b();
             if (uob.d != null) {
                uob = new k$b(uob.c, uob.a, uob.b, 0);
             }
             str = uob.a(bytes);
          }
       }catch(java.lang.Exception e7){
          Log.e(a.a, "encrypt error:", e7);
       }
       return str;
    }
}
