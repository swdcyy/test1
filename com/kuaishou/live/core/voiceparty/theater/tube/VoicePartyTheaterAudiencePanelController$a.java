package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$a;
import dx2.h;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import java.lang.Object;
import java.lang.String;
import dx2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import androidx.fragment.app.c;
import ix2.f;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$a$b;
import java.lang.Runnable;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import androidx.fragment.app.Fragment;
import com.yxcorp.gifshow.tube.TubeInfo;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$b;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$d;
import androidx.fragment.app.e;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem;
import com.kwai.robust.PatchProxyResult;
import ok.x;
import java.lang.Boolean;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import com.kwai.framework.model.user.User;
import com.kwai.framework.model.user.UserProfile;
import com.kwai.framework.model.user.UserInfo;
import com.kwai.feature.api.live.base.service.model.LiveStreamClickType;
import wj2.r0;
import java.util.Collection;
import ekd.q;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$a$a;
import java.util.Objects;
import kotlin.collections.CollectionsKt___CollectionsKt;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import dx2.d;

public final class VoicePartyTheaterAudiencePanelController$a implements h	// class@0019ec
{
    public final VoicePartyTheaterAudiencePanelController b;

    public void VoicePartyTheaterAudiencePanelController$a(VoicePartyTheaterAudiencePanelController p0){
       this.b = p0;
       super();
    }
    public void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController$a.class, "4")) {
          return;
       }
       a.p(p1, "logWrapper");
       f.b(this.b.B2(), this.b.x, p0);
       this.b.W2("AUTHOR", p1, 2);
       return;
    }
    public void b(VoicePartyTheaterTubeInfo p0,VoicePartyTheaterPhotoWithEpisode p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VoicePartyTheaterAudiencePanelController$a.class, "2")) {
          return;
       }
       a.p(p0, "tubeInfo");
       a.p(p1, "episode");
       a.p(p2, "logWrapper");
       this.b.X2(p1, new VoicePartyTheaterAudiencePanelController$a$b(this));
       this.b.W2("PLAY", p2, p0.mTubeType);
       return;
    }
    public void c(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController$a.class, "6")) {
          return;
       }
       a.p(p0, "tubeFeed");
       a.p(p1, "logWrapper");
       VoicePartyTheaterTubeFeedWithEpisodes mTube = p0.mTube;
       this.b.W2("MORE", p1, mTube.mTubeType);
       VoicePartyTheaterAudiencePanelController k = this.b.k;
       if (k != null && k.getHost() != null) {
          VoicePartyTheaterTubeDetailFragment voicePartyTh = VoicePartyTheaterTubeDetailFragment.Gh(mTube.mTubeId, mTube.mName, mTube.mTubeType);
          voicePartyTh.Hh(new VoicePartyTheaterAudiencePanelController$b(this.b, this, p0));
          e uoe = k.getChildFragmentManager().beginTransaction();
          uoe.z(R.anim.arg_RES_7f010054, 0, 0, R.anim.arg_RES_7f010056);
          uoe.j(voicePartyTh.getClass().getSimpleName());
          uoe.f(R.id.live_bottom_dialog_container_root, voicePartyTh);
          uoe.m();
       }
       return;
    }
    public void d(VoicePartyTheaterPlayListResponse$VoicePartyTheaterPlayOrderItem p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController$a.class, "1")) {
          return;
       }
       a.p(p0, "orderItem");
       a.p(p1, "logWrapper");
       Boolean uBoolean = PatchProxy.apply(null, null, f.class, "3");
       if (uBoolean == PatchProxyResult.class) {
          uBoolean = f.a.get();
       }
       if (uBoolean.booleanValue()) {
          this.b.Z2(p0.mVoicePartyTheaterPhotoWithEpisode, "PLAY");
       }
       this.b.W2("PLAY", p1, p0.mVoicePartyTheaterPhotoWithEpisode.mVoicePartyTheaterEpisodeInfo.mType);
       return;
    }
    public void e(User p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController$a.class, "3")) {
          return;
       }
       a.p(p0, "user");
       a.p(p1, "logWrapper");
       this.b.s.w0(new UserProfile(UserInfo.convertFromQUser(p0)), LiveStreamClickType.VOICE_PARTY_THEATER, 18, true, 72);
       this.b.W2("AUTHOR", p1, 1);
       return;
    }
    public void f(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1){
       VoicePartyTheaterTubeFeedWithEpisodes mEpisodes;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController$a.class, "5")) {
          return;
       }
       a.p(p0, "tubeFeed");
       a.p(p1, "logWrapper");
       if (q.f(p0.mEpisodes)) {
          b.P(LiveVoicePartyLogTag.THEATER.appendTag("VoicePartyTheaterAudiencePanelController"), "onPlayTubeAllEpisode fail, cause voicePartyTheaterTubeFeedWithEpisodes.mEpisodes is null");
          return;
       }else {
          VoicePartyTheaterAudiencePanelController$a tb = this.b;
          VoicePartyTheaterAudiencePanelController$a$a uoa$a = new VoicePartyTheaterAudiencePanelController$a$a(this);
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidTwoRefs(p0, uoa$a, tb, VoicePartyTheaterAudiencePanelController.class, "10")) {
             mEpisodes = p0.mEpisodes;
             int i = (mEpisodes != null)? mEpisodes.size(): 0;
             VoicePartyTheaterTubeFeedWithEpisodes mEpisodes1 = p0.mEpisodes;
             String str = null;
             VoicePartyTheaterPhotoWithEpisode voicePartyTh = (mEpisodes1 != null)? CollectionsKt___CollectionsKt.p2(mEpisodes1): str;
             if (voicePartyTh != null && i == 1) {
                str = voicePartyTh.mVoicePartyTheaterEpisodePhoto.mEpisodePhotoId;
             }
             mEpisodes = p0.mTube;
             tb.Y2(mEpisodes.mTubeId, mEpisodes.mTubeType, str, uoa$a, new d(tb, voicePartyTh));
          }
          this.b.W2("ALL_PLAY", p1, p0.mTube.mTubeType);
          return;
       }
    }
}
