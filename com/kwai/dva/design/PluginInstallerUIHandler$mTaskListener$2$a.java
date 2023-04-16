package com.kwai.dva.design.PluginInstallerUIHandler$mTaskListener$2$a;
import com.kwai.dva.design.PluginInstallerUIHandler$c;
import com.kwai.dva.design.PluginInstallerUIHandler;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Boolean;
import kotlin.jvm.internal.a;
import zi5.a;
import com.kwai.dva.design.internal.UIStrategy;
import vi5.a;
import com.kwai.dva.design.PluginInstallerUIHandler$d;
import vi5.j;
import vi5.c;
import yi5.a;
import java.lang.Integer;
import com.kwai.dva.design.PluginInstallerUIHandler$e;

public final class PluginInstallerUIHandler$mTaskListener$2$a extends PluginInstallerUIHandler$c	// class@000d0e
{
    public final PluginInstallerUIHandler b;

    public void PluginInstallerUIHandler$mTaskListener$2$a(PluginInstallerUIHandler p0){
       this.b = p0;
       super();
    }
    public void b(Exception p0){
       PluginInstallerUIHandler$mTaskListener$2$a tb1;
       if (PatchProxy.applyVoidOneRefs(p0, this, PluginInstallerUIHandler$mTaskListener$2$a.class, "4")) {
          return;
       }
       a.a(a.C("task fail, ended=", Boolean.valueOf(this.b.c())));
       if (this.b.c()) {
          return;
       }
       PluginInstallerUIHandler$mTaskListener$2$a tb = this.b;
       tb.h = p0;
       if (tb.o.h()) {
          tb1 = this.b;
          tb1.c = true;
          tb1.o.d(false);
       }else {
          a.a("task fail, so fast.");
          this.b.o.c();
          if (this.b.r.e()) {
             this.b.o.k();
             tb1 = this.b;
             tb1.n.a(tb1.h);
             tb1 = this.b;
             tb1.p.c(tb1.m, tb1.q);
          }else {
             this.b.e();
          }
       }
       return;
    }
    public void c(int p0){
       PluginInstallerUIHandler$mTaskListener$2$a omTaskListen = PluginInstallerUIHandler$mTaskListener$2$a.class;
       if (PatchProxy.isSupport(omTaskListen) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, omTaskListen, "2")) {
          return;
       }
       this.b.o.i(p0);
       return;
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$mTaskListener$2$a.class, "1")) {
          return;
       }
       a.a("task start.");
       return;
    }
    public void e(){
       if (PatchProxy.applyVoid(null, this, PluginInstallerUIHandler$mTaskListener$2$a.class, "3")) {
          return;
       }
       a.a("task success.");
       PluginInstallerUIHandler$mTaskListener$2$a tb = this.b;
       tb.a = true;
       tb.o.i(100);
       tb = this.b;
       tb.n.n(tb.i);
       return;
    }
}
