package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1;
import java.lang.Object;
import qrd.l1;
import com.kwai.robust.PatchProxyResult;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2;
import java.util.Objects;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;
import im8.f;
import kotlin.jvm.internal.a;
import java.lang.Boolean;

public final class NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1$1 extends Lambda implements a	// class@00197a
{
    public final NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1 this$0;

    public void NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1$1(NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       NasaFeatureLongPressCollectGuidePresenter nasaFeatureL = NasaFeatureLongPressCollectGuidePresenter.class;
       if (PatchProxy.applyVoid(null, this, NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2$1$1.class, "1")) {
          return;
       }
       NasaFeatureLongPressCollectGuidePresenter$mShowGuideRunnable$2 this$0 = this.this$0.b.this$0;
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoid(null, this$0, nasaFeatureL, "29")) {
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GESTURE_GUIDANCE_CARD";
          i3 oi3 = i3.f();
          oi3.d("gesture_type", "LONG_PRESS_COLLECT");
          uElementPack.params = oi3.e();
          u1.u0(10, uElementPack, null);
       }
       this$0 = this.this$0.b.this$0;
       Objects.requireNonNull(this$0);
       NasaFeatureLongPressCollectGuidePresenter nasaFeatureL1 = PatchProxy.apply(null, this$0, nasaFeatureL, "6");
       if (nasaFeatureL1 != patchProxyRe) {
       }else {
          nasaFeatureL1 = this$0.r;
          if (nasaFeatureL1 == null) {
             a.S("mHasShownGuide");
          }
       }
       nasaFeatureL1.set(Boolean.TRUE);
       this$0 = this.this$0.b.this$0;
       Objects.requireNonNull(this$0);
       nasaFeatureL = PatchProxy.apply(null, this$0, nasaFeatureL, "8");
       if (nasaFeatureL != patchProxyRe) {
       }else {
          nasaFeatureL = this$0.s;
          if (nasaFeatureL == null) {
             a.S("mCanClearScreen");
          }
       }
       nasaFeatureL.set(Boolean.FALSE);
       this.this$0.b.this$0.X8();
       return;
    }
}
