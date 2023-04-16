package com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment$b;
import fx2.c;
import com.kuaishou.live.core.voiceparty.theater.tube.list.VoicePartyTheaterTubeListFragment;
import java.lang.String;
import brd.t;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.Object;
import com.kwai.robust.PatchProxyResult;
import bs2.e;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import qu2.a;
import dx2.p;
import co2.f2;
import cjd.e;
import erd.o;

public class VoicePartyTheaterTubeListFragment$b extends c	// class@001a0f
{
    public final VoicePartyTheaterTubeListFragment r;

    public void VoicePartyTheaterTubeListFragment$b(VoicePartyTheaterTubeListFragment p0,int p1){
       this.r = p0;
       super(p1);
    }
    public t i2(int p0,String p1){
       VoicePartyTheaterTubeListFragment$b uob = VoicePartyTheaterTubeListFragment$b.class;
       if (PatchProxy.isSupport(uob)) {
          Object obj = PatchProxy.applyTwoRefs(Integer.valueOf(p0), p1, this, uob, "1");
          if (obj != PatchProxyResult.class) {
             return obj;
          }
       }
       return LiveVoicePartyApi.e().e(this.r.J.d().getLiveStreamId(), this.r.J.g().y(), p0, p1, 20).map(new e());
    }
}
