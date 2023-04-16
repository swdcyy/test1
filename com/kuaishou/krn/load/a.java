package com.kuaishou.krn.load.a;
import java.lang.Object;
import sj0.b;
import com.facebook.react.a;
import brd.c0;
import com.facebook.react.a$k;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import com.kuaishou.krn.load.a$a;
import java.lang.Boolean;
import com.kuaishou.krn.experiment.ExpConfigKt;
import ak0.e;
import java.lang.Runnable;
import ekd.k1;
import java.util.Objects;
import od.a;
import brd.a0;
import ek0.d;
import ak0.d;
import io.reactivex.i;
import brd.z;
import io.reactivex.android.schedulers.a;

public class a	// class@0008db
{

    public void a(){
       super();
    }
    public static a$k a(b p0,a p1,c0 p2){
       Object obj = PatchProxy.applyThreeRefs(p0, p1, p2, null, a.class, "2");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       return new a$a(p0, p1, p2);
    }
    public static void b(a p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "3")) {
          return;
       }
       if (ExpConfigKt.a()) {
          if (!p1 && p0.u()) {
             return;
          }else {
             k1.o(new e(p1, p0));
          }
       }else {
          a.c(p0, p1);
       }
       return;
    }
    public static void c(a p0,boolean p1){
       a uoa = a.class;
       if (PatchProxy.isSupport(uoa) && PatchProxy.applyVoidTwoRefs(p0, Boolean.valueOf(p1), null, uoa, "4")) {
          return;
       }
       if (p1) {
          Objects.requireNonNull(p0);
          if (!PatchProxy.applyVoid(null, p0, a.class, "10")) {
             a.b(p0.s, "recreateReactContextInBackground should only be called after the initial createReactContextInBackground call.");
             p0.M();
          }
       }else {
          p0.i();
       }
       return;
    }
    public static a0 d(b p0){
       Object obj = PatchProxy.applyOneRefs(p0, null, a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       d.e("[perfOpt]getReactInstanceManager: ");
       return a0.k(new d(p0.i(), p0)).T(a.c());
    }
}
