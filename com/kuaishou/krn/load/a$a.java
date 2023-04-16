package com.kuaishou.krn.load.a$a;
import com.facebook.react.a$k;
import sj0.b;
import com.facebook.react.a;
import brd.c0;
import java.lang.Object;
import com.facebook.react.bridge.ReactContext;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.krn.load.JsRuntimeState;
import ek0.d;
import java.lang.Throwable;
import com.facebook.react.bridge.CatalystInstance;
import rd.y;

public class a$a implements a$k	// class@0008da
{
    public final b a;
    public final a b;
    public final c0 c;

    public void a$a(b p0,a p1,c0 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public void a(ReactContext p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$a.class, "1")) {
          return;
       }
       this.a.l();
       this.b.N(this);
       this.c.onSuccess(JsRuntimeState.NOT_START);
       d.e("[perfOpt]onReactContextInitialized: ");
       return;
    }
    public void b(a p0,Throwable p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, a$a.class, "2")) {
          return;
       }
       this.a.l();
       this.b.N(this);
       this.c.onError(p1);
       d.e("[perfOpt]onReactContextCreateFailed: ");
       return;
    }
    public void c(ReactContext p0,CatalystInstance p1){
       y.d(this, p0, p1);
    }
    public void d(CatalystInstance p0){
       y.b(this, p0);
    }
    public void e(ReactContext p0){
       y.a(this, p0);
    }
}
