package com.yxcorp.gifshow.growth.util.d;
import com.kwai.framework.activitycontext.ActivityContext$b;
import java.lang.Object;
import android.app.Activity;
import cra.u;
import m56.a;
import android.os.Bundle;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.ref.WeakReference;
import com.kwai.sdk.switchconfig.a;
import t45.d;
import cra.s;
import io.reactivex.g;
import brd.t;
import brd.z;
import crd.b;
import oe6.a;
import com.yxcorp.gifshow.util.rx.RxBus;
import zca.p;
import com.yxcorp.gifshow.growth.util.b;
import erd.g;
import java.lang.System;
import cra.t;
import java.lang.Runnable;
import t45.c;

public class d implements ActivityContext$b	// class@0011ab
{

    public void d(){
       super();
    }
    public void a(Activity p0){
       int i = u.b - 1;
       u.b = i;
       if (!i) {
          u.c = null;
          u.d = 0;
       }
       return;
    }
    public void d(Activity p0){
       a.d(this, p0);
    }
    public void e(Activity p0){
       a.c(this, p0);
    }
    public void f(Activity p0,Bundle p1){
       z a;
       u ou = u.class;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, d.class, "1")) {
          return;
       }
       p1 = null;
       boolean b = false;
       if (!PatchProxy.applyVoidOneRefs(p0, p1, ou, "2")) {
          boolean h = u.h;
          WeakReference weakReferenc = new WeakReference(p0);
          a = (a.t().d("ug_report_screen_off_main_thread", b))? d.a: d.c;
          t.create(new s(weakReferenc, h)).subscribeOn(a).subscribe();
       }
       if (!PatchProxy.applyVoid(p1, p1, ou, "7") && !u.f) {
          if (a.a()) {
             u.b();
          }else if(u.g == null){
             u.g = RxBus.f.f(p.class).observeOn(d.c).subscribe(b.b);
          }
       }
       u.h = b;
       int i = 1;
       u.b = u.b + i;
       if (u.a) {
          return;
       }else {
          u.a = i;
          if (u.b == i) {
             if (!u.d) {
                u.d = System.currentTimeMillis();
             }
             c.a(new t(new WeakReference(p0)));
          }
          return;
       }
    }
    public void onBackground(){
       u.a = false;
    }
    public void onForeground(){
       a.f(this);
    }
}
