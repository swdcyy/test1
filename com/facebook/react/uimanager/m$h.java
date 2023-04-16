package com.facebook.react.uimanager.m$h;
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
import java.lang.Float;

public class m$h extends m$k	// class@001380
{
    public final float i;

    public void m$h(a p0,Method p1,float p2){
       super(p0, "number", p1, null);
       this.i = p2;
    }
    public void m$h(b p0,Method p1,int p2,float p3){
       super(p0, "number", p1, p2, null);
       this.i = p3;
    }
    public Object c(Object p0){
       float f;
       Object obj = PatchProxy.applyOneRefs(p0, this, m$h.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 == null)? this.i: Float.valueOf(p0.floatValue()).floatValue();
       return Float.valueOf(p0);
    }
}
