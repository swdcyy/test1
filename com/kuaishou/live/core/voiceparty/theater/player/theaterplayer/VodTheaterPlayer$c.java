package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$c;
import com.kwai.framework.player.multisource.e;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import oc6.a;
import com.kwai.framework.player.multisource.PlaySourceSwitcher$a;
import java.lang.Class;
import java.lang.String;
import com.kwai.robust.PatchProxy;
import kotlin.jvm.internal.a;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import java.util.Objects;
import ht.c;
import java.lang.Integer;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import msd.l;
import qrd.l1;
import oc6.b;

public final class VodTheaterPlayer$c implements e	// class@0019c8
{
    public final VodTheaterPlayer a;

    public void VodTheaterPlayer$c(VodTheaterPlayer p0){
       this.a = p0;
       super();
    }
    public void a(int p0){
       a.a(this, p0);
    }
    public void b(PlaySourceSwitcher$a p0){
       if (PatchProxy.applyVoidOneRefs(p0, this, VodTheaterPlayer$c.class, "1")) {
          return;
       }
       a.p(p0, "playSource");
       b.Z(LiveVoicePartyLogTag.THEATER, "onPlayerSwitched");
       VodTheaterPlayer$c ta = this.a;
       Objects.requireNonNull(ta);
       if (!PatchProxy.applyVoid(null, ta, VodTheaterPlayer.class, "4") && ta.g != null) {
          ta.p(ta.c);
       }
       return;
    }
    public void c(int p0){
       VodTheaterPlayer$c uoc = VodTheaterPlayer$c.class;
       if (PatchProxy.isSupport(uoc) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, uoc, "2")) {
          return;
       }
       VodTheaterPlayer j = this.a.j;
       if (j != null) {
          l1 ol1 = j.invoke(TheaterPlayer$Event.CONNECTION_BROKEN);
       }
       b.c0(LiveVoicePartyLogTag.THEATER, "on player switch failed ", "errorCode", Integer.valueOf(p0));
       return;
    }
    public void d(b p0){
       a.c(this, p0);
    }
}
