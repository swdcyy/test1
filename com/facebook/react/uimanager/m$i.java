package com.facebook.react.uimanager.m$i;
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
import java.lang.Integer;

public class m$i extends m$k	// class@001381
{
    public final int i;

    public void m$i(a p0,Method p1,int p2){
       super(p0, "number", p1, null);
       this.i = p2;
    }
    public void m$i(b p0,Method p1,int p2,int p3){
       super(p0, "number", p1, p2, null);
       this.i = p3;
    }
    public Object c(Object p0){
       int i;
       Object obj = PatchProxy.applyOneRefs(p0, this, m$i.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       p0 = (p0 == null)? this.i: Integer.valueOf(p0.intValue()).intValue();
       return Integer.valueOf(p0);
    }
}
