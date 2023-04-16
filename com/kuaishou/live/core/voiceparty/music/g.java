package com.kuaishou.live.core.voiceparty.music.g;
import com.kuaishou.live.core.voiceparty.clipmusic.b$a;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import java.lang.Long;
import tt2.a;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import tt2.m;
import tt2.l;
import erd.g;
import crd.b;

public class g implements b$a	// class@0017d9
{
    public final LiveVoicePartyOrderedMusic a;
    public final LiveVoicePartyOrderedMusicFragment b;

    public void g(LiveVoicePartyOrderedMusicFragment p0,LiveVoicePartyOrderedMusic p1){
       this.b = p0;
       this.a = p1;
       super();
    }
    public void a(){
       if (PatchProxy.applyVoid(null, this, g.class, "1")) {
          return;
       }
       this.b.Hh();
       return;
    }
    public void b(long p0,long p1){
       g og = g.class;
       if (PatchProxy.isSupport(og) && PatchProxy.applyVoidTwoRefs(Long.valueOf(p0), Long.valueOf(p1), this, og, "2")) {
          return;
       }
       if (this.b.Gh() != null) {
          this.b.Gh().Dg();
       }
       og = this.b;
       LiveVoicePartyApi.c().u(og.F, og.G, og.H, this.a.musicOrderId, p0, p1).map(new e()).subscribeOn(d.a).subscribe(new m(this), new l(this));
       return;
    }
}
