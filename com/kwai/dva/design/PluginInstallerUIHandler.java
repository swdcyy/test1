package com.kwai.dva.design.PluginInstallerUIHandler;
import com.kwai.dva.design.PluginInstallerUIHandler$b;
import nsd.u;
import com.kwai.dva.design.PluginInstallerUIHandler$Companion$sDialogLoadingTitle$2;
import msd.a;
import qrd.p;
import qrd.s;
import com.kwai.dva.design.PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2;
import com.kwai.dva.design.PluginInstallerUIHandler$Companion$sPageLoadingTitle$2;
import com.kwai.dva.design.PluginInstallerUIHandler$Companion$sPageLoadingFailTitle$2;
import com.kwai.dva.design.PluginInstallerUIHandler$Companion$sToastBackgroundSuccessTitle$2;
import java.lang.ref.WeakReference;
import java.lang.Object;
import vi5.j;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.c;
import vi5.a;
import yi5.a;
import java.util.concurrent.atomic.AtomicBoolean;
import com.kwai.dva.design.PluginInstallerUIHandler$e;
import vi5.g;
import java.lang.Runnable;
import com.kwai.dva.design.PluginInstallerUIHandler$mTaskListener$2;
import com.kwai.dva.design.PluginInstallerUIHandler$mEventCallbackImpl$2;
import com.kwai.dva.design.internal.UIStrategy;
import android.app.Activity;
import com.kwai.dva.design.PluginInstallerUIHandler$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kwai.dva.design.PluginInstallerUIHandler$c;
import vi5.d;
import com.kwai.dva.design.PluginInstallerUIHandler$d$a;
import vi5.c$b;
import android.os.Looper;
import kotlin.jvm.internal.a;
import android.os.Handler;
import vi5.e;
import vi5.f;
import java.util.Objects;
import java.lang.IllegalStateException;

public final class PluginInstallerUIHandler	// class@000ad3
{
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;
    public AtomicBoolean e;
    public boolean f;
    public boolean g;
    public Exception h;
    public PluginInstallerUIHandler$e i;
    public final p j;
    public final p k;
    public final WeakReference l;
    public final j m;
    public PluginInstallerUIHandler$d n;
    public final UIStrategy o;
    public final a p;
    public final c q;
    public final a r;
    public static boolean A;
    public static Context B;
    public static a C;
    public static WeakReference D;
    public static final PluginInstallerUIHandler$b s;
    public static c t;
    public static c u;
    public static final p v;
    public static final p w;
    public static final p x;
    public static final p y;
    public static final p z;

    static {
       PluginInstallerUIHandler.s = new PluginInstallerUIHandler$b(null);
       PluginInstallerUIHandler.v = s.c(PluginInstallerUIHandler$Companion$sDialogLoadingTitle$2.INSTANCE);
       PluginInstallerUIHandler.w = s.c(PluginInstallerUIHandler$Companion$sDialogLoadingFailTitle$2.INSTANCE);
       PluginInstallerUIHandler.x = s.c(PluginInstallerUIHandler$Companion$sPageLoadingTitle$2.INSTANCE);
       PluginInstallerUIHandler.y = s.c(PluginInstallerUIHandler$Companion$sPageLoadingFailTitle$2.INSTANCE);
       PluginInstallerUIHandler.z = s.c(PluginInstallerUIHandler$Companion$sToastBackgroundSuccessTitle$2.INSTANCE);
       PluginInstallerUIHandler.D = new WeakReference(null);
    }
    public void PluginInstallerUIHandler(WeakReference p0,j p1,PluginInstallerUIHandler$d p2,c p3,a p4,a p5,long p6,u p7){
       super();
       this.e = new AtomicBoolean(false);
       this.i = new PluginInstallerUIHandler$e(new g(this));
       this.j = s.c(new PluginInstallerUIHandler$mTaskListener$2(this));
       this.k = s.c(new PluginInstallerUIHandler$mEventCallbackImpl$2(this));
       this.l = p0;
       this.m = p1;
       this.n = p2;
       this.q = p3;
       this.r = p4;
       this.p = p5;
       this.o = new UIStrategy(p3, p6);
    }
    public static final PluginInstallerUIHandler$a d(Activity p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, PluginInstallerUIHandler.class, "12");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return PluginInstallerUIHandler.s.b(p0);
    }
    public final PluginInstallerUIHandler$c a(){
       Object obj = PatchProxy.apply(null, this, PluginInstallerUIHandler.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.j.getValue();
    }
    public final j b(){
       return this.m;
    }
    public final boolean c(){
       return this.f;
    }
    public final void e(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler.class, "5")) {
          return;
       }
       this.f(new d(this));
       this.f = true;
       this.a().g(false);
       this.i.b = false;
       this.n = PluginInstallerUIHandler$d.a.a();
       this.q.e(c$b.a);
       this.m.b();
       return;
    }
    public final void f(Runnable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerUIHandler.class, "6")) {
          return;
       }
       if (a.g(Looper.myLooper(), Looper.getMainLooper())) {
          p0.run();
       }else {
          this.o.e().post(p0);
       }
       return;
    }
    public final void g(){
       PluginInstallerUIHandler tq;
       PluginInstallerUIHandler pluginInstal = PluginInstallerUIHandler.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, pluginInstal, "3")) {
          return;
       }
       if (!PluginInstallerUIHandler.A) {
          throw new IllegalStateException("init\(\) should be called.");
       }
       if (!this.e.compareAndSet(false, true)) {
          throw new IllegalStateException("show\(\) should only be called once.");
       }
       if (!PatchProxy.applyVoid(objArray, this, pluginInstal, "7")) {
          tq = PluginInstallerUIHandler.D.get();
          if (tq != null && !tq.c()) {
             tq.e();
          }
          PluginInstallerUIHandler.D = new WeakReference(this);
       }
       this.f(new e(this));
       this.q.g(this.l, this.r);
       tq = this.q;
       c$b uob = PatchProxy.apply(objArray, this, pluginInstal, "2");
       if (uob == PatchProxyResult.class) {
          uob = this.k.getValue();
       }
       tq.e(uob);
       this.a().g(true);
       this.o.l();
       pluginInstal = this.o;
       f uof = new f(this);
       Objects.requireNonNull(pluginInstal);
       if (!PatchProxy.applyVoidOneRefs(uof, pluginInstal, UIStrategy.class, "10")) {
          a.p(uof, "task");
          pluginInstal.h = uof;
       }
       this.m.c(this.a());
       return;
    }
}
