package mb1.b;
import java.lang.String;
import java.lang.Object;
import kotlin.jvm.internal.a;
import android.util.Base64;
import android.util.LruCache;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import zsd.d;
import java.nio.charset.Charset;
import java.lang.CharSequence;
import android.text.TextUtils;
import zsd.u;
import java.lang.NullPointerException;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class b	// class@003148
{
    public final byte[] a;
    public final byte[] b;
    public final LruCache c;
    public final String d;

    public void b(String p0,String p1,String p2){
       a.p(p0, "token");
       a.p(p1, "ivSpec");
       a.p(p2, "verifyKey");
       super();
       this.d = p2;
       this.a = Base64.decode(p0, 8);
       this.b = Base64.decode(p1, 8);
       this.c = new LruCache(1000);
    }
    public final String a(byte[] p0,byte[] p1,byte[] p2){
       Cipher obj = PatchProxy.applyThreeRefs(p0, p1, p2, this, b.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = Cipher.getInstance("AES/CBC/PKCS5Padding");
       obj.init(2, new SecretKeySpec(p1, "AES"), new IvParameterSpec(p2));
       p0 = obj.doFinal(p0);
       a.o(p0, "result");
       return new String(p0, d.a);
    }
    public final String b(String p0){
       String obj = PatchProxy.applyOneRefs(p0, this, b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       a.p(p0, "data");
       if (TextUtils.isEmpty(p0)) {
          return null;
       }
       obj = this.c.get(p0);
       if (obj != null) {
          return obj;
       }
       int i = 8;
       try{
          byte[] uobyteArray = Base64.decode(p0, i);
          a.o(uobyteArray, "originData");
          b ta = this.a;
          a.o(ta, "tokenArray");
          b tb = this.b;
          a.o(tb, "ivArray");
          obj = this.a(uobyteArray, ta, tb);
          if (u.q2(obj, this.d, false, 2, null)) {
             int i1 = (this.d).length();
             if (obj != null) {
                obj = obj.substring(i1);
                a.o(obj, "\(this as java.lang.String\).substring\(startIndex\)");
                this.c.put(p0, obj);
                return obj;
             }else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
             }
          }
       }catch(java.lang.Exception e0){
          b.I(LiveLogTag.LIVE_ANONYMOUS, "decryptData error "+p0, e0);
       }
       return null;
    }
}
