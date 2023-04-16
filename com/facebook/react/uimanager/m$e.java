package com.facebook.react.uimanager.m$e;
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

public class m$e extends m$k	// class@00137d
{

    public void m$e(a p0,Method p1){
       super(p0, "number", p1, null);
    }
    public void m$e(b p0,Method p1,int p2){
       super(p0, "number", p1, p2, null);
    }
    public Object c(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$e.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       if (p0 instanceof Double) {
          return Integer.valueOf(p0.intValue());
       }
       return p0;
    }
}
