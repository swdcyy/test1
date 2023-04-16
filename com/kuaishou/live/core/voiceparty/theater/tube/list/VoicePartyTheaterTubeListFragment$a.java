package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment$a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment;
import java.lang.Object;
import java.lang.String;
import dx2.a;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import dx2.h;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeInfo;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import com.kwai.framework.model.user.User;
import com.kuaishou.live.core.voiceparty.d0;
import java.lang.Integer;

public class VoicePartyTheaterTubeListFragment$a implements a$a	// class@001a0e
{
    public final VoicePartyTheaterTubeListFragment a;

    public void VoicePartyTheaterTubeListFragment$a(VoicePartyTheaterTubeListFragment p0){
       this.a = p0;
       super();
    }
    public void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeListFragment$a.class, "5")) {
          return;
       }
       VoicePartyTheaterTubeListFragment$a ta = this.a;
       ta.K.a(p0, ta.Gh(p1));
       return;
    }
    public void b(VoicePartyTheaterTubeInfo p0,VoicePartyTheaterPhotoWithEpisode p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VoicePartyTheaterTubeListFragment$a.class, "6")) {
          return;
       }
       VoicePartyTheaterTubeListFragment$a ta = this.a;
       ta.K.b(p0, p1, ta.Gh(p2));
       return;
    }
    public void c(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeListFragment$a.class, "2")) {
          return;
       }
       VoicePartyTheaterTubeListFragment$a ta = this.a;
       ta.K.c(p0, ta.Gh(p1));
       return;
    }
    public void e(User p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeListFragment$a.class, "4")) {
          return;
       }
       if (!d0.p(p0)) {
          return;
       }
       VoicePartyTheaterTubeListFragment$a ta = this.a;
       ta.K.e(p0, ta.Gh(p1));
       return;
    }
    public void f(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeListFragment$a.class, "3")) {
          return;
       }
       VoicePartyTheaterTubeListFragment$a ta = this.a;
       ta.K.f(p0, ta.Hh(p1, p0));
       return;
    }
    public void g(VoicePartyTheaterTubeFeedWithEpisodes p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeListFragment$a.class, "1")) {
          return;
       }
       this.a.Ih(p1.intValue());
       return;
    }
}
