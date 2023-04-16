package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$g;
import u07.u;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import java.lang.String;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import java.lang.Object;
import u07.t;
import android.view.View;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import co2.f2;
import mw2.e;
import java.util.Objects;
import android.app.Activity;
import com.kuaishou.live.viewcontroller.ViewController;
import d61.g;
import qm6.b$a;
import android.content.Context;
import android.net.Uri;
import ix2.e;
import com.kuaishou.live.core.voiceparty.theater.creation.playsource.EpisodeListTheaterPlaySource;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterEpisodePhoto;
import com.kwai.robust.PatchProxyResult;
import qm6.b;
import com.kwai.gifshow.post.api.core.plugin.RecordPostPlugin;
import com.yxcorp.gifshow.util.LoadPolicy;
import brd.a0;
import lnc.y6;
import dx2.b;
import dx2.c;
import erd.g;
import crd.b;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import java.util.List;
import pp.c;
import java.lang.Throwable;
import com.kuaishou.android.live.log.b;

public final class VoicePartyTheaterAudiencePanelController$g implements u	// class@0019f3
{
    public final VoicePartyTheaterAudiencePanelController b;
    public final String c;
    public final VoicePartyTheaterPhotoWithEpisode d;

    public void VoicePartyTheaterAudiencePanelController$g(VoicePartyTheaterAudiencePanelController p0,String p1,VoicePartyTheaterPhotoWithEpisode p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public final void a(t p0,View p1){
       EpisodeListTheaterPlaySource uEpisodeList;
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterAudiencePanelController$g.class, "1")) {
          return;
       }
       try{
          a.p(p0, "<anonymous parameter 0>");
          a.p(p1, "<anonymous parameter 1>");
          e.g("CREATE", this.c, this.b.o.a(), this.b.p);
          VoicePartyTheaterAudiencePanelController$g tb = this.b;
          VoicePartyTheaterAudiencePanelController$g td = this.d;
          Objects.requireNonNull(tb);
          if (!PatchProxy.applyVoidOneRefs(td, tb, VoicePartyTheaterAudiencePanelController.class, "9") && !g.h(tb.B2())) {
             b$a uoa = new b$a(tb.B2(), 0).B(e.a());
             if (td != null) {
                VoicePartyTheaterPhotoWithEpisode mVoicePartyT = td.mVoicePartyTheaterEpisodeInfo;
                if (mVoicePartyT != null) {
                   VoicePartyTheaterPhotoWithEpisode mVoicePartyT1 = td.mVoicePartyTheaterEpisodePhoto;
                   if (mVoicePartyT1 != null) {
                      uEpisodeList = new EpisodeListTheaterPlaySource(mVoicePartyT.mTubeId, mVoicePartyT.mEpisodeNumber, mVoicePartyT1.mEpisodePhotoId, mVoicePartyT.mType);
                   label_0072 :
                      Objects.requireNonNull(uoa);
                      mVoicePartyT1 = PatchProxy.applyOneRefs(uEpisodeList, uoa, b$a.class, "80");
                      uoa = (mVoicePartyT1 != PatchProxyResult.class)? mVoicePartyT1: uEpisodeList;
                      y6.s(RecordPostPlugin.class, LoadPolicy.DIALOG).R(new b(tb, uoa.f()), c.b);
                   }
                }
             }
             uEpisodeList = null;
             goto label_0072 ;
          }
       }catch(java.lang.Exception e6){
          b.y(LiveVoicePartyLogTag.THEATER.appendTag("VoicePartyTheaterAudiencePanelController"), "openLivePreview", e6);
       }
       return;
    }
}
