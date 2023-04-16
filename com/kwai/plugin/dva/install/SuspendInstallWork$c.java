package com.kwai.plugin.dva.install.SuspendInstallWork$c;
import com.kwai.plugin.dva.work.c$c;
import com.kwai.plugin.dva.install.SuspendInstallWork;
import asd.c;
import java.lang.Object;
import java.lang.Exception;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.Result;
import java.lang.Throwable;
import qrd.j0;
import java.lang.Float;
import com.kwai.plugin.dva.work.c;
import sj7.d;
import java.util.List;

public final class SuspendInstallWork$c implements c$c	// class@00134d
{
    public final boolean a;
    public final SuspendInstallWork b;
    public final c c;

    public void SuspendInstallWork$c(boolean p0,SuspendInstallWork p1,c p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void onFailed(Exception p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuspendInstallWork$c.class, "3")) {
          return;
       }
       SuspendInstallWork$c tc = this.c;
       if (p0 == null) {
          p0 = new Exception();
       }
       tc.resumeWith(Result.constructor-impl(j0.a(p0)));
       return;
    }
    public void onProgress(float p0){
       SuspendInstallWork$c uoc = SuspendInstallWork$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, uoc, "1")) {
          return;
       }
       if (this.a != null) {
          uoc = this.b;
          uoc.j = p0;
          uoc.e(uoc.a, uoc.b());
       }
       return;
    }
    public void onStart(){
       d.a(this);
    }
    public void onSucceed(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SuspendInstallWork$c.class, "2")) {
       }else {
          this.c.resumeWith(Result.constructor-impl(p0));
       }
       return;
    }
}
