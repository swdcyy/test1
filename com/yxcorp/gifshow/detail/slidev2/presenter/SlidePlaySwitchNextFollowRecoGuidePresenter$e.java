package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$e;
import erd.g;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter;
import java.lang.Object;
import java.lang.Long;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.yxcorp.gifshow.entity.QPhoto;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import kotlin.jvm.internal.a;
import p5a.e;
import de5.a;
import com.kwai.framework.player.core.b;

public final class SlidePlaySwitchNextFollowRecoGuidePresenter$e implements g	// class@0018d1
{
    public final SlidePlaySwitchNextFollowRecoGuidePresenter b;

    public void SlidePlaySwitchNextFollowRecoGuidePresenter$e(SlidePlaySwitchNextFollowRecoGuidePresenter p0){
       this.b = p0;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, SlidePlaySwitchNextFollowRecoGuidePresenter$e.class, "1")) {
       }else {
          p0 = this.b.W8();
          if (p0 != null) {
             FollowSlideRecoGuide uFollowSlide = this.b.a9(p0);
             if (uFollowSlide != null && uFollowSlide.mShowFromStart == 1) {
                SlidePlaySwitchNextFollowRecoGuidePresenter u = this.b.u;
                if (u == null) {
                   a.S("mDetailPlayModule");
                }
                e player = u.getPlayer();
                a.o(player, "mDetailPlayModule.player");
                if (player.getCurrentPosition() - this.b.V8(p0) >= 0) {
                   this.b.d9(p0);
                }
             }
          }
       }
       return;
    }
}
