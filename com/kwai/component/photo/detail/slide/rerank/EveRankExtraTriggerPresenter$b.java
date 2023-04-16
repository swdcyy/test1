package com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$b;
import d6a.a;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import android.os.Handler;
import java.lang.Runnable;
import java.util.BitSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.a;
import g50.c;
import e50.m;
import com.kuaishou.eve.kit.rerank.config.RankABParam;
import java.lang.Integer;
import java.util.List;

public final class EveRankExtraTriggerPresenter$b extends a	// class@000a9a
{
    public final EveRankExtraTriggerPresenter b;

    public void EveRankExtraTriggerPresenter$b(EveRankExtraTriggerPresenter p0){
       this.b = p0;
       super();
    }
    public void F1(){
       if (PatchProxy.applyVoid(null, this, EveRankExtraTriggerPresenter$b.class, "2")) {
          return;
       }
       this.b.P8().removeCallbacks(this.b.B);
       this.b.x.set(2);
       return;
    }
    public void i2(){
       if (PatchProxy.applyVoid(null, this, EveRankExtraTriggerPresenter$b.class, "1")) {
          return;
       }
       this.b.x.clear();
       EveRankExtraTriggerPresenter$b tb = this.b;
       EveRankExtraTriggerPresenter u = tb.u;
       a.m(u);
       tb.w = TimeUnit.SECONDS.toMillis(u.d().c().getEffectViewDuration());
       if (this.b.y.contains(Integer.valueOf(6))) {
          tb = this.b;
          if (tb.w - null > 0) {
             EveRankExtraTriggerPresenter$b tb1 = this.b;
             tb.P8().postDelayed(tb1.B, tb1.w);
          }
       }
       return;
    }
}
