package com.facebook.react.uimanager.k$a;
import com.facebook.react.uimanager.k$d;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import com.facebook.react.uimanager.m;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Iterator;
import com.facebook.react.uimanager.m$k;
import ze.x;
import java.lang.ThreadLocal;
import java.lang.reflect.Method;
import java.util.Arrays;
import com.facebook.react.uimanager.ViewManager;
import java.lang.StringBuilder;
import java.lang.Throwable;
import cb.a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

public class k$a implements k$d	// class@00136e
{
    public final Map a;

    public void k$a(Class p0){
       super();
       this.a = m.c(p0);
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$a.class, "2")) {
          return;
       }
       Iterator iterator = this.a.values().iterator();
       while (iterator.hasNext()) {
          m$k ok = iterator.next();
          String str = ok.a();
          p0.put(str, ok.b());
       }
       return;
    }
    public void setProperty(x p0,String p1,Object p2){
       Object[] objArray;
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, k$a.class, "1")) {
          return;
       }
       m$k ok = this.a.get(p1);
       if (ok != null && !PatchProxy.applyVoidTwoRefs(p0, p2, ok, m$k.class, "2")) {
          int i = 0;
          if (ok.d == null) {
             objArray = m$k.g.get();
             objArray[i] = ok.c(p2);
             ok.c.invoke(p0, objArray);
             Arrays.fill(objArray, null);
          }else {
             objArray = m$k.h.get();
             objArray[i] = ok.d;
             objArray[1] = ok.c(p2);
             ok.c.invoke(p0, objArray);
             Arrays.fill(objArray, null);
          }
       }
       return;
    }
}
