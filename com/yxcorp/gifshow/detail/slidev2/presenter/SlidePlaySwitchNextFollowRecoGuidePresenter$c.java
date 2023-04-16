package com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter$c;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.yxcorp.gifshow.detail.slidev2.presenter.SlidePlaySwitchNextFollowRecoGuidePresenter;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import com.yxcorp.gifshow.entity.QPhoto;
import java.util.Objects;
import com.yxcorp.gifshow.nasa.NasaSlideParam;
import com.kwai.feature.api.feed.detail.router.biz.nasa.NasaBizParam;
import kotlin.jvm.internal.a;
import zm5.a;
import com.kwai.feature.api.social.followSlide.model.FollowSlideRecoGuide;
import com.kwai.library.groot.api.viewmodel.SlidePlayViewModel;
import xx9.a;
import uw9.o;
import q87.c;

public final class SlidePlaySwitchNextFollowRecoGuidePresenter$c implements IMediaPlayer$OnInfoListener	// class@0018cf
{
    public final SlidePlaySwitchNextFollowRecoGuidePresenter b;

    public void SlidePlaySwitchNextFollowRecoGuidePresenter$c(SlidePlaySwitchNextFollowRecoGuidePresenter p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       boolean b;
       SlidePlaySwitchNextFollowRecoGuidePresenter v;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(SlidePlaySwitchNextFollowRecoGuidePresenter$c.class)) {
          p0 = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, SlidePlaySwitchNextFollowRecoGuidePresenter$c.class, "1");
          if (p0 != patchProxyRe) {
             return p0.booleanValue();
          }
       }
       if (p1 == 0x2775) {
          QPhoto qPhoto = this.b.W8();
          SlidePlaySwitchNextFollowRecoGuidePresenter$c tb = this.b;
          Objects.requireNonNull(tb);
          Object obj = PatchProxy.applyOneRefs(qPhoto, tb, SlidePlaySwitchNextFollowRecoGuidePresenter.class, "13");
          if (obj != patchProxyRe) {
             b = obj.booleanValue();
          }else {
             SlidePlaySwitchNextFollowRecoGuidePresenter h = tb.H;
             if (h != null) {
                NasaSlideParam nasaSlidePar1 = h.getNasaSlideParam();
                if (nasaSlidePar1 != null && nasaSlidePar1.mEnableAutoNext == true) {
                   h = tb.A;
                   if (h == null) {
                      a.S("mSlidePlaySceneRecord");
                   }
                   if (h.a()) {
                      FollowSlideRecoGuide uFollowSlide1 = tb.a9(qPhoto);
                      if (uFollowSlide1 != null && uFollowSlide1.mEnableAutoNext == true) {
                         b = true;
                      }
                   }
                }
             }
          label_0070 :
             b = false;
          }
          if (b) {
             FollowSlideRecoGuide uFollowSlide = this.b.a9(qPhoto);
             if (uFollowSlide != null && (uFollowSlide.mRecoGuideHasShowed == true && !SlidePlaySwitchNextFollowRecoGuidePresenter.R8(this.b).I())) {
                v = this.b.v;
                if (v == null) {
                   a.S("mScreenCleanStatusCombination");
                }
                if (!v.c() && this.b.E == null) {
                   Object[] objArray = new Object[0];
                   o.C().w("FollowRecoGuidePresenter", "autoSwitchNext", objArray);
                   SlidePlaySwitchNextFollowRecoGuidePresenter$c tb1 = this.b;
                   tb1.E = true;
                   SlidePlaySwitchNextFollowRecoGuidePresenter.R8(tb1).Y(true);
                }
             }
          }
       label_00ba :
          v = this.b.H;
          if (v != null) {
             NasaSlideParam nasaSlidePar = v.getNasaSlideParam();
             if (nasaSlidePar != null && nasaSlidePar.mEnableAutoNext == true) {
                v = this.b.H;
                if (v != null) {
                   nasaSlidePar = v.getNasaSlideParam();
                   if (nasaSlidePar != null && nasaSlidePar.mIsRecoGuideHasShowed == true) {
                      v = this.b.H;
                      if (v != null) {
                         nasaSlidePar = v.getNasaSlideParam();
                         if (nasaSlidePar != null) {
                            nasaSlidePar.mEnableAutoNext = false;
                         }
                      }
                   }
                }
             }
          }
       }
    label_00e8 :
       return 0;
    }
}
