package com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$b;
import qvb.f;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment;
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
import com.kuaishou.live.core.voiceparty.music.f;

public class LiveVoicePartyOrderedMusicFragment$b extends f	// class@0017c8
{
    public final LiveVoicePartyOrderedMusicFragment p;
    public static final int q;

    public void LiveVoicePartyOrderedMusicFragment$b(LiveVoicePartyOrderedMusicFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartyOrderedMusicFragment$b.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveVoicePartyOrderedMusicFragment$b tp = this.p;
       return LiveVoicePartyApi.c().r(tp.F, tp.G, tp.H).map(new e()).map(f.b);
    }
}
