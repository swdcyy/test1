package com.kuaishou.kds.animate.core.b;
import java.lang.Math;
import yh0.c$a;
import vh0.a;
import java.lang.Object;
import java.util.HashMap;
import com.facebook.react.bridge.ReadableMap;
import java.util.List;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import java.lang.String;
import android.animation.Animator;
import com.kwai.robust.PatchProxyResult;
import vh0.g;
import java.lang.Runnable;
import com.facebook.react.bridge.ReactContext;

public abstract class b	// class@00079c
{
    public final a a;
    public Animator b;
    public final Object c;
    public final List d;
    public final Map e;
    public final Map f;
    public static final float g;
    public static c$a h;
    public static double[] i;
    public static double[] j;

    static {
       b.g = (float)Math.sqrt(5.00f);
       b.h = new c$a();
       double[] uodoubleArra = new double[16];
       b.i = uodoubleArra;
       uodoubleArra = new double[3];
       b.j = uodoubleArra;
    }
    public void b(a p0){
       super();
       this.a = p0;
       this.e = new HashMap();
       this.f = new HashMap();
       this.c = this.h(p0.e);
       this.d = this.i(p0.e);
    }
    public void a(boolean p0){
       b uob = b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uob, "2")) {
          return;
       }
       uob = this.b;
       if (uob != null) {
          uob.cancel();
          if (p0) {
             this.f("cancel");
          }
       }
       return;
    }
    public abstract Animator b(a p0,List p1,Object p2);
    public void c(){
       if (PatchProxy.applyVoid(null, this, b.class, "5")) {
          return;
       }
       b tb = this.b;
       if (tb != null) {
          tb.end();
       }
       return;
    }
    public boolean d(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "8");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       b = (obj != null && obj.isPaused())? true: false;
       return b;
    }
    public boolean e(){
       boolean b;
       b obj = PatchProxy.apply(null, this, b.class, "7");
       if (obj != PatchProxyResult.class) {
          return obj.booleanValue();
       }
       obj = this.b;
       b = (obj != null && obj.isRunning())? true: false;
       return b;
    }
    public void f(String p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "6")) {
          return;
       }
       b ta = this.a;
       if (ta != null) {
          a d = ta.d;
          if (d != null) {
             d.runOnJSQueueThread(new g(this, p0));
          }
       }
       return;
    }
    public abstract void g();
    public abstract Object h(ReadableMap p0);
    public abstract List i(ReadableMap p0);
}
