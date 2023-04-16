package com.kuaishou.commercial.tach.bridge.jsinterface.a;
import oz.g;
import r97.f0;
import java.util.concurrent.ThreadPoolExecutor;
import iq8.o;
import java.util.concurrent.Executor;
import brd.z;
import lrd.b;
import java.lang.Object;
import java.lang.String;
import oz.f;
import oz.a;
import android.app.Activity;
import f55.g;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import oz.j;
import java.util.concurrent.Callable;
import brd.t;
import com.kwai.middleware.azeroth.scheduler.AzerothSchedulers;
import oz.h;
import oz.i;
import erd.g;
import crd.b;
import crd.a;

public class a implements g	// class@001645
{
    public a f;
    public static final y g;
    public static final z h;

    static {
       a.g = new f0();
       a.h = b.b(o.b());
    }
    public void a(){
       super();
    }
    public String getNameSpace(){
       return f.a(this);
    }
    public void n4(a p0,Activity p1,String p2,g p3){
       if (PatchProxy.applyVoidFourRefs(p0, p1, p2, p3, this, a.class, "1")) {
          return;
       }
       b uob = t.fromCallable(new j(p0, p1, p2)).subscribeOn(a.h).observeOn(AzerothSchedulers.b()).subscribe(new h(p3), new i(p3));
       if (!PatchProxy.applyVoidOneRefs(uob, this, a.class, "2")) {
          a tf = this.f;
          if (tf == null || tf.isDisposed()) {
             this.f = new a();
          }
          this.f.c(uob);
       }
       return;
    }
}
