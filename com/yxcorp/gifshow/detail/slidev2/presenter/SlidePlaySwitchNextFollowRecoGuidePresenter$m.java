package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$m;
import s4a.b;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter;
import com.yxcorp.gifshow.entity.QPhoto;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import uw9.o;
import q87.c;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import java.util.Objects;
import com.yxcorp.gifshow.log.model.ClickMetaData;
import com.kuaishou.client.log.event.packages.nano.ClientEvent$ElementPackage;
import lnc.i3;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import com.kuaishou.client.log.content.packages.nano.ClientContent$ContentPackage;
import kotlin.jvm.internal.a;
import com.kwai.framework.model.feed.BaseFeed;
import com.kuaishou.client.log.content.packages.nano.ClientContent$PhotoPackage;
import kp.w1;
import k2b.u1;

public final class SlidePlaySwitchNextFollowRecoGuidePresenter$m implements b	// class@0018d9
{
    public final SlidePlaySwitchNextFollowRecoGuidePresenter a;
    public final QPhoto b;

    public void SlidePlaySwitchNextFollowRecoGuidePresenter$m(SlidePlaySwitchNextFollowRecoGuidePresenter p0,QPhoto p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void b(){
       if (PatchProxy.applyVoid(null, this, SlidePlaySwitchNextFollowRecoGuidePresenter$m.class, "1")) {
          return;
       }
       Object[] objArray = new Object[0];
       o.C().w("FollowRecoGuidePresenter", "clickGuidePop", objArray);
       SlidePlaySwitchNextFollowRecoGuidePresenter.R8(this.a).Y(true);
       SlidePlaySwitchNextFollowRecoGuidePresenter$m ta = this.a;
       SlidePlaySwitchNextFollowRecoGuidePresenter$m tb = this.b;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoidOneRefs(tb, ta, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "15")) {
          ClickMetaData uClickMetaDa = new ClickMetaData();
          ClientEvent$ElementPackage uElementPack = new ClientEvent$ElementPackage();
          uElementPack.action2 = "ELSE_TEXT_BUTTON";
          i3 oi3 = i3.f();
          oi3.d("text", ta.b9(tb));
          FollowSlideRecoGuide uFollowSlide = ta.a9(tb);
          String str = "";
          if (uFollowSlide != null) {
             uFollowSlide = uFollowSlide.mTextType;
             if (uFollowSlide != null) {
             label_005f :
                oi3.d("text_type", uFollowSlide);
                FollowSlideRecoGuide uFollowSlide1 = ta.a9(tb);
                if (uFollowSlide1 != null) {
                   uFollowSlide1 = uFollowSlide1.mType;
                   if (uFollowSlide1 != null) {
                      str = uFollowSlide1;
                   }
                }
                oi3.d("type", str);
                uElementPack.params = oi3.e();
                ClientContent$ContentPackage uContentPack = new ClientContent$ContentPackage();
                SlidePlaySwitchNextFollowRecoGuidePresenter t = ta.t;
                if (t == null) {
                   a.S("mPhoto");
                }
                uContentPack.photoPackage = w1.f(t.mEntity);
                uClickMetaDa.setElementPackage(uElementPack);
                uClickMetaDa.setContentPackage(uContentPack);
                u1.B(uClickMetaDa);
             }
          }
          String str1 = str;
          goto label_005f ;
       }
       return;
    }
}
