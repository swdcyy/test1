package com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer$playerAddCallback$3;
import msd.l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.VodTheaterPlayer;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.lang.Number;
import qrd.l1;
import com.kwai.robust.PatchProxy;
import java.lang.Integer;
import kotlin.jvm.internal.CallableReference;
import java.util.Objects;
import sw2.a;
import com.kuaishou.live.core.voiceparty.theater.player.theaterplayer.TheaterPlayer$State;
import com.kuaishou.live.core.voiceparty.LiveVoicePartyLogTag;
import pp.c;
import com.kuaishou.android.live.log.b;
import com.kwai.framework.player.core.b;

public final class VodTheaterPlayer$playerAddCallback$3 extends FunctionReferenceImpl implements l	// class@0019d1
{

    public void VodTheaterPlayer$playerAddCallback$3(VodTheaterPlayer p0){
       super(1, p0, VodTheaterPlayer.class, "onPlayerStateChange", "onPlayerStateChange\(I\)V", 0);
    }
    public Object invoke(Object p0){
       this.invoke(p0.intValue());
       return l1.a;
    }
    public final void invoke(int p0){
       VodTheaterPlayer i;
       if (PatchProxy.isSupport(VodTheaterPlayer$playerAddCallback$3.class) && PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), this, VodTheaterPlayer$playerAddCallback$3.class, "1")) {
          return;
       }
       CallableReference treceiver = this.receiver;
       Objects.requireNonNull(treceiver);
       VodTheaterPlayer vodTheaterPl = VodTheaterPlayer.class;
       if (!PatchProxy.isSupport(vodTheaterPl) || !PatchProxy.applyVoidOneRefs(Integer.valueOf(p0), treceiver, vodTheaterPl, "6")) {
          if (p0 != 2) {
             if (p0 != 3) {
                if (p0 != 4) {
                   if (p0 != 6) {
                      if (p0 == 7) {
                         treceiver.l.a(3);
                         i = treceiver.i;
                         if (i != null) {
                            i.invoke(TheaterPlayer$State.ERROR);
                         }
                      }
                   }else {
                      b.Z(LiveVoicePartyLogTag.THEATER, "onCompletion");
                      treceiver.l.a(3);
                      i = treceiver.i;
                      if (i != null) {
                         i.invoke(TheaterPlayer$State.COMPLETED);
                      }
                   }
                }else {
                   treceiver.l.a(3);
                   i = treceiver.i;
                   if (i != null) {
                      i.invoke(TheaterPlayer$State.PAUSED);
                   }
                }
             }else {
                treceiver.l.c(3);
                i = treceiver.i;
                if (i != null) {
                   i.invoke(TheaterPlayer$State.STARTED);
                }
             }
          }else {
             p0.b = treceiver.b.getDuration();
             i = treceiver.i;
             if (i != null) {
                l1 ol1 = i.invoke(TheaterPlayer$State.PREPARED);
             }
             if (!PatchProxy.applyVoid(null, treceiver, vodTheaterPl, "21")) {
                if (treceiver.n != null) {
                   treceiver.b.start();
                }
                vodTheaterPl = treceiver.o;
                if (vodTheaterPl - -1) {
                   treceiver.b.seekTo(vodTheaterPl);
                   treceiver.o = -1;
                }
             }
          }
       }
    label_00cd :
       return;
    }
}
