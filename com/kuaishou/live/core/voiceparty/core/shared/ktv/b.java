package com.kuaishou.live.core.voiceparty.core.shared.ktv.b;
import erd.g;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$g;
import com.kuaishou.livestream.message.nano.KtvMusicOrderInfo;
import java.lang.Object;
import com.kuaishou.live.core.voiceparty.model.LiveVoicePartyOrderedMusic;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager$SwitchSong;
import kotlin.jvm.internal.a;
import ut7.e;
import com.kuaishou.live.core.voiceparty.core.shared.ktv.KtvManager;

public final class b implements g	// class@001444
{
    public final KtvManager$g b;
    public final KtvMusicOrderInfo c;
    public final int d;

    public void b(KtvManager$g p0,KtvMusicOrderInfo p1,int p2){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       super();
    }
    public void accept(Object p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, b.class, "1")) {
       }else {
          KtvMusicOrderInfo musicOrderId = this.c.musicOrderId;
          a.o(musicOrderId, "music.musicOrderId");
          this.b.g.r(new KtvManager$SwitchSong(musicOrderId, this.d));
       }
       return;
    }
}
