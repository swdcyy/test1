package com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment$b;
import qvb.f;
import com.kuaishou.live.core.voiceparty.theater.tube.search.VoicePartyTheaterTubeSearchFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import qu2.a;
import dx2.p;
import co2.f2;
import bs2.e;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;

public class VoicePartyTheaterTubeSearchFragment$b extends f	// class@001a37
{
    public final VoicePartyTheaterTubeSearchFragment p;

    public void VoicePartyTheaterTubeSearchFragment$b(VoicePartyTheaterTubeSearchFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, VoicePartyTheaterTubeSearchFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       VoicePartyTheaterTubeSearchFragment$b tp = this.p;
       return LiveVoicePartyApi.e().d(this.p.H.d().getLiveStreamId(), this.p.H.g().y(), tp.F, tp.G).map(new e());
    }
}
