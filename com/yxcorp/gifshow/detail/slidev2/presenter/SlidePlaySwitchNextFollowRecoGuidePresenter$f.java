package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$f;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;

public final class SlidePlaySwitchNextFollowRecoGuidePresenter$f implements g	// class@0018d2
{
    public final SlidePlaySwitchNextFollowRecoGuidePresenter b;

    public void SlidePlaySwitchNextFollowRecoGuidePresenter$f(SlidePlaySwitchNextFollowRecoGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter$f.class, "1")) {
       }else {
          QPhoto qPhoto = this.b.W8();
          if (qPhoto != null) {
             FollowSlideRecoGuide uFollowSlide = this.b.a9(qPhoto);
             if (uFollowSlide != null && (uFollowSlide.mShowFromStart == null && p0.longValue() - this.b.V8(qPhoto) < 0)) {
                this.b.d9(qPhoto);
             }
          }
       }
       return;
    }
}
