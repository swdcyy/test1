package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$e;
import com.kwai.video.player.IMediaPlayer$OnInfoListener;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import com.kwai.video.player.IMediaPlayer;
import com.kwai.robust.PatchProxyResult;
import java.lang.Class;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import java.lang.String;
import java.lang.Boolean;
import java.util.Objects;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import sw2.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$Event;
import msd.l;
import qrd.l1;
import com.kwai.framework.player.core.b;
import sw2.b;
import java.lang.Long;
import sw2.c;
import android.os.SystemClock;

public final class VodTheaterPlayer$e implements IMediaPlayer$OnInfoListener	// class@0019ca
{
    public final VodTheaterPlayer b;

    public void VodTheaterPlayer$e(VodTheaterPlayer p0){
       this.b = p0;
       super();
    }
    public final boolean onInfo(IMediaPlayer p0,int p1,int p2){
       VodTheaterPlayer j;
       l1 ol1;
       int i = p1;
       PatchProxyResult patchProxyRe = PatchProxyResult.class;
       if (PatchProxy.isSupport(VodTheaterPlayer$e.class)) {
          Object obj = PatchProxy.applyThreeRefs(p0, Integer.valueOf(p1), Integer.valueOf(p2), this, VodTheaterPlayer$e.class, "1");
          if (obj != patchProxyRe) {
             return obj.booleanValue();
          }
       }
       VodTheaterPlayer$e b = this.b;
       VodTheaterPlayer f = b.f;
       Objects.requireNonNull(b);
       if (PatchProxy.isSupport(VodTheaterPlayer.class)) {
          Object obj1 = PatchProxy.applyThreeRefs(f, Integer.valueOf(p1), Integer.valueOf(p2), b, VodTheaterPlayer.class, "7");
          if (obj1 != patchProxyRe) {
             obj1.booleanValue();
          }else {
          label_0055 :
             LiveVoicePartyLogTag tHEATER = LiveVoicePartyLogTag.THEATER;
             b.d0(tHEATER, "onPlayerInfo", "what", Integer.valueOf(p1), "extra", Integer.valueOf(p2));
             if (i != 3) {
                if (i != 701) {
                   if (i == 702) {
                      b.Z(tHEATER, "onInfo, buffering finished, hide loading");
                      b.l.a(1);
                      j = b.j;
                      if (j != null) {
                         ol1 = j.invoke(TheaterPlayer$Event.END_BUFFER);
                      }
                   }
                }else {
                   b.Z(tHEATER, "onInfo, start buffering£¬show loading");
                   b.l.c(1);
                   j = b.j;
                   if (j != null) {
                      ol1 = j.invoke(TheaterPlayer$Event.BEGIN_BUFFER);
                   }
                }
             }else {
                long duration = b.b.getDuration();
                Objects.requireNonNull(f);
                b uob = b.class;
                if (!PatchProxy.isSupport(uob) || !PatchProxy.applyVoidOneRefs(Long.valueOf(duration), f, uob, "1")) {
                   b.c0(tHEATER, "setVideoDurationMs", "durationMs", Long.valueOf(duration));
                   f.a = duration;
                   uob = f.b;
                   if (uob != null) {
                      uob.e = duration;
                   }
                }
                j = b.l;
                Objects.requireNonNull(j);
                if (!PatchProxy.applyVoid(null, j, a.class, "10") && !j.s) {
                   j.s = SystemClock.elapsedRealtime();
                }
                b.c0(tHEATER, "onInfo, start render, hide loading", "duration", Long.valueOf(b.b.getDuration()));
                j = b.j;
                if (j != null) {
                   ol1 = j.invoke(TheaterPlayer$Event.START_RENDERING);
                }
             }
          }
       }else {
          goto label_0055 ;
       }
       return false;
    }
}
