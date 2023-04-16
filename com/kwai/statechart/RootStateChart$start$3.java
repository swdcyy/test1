package com.kwai.statechart.RootStateChart$start$3;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.kwai.statechart.RootStateChart;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.Objects;
import com.kwai.statechart.StateChart;
import ut7.k;
import ut7.l;
import ut7.h;

public final class RootStateChart$start$3 extends Lambda implements a	// class@0018e8
{
    public final RootStateChart this$0;

    public void RootStateChart$start$3(RootStateChart p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       RootStateChart rootStateCha = RootStateChart.class;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RootStateChart$start$3.class, "1")) {
          return;
       }
       RootStateChart$start$3 tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, rootStateCha, "2")) {
          tthis$0.r(tthis$0.k.invoke());
       }
       tthis$0 = this.this$0;
       Objects.requireNonNull(tthis$0);
       if (!PatchProxy.applyVoid(objArray, tthis$0, rootStateCha, "3")) {
          k ok = tthis$0.i();
          l ol = tthis$0.l.invoke();
          Object obj = ol.a();
          ok.c(obj, ol.b());
          tthis$0.q(ok);
       }
       return;
    }
}
