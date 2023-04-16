package com.facebook.react.uimanager.m$d;
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

public class m$d extends m$k	// class@00137c
{

    public void m$d(a p0,Method p1){
       super(p0, "boolean", p1, null);
    }
    public Object c(Object p0){
       Object obj = PatchProxy.applyOneRefs(p0, this, m$d.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       if (p0 == null) {
          return null;
       }
       p0 = (p0.booleanValue())? Boolean.TRUE: Boolean.FALSE;
       return p0;
    }
}
