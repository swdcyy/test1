package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$h;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter;
import java.lang.Object;
import java.lang.Boolean;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import s4a.g;

public final class SlidePlaySwitchNextFollowRecoGuidePresenter$h implements g	// class@0018d4
{
    public final SlidePlaySwitchNextFollowRecoGuidePresenter b;

    public void SlidePlaySwitchNextFollowRecoGuidePresenter$h(SlidePlaySwitchNextFollowRecoGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter$h.class, "1")) {
       }else {
          a.o(p0, "it");
          if (p0.booleanValue()) {
             SlidePlaySwitchNextFollowRecoGuidePresenter b = this.b.B;
             if (b != null) {
                b.b0();
             }
          }
          this.b.D = p0.booleanValue();
       }
       return;
    }
}
