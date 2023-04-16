package com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$b;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$d;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController;
import dx2.h;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeFeedWithEpisodes;
import java.lang.Object;
import java.lang.String;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.theater.tube.VoicePartyTheaterAudiencePanelController$b$a;
import java.lang.Runnable;
import com.kuaishou.client.log.content.packages.nano.ClientContent$LiveStreamPackage;
import qu2.a;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterPhotoWithEpisode$VoicePartyTheaterEpisodeInfo;
import co2.f2;
import com.kuaishou.client.log.content.packages.nano.ClientContent$SearchResultPackage;
import com.kuaishou.client.log.content.packages.nano.ClientContent$TagPackage;
import mw2.e;
import dx2.a;

public final class VoicePartyTheaterAudiencePanelController$b implements VoicePartyTheaterTubeDetailFragment$d	// class@0019ee
{
    public final h a;
    public final VoicePartyTheaterTubeFeedWithEpisodes b;
    public final VoicePartyTheaterAudiencePanelController c;

    public void VoicePartyTheaterAudiencePanelController$b(VoicePartyTheaterAudiencePanelController p0,h p1,VoicePartyTheaterTubeFeedWithEpisodes p2){
       a.p(p1, "panelCallback");
       a.p(p2, "tubeFeed");
       this.c = p0;
       super();
       this.a = p1;
       this.b = p2;
    }
    public void a(VoicePartyTheaterPhotoWithEpisode p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VoicePartyTheaterAudiencePanelController$b.class, "2")) {
          return;
       }
       a.p(p0, "episode");
       this.c.X2(p0, new VoicePartyTheaterAudiencePanelController$b$a(this));
       e.n(this.c.o.a(), this.c.p, "PLAY", "photo_list", null, null, "", "", p0.mVoicePartyTheaterEpisodeInfo.mType, null, -1);
       return;
    }
    public void b(){
       if (PatchProxy.applyVoid(null, this, VoicePartyTheaterAudiencePanelController$b.class, "1")) {
          return;
       }
       this.a.f(this.b, new a("photo_list"));
       return;
    }
}
