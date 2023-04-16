package com.facebook.react.uimanager.m$f;
import com.facebook.react.uimanager.m$k;
import af.a;
import java.lang.reflect.Method;
import java.lang.String;
import com.facebook.react.uimanager.m$a;
import af.b;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import java.lang.Double;

public class m$f extends m$k	// class@00137e
{
    public final double i;

    public void m$f(a p0,Method p1,double p2){
       super(p0, "number", p1, null);
       this.i = p2;
    }
    public void m$f(b p0,Method p1,int p2,double p3){
       super(p0, "number", p1, p2, null);
       this.i = p3;
    }
    public Object c(Object p0){
       double d;
       m$f obj = PatchProxy.applyOneRefs(p0, this, m$f.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = (p0 == null)? this.i: p0.doubleValue();
       return Double.valueOf(obj);
    }
}
