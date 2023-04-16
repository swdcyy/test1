package com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter$c;
import java.lang.Runnable;
import com.kwai.component.photo.detail.slide.rerank.EveRankExtraTriggerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;
import java.util.Objects;
import com.kwai.robust.PatchProxyResult;
import im8.f;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import nsd.r0;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import java.util.Arrays;
import v40.b;
import android.os.Handler;

public final class EveRankExtraTriggerPresenter$c implements Runnable	// class@000a9b
{
    public final EveRankExtraTriggerPresenter b;

    public void EveRankExtraTriggerPresenter$c(EveRankExtraTriggerPresenter p0){
       this.b = p0;
       super();
    }
    public void run(){
       EveRankExtraTriggerPresenter u;
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, EveRankExtraTriggerPresenter$c.class, "1")) {
          return;
       }
       if (this.b.x.cardinality() > 0) {
          return;
       }
       EveRankExtraTriggerPresenter$c tb = this.b;
       Objects.requireNonNull(tb);
       EveRankExtraTriggerPresenter uEveRankExtr = PatchProxy.apply(objArray, tb, EveRankExtraTriggerPresenter.class, "5");
       if (uEveRankExtr != PatchProxyResult.class) {
       }else {
          uEveRankExtr = tb.r;
          if (uEveRankExtr == null) {
             a.S("mLogger");
          }
       }
       Object[] obj = uEveRankExtr.get();
       a.o(obj, "mLogger.get\(\)");
       long actualPlayDu = obj.getActualPlayDuration();
       EveRankExtraTriggerPresenter$c tb1 = this.b;
       if (tb1.w - actualPlayDu <= 0) {
          tb1.x.set(1);
          obj = new Object[]{u.b().getTaskId()};
          u = this.b.u;
          a.m(u);
          String str = String.format("custom_infer_%s", Arrays.copyOf(obj, 1));
          a.o(str, "java.lang.String.format\(format, *args\)");
          b.b(str, "EFFECTVIEW");
       }else {
          tb1.P8().postDelayed(this, (this.b.w - actualPlayDu));
       }
       return;
    }
}
