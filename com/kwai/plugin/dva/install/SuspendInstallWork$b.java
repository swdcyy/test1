package com.kwai.plugin.dva.install.SuspendInstallWork$b;
import com.kwai.plugin.dva.install.e$b;
import com.kwai.plugin.dva.install.SuspendInstallWork;
import com.kwai.plugin.dva.work.c;
import asd.c;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Thread;
import kotlin.jvm.internal.a;
import qj7.d;
import qrd.l1;
import kotlin.Result;
import java.lang.Integer;
import java.lang.StringBuilder;
import com.kwai.plugin.dva.install.error.PluginInstallException;
import java.lang.Throwable;
import qrd.j0;
import java.lang.Float;

public final class SuspendInstallWork$b implements e$b	// class@00134c
{
    public final SuspendInstallWork a;
    public final c b;
    public final c c;

    public void SuspendInstallWork$b(SuspendInstallWork p0,c p1,c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void d(){
       if (PatchProxy.applyVoid(null, this, SuspendInstallWork$b.class, "2")) {
          return;
       }
       d.c(a.C("\t service install success ", Thread.currentThread().getName()));
       this.c.resumeWith(Result.constructor-impl(l1.a));
       return;
    }
    public void onFailed(int p0,String p1){
       SuspendInstallWork$b uob = SuspendInstallWork$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidTwoRefs(Integer.valueOf(p0), p1, this, uob, "3")) {
          return;
       }
       a.p(p1, "errMsg");
       d.c("\t service install fail "+p1+Thread.currentThread().getName());
       this.c.resumeWith(Result.constructor-impl(j0.a(new PluginInstallException(p0, p1))));
       return;
    }
    public void onProgress(float p0){
       SuspendInstallWork$b uob = SuspendInstallWork$b.class;
       if (PatchProxy.isSupport(uob) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uob, "1")) {
          return;
       }
       uob = this.a;
       uob.i = p0;
       uob.e(this.b, uob.b());
       return;
    }
}
