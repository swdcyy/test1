package com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$b;
import d6a.a;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import java.lang.Runnable;
import java.util.BitSet;
import kotlin.jvm.internal.a;
import java.util.Objects;
import ff6.d;
import com.kwai.robust.PatchProxyResult;
import java.lang.Number;
import java.util.concurrent.TimeUnit;
import g50.c;
import e50.m;
import com.kuaishou.eve.kit.rerank.config.RankABParam;
import java.lang.Integer;
import java.util.List;

public final class RankExtraTriggerPresenter$b extends a	// class@000aa0
{
    public final RankExtraTriggerPresenter b;

    public void RankExtraTriggerPresenter$b(RankExtraTriggerPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, RankExtraTriggerPresenter$b.class, "2")) {
          return;
       }
       this.b.S8().removeCallbacks(this.b.E);
       this.b.A.set(2);
       return;
    }
    public void i2(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, RankExtraTriggerPresenter$b.class, "1")) {
          return;
       }
       this.b.A.clear();
       RankExtraTriggerPresenter$b tb = this.b;
       RankExtraTriggerPresenter u = tb.u;
       a.m(u);
       Objects.requireNonNull(u);
       RankExtraTriggerPresenter$b obj = PatchProxy.apply(objArray, u, d.class, "5");
       long l = (obj != PatchProxyResult.class)? obj.longValue(): TimeUnit.SECONDS.toMillis(u.d().c().getEffectViewDuration());
       tb.z = l;
       if (this.b.B.contains(Integer.valueOf(6))) {
          tb = this.b;
          if (tb.z - null > 0) {
             obj = this.b;
             tb.S8().postDelayed(obj.E, obj.z);
          }
       }
       return;
    }
}
