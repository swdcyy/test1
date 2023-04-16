package com.kwai.dva.design.PluginInstallerUIHandler$mEventCallbackImpl$2$a;
import vi5.c$b;
import com.kwai.dva.design.PluginInstallerUIHandler;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import zi5.a;
import vi5.j;
import vi5.c;
import yi5.a;
import com.kwai.dva.design.internal.UIStrategy;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import com.kwai.dva.design.PluginInstallerUIHandler$c;
import vi5.a;
import java.util.Objects;
import java.lang.Long;
import kotlin.jvm.internal.a;
import android.os.Handler;
import xi5.a;
import java.lang.Runnable;
import wi5.b;
import java.lang.Exception;

public final class PluginInstallerUIHandler$mEventCallbackImpl$2$a implements c$b	// class@000d0c
{
    public final PluginInstallerUIHandler b;

    public void PluginInstallerUIHandler$mEventCallbackImpl$2$a(PluginInstallerUIHandler p0){
       this.b = p0;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$mEventCallbackImpl$2$a.class, "4")) {
          return;
       }
       a.a("view loading fail click retry.");
       PluginInstallerUIHandler$mEventCallbackImpl$2$a tb = this.b;
       tb.p.a(tb.m, tb.q);
       tb = this.b;
       tb.d = true;
       tb.o.b();
       this.b.n.p();
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$mEventCallbackImpl$2$a.class, "2")) {
          return;
       }
       a.a("view loading fail dismiss");
       PluginInstallerUIHandler$mEventCallbackImpl$2$a tb = this.b;
       if (tb.d != null) {
          tb.d = false;
          tb.m.d();
          tb = this.b;
          tb.m.c(tb.a());
          this.b.o.l();
       }else {
          tb.p.d(tb.m, tb.q);
          this.b.n.o();
          this.b.e();
       }
       return;
    }
    public void c(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$mEventCallbackImpl$2$a.class, "3")) {
          return;
       }
       a.a("view loading fail click ok.");
       if (this.b.q.i() != 2) {
          PluginInstallerUIHandler$mEventCallbackImpl$2$a tb = this.b;
          tb.p.d(tb.m, tb.q);
          this.b.n.o();
          this.b.e();
       }else {
          this.b.o.b();
       }
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$mEventCallbackImpl$2$a.class, "1")) {
          return;
       }
       a.a("view loading dismiss.");
       PluginInstallerUIHandler$mEventCallbackImpl$2$a tb = this.b;
       tb = this.b;
       tb.p.f(tb.o.f(), tb.m, tb.q, (tb.o.g() ^ 0x01), this.b.b);
       if (!this.b.o.g()) {
          this.b.n.b();
       }
       this.b.n.e();
       if (!this.b.o.g()) {
          tb = this.b;
          if (tb.b != null && tb.r.g()) {
             long l = 500;
             PluginInstallerUIHandler$mEventCallbackImpl$2$a tb1 = this.b;
             PluginInstallerUIHandler o = tb1.o;
             String str = tb1.r.h();
             Objects.requireNonNull(o);
             UIStrategy uIStrategy = UIStrategy.class;
             if (!PatchProxy.isSupport(uIStrategy) || !PatchProxy.applyVoidTwoRefs(str, Long.valueOf(l), o, uIStrategy, "9")) {
                a.p(str, "msg");
                o.e().postDelayed(new a(o, str), l);
             }
             a.a("view loading dismiss ±ß½çcase, toast success.");
          }
          this.b.e();
          tb = this.b;
          if (tb.b == null && tb.r.g()) {
             tb = this.b;
             tb.m.c(new b(tb.q, tb.r.h()));
          }
       }else {
          tb = this.b;
          if (tb.b != null) {
             tb.g = true;
             tb.n.d();
             this.b.e();
             a.a("view loading dismiss, success end.");
          }
          tb = this.b;
          if (tb.c != null) {
             if (tb.r.e()) {
                tb = this.b;
                tb.c = false;
                tb.o.k();
                tb = this.b;
                tb.n.a(tb.h);
                tb = this.b;
                tb.p.c(tb.m, tb.q);
                a.a("view loading dismiss, show fail.");
             }else {
                a.a("view loading dismiss, showFailDialog=false .");
                this.b.e();
             }
          }
       }
    label_0116 :
       if (!this.b.o.g()) {
          this.b.o.c();
       }
       return;
    }
}
