package com.kuaishou.growth.pendant.core.PendantInitModule;
import com.kwai.framework.init.HomeCreateInitModule;
import java.util.List;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.framework.init.CoreInitModule;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import android.app.Activity;
import vt5.a;
import au5.b;
import android.os.Bundle;
import o56.d;
import lnc.u1;
import ce0.a;
import android.app.Application;
import o56.a;
import android.app.Application$ActivityLifecycleCallbacks;
import b66.k$a;
import com.kuaishou.growth.pendant.ui.PendantExpHelper;
import java.util.Objects;
import nf0.b;
import java.lang.Runnable;
import t45.c;

public class PendantInitModule extends HomeCreateInitModule	// class@00062e
{
    public a q;

    public void PendantInitModule(){
       super();
    }
    public int f0(){
       return 9;
    }
    public List g(){
       Class[] obj = PatchProxy.apply(null, this, PendantInitModule.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = new Class[]{CoreInitModule.class};
       return Lists.e(obj);
    }
    public void h0(){
       PatchProxy.applyVoid(null, this, PendantInitModule.class, "6");
    }
    public void i0(){
       PatchProxy.applyVoid(null, this, PendantInitModule.class, "5");
    }
    public void j0(Activity p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantInitModule.class, "4")) {
          return;
       }
       b.a().l(p0);
       return;
    }
    public void l0(Activity p0,Bundle p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, PendantInitModule.class, "3")) {
          return;
       }
       b.a().F40(p0, false);
       return;
    }
    public void n(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, PendantInitModule.class, "1")) {
          return;
       }
       if (!PatchProxy.applyVoid(objArray, this, PendantInitModule.class, "2") && d.i) {
          u1.a(this);
          this.q = new a();
          a.b().registerActivityLifecycleCallbacks(this.q);
          b.a().W1();
       }
       return;
    }
    public void onEventMainThread(k$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PendantInitModule.class, "8")) {
          return;
       }
       if (p0.a == 2) {
          PendantExpHelper e = PendantExpHelper.e;
          Objects.requireNonNull(e);
          if (!PatchProxy.applyVoid(null, e, PendantExpHelper.class, "4") && !PatchProxy.applyVoid(null, e, PendantExpHelper.class, "5")) {
             c.a(b.b);
          }
       }
       return;
    }
}
