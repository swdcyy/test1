package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2$a;
import jta.a;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Float;
import java.lang.Object;
import java.lang.String;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextNebulaFollowGuidePresenter;
import zm5.a;

public final class SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2$a extends a	// class@0018e7
{
    public final SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2 a;

    public void SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2$a(SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2 p0){
       this.a = p0;
       super();
    }
    public void c(float p0){
       SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2$a omSideBarLis = SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2$a.class;
       if (PatchProxy.isSupport(omSideBarLis) && PatchProxy.applyVoidOneRefs(Float.valueOf(p0), this, omSideBarLis, "1")) {
          return;
       }
       boolean b = (!p0 - 0x3f800000)? true: false;
       SlidePlaySwitchNextNebulaFollowGuidePresenter$mSideBarListener$2 this$0 = this.a.this$0;
       if (b != this$0.J) {
          this$0.J = b;
          SlidePlaySwitchNextNebulaFollowGuidePresenter.P8(this$0).b(this.a.this$0.J, 8);
       }
       return;
    }
}
