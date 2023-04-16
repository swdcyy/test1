package com.meizu.cloud.pushsdk.b.b.b;
import com.meizu.cloud.pushsdk.b.b.a;
import java.lang.Class;
import java.lang.Object;
import com.meizu.cloud.pushsdk.b.b.d;
import java.lang.reflect.Constructor;
import java.lang.String;
import java.lang.Throwable;
import com.meizu.cloud.pushinternal.DebugLogger;

public class b	// class@00149f
{
    public final a a;
    public final Class[] b;

    public void b(a p0,Class[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public d a(Object[] p0){
       d uod;
       try{
          uod = new d();
          Constructor declaredCons = this.a.a().getDeclaredConstructor(this.b);
          declaredCons.setAccessible(true);
          uod.b = declaredCons.newInstance(p0);
          uod.a = true;
       }catch(java.lang.Exception e4){
          DebugLogger.e("ReflectConstructor", "newInstance", e4);
       }
       return uod;
    }
}
