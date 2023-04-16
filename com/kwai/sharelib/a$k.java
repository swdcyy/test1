package com.kwai.sharelib.a$k;
import erd.g;
import com.kwai.sharelib.a;
import uo7.a0;
import kotlin.jvm.internal.Ref$ObjectRef;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import yo7.e;
import java.lang.Integer;
import java.lang.Throwable;
import nsd.u;
import uo7.k;
import yo7.f;
import com.kwai.sharelib.log.KsSharePerformanceStat;
import qrd.l1;
import crd.b;
import java.lang.IllegalArgumentException;

public final class a$k implements g	// class@0016ae
{
    public final a b;
    public final a0 c;
    public final Ref$ObjectRef d;

    public void a$k(a p0,a0 p1,Ref$ObjectRef p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1")) {
       }else {
          e uoe = new e("social_share_start", null, null, null, null, null, null, null, null, null, 1022, null);
          f.b(PatchProxy.applyVoidOneRefs(p0, this, a$k.class, "1"), this.b.g);
          KsSharePerformanceStat ksSharePerfo = new KsSharePerformanceStat("SHARE_SDK_SHAERE_PANNEL_TASK");
          ksSharePerfo.x("share_start");
          this.b.g.E(ksSharePerfo);
          p0 = this.c;
          if (p0 != null) {
             if (p0.Eg()) {
                p0.element = this.b.k();
             }
          }else {
             throw new IllegalArgumentException("No KsShareOperationController passed in!");
          }
       }
       return;
    }
}
