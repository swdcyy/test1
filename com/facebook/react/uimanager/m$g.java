package com.facebook.react.uimanager.m$g;
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
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.DynamicFromObject;

public class m$g extends m$k	// class@00137f
{

    public void m$g(a p0,Method p1){
       super(p0, "mixed", p1, null);
    }
    public void m$g(b p0,Method p1,int p2){
       super(p0, "mixed", p1, p2, null);
    }
    public Object c(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$g.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 instanceof Dynamic) {
          return p0;
       }
       return new DynamicFromObject(p0);
    }
}
