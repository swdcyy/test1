package com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment$a;
import com.kuaishou.live.core.voiceparty.theater.tube.list.a$a;
import com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment;
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
import bk2.e;

public class VoicePartyTheaterTubeSearchFragment$a implements a$a	// class@001a36
{
    public final VoicePartyTheaterTubeSearchFragment a;

    public void VoicePartyTheaterTubeSearchFragment$a(VoicePartyTheaterTubeSearchFragment p0){
       this.a = p0;
       super();
    }
    public void a(String p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeSearchFragment$a.class, "5")) {
          return;
       }
       VoicePartyTheaterTubeSearchFragment$a ta = this.a;
       ta.Gh(p1);
       ta.I.a(p0, p1);
       return;
    }
    public void b(VoicePartyTheaterTubeInfo p0,VoicePartyTheaterPhotoWithEpisode p1,a p2){
       if (PatchProxy.applyVoidThreeRefs(p0, p1, p2, this, VoicePartyTheaterTubeSearchFragment$a.class, "6")) {
          return;
       }
       VoicePartyTheaterTubeSearchFragment$a ta = this.a;
       ta.Gh(p2);
       ta.I.b(p0, p1, p2);
       return;
    }
    public void c(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeSearchFragment$a.class, "2")) {
          return;
       }
       VoicePartyTheaterTubeSearchFragment$a ta = this.a;
       ta.Gh(p1);
       ta.I.c(p0, p1);
       return;
    }
    public void e(User p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeSearchFragment$a.class, "4")) {
          return;
       }
       if (!d0.p(p0)) {
          return;
       }
       VoicePartyTheaterTubeSearchFragment$a ta = this.a;
       ta.Gh(p1);
       ta.I.e(p0, p1);
       return;
    }
    public void f(VoicePartyTheaterTubeFeedWithEpisodes p0,a p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeSearchFragment$a.class, "3")) {
          return;
       }
       p1.b = p0;
       VoicePartyTheaterTubeSearchFragment$a ta = this.a;
       ta.Gh(p1);
       ta.I.f(p0, p1);
       return;
    }
    public void g(VoicePartyTheaterTubeFeedWithEpisodes p0,Integer p1){
       if (PatchProxy.applyVoidTwoRefs(p0, p1, this, VoicePartyTheaterTubeSearchFragment$a.class, "1")) {
          return;
       }
       if (p0 != null && p0.mTube != null) {
          this.a.J.a(p1.intValue());
       }
       return;
    }
}
