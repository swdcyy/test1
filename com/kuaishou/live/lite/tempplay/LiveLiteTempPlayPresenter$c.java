package com.kuaishou.live.lite.tempplay.LiveLiteTempPlayPresenter$c;
import z1.a;
import qd3.o;
import java.lang.Object;
import java.util.List;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import java.util.Objects;
import qd3.n;
import java.lang.Runnable;
import com.kuaishou.live.lite.util.viewupdater.a;

public final class LiveLiteTempPlayPresenter$c implements a	// class@000b80
{
    public final o a;

    public void LiveLiteTempPlayPresenter$c(o p0){
       this.a = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, LiveLiteTempPlayPresenter$c.class, "1")) {
       }else {
          LiveLiteTempPlayPresenter$c ta = this.a;
          a.m(p0);
          Objects.requireNonNull(ta);
          if (!PatchProxy.applyVoidOneRefs(p0, ta, o.class, "3")) {
             ta.v.a("reloadProfitInfoItems", new n(ta, p0));
          }
       }
       return;
    }
}
