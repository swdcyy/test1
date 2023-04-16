package com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdGapPresenter$mAdGapInfoListener$2$a;
import qx.b;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdGapPresenter$mAdGapInfoListener$2;
import java.lang.Object;
import com.kwai.framework.model.feed.BaseFeed;
import vq4.c;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.yxcorp.gifshow.entity.QPhoto;
import com.yxcorp.gifshow.ad.detail.presenter.log.SlidePlayAdGapPresenter;
import java.util.List;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import com.yxcorp.gifshow.photoad.g;

public final class SlidePlayAdGapPresenter$mAdGapInfoListener$2$a implements b	// class@001659
{
    public final SlidePlayAdGapPresenter$mAdGapInfoListener$2 a;

    public void SlidePlayAdGapPresenter$mAdGapInfoListener$2$a(SlidePlayAdGapPresenter$mAdGapInfoListener$2 p0){
       this.a = p0;
       super();
    }
    public void a(BaseFeed p0,c p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, SlidePlayAdGapPresenter$mAdGapInfoListener$2$a.class, "1")) {
          return;
       }
       a.p(p0, "feed");
       a.p(p1, "clientAdLog");
       if (a.g(p0, this.a.this$0.P8().getEntity())) {
          SlidePlayAdGapPresenter t = this.a.this$0.t;
          a.m(t);
          g.a(this.a.this$0.P8(), p1, t.V0());
       }
       return;
    }
}
