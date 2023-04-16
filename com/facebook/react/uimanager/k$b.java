package com.facebook.react.uimanager.k$b;
import com.facebook.react.uimanager.k$e;
import java.lang.Class;
import java.lang.Object;
import java.util.Map;
import com.facebook.react.uimanager.m;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Collection;
import java.util.Iterator;
import com.facebook.react.uimanager.m$k;
import com.facebook.react.uimanager.ViewManager;
import android.view.View;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.lang.StringBuilder;
import java.lang.Throwable;
import cb.a;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;

public class k$b implements k$e	// class@00136f
{
    public final Map a;

    public void k$b(Class p0){
       super();
       this.a = m.d(p0);
    }
    public void getProperties(Map p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, k$b.class, "2")) {
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
    public void setProperty(ViewManager p0,View p1,String p2,Object p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, k$b.class, "1")) {
          return;
       }
       m$k ok = this.a.get(p2);
       if (ok != null && !PatchProxy.applyVoidThreeRefs(p0, p1, p3, ok, m$k.class, "1")) {
          m$k d = ok.d;
          if (d == null) {
             Object[] e = m$k.e;
             e[0] = p1;
             e[1] = ok.c(p3);
             ok.c.invoke(p0, e);
             Arrays.fill(e, null);
          }else {
             Object[] f = m$k.f;
             f[0] = p1;
             f[1] = d;
             f[2] = ok.c(p3);
             ok.c.invoke(p0, f);
             Arrays.fill(f, null);
          }
       }
       return;
    }
}
