package com.kuaishou.live.core.voiceparty.music.LiveVoicePartySearchMusicFragment$b;
import qvb.f;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySearchMusicFragment;
import brd.t;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kwai.robust.PatchProxyResult;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import cjd.e;
import erd.o;
import com.kuaishou.live.core.voiceparty.music.l;

public class LiveVoicePartySearchMusicFragment$b extends f	// class@0017d1
{
    public final LiveVoicePartySearchMusicFragment p;
    public static final int q;

    public void LiveVoicePartySearchMusicFragment$b(LiveVoicePartySearchMusicFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       LiveVoicePartySearchMusicFragment$b obj = PatchProxy.apply(null, this, LiveVoicePartySearchMusicFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       obj = this.p;
       return LiveVoicePartyApi.c().q(obj.G, obj.H, obj.I, obj.F, obj.J).map(new e()).map(l.b);
    }
}
