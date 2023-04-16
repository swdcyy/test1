package lv8.p;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Mac;
import java.security.Key;
import java.lang.RuntimeException;
import java.lang.Throwable;
import java.lang.System;

public final class p	// class@002dba
{

    public static byte[] a(byte[] p0,byte[] p1){
       SecretKeySpec obj = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       try{
          obj = new SecretKeySpec(p0, "HmacSHA256");
          Mac instance = Mac.getInstance(obj.getAlgorithm());
          instance.init(obj);
          return instance.doFinal(p1);
       }catch(java.lang.Exception e3){
          throw new RuntimeException("Fail to generate the signature", e3);
       }
    }
    public static byte[] b(byte[] p0,byte[] p1){
       byte[] obj = PatchProxy.applyTwoRefs(p0, p1, null, p.class, "3");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new byte[(p0.length + p1.length)];
       System.arraycopy(p0, 0, obj, 0, p0.length);
       System.arraycopy(p1, 0, obj, p0.length, p1.length);
       return obj;
    }
}
