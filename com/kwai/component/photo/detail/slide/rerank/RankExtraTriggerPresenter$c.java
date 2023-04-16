package com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter$c;
import java.lang.Runnable;
import com.kwai.component.photo.detail.slide.rerank.RankExtraTriggerPresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.util.BitSet;
import im8.f;
import kotlin.jvm.internal.a;
import com.kwai.component.photo.detail.core.log.PhotoDetailLogger;
import j50.e;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.framework.model.feed.BaseFeed;
import java.util.Map;
import pf5.d;
import com.kuaishou.eve.kit.rerank.BizPage;
import e50.m;
import j50.b;
import hf6.b;
import brd.t;
import ff6.d;
import erd.g;
import io.reactivex.internal.functions.Functions;
import crd.b;
import android.os.Handler;

public final class RankExtraTriggerPresenter$c implements Runnable	// class@000aa1
{
    public final RankExtraTriggerPresenter b;

    public void RankExtraTriggerPresenter$c(RankExtraTriggerPresenter p0){
       this.b = p0;
       super();
    }
    public void run(){
       if (PatchProxy.applyVoid(null, this, RankExtraTriggerPresenter$c.class, "1")) {
          return;
       }
       if (this.b.A.cardinality() > 0) {
          return;
       }
       RankExtraTriggerPresenter$c obj = this.b.P8().get();
       a.o(obj, "mLogger.get\(\)");
       long actualPlayDu = obj.getActualPlayDuration();
       RankExtraTriggerPresenter$c tb = this.b;
       if (tb.z - actualPlayDu <= 0) {
          tb.A.set(1);
          obj = this.b;
          RankExtraTriggerPresenter x = obj.x;
          if (x != null) {
             QPhoto mEntity = obj.R8().mEntity;
             a.o(mEntity, "mPhoto.mEntity");
             e uoe = new e(mEntity);
             uoe.h(d.a(this.b.P8().get(), this.b.R8(), 0, 0, 12, null));
             RankExtraTriggerPresenter u = this.b.u;
             a.m(u);
             x.o0(u.b().getBizId(), "user_feature", uoe);
             u = this.b.u;
             a.m(u);
             u.a(6).subscribe(Functions.d(), Functions.d());
          }
       }else {
          tb.S8().postDelayed(this, (this.b.z - actualPlayDu));
       }
       return;
    }
}
