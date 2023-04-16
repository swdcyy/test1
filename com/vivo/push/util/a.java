package com.vivo.push.util.a;
import android.content.Context;
import java.lang.Object;
import com.vivo.push.util.w;
import com.vivo.push.util.ContextDelegate;
import java.lang.String;
import com.vivo.push.util.f;
import javax.crypto.spec.SecretKeySpec;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import android.util.Base64;

public class a	// class@0010af
{
    public byte[] a;
    public byte[] b;
    public static a c;

    public void a(Context p0){
       super();
       w.b().a(ContextDelegate.getContext(p0));
       w ow = w.b();
       this.a = ow.c();
       this.b = ow.d();
    }
    public static a a(Context p0){
       if (a.c == null) {
          _monitor_enter(a.class);
          if (a.c == null) {
             a.c = new a(p0.getApplicationContext());
          }
          _monitor_exit(a.class);
       }
       return a.c;
    }
    public final String a(String p0){
       Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
       instance.init(1, new SecretKeySpec((f.a(this.b())).getBytes("utf-8"), "AES"), new IvParameterSpec((f.a(this.a())).getBytes("utf-8")));
       return Base64.encodeToString(instance.doFinal(p0.getBytes("utf-8")), 2);
    }
    public final byte[] a(){
       a ta = this.a;
       if (ta != null && ta.length > 0) {
          return ta;
       }
       return w.b().c();
    }
    public final String b(String p0){
       return new String(f.a(f.a(this.a()), f.a(this.b()), Base64.decode(p0, 2)), "utf-8");
    }
    public final byte[] b(){
       a tb = this.b;
       if (tb != null && tb.length > 0) {
          return tb;
       }
       return w.b().d();
    }
}
