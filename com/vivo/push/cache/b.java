package com.vivo.push.cache.b;
import java.lang.Object;
import android.content.Context;
import com.vivo.push.cache.d;
import com.vivo.push.cache.ClientConfigManagerImpl;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import com.vivo.push.util.p;
import java.lang.Exception;
import java.lang.Throwable;

public final class b	// class@001053
{
    public d b;
    public static b a;

    public void b(){
       super();
    }
    public static synchronized b a(){
       _monitor_enter(b.class);
       if (b.a == null) {
          b.a = new b();
       }
       _monitor_exit(b.class);
       return b.a;
    }
    public final d a(Context p0){
       b tb = this.b;
       if (tb != null) {
          return tb;
       }
       Object obj = null;
       try{
          Class[] uClassArray = new Class[]{Context.class};
          p.d("ConfigManagerFactory", ("createConfig success is ").concat("com.vivo.push.cache.ClientConfigManagerImpl"));
          Object[] objArray = new Object[]{p0};
          d uod = ClientConfigManagerImpl.class.getMethod("getInstance", uClassArray).invoke(obj, objArray);
          this.b = uod;
          return uod;
       }catch(java.lang.Exception e10){
          e10.printStackTrace();
          p.b(v0, "createConfig error", e10);
          return obj;
       }
    }
}
