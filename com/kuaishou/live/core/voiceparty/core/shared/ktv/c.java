package com.kuaishou.live.core.voiceparty.core.shared.ktv.c;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$g;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SwitchSong;
import kotlin.jvm.internal.a;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;
import com.kuaishou.android.live.log.LiveLogTag;
import java.lang.StringBuilder;
import pp.c;
import com.kuaishou.android.live.log.b;

public final class c implements g	// class@001445
{
    public final KtvManager$g b;
    public final int c;
    public final KtvMusicOrderInfo d;

    public void c(KtvManager$g p0,int p1,KtvMusicOrderInfo p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, c.class, "1")) {
       }else if(this.c == 1){
          KtvMusicOrderInfo musicOrderId = this.d.musicOrderId;
          a.o(musicOrderId, "music.musicOrderId");
          this.b.g.r(new KtvManager$SwitchSong(musicOrderId, this.c));
       }
       b.k0(LiveLogTag.LIVE_VOICE_PARTY, "singer play next failed reason:"+this.c, p0);
       return;
    }
}
