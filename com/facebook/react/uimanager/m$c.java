package com.facebook.react.uimanager.m$c;
import com.facebook.react.uimanager.m$k;
import af.a;
import java.lang.reflect.Method;
import java.lang.String;
import com.facebook.react.uimanager.m$a;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Boolean;

public class m$c extends m$k	// class@00137b
{
    public final boolean i;

    public void m$c(a p0,Method p1,boolean p2){
       super(p0, "boolean", p1, null);
       this.i = p2;
    }
    public Object c(Object p0){
       boolean b;
       Object obj = PatchProxy.applyOneRefs(p0, this, m$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 == null)? this.i: p0.booleanValue();
       p0 = (p0)? Boolean.TRUE: Boolean.FALSE;
       return p0;
    }
}
