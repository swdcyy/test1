package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2$a;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter;
import zm5.a;

public final class SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2$a extends a	// class@0018da
{
    public final SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2 a;

    public void SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2$a(SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2 p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2$a omSideBarLis = SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2$a.class;
       if (PatchProxy.isSupport(omSideBarLis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, omSideBarLis, "1")) {
          return;
       }
       boolean b = (!p0 - 0x3f800000)? true: false;
       SlidePlaySwitchNextFollowRecoGuidePresenter$mSideBarListener$2 this$0 = this.a.this$0;
       if (b != this$0.K) {
          this$0.K = b;
          SlidePlaySwitchNextFollowRecoGuidePresenter.P8(this$0).b(this.a.this$0.K, 8);
       }
       return;
    }
}
