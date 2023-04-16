package com.kuaishou.live.core.voiceparty.music.d;
import u07.u;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment$a;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import java.lang.Object;
import u07.t;
import android.view.View;
import tt2.a;
import com.kuaishou.live.core.voiceparty.music.LiveVoicePartyOrderedMusicFragment;
import com.kuaishou.android.model.music.Music;
import bs2.b;
import com.kuaishou.live.core.voiceparty.http.LiveVoicePartyApi;
import java.lang.String;
import brd.t;
import cjd.e;
import erd.o;
import t45.d;
import brd.z;
import tt2.j;
import tt2.i;
import erd.g;
import crd.b;

public final class d implements u	// class@0017d6
{
    public final LiveVoicePartyOrderedMusicFragment$a b;
    public final LiveVoicePartyOrderedMusic c;

    public void d(LiveVoicePartyOrderedMusicFragment$a p0,LiveVoicePartyOrderedMusic p1){
       super();
       this.b = p0;
       this.c = p1;
    }
    public final void a(t p0,View p1){
       d tb = this.b;
       d tc = this.c;
       if (tb.a.Gh() != null) {
          tb.a.Gh().P3(tc.music);
       }
       LiveVoicePartyOrderedMusicFragment$a a = tb.a;
       LiveVoicePartyApi.c().z(a.F, a.G, a.H, tc.musicOrderId).map(new e()).subscribeOn(d.a).subscribe(new j(tb, tc), new i(tb));
       return;
    }
}
