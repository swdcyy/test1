package com.kuaishou.live.core.voiceparty.music.LiveVoicePartySangMusicFragment$a;
import qvb.f;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartySangMusicFragment;
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
import com.kuaishou.live.core.voiceparty.music.i;

public class LiveVoicePartySangMusicFragment$a extends f	// class@0017cd
{
    public final LiveVoicePartySangMusicFragment p;
    public static final int q;

    public void LiveVoicePartySangMusicFragment$a(LiveVoicePartySangMusicFragment p0){
       this.p = p0;
       super();
    }
    public t I1(){
       Object obj = PatchProxy.apply(null, this, LiveVoicePartySangMusicFragment$a.class, "1");
       if (obj != PatchProxyResult.class) {
          return obj;
       }
       LiveVoicePartySangMusicFragment$a tp = this.p;
       return LiveVoicePartyApi.c().v(tp.F, tp.G, tp.H).map(new e()).map(i.b);
    }
}
