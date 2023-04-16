package io.netty.channel.h;
import io.netty.channel.g;
import java.lang.Object;
import lqd.e;
import java.lang.Throwable;
import java.lang.Class;
import zqd.d;
import zqd.z;
import java.util.WeakHashMap;
import java.util.Map;
import java.lang.Boolean;
import io.netty.channel.g$a;

public abstract class h implements g	// class@00109e
{
    public boolean b;

    public void h(){
       super();
    }
    public void a(e p0,Throwable p1){
       p0.A(p1);
    }
    public void f(e p0){
    }
    public boolean i(){
       z d;
       Class class = this.getClass();
       d uod = d.b();
       d = uod.d;
       if (d == null) {
          d = new WeakHashMap(4);
          uod.d = d;
       }
       Boolean uBoolean = d.get(class);
       if (uBoolean == null) {
          uBoolean = Boolean.valueOf(class.isAnnotationPresent(g$a.class));
          d.put(class, uBoolean);
       }
       return uBoolean.booleanValue();
    }
    public void m(e p0){
    }
}
