package com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$1;
import msd.a;
import kotlin.jvm.internal.Lambda;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1;
import java.lang.Object;
import qrd.l1;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2;
import im8.f;
import com.yxcorp.gifshow.detail.slidev2.presenter.feature.guide.NasaFeatureLikeGuidePresenter;
import java.lang.Boolean;
import java.util.Objects;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import k2b.u1;

public final class NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$1 extends Lambda implements a	// class@00196c
{
    public final NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1 this$0;

    public void NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$1(NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1 p0){
       this.this$0 = p0;
       super(0);
    }
    public Object invoke(){
       this.invoke();
       return l1.a;
    }
    public final void invoke(){
       Object[] objArray = null;
       if (PatchProxy.applyVoid(objArray, this, NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2$1$1.class, "1")) {
          return;
       }
       this.this$0.b.this$0.V8().set(Boolean.TRUE);
       this.this$0.b.this$0.S8().set(Boolean.FALSE);
       this.this$0.b.this$0.c9();
       NasaFeatureLikeGuidePresenter$mShowGuideRunnable$2 this$0 = this.this$0.b.this$0;
       String str = "CLICK_TO_LIKE";
       Objects.requireNonNull(this$0);
       if (!PatchProxy.applyVoidOneRefs(str, this$0, NasaFeatureLikeGuidePresenter.class, "35")) {
          a.p(str, "type");
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "GESTURE_GUIDANCE_CARD";
          i3 oi3 = i3.f();
          oi3.d("gesture_type", str);
          uElementPack.params = oi3.e();
          u1.u0(10, uElementPack, objArray);
       }
       this.this$0.b.this$0.b9("t");
       return;
    }
}
