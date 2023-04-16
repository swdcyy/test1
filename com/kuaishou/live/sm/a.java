package com.kuaishou.live.sm.a;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.IllegalStateException;

public class a implements InvocationHandler	// class@000f8d
{
    public final Object b;
    public boolean c;

    public void a(Object p0){
       super();
       this.b = p0;
    }
    public Object invoke(Object p0,Method p1,Object[] p2){
       p0 = PatchProxy.applyThreeRefs(p0, p1, p2, this, a.class, "1");
       if (p0 != PatchProxyResult.class) {
          return p0;
       }
       if (this.c == null) {
          return p1.invoke(this.b, p2);
       }
       throw new IllegalStateException("ILiveService|LiveServiceManager 销毁之后，此时不应该再调用service里的任何方法");
    }
}
