package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$onBind$2;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import fda.b;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import java.lang.Runnable;
import ekd.k1;

public final class NasaFeatureLikeGuidePresenter$onBind$2 extends FunctionReferenceImpl implements l	// class@001973
{

    public void NasaFeatureLikeGuidePresenter$onBind$2(NasaFeatureLikeGuidePresenter p0){
       super(1, p0, NasaFeatureLikeGuidePresenter.class, "onKgiGuideMain", "onKgiGuideMain\(Lcom/yxcorp/gifshow/events/growth/GrowthKgiGuideEvent;\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0);
       return l1.a;
    }
    public final void invoke(b p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, NasaFeatureLikeGuidePresenter$onBind$2.class, "1")) {
          return;
       }
       a.p(p0, "p1");
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       if (!PatchProxy.applyVoidOneRefs(p0, treceiver, NasaFeatureLikeGuidePresenter.class, "28") && treceiver.C != null) {
          String str = p0.a();
          if (str != null && a.g("like_guide", str)) {
             treceiver.D = true;
             k1.m(treceiver.W8());
             k1.o(treceiver.W8());
          }
       }
       return;
    }
}
