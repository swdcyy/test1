package com.kwai.dva.design.internal.UIStrategy;
import com.kwai.dva.design.internal.UIStrategy$a;
import nsd.u;
import vi5.c;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kwai.dva.design.internal.UIStrategy$mHandler$2;
import msd.a;
import qrd.p;
import qrd.s;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import zi5.a;
import java.lang.Boolean;
import java.lang.System;
import usd.q;
import android.os.Handler;
import com.kwai.robust.PatchProxyResult;
import java.lang.Integer;
import java.lang.StringBuilder;

public final class UIStrategy	// class@000d14
{
    public final c a;
    public final long b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public long g;
    public Runnable h;
    public final p i;
    public static final UIStrategy$a j;

    static {
       UIStrategy.j = new UIStrategy$a(null);
    }
    public void UIStrategy(c p0,long p1){
       a.p(p0, "mInstallerUI");
       super();
       this.a = p0;
       this.b = p1;
       this.i = s.c(new UIStrategy$mHandler$2(this));
    }
    public final void a(){
       if (PatchProxy.applyVoid(null, this, UIStrategy.class, "12")) {
          return;
       }
       a.a("strategy cancel loading.");
       this.j();
       this.c = false;
       this.e = false;
       this.f = true;
       this.d = 0;
       this.g = 0;
       if (this.a.i() == 1) {
          a.b("strategy cancel loading, cancel loading success.");
          this.a.d();
       }
       return;
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, UIStrategy.class, "6")) {
          return;
       }
       this.a.a();
       return;
    }
    public final void c(){
       if (PatchProxy.applyVoid(null, this, UIStrategy.class, "4")) {
          return;
       }
       a.a("strategy dismiss loading. not allow delay.");
       this.j();
       this.a();
       return;
    }
    public final void d(boolean p0){
       UIStrategy uIStrategy = UIStrategy.class;
       if (PatchProxy.isSupport(uIStrategy) && PatchProxy.applyVoidOneRefs(Boolean.valueOf(p0), this, uIStrategy, "5")) {
          return;
       }
       a.b("strategy dismiss loading, allow delay.");
       this.j();
       long l = System.currentTimeMillis() - this.g;
       long l1 = 0;
       if (p0) {
          this.e().sendEmptyMessageDelayed(3, q.o((400 - l), l1));
       }else {
          this.e().sendEmptyMessageDelayed(4, q.o((500 - l), l1));
       }
       return;
    }
    public final Handler e(){
       Object obj = PatchProxy.apply(null, this, UIStrategy.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return this.i.getValue();
    }
    public final int f(){
       return this.d;
    }
    public final boolean g(){
       return this.f;
    }
    public final boolean h(){
       return this.e;
    }
    public final void i(int p0){
       UIStrategy uIStrategy = UIStrategy.class;
       if (PatchProxy.isSupport(uIStrategy) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uIStrategy, "3")) {
          return;
       }
       this.d = p0;
       if (this.f == null && this.e != null) {
          this.a.b(p0);
       }else {
          a.b("strategy progress, anim cancelled="+this.f+" animStarted="+this.e);
       }
       return;
    }
    public final void j(){
       if (PatchProxy.applyVoid(null, this, UIStrategy.class, "13")) {
          return;
       }
       a.b("strategy remove all msg.");
       this.e().removeMessages(1);
       this.e().removeMessages(2);
       this.e().removeMessages(3);
       this.e().removeMessages(4);
       return;
    }
    public final void k(){
       if (PatchProxy.applyVoid(null, this, UIStrategy.class, "7")) {
          return;
       }
       a.a("strategy show fail.");
       this.j();
       this.a.h();
       return;
    }
    public final void l(){
       if (PatchProxy.applyVoid(null, this, UIStrategy.class, "2")) {
          return;
       }
       if (this.c != null) {
          a.b("strategy start. actualStarted is true!");
          return;
       }else {
          a.a("strategy start.");
          this.c = true;
          this.f = false;
          this.e().sendEmptyMessageDelayed(true, this.b);
          return;
       }
    }
}
