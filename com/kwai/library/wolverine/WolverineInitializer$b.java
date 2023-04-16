package com.kwai.library.wolverine.WolverineInitializer$b;
import v27.d;
import java.lang.String;
import java.lang.Throwable;
import java.lang.Object;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.wolverine.log.KLogWolverine;
import com.yxcorp.gifshow.wolverine.log.KLogWolverine$a;
import java.lang.StringBuilder;
import q87.c;
import com.yxcorp.gifshow.log.utils.ExceptionHandler;
import k2b.u1;

public final class WolverineInitializer$b extends d	// class@000a9b
{

    public void WolverineInitializer$b(){
       super();
    }
    public void a(String p0,String p1,Throwable p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, WolverineInitializer$b.class, "2")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "content");
       a.p(p2, "throwable");
       Object[] objArray = new Object[0];
       KLogWolverine.d.a().u(p0+'-'+p1, p2, objArray);
       return;
    }
    public void b(Throwable p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, WolverineInitializer$b.class, "4")) {
          return;
       }
       a.p(p0, "throwable");
       ExceptionHandler.handleCaughtException(p0);
       return;
    }
    public void c(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WolverineInitializer$b.class, "1")) {
          return;
       }
       a.p(p0, "tag");
       a.p(p1, "content");
       Object[] objArray = new Object[0];
       KLogWolverine.d.a().w(p0, p1, objArray);
       return;
    }
    public void d(String p0,String p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, WolverineInitializer$b.class, "3")) {
          return;
       }
       a.p(p0, "key");
       a.p(p1, "value");
       u1.X(p0, p1);
       return;
    }
}
