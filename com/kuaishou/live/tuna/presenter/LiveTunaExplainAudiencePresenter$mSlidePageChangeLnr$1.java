package com.kuaishou.live.tuna.presenter.LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1;
import xq5.c;
import com.kuaishou.live.tuna.presenter.LiveTunaExplainAudiencePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import xq5.b;
import com.kuaishou.tuna_logger.KsgLogTunaLiveTag;
import java.util.List;
import com.kuaishou.live.tuna.presenter.LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1$onPageHide$1;
import msd.a;
import c15.b;
import com.kwai.feature.api.live.base.service.slideplay.LiveWillShowType;

public final class LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1 implements c	// class@000fd4
{
    public final LiveTunaExplainAudiencePresenter b;

    public void LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1(LiveTunaExplainAudiencePresenter p0){
       this.b = p0;
       super();
    }
    public void P(){
       if (PatchProxy.applyVoid(null, this, LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1.class, "1")) {
          return;
       }
       b.a(this);
       b.f(KsgLogTunaLiveTag.EXPLAIN_CARD.appendTag("BaseLiveTunaExplainPresenter"), LiveTunaExplainAudiencePresenter$mSlidePageChangeLnr$1$onPageHide$1.INSTANCE);
       this.b.L = false;
       return;
    }
    public void W4(){
       b.c(this);
    }
    public void r(){
       b.b(this);
    }
    public void t4(LiveWillShowType p0){
       b.e(this, p0);
    }
    public void x4(){
       b.d(this);
    }
    public void y1(){
       b.f(this);
    }
}
