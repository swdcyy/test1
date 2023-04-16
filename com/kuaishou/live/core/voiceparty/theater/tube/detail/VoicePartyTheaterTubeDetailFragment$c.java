package com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment$c;
import qvb.f;
import com.kuaishou.live.core.voiceparty.theater.tube.detail.VoicePartyTheaterTubeDetailFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qu2.a;
import dx2.p;
import co2.f2;
import qvb.n0;
import com.kuaishou.live.core.voiceparty.theater.model.VoicePartyTheaterTubeDetailResponse;
import bs2.e;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;

public class VoicePartyTheaterTubeDetailFragment$c extends f	// class@001a05
{
    public final VoicePartyTheaterTubeDetailFragment p;

    public void VoicePartyTheaterTubeDetailFragment$c(VoicePartyTheaterTubeDetailFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object[] objArray = null;
       VoicePartyTheaterTubeDetailFragment$c obj = PatchProxy.apply(objArray, this, VoicePartyTheaterTubeDetailFragment$c.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       String liveStreamId = this.p.F.d().getLiveStreamId();
       String str = this.p.F.g().y();
       if (!this.K() && this.L0() != null) {
          objArray = this.L0().getCursor();
       }
       obj = this.p;
       return LiveVoicePartyApi.e().h(liveStreamId, str, obj.G, obj.I, objArray, 20).map(new e());
    }
}
